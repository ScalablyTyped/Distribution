package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File_
  extends BaseNode
     with _Node {
  var comments: js.Any
  var program: Program_
  var tokens: js.Any
  @JSName("type")
  var type_File_ : File
}

object File_ {
  @scala.inline
  def apply(
    comments: js.Any,
    program: Program_,
    tokens: js.Any,
    `type`: File,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): File_ = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File_]
  }
}

