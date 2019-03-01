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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CommentLine]
  }
}

