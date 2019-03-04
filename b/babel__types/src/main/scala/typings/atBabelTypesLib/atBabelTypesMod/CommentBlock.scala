package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentBlock
  extends BaseComment
     with Comment {
  @JSName("type")
  var type_CommentBlock: atBabelTypesLib.atBabelTypesLibStrings.CommentBlock
}

object CommentBlock {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.CommentBlock,
    value: java.lang.String
  ): CommentBlock = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommentBlock]
  }
}

