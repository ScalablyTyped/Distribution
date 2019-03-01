package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File
  extends BaseNode
     with _Node {
  var comments: js.Any
  var program: Program
  var tokens: js.Any
  @JSName("type")
  var type_File: atBabelTypesLib.atBabelTypesLibStrings.File
}

object File {
  @scala.inline
  def apply(
    comments: js.Any,
    program: Program,
    tokens: js.Any,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.File,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): File = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("program")(program)
    __obj.updateDynamic("tokens")(tokens)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[File]
  }
}

