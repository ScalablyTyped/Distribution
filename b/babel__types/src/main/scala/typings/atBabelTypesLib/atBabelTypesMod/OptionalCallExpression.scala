package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait OptionalCallExpression
  extends Expression
     with BaseNode {
  var arguments: js.Array[Expression | SpreadElement | JSXNamespacedName]
  var callee: Expression
  var optional: scala.Boolean
  var typeArguments: TypeParameterInstantiation | scala.Null
  var typeParameters: TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_OptionalCallExpression: atBabelTypesLib.atBabelTypesLibStrings.OptionalCallExpression
}

object OptionalCallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    callee: Expression,
    optional: scala.Boolean,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.OptionalCallExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeArguments: TypeParameterInstantiation = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): OptionalCallExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("arguments")(arguments)
    __obj.updateDynamic("callee")(callee)
    __obj.updateDynamic("optional")(optional)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[OptionalCallExpression]
  }
}

