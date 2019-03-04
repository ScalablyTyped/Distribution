package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentBlock extends Comment {
  var `type`: babelDashTypesLib.babelDashTypesLibStrings.CommentBlock
}

object CommentBlock {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.CommentBlock,
    value: java.lang.String
  ): CommentBlock = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommentBlock]
  }
}

