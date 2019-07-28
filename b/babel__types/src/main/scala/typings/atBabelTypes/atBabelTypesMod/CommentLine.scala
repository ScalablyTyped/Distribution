package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentLine
  extends BaseComment
     with Comment {
  @JSName("type")
  var type_CommentLine: typings.atBabelTypes.atBabelTypesStrings.CommentLine
}

object CommentLine {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.atBabelTypes.atBabelTypesStrings.CommentLine,
    value: String
  ): CommentLine = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommentLine]
  }
}

