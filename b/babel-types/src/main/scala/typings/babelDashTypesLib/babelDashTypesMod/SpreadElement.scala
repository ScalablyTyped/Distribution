package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadElement
  extends Node
     with UnaryLike {
  var argument: Expression
  @JSName("type")
  var type_SpreadElement: babelDashTypesLib.babelDashTypesLibStrings.SpreadElement
}

object SpreadElement {
  @scala.inline
  def apply(
    argument: Expression,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.SpreadElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SpreadElement]
  }
}

