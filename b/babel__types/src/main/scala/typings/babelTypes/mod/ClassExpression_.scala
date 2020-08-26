package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ClassExpression_
  extends Class
     with BaseNode
     with Expression
     with Scopable {
  var body: ClassBody_ = js.native
  var decorators: js.Array[Decorator_] | Null = js.native
  var id: Identifier_ | Null = js.native
  var implements: (js.Array[TSExpressionWithTypeArguments_ | ClassImplements_]) | Null = js.native
  var mixins: InterfaceExtends_ | Null = js.native
  var superClass: Expression | Null = js.native
  var superTypeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ | Null = js.native
  @JSName("type")
  var type_ClassExpression_ : ClassExpression = js.native
}

object ClassExpression_ {
  @scala.inline
  def apply(body: ClassBody_, `type`: ClassExpression): ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression_]
  }
  @scala.inline
  implicit class ClassExpression_Ops[Self <: ClassExpression_] (val x: Self) extends AnyVal {
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
    def setBody(value: ClassBody_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ClassExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsNull: Self = this.set("decorators", null)
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setImplementsVarargs(value: (TSExpressionWithTypeArguments_ | ClassImplements_)*): Self = this.set("implements", js.Array(value :_*))
    @scala.inline
    def setImplements(value: js.Array[TSExpressionWithTypeArguments_ | ClassImplements_]): Self = this.set("implements", value.asInstanceOf[js.Any])
    @scala.inline
    def setImplementsNull: Self = this.set("implements", null)
    @scala.inline
    def setMixins(value: InterfaceExtends_): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def setMixinsNull: Self = this.set("mixins", null)
    @scala.inline
    def setSuperClass(value: Expression): Self = this.set("superClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperClassNull: Self = this.set("superClass", null)
    @scala.inline
    def setSuperTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation_): Self = this.set("superTypeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperTypeParametersNull: Self = this.set("superTypeParameters", null)
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
  
}

