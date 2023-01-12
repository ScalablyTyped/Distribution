package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  var params: js.Array[FunctionTypeParam_]
  
  var rest: FunctionTypeParam_
  
  var returnType: FlowTypeAnnotation
  
  var typeParameters: TypeParameterDeclaration_
  
  @JSName("type")
  var type_FunctionTypeAnnotation_ : FunctionTypeAnnotation
}
object FunctionTypeAnnotation_ {
  
  inline def apply(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_,
    returnType: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[FunctionTypeAnnotation_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionTypeAnnotation_] (val x: Self) extends AnyVal {
    
    inline def setParams(value: js.Array[FunctionTypeParam_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: FunctionTypeParam_ *): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setRest(value: FunctionTypeParam_): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: FlowTypeAnnotation): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setType(value: FunctionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
