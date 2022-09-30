package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSSymbolKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSSymbolKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSSymbolKeyword__ : TSSymbolKeyword
}
object TSSymbolKeyword__ {
  
  inline def apply(): TSSymbolKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[TSSymbolKeyword__]
  }
  
  extension [Self <: TSSymbolKeyword__](x: Self) {
    
    inline def setType(value: TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
