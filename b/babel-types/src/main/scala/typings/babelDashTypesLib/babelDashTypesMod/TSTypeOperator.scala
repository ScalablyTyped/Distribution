package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeOperator
  extends Node
     with TSType {
  var operator: java.lang.String | scala.Null
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSTypeOperator: babelDashTypesLib.babelDashTypesLibStrings.TSTypeOperator
}

object TSTypeOperator {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTypeOperator,
    typeAnnotation: TSType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    operator: java.lang.String = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeOperator = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeOperator]
  }
}

