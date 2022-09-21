package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNumberKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSNumberKeyword: typings.babelTypes.babelTypesStrings.TSNumberKeyword
}
object TSNumberKeyword {
  
  inline def apply(): TSNumberKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[TSNumberKeyword]
  }
  
  extension [Self <: TSNumberKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNumberKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
