package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentBlock
  extends BaseComment
     with Comment {
  @JSName("type")
  var type_CommentBlock: typings.atBabelTypes.atBabelTypesStrings.CommentBlock
}

object CommentBlock {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.atBabelTypes.atBabelTypesStrings.CommentBlock,
    value: String
  ): CommentBlock = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommentBlock]
  }
}

