package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNumberKeyword
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSNumberKeyword: typings.babelTypes.babelTypesStrings.TSNumberKeyword = js.native
}
object TSNumberKeyword {
  
  @JSImport("babel-types/ts3.6", "TSNumberKeyword")
  @js.native
  def apply(): TSNumberKeyword = js.native
  
  @scala.inline
  implicit class TSNumberKeywordMutableBuilder[Self <: TSNumberKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSNumberKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
