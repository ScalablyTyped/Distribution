package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameterDeclaration__
  extends StObject
     with BaseNode {
  
  var params: js.Array[TSTypeParameter__]
  
  @JSName("type")
  var type_TSTypeParameterDeclaration__ : "TSTypeParameterDeclaration"
}
object TSTypeParameterDeclaration__ {
  
  inline def apply(params: js.Array[TSTypeParameter__]): TSTypeParameterDeclaration__ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[TSTypeParameterDeclaration__]
  }
  
  extension [Self <: TSTypeParameterDeclaration__](x: Self) {
    
    inline def setParams(value: js.Array[TSTypeParameter__]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TSTypeParameter__ *): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: "TSTypeParameterDeclaration"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
