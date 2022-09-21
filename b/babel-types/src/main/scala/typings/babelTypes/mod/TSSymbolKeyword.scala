package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSSymbolKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSSymbolKeyword: typings.babelTypes.babelTypesStrings.TSSymbolKeyword
}
object TSSymbolKeyword {
  
  @JSImport("babel-types", "TSSymbolKeyword")
  @js.native
  def apply(): TSSymbolKeyword = js.native
  
  extension [Self <: TSSymbolKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
