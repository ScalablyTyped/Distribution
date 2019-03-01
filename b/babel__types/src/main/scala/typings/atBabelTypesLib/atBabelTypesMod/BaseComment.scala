package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComment extends js.Object {
  var end: scala.Double
  var loc: SourceLocation
  var start: scala.Double
  var `type`: atBabelTypesLib.atBabelTypesLibStrings.CommentBlock | atBabelTypesLib.atBabelTypesLibStrings.CommentLine
  var value: java.lang.String
}

object BaseComment {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.CommentBlock | atBabelTypesLib.atBabelTypesLibStrings.CommentLine,
    value: java.lang.String
  ): BaseComment = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BaseComment]
  }
}

