package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentLine extends Comment {
  var `type`: babelDashTypesLib.babelDashTypesLibStrings.CommentLine
}

object CommentLine {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.CommentLine,
    value: java.lang.String
  ): CommentLine = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommentLine]
  }
}

