package typings.babelTypes.mod

import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.babelTypes.babelTypesStrings.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait CallExpression_
  extends Expression
     with BaseNode {
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_] = js.native
  var callee: Expression | V8IntrinsicIdentifier_ = js.native
  var optional: `true` | `false` | Null = js.native
  var typeArguments: TypeParameterInstantiation_ | Null = js.native
  var typeParameters: TSTypeParameterInstantiation_ | Null = js.native
  @JSName("type")
  var type_CallExpression_ : CallExpression = js.native
}

object CallExpression_ {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | V8IntrinsicIdentifier_,
    `type`: CallExpression
  ): CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallExpression_]
  }
  @scala.inline
  implicit class CallExpression_Ops[Self <: CallExpression_] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: (Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_)*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallee(value: Expression | V8IntrinsicIdentifier_): Self = this.set("callee", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CallExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: `true` | `false`): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalNull: Self = this.set("optional", null)
    @scala.inline
    def setTypeArguments(value: TypeParameterInstantiation_): Self = this.set("typeArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentsNull: Self = this.set("typeArguments", null)
    @scala.inline
    def setTypeParameters(value: TSTypeParameterInstantiation_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
  
}

