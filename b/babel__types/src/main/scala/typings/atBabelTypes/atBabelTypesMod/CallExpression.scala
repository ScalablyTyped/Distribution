package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesNumbers.`false`
import typings.atBabelTypes.atBabelTypesNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait CallExpression
  extends Expression
     with BaseNode {
  var arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder]
  var callee: Expression | V8IntrinsicIdentifier
  var optional: `true` | `false` | Null
  var typeArguments: TypeParameterInstantiation | Null
  var typeParameters: TSTypeParameterInstantiation | Null
  @JSName("type")
  var type_CallExpression: typings.atBabelTypes.atBabelTypesStrings.CallExpression
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    callee: Expression | V8IntrinsicIdentifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.CallExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: `true` | `false` = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeArguments: TypeParameterInstantiation = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallExpression]
  }
}

@JSImport("@babel/types", "callExpression")
@js.native
object callExpression extends js.Object {
  def apply(
    callee: Expression | V8IntrinsicIdentifier,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder]
  ): CallExpression = js.native
  def apply(
    callee: Expression | V8IntrinsicIdentifier,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `true` | `false`
  ): CallExpression = js.native
  def apply(
    callee: Expression | V8IntrinsicIdentifier,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `true` | `false`,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  def apply(
    callee: Expression | V8IntrinsicIdentifier,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `true` | `false`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
}

