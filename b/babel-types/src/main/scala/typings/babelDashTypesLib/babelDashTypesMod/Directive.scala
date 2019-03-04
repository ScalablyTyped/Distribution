package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive extends Node {
  @JSName("type")
  var type_Directive: babelDashTypesLib.babelDashTypesLibStrings.Directive
  var value: DirectiveLiteral
}

object Directive {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.Directive,
    value: DirectiveLiteral,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): Directive = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Directive]
  }
}

