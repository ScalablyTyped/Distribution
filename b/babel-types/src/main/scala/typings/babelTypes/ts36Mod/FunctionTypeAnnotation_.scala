package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  
  var params: js.Array[FunctionTypeParam_] = js.native
  
  var rest: FunctionTypeParam_ = js.native
  
  var returnType: FlowTypeAnnotation = js.native
  
  var typeParameters: TypeParameterDeclaration_ = js.native
  
  @JSName("type")
  var type_FunctionTypeAnnotation_ : FunctionTypeAnnotation = js.native
}
object FunctionTypeAnnotation_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_,
    returnType: FlowTypeAnnotation,
    start: Double,
    `type`: FunctionTypeAnnotation,
    typeParameters: TypeParameterDeclaration_
  ): FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setReturnType(value: FlowTypeAnnotation): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FunctionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
