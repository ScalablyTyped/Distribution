package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSVoidKeyword
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSVoidKeyword: typings.babelTypes.babelTypesStrings.TSVoidKeyword = js.native
}
object TSVoidKeyword {
  
  @JSImport("babel-types/ts3.6", "TSVoidKeyword")
  @js.native
  def apply(): TSVoidKeyword = js.native
  
  @scala.inline
  implicit class TSVoidKeywordMutableBuilder[Self <: TSVoidKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
