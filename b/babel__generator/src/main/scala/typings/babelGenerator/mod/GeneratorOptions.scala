package typings.babelGenerator.mod

import typings.babelGenerator.anon.Compact
import typings.babelGenerator.babelGeneratorStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorOptions extends js.Object {
  /**
    * Optional string to add as a block comment at the end of the output file.
    */
  var auxiliaryCommentAfter: js.UndefOr[String] = js.native
  /**
    * Optional string to add as a block comment at the start of the output file.
    */
  var auxiliaryCommentBefore: js.UndefOr[String] = js.native
  /**
    * Should comments be included in output? Defaults to `true`.
    */
  var comments: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to avoid adding whitespace for formatting. Defaults to the value of `opts.minified`.
    */
  var compact: js.UndefOr[Boolean | auto] = js.native
  /**
    * Set to true to reduce whitespace (but not as much as opts.compact). Defaults to `false`.
    */
  var concise: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to enable support for experimental decorators syntax before module exports.
    * Defaults to `false`.
    */
  var decoratorsBeforeExport: js.UndefOr[Boolean] = js.native
  /**
    * Used in warning messages
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Options for outputting jsesc representation.
    */
  var jsescOption: js.UndefOr[Compact] = js.native
  /**
    * Set to true to run jsesc with "json": true to print "\\u00A9" vs. "©";
    */
  var jsonCompatibleStrings: js.UndefOr[Boolean] = js.native
  /**
    * Should the output be minified. Defaults to `false`.
    */
  var minified: js.UndefOr[Boolean] = js.native
  /**
    * Retain parens around function expressions (could be used to change engine parsing behavior)
    * Defaults to `false`.
    */
  var retainFunctionParens: js.UndefOr[Boolean] = js.native
  /**
    * Attempt to use the same line numbers in the output code as in the source code (helps preserve stack traces).
    * Defaults to `false`.
    */
  var retainLines: js.UndefOr[Boolean] = js.native
  /**
    * Function that takes a comment (as a string) and returns true if the comment should be included in the output.
    * By default, comments are included if `opts.comments` is `true` or if `opts.minifed` is `false` and the comment
    * contains `@preserve` or `@license`.
    */
  var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.native
  /**
    * The filename for the source code (i.e. the code in the `code` argument).
    * This will only be used if `code` is a string.
    */
  var sourceFileName: js.UndefOr[String] = js.native
  /**
    * Enable generating source maps. Defaults to `false`.
    */
  var sourceMaps: js.UndefOr[Boolean] = js.native
  /**
    * A root for all relative URLs in the source map.
    */
  var sourceRoot: js.UndefOr[String] = js.native
}

object GeneratorOptions {
  @scala.inline
  def apply(): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorOptions]
  }
  @scala.inline
  implicit class GeneratorOptionsOps[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
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
    def setAuxiliaryCommentAfter(value: String): Self = this.set("auxiliaryCommentAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryCommentAfter: Self = this.set("auxiliaryCommentAfter", js.undefined)
    @scala.inline
    def setAuxiliaryCommentBefore(value: String): Self = this.set("auxiliaryCommentBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryCommentBefore: Self = this.set("auxiliaryCommentBefore", js.undefined)
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setCompact(value: Boolean | auto): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setConcise(value: Boolean): Self = this.set("concise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcise: Self = this.set("concise", js.undefined)
    @scala.inline
    def setDecoratorsBeforeExport(value: Boolean): Self = this.set("decoratorsBeforeExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecoratorsBeforeExport: Self = this.set("decoratorsBeforeExport", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setJsescOption(value: Compact): Self = this.set("jsescOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsescOption: Self = this.set("jsescOption", js.undefined)
    @scala.inline
    def setJsonCompatibleStrings(value: Boolean): Self = this.set("jsonCompatibleStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonCompatibleStrings: Self = this.set("jsonCompatibleStrings", js.undefined)
    @scala.inline
    def setMinified(value: Boolean): Self = this.set("minified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinified: Self = this.set("minified", js.undefined)
    @scala.inline
    def setRetainFunctionParens(value: Boolean): Self = this.set("retainFunctionParens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainFunctionParens: Self = this.set("retainFunctionParens", js.undefined)
    @scala.inline
    def setRetainLines(value: Boolean): Self = this.set("retainLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainLines: Self = this.set("retainLines", js.undefined)
    @scala.inline
    def setShouldPrintComment(value: /* comment */ String => Boolean): Self = this.set("shouldPrintComment", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldPrintComment: Self = this.set("shouldPrintComment", js.undefined)
    @scala.inline
    def setSourceFileName(value: String): Self = this.set("sourceFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFileName: Self = this.set("sourceFileName", js.undefined)
    @scala.inline
    def setSourceMaps(value: Boolean): Self = this.set("sourceMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMaps: Self = this.set("sourceMaps", js.undefined)
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
  }
  
}

