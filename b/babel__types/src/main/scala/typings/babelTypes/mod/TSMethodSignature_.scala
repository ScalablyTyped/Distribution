package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSMethodSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSMethodSignature_
  extends TSTypeElement
     with BaseNode {
  
  var computed: Boolean | Null = js.native
  
  var key: Expression = js.native
  
  var optional: Boolean | Null = js.native
  
  var parameters: js.Array[Identifier_ | RestElement_] = js.native
  
  var typeAnnotation: TSTypeAnnotation_ | Null = js.native
  
  var typeParameters: TSTypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSMethodSignature_ : TSMethodSignature = js.native
}
object TSMethodSignature_ {
  
  @scala.inline
  def apply(key: Expression, parameters: js.Array[Identifier_ | RestElement_], `type`: TSMethodSignature): TSMethodSignature_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMethodSignature_]
  }
  
  @scala.inline
  implicit class TSMethodSignature_Ops[Self <: TSMethodSignature_] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Expression): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSMethodSignature): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputed(value: Boolean): Self = this.set("computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedNull: Self = this.set("computed", null)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = this.set("optional", null)
    
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
