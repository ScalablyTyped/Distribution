package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionTypeAnnotation_
  extends StObject
     with BaseNode {
  
  var params: js.Array[FunctionTypeParam_]
  
  var rest: js.UndefOr[FunctionTypeParam_ | Null] = js.undefined
  
  var returnType: FlowType
  
  var `this`: js.UndefOr[FunctionTypeParam_ | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_ | Null] = js.undefined
  
  @JSName("type")
  var type_FunctionTypeAnnotation_ : "FunctionTypeAnnotation"
}
object FunctionTypeAnnotation_ {
  
  inline def apply(params: js.Array[FunctionTypeParam_], returnType: FlowType): FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[FunctionTypeAnnotation_]
  }
  
  extension [Self <: FunctionTypeAnnotation_](x: Self) {
    
    inline def setParams(value: js.Array[FunctionTypeParam_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: FunctionTypeParam_ *): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setRest(value: FunctionTypeParam_): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestNull: Self = StObject.set(x, "rest", null)
    
    inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    inline def setReturnType(value: FlowType): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setThis(value: FunctionTypeParam_): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
    
    inline def setThisNull: Self = StObject.set(x, "this", null)
    
    inline def setThisUndefined: Self = StObject.set(x, "this", js.undefined)
    
    inline def setType(value: "FunctionTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
