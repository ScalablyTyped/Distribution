package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSConstructorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSConstructorType_
  extends TSType
     with BaseNode {
  
  var parameters: js.Array[Identifier_ | RestElement_] = js.native
  
  var typeAnnotation: TSTypeAnnotation_ | Null = js.native
  
  var typeParameters: TSTypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSConstructorType_ : TSConstructorType = js.native
}
object TSConstructorType_ {
  
  @scala.inline
  def apply(parameters: js.Array[Identifier_ | RestElement_], `type`: TSConstructorType): TSConstructorType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConstructorType_]
  }
  
  @scala.inline
  implicit class TSConstructorType_Ops[Self <: TSConstructorType_] (val x: Self) extends AnyVal {
    
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
    def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSConstructorType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = this.set("typeAnnotation", null)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
