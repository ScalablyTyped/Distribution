package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File_
  extends BaseNode
     with _Node {
  var comments: (js.Array[CommentBlock | CommentLine]) | Null
  var program: Program_
  var tokens: js.Array[_] | Null
  @JSName("type")
  var type_File_ : File
}

object File_ {
  @scala.inline
  def apply(
    program: Program_,
    `type`: File,
    comments: js.Array[CommentBlock | CommentLine] = null,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    tokens: js.Array[_] = null,
    trailingComments: js.Array[Comment] = null
  ): File_ = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File_]
  }
}

