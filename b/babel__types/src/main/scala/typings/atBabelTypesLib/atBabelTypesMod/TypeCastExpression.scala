package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TypeCastExpression
  extends Expression
     with BaseNode
     with ExpressionWrapper
     with Flow {
  var expression: Expression
  var typeAnnotation: TypeAnnotation
  @JSName("type")
  var type_TypeCastExpression: atBabelTypesLib.atBabelTypesLibStrings.TypeCastExpression
}

object TypeCastExpression {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotation,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TypeCastExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeCastExpression]
  }
}

