package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait FunctionTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var params: js.Array[FunctionTypeParam_]
  
  var rest: FunctionTypeParam_ | Null
  
  var returnType: FlowType
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_FunctionTypeAnnotation_ : FunctionTypeAnnotation
}
object FunctionTypeAnnotation_ {
  
  @scala.inline
  def apply(params: js.Array[FunctionTypeParam_], returnType: FlowType): FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, rest = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[FunctionTypeAnnotation_]
  }
  
  @scala.inline
  implicit class FunctionTypeAnnotation_MutableBuilder[Self <: FunctionTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[FunctionTypeParam_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: FunctionTypeParam_ *): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setRest(value: FunctionTypeParam_): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestNull: Self = StObject.set(x, "rest", null)
    
    @scala.inline
    def setReturnType(value: FlowType): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FunctionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
