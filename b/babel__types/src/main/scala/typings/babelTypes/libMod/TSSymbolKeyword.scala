package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSSymbolKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSSymbolKeyword: typings.babelTypes.babelTypesStrings.TSSymbolKeyword
}
object TSSymbolKeyword {
  
  inline def apply(): TSSymbolKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[TSSymbolKeyword]
  }
  
  extension [Self <: TSSymbolKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
