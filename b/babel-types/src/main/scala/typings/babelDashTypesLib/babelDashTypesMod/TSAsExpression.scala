package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSAsExpression
  extends Node
     with Expression {
  var expression: Expression
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSAsExpression: babelDashTypesLib.babelDashTypesLibStrings.TSAsExpression
}

object TSAsExpression {
  @scala.inline
  def apply(
    end: scala.Double,
    expression: Expression,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSAsExpression,
    typeAnnotation: TSType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSAsExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSAsExpression]
  }
}

