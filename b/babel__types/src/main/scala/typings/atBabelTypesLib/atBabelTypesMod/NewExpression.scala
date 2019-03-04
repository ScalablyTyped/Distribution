package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait NewExpression
  extends Expression
     with BaseNode {
  var arguments: js.Array[Expression | SpreadElement | JSXNamespacedName]
  var callee: Expression
  var optional: atBabelTypesLib.atBabelTypesLibNumbers.`true` | atBabelTypesLib.atBabelTypesLibNumbers.`false` | scala.Null
  var typeArguments: TypeParameterInstantiation | scala.Null
  var typeParameters: TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_NewExpression: atBabelTypesLib.atBabelTypesLibStrings.NewExpression
}

object NewExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    callee: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.NewExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true` | atBabelTypesLib.atBabelTypesLibNumbers.`false` = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeArguments: TypeParameterInstantiation = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee)
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
    __obj.asInstanceOf[NewExpression]
  }
}

