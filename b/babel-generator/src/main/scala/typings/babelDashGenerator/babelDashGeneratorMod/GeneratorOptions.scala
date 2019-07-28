package typings.babelDashGenerator.babelDashGeneratorMod

import typings.babelDashGenerator.babelDashGeneratorStrings.auto
import typings.babelDashGenerator.babelDashGeneratorStrings.double
import typings.babelDashGenerator.babelDashGeneratorStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorOptions extends js.Object {
  /**
    * Optional string to add as a block comment at the end of the output file.
    */
  var auxiliaryCommentAfter: js.UndefOr[String] = js.undefined
  /**
    * Optional string to add as a block comment at the start of the output file.
    */
  var auxiliaryCommentBefore: js.UndefOr[String] = js.undefined
  /**
    * Should comments be included in output? Defaults to `true`.
    */
  var comments: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to avoid adding whitespace for formatting. Defaults to the value of `opts.minified`.
    */
  var compact: js.UndefOr[Boolean | auto] = js.undefined
  /**
    * Set to true to reduce whitespace (but not as much as opts.compact). Defaults to `false`.
    */
  var concise: js.UndefOr[Boolean] = js.undefined
  /**
    * Used in warning messages
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Set to true to run jsesc with "json": true to print "\\u00A9" vs. "©";
    */
  var jsonCompatibleStrings: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the output be minified. Defaults to `false`.
    */
  var minified: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of quote to use in the output. If omitted, autodetects based on `ast.tokens`.
    */
  var quotes: js.UndefOr[single | double] = js.undefined
  /**
    * Attempt to use the same line numbers in the output code as in the source code (helps preserve stack traces).
    * Defaults to `false`.
    */
  var retainLines: js.UndefOr[Boolean] = js.undefined
  /**
    * Function that takes a comment (as a string) and returns true if the comment should be included in the output.
    * By default, comments are included if `opts.comments` is `true` or if `opts.minifed` is `false` and the comment
    * contains `@preserve` or `@license`.
    */
  var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.undefined
  /**
    * The filename for the source code (i.e. the code in the `code` argument).
    * This will only be used if `code` is a string.
    */
  var sourceFileName: js.UndefOr[String] = js.undefined
  /**
    * The filename of the generated code that the source map will be associated with.
    */
  var sourceMapTarget: js.UndefOr[String] = js.undefined
  /**
    * Enable generating source maps. Defaults to `false`.
    */
  var sourceMaps: js.UndefOr[Boolean] = js.undefined
  /**
    * A root for all relative URLs in the source map.
    */
  var sourceRoot: js.UndefOr[String] = js.undefined
}

object GeneratorOptions {
  @scala.inline
  def apply(
    auxiliaryCommentAfter: String = null,
    auxiliaryCommentBefore: String = null,
    comments: js.UndefOr[Boolean] = js.undefined,
    compact: Boolean | auto = null,
    concise: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    jsonCompatibleStrings: js.UndefOr[Boolean] = js.undefined,
    minified: js.UndefOr[Boolean] = js.undefined,
    quotes: single | double = null,
    retainLines: js.UndefOr[Boolean] = js.undefined,
    shouldPrintComment: /* comment */ String => Boolean = null,
    sourceFileName: String = null,
    sourceMapTarget: String = null,
    sourceMaps: js.UndefOr[Boolean] = js.undefined,
    sourceRoot: String = null
  ): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryCommentAfter != null) __obj.updateDynamic("auxiliaryCommentAfter")(auxiliaryCommentAfter)
    if (auxiliaryCommentBefore != null) __obj.updateDynamic("auxiliaryCommentBefore")(auxiliaryCommentBefore)
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments)
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(concise)) __obj.updateDynamic("concise")(concise)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(jsonCompatibleStrings)) __obj.updateDynamic("jsonCompatibleStrings")(jsonCompatibleStrings)
    if (!js.isUndefined(minified)) __obj.updateDynamic("minified")(minified)
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(retainLines)) __obj.updateDynamic("retainLines")(retainLines)
    if (shouldPrintComment != null) __obj.updateDynamic("shouldPrintComment")(js.Any.fromFunction1(shouldPrintComment))
    if (sourceFileName != null) __obj.updateDynamic("sourceFileName")(sourceFileName)
    if (sourceMapTarget != null) __obj.updateDynamic("sourceMapTarget")(sourceMapTarget)
    if (!js.isUndefined(sourceMaps)) __obj.updateDynamic("sourceMaps")(sourceMaps)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[GeneratorOptions]
  }
}

