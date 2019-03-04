package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentLine
  extends BaseComment
     with Comment {
  @JSName("type")
  var type_CommentLine: atBabelTypesLib.atBabelTypesLibStrings.CommentLine
}

object CommentLine {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.CommentLine,
    value: java.lang.String
  ): CommentLine = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommentLine]
  }
}

