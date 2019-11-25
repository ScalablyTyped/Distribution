package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atBabelTypes.atBabelTypesMod.CommentBlock
  - typings.atBabelTypes.atBabelTypesMod.CommentLine
*/
trait Comment extends js.Object

object Comment {
  @scala.inline
  def CommentBlock(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.atBabelTypes.atBabelTypesStrings.CommentBlock,
    value: String
  ): Comment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  def CommentLine(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.atBabelTypes.atBabelTypesStrings.CommentLine,
    value: String
  ): Comment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

