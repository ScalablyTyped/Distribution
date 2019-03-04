package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSLiteralType
  extends Node
     with TSType {
  var literal: NumericLiteral | StringLiteral | BooleanLiteral
  @JSName("type")
  var type_TSLiteralType: babelDashTypesLib.babelDashTypesLibStrings.TSLiteralType
}

object TSLiteralType {
  @scala.inline
  def apply(
    end: scala.Double,
    literal: NumericLiteral | StringLiteral | BooleanLiteral,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSLiteralType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSLiteralType = {
    val __obj = js.Dynamic.literal(end = end, literal = literal.asInstanceOf[js.Any], loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSLiteralType]
  }
}

