package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSInterfaceDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSInterfaceBody_ = js.native
  var declare: Boolean | Null = js.native
  var `extends`: js.Array[TSExpressionWithTypeArguments_] | Null = js.native
  var id: Identifier_ = js.native
  var typeParameters: TSTypeParameterDeclaration_ | Null = js.native
  @JSName("type")
  var type_TSInterfaceDeclaration_ : TSInterfaceDeclaration = js.native
}

object TSInterfaceDeclaration_ {
  @scala.inline
  def apply(body: TSInterfaceBody_, id: Identifier_, `type`: TSInterfaceDeclaration): TSInterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInterfaceDeclaration_]
  }
  @scala.inline
  implicit class TSInterfaceDeclaration_Ops[Self <: TSInterfaceDeclaration_] (val x: Self) extends AnyVal {
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
    def setBody(value: TSInterfaceBody_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSInterfaceDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclare(value: Boolean): Self = this.set("declare", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclareNull: Self = this.set("declare", null)
    @scala.inline
    def setExtendsVarargs(value: TSExpressionWithTypeArguments_ *): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: js.Array[TSExpressionWithTypeArguments_]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendsNull: Self = this.set("extends", null)
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
  
}

