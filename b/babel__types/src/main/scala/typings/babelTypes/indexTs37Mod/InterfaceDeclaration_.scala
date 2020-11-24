package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait InterfaceDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var body: ObjectTypeAnnotation_ = js.native
  
  var `extends`: js.Array[InterfaceExtends_] | Null = js.native
  
  var id: Identifier_ = js.native
  
  var implements: js.Array[ClassImplements_] | Null = js.native
  
  var mixins: js.Array[InterfaceExtends_] | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_InterfaceDeclaration_ : InterfaceDeclaration = js.native
}
object InterfaceDeclaration_ {
  
  @scala.inline
  def apply(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDeclaration_]
  }
  
  @scala.inline
  implicit class InterfaceDeclaration_Ops[Self <: InterfaceDeclaration_] (val x: Self) extends AnyVal {
    
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
    def setBody(value: ObjectTypeAnnotation_): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InterfaceDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtends_ *): Self = this.set("extends", js.Array(value :_*))
    
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtends_]): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsNull: Self = this.set("extends", null)
    
    @scala.inline
    def setImplementsVarargs(value: ClassImplements_ *): Self = this.set("implements", js.Array(value :_*))
    
    @scala.inline
    def setImplements(value: js.Array[ClassImplements_]): Self = this.set("implements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementsNull: Self = this.set("implements", null)
    
    @scala.inline
    def setMixinsVarargs(value: InterfaceExtends_ *): Self = this.set("mixins", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: js.Array[InterfaceExtends_]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsNull: Self = this.set("mixins", null)
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
