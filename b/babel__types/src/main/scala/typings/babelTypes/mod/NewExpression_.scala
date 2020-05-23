package typings.babelTypes.mod

import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.babelTypes.babelTypesStrings.NewExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait NewExpression_
  extends Expression
     with BaseNode {
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  var callee: Expression | V8IntrinsicIdentifier_
  var optional: `true` | `false` | Null
  var typeArguments: TypeParameterInstantiation_ | Null
  var typeParameters: TSTypeParameterInstantiation_ | Null
  @JSName("type")
  var type_NewExpression_ : NewExpression
}

object NewExpression_ {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | V8IntrinsicIdentifier_,
    `type`: NewExpression,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: `true` | `false` = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeArguments: TypeParameterInstantiation_ = null,
    typeParameters: TSTypeParameterInstantiation_ = null
  ): NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExpression_]
  }
}

