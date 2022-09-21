package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSObjectKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSObjectKeyword: typings.babelTypes.babelTypesStrings.TSObjectKeyword
}
object TSObjectKeyword {
  
  inline def apply(): TSObjectKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[TSObjectKeyword]
  }
  
  extension [Self <: TSObjectKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSObjectKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
