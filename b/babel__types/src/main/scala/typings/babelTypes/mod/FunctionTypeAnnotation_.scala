package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait FunctionTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  var params: js.Array[FunctionTypeParam_] = js.native
  
  var rest: FunctionTypeParam_ | Null = js.native
  
  var returnType: FlowType = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_FunctionTypeAnnotation_ : FunctionTypeAnnotation = js.native
}
object FunctionTypeAnnotation_ {
  
  @scala.inline
  def apply(params: js.Array[FunctionTypeParam_], returnType: FlowType, `type`: FunctionTypeAnnotation): FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeAnnotation_]
  }
  
  @scala.inline
  implicit class FunctionTypeAnnotation_Ops[Self <: FunctionTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParamsVarargs(value: FunctionTypeParam_ *): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[FunctionTypeParam_]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: FlowType): Self = this.set("returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FunctionTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest(value: FunctionTypeParam_): Self = this.set("rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestNull: Self = this.set("rest", null)
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
