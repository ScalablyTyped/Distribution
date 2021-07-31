package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentOptions extends StObject {
  
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
  def apply(): CommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentOptions]
  }
  
  @scala.inline
  implicit class CommentOptionsMutableBuilder[Self <: CommentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockCommentEnd(value: String): Self = StObject.set(x, "blockCommentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCommentEndUndefined: Self = StObject.set(x, "blockCommentEnd", js.undefined)
    
    @scala.inline
    def setBlockCommentLead(value: String): Self = StObject.set(x, "blockCommentLead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCommentLeadUndefined: Self = StObject.set(x, "blockCommentLead", js.undefined)
    
    @scala.inline
    def setBlockCommentStart(value: String): Self = StObject.set(x, "blockCommentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCommentStartUndefined: Self = StObject.set(x, "blockCommentStart", js.undefined)
    
    @scala.inline
    def setCommentBlankLines(value: Boolean): Self = StObject.set(x, "commentBlankLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentBlankLinesUndefined: Self = StObject.set(x, "commentBlankLines", js.undefined)
    
    @scala.inline
    def setFullLines(value: Boolean): Self = StObject.set(x, "fullLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLinesUndefined: Self = StObject.set(x, "fullLines", js.undefined)
    
    @scala.inline
    def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setLineComment(value: String): Self = StObject.set(x, "lineComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCommentUndefined: Self = StObject.set(x, "lineComment", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
