package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSSymbolKeyword
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSSymbolKeyword: typings.babelTypes.babelTypesStrings.TSSymbolKeyword = js.native
}
object TSSymbolKeyword {
  
  @JSImport("babel-types/ts3.6", "TSSymbolKeyword")
  @js.native
  def apply(): TSSymbolKeyword = js.native
  
  @scala.inline
  implicit class TSSymbolKeywordMutableBuilder[Self <: TSSymbolKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
