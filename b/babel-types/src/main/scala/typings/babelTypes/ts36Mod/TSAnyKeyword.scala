package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSAnyKeyword
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSAnyKeyword: typings.babelTypes.babelTypesStrings.TSAnyKeyword = js.native
}
object TSAnyKeyword {
  
  @JSImport("babel-types/ts3.6", "TSAnyKeyword")
  @js.native
  def apply(): TSAnyKeyword = js.native
  
  @scala.inline
  implicit class TSAnyKeywordMutableBuilder[Self <: TSAnyKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
