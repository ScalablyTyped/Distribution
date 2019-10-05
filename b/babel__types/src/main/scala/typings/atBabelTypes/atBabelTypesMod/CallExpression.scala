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
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
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

