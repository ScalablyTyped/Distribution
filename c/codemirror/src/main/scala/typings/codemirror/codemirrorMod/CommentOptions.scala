package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentOptions extends js.Object {
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentEnd: js.UndefOr[String] = js.undefined
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentLead: js.UndefOr[String] = js.undefined
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentStart: js.UndefOr[String] = js.undefined
  /** Whether, when adding line comments, to also comment lines that contain only whitespace. */
  var commentBlankLines: js.UndefOr[Boolean] = js.undefined
  /** When block commenting, this controls whether the whole lines are indented, or only the precise range that is given. Defaults to `true`. */
  var fullLines: js.UndefOr[Boolean] = js.undefined
  /** When adding line comments and this is turned on, it will align the comment block to the current indentation of the first line of the block. */
  var indent: js.UndefOr[Boolean] = js.undefined
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var lineComment: js.UndefOr[String] = js.undefined
  /** A string that will be inserted after opening and leading markers, and before closing comment markers. Defaults to a single space. */
  var padding: js.UndefOr[String] = js.undefined
}

object CommentOptions {
  @scala.inline
  def apply(
    blockCommentEnd: String = null,
    blockCommentLead: String = null,
    blockCommentStart: String = null,
    commentBlankLines: js.UndefOr[Boolean] = js.undefined,
    fullLines: js.UndefOr[Boolean] = js.undefined,
    indent: js.UndefOr[Boolean] = js.undefined,
    lineComment: String = null,
    padding: String = null
  ): CommentOptions = {
    val __obj = js.Dynamic.literal()
    if (blockCommentEnd != null) __obj.updateDynamic("blockCommentEnd")(blockCommentEnd)
    if (blockCommentLead != null) __obj.updateDynamic("blockCommentLead")(blockCommentLead)
    if (blockCommentStart != null) __obj.updateDynamic("blockCommentStart")(blockCommentStart)
    if (!js.isUndefined(commentBlankLines)) __obj.updateDynamic("commentBlankLines")(commentBlankLines)
    if (!js.isUndefined(fullLines)) __obj.updateDynamic("fullLines")(fullLines)
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent)
    if (lineComment != null) __obj.updateDynamic("lineComment")(lineComment)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[CommentOptions]
  }
}

