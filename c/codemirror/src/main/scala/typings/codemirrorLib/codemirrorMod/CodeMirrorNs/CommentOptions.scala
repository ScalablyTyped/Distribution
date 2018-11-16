package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommentOptions extends js.Object {
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentEnd: js.UndefOr[java.lang.String] = js.undefined
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentLead: js.UndefOr[java.lang.String] = js.undefined
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentStart: js.UndefOr[java.lang.String] = js.undefined
  /** Whether, when adding line comments, to also comment lines that contain only whitespace. */
  var commentBlankLines: js.UndefOr[scala.Boolean] = js.undefined
  /** When block commenting, this controls whether the whole lines are indented, or only the precise range that is given. Defaults to `true`. */
  var fullLines: js.UndefOr[scala.Boolean] = js.undefined
  /** When adding line comments and this is turned on, it will align the comment block to the current indentation of the first line of the block. */
  var indent: js.UndefOr[scala.Boolean] = js.undefined
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var lineComment: js.UndefOr[java.lang.String] = js.undefined
  /** A string that will be inserted after opening and leading markers, and before closing comment markers. Defaults to a single space. */
  var padding: js.UndefOr[java.lang.String] = js.undefined
}

