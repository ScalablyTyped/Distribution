package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUnionType
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSUnionType: typings.babelTypes.babelTypesStrings.TSUnionType
  
  var types: js.Array[TSType]
}
object TSUnionType {
  
  inline def apply(types: js.Array[TSType]): TSUnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[TSUnionType]
  }
  
  extension [Self <: TSUnionType](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
