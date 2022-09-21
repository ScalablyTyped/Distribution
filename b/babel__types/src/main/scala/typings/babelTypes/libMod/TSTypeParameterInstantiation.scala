package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameterInstantiation
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var params: js.Array[TSType]
  
  @JSName("type")
  var type_TSTypeParameterInstantiation: typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
}
object TSTypeParameterInstantiation {
  
  inline def apply(params: js.Array[TSType]): TSTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[TSTypeParameterInstantiation]
  }
  
  extension [Self <: TSTypeParameterInstantiation](x: Self) {
    
    inline def setParams(value: js.Array[TSType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TSType*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
