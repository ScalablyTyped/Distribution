package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentOptions extends js.Object {
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentEnd: js.UndefOr[String] = js.native
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentLead: js.UndefOr[String] = js.native
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentStart: js.UndefOr[String] = js.native
  /** Whether, when adding line comments, to also comment lines that contain only whitespace. */
  var commentBlankLines: js.UndefOr[Boolean] = js.native
  /** When block commenting, this controls whether the whole lines are indented, or only the precise range that is given. Defaults to `true`. */
  var fullLines: js.UndefOr[Boolean] = js.native
  /** When adding line comments and this is turned on, it will align the comment block to the current indentation of the first line of the block. */
  var indent: js.UndefOr[Boolean] = js.native
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var lineComment: js.UndefOr[String] = js.native
  /** A string that will be inserted after opening and leading markers, and before closing comment markers. Defaults to a single space. */
  var padding: js.UndefOr[String] = js.native
}

object CommentOptions {
  @scala.inline
  def apply(): CommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentOptions]
  }
  @scala.inline
  implicit class CommentOptionsOps[Self <: CommentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockCommentEnd(value: String): Self = this.set("blockCommentEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockCommentEnd: Self = this.set("blockCommentEnd", js.undefined)
    @scala.inline
    def setBlockCommentLead(value: String): Self = this.set("blockCommentLead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockCommentLead: Self = this.set("blockCommentLead", js.undefined)
    @scala.inline
    def setBlockCommentStart(value: String): Self = this.set("blockCommentStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockCommentStart: Self = this.set("blockCommentStart", js.undefined)
    @scala.inline
    def setCommentBlankLines(value: Boolean): Self = this.set("commentBlankLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentBlankLines: Self = this.set("commentBlankLines", js.undefined)
    @scala.inline
    def setFullLines(value: Boolean): Self = this.set("fullLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullLines: Self = this.set("fullLines", js.undefined)
    @scala.inline
    def setIndent(value: Boolean): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setLineComment(value: String): Self = this.set("lineComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineComment: Self = this.set("lineComment", js.undefined)
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

