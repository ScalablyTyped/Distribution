package typings.babelTemplate.mod

import typings.babelParser.babelParserStrings.module
import typings.babelParser.babelParserStrings.script
import typings.babelParser.babelParserStrings.unambiguous
import typings.babelParser.mod.ParserOptions
import typings.babelParser.mod.ParserPlugin
import typings.babelTemplate.babelTemplateBooleans.`false`
import typings.std.RegExp
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateBuilderOptions extends ParserOptions {
  /**
    * A pattern to search for when looking for Identifier and StringLiteral nodes that should be considered placeholders. `false` will
    * disable placeholder searching entirely, leaving only the `placeholderWhitelist` value to find placeholders.
    */
  var placeholderPattern: js.UndefOr[RegExp | `false`] = js.undefined
  /**
    * A set of placeholder names to automatically accept. Items in this list do not need to match the given placeholder pattern.
    */
  var placeholderWhitelist: js.UndefOr[Set[String]] = js.undefined
  /**
    * Set this to `true` to preserve any comments from the `code` parameter.
    */
  var preserveComments: js.UndefOr[Boolean] = js.undefined
}

object TemplateBuilderOptions {
  @scala.inline
  def apply(
    allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.undefined,
    allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined,
    allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined,
    allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined,
    allowUndeclaredExports: js.UndefOr[Boolean] = js.undefined,
    createParenthesizedExpressions: js.UndefOr[Boolean] = js.undefined,
    placeholderPattern: RegExp | `false` = null,
    placeholderWhitelist: Set[String] = null,
    plugins: js.Array[ParserPlugin] = null,
    preserveComments: js.UndefOr[Boolean] = js.undefined,
    ranges: js.UndefOr[Boolean] = js.undefined,
    sourceFilename: String = null,
    sourceType: script | module | unambiguous = null,
    startLine: js.UndefOr[Double] = js.undefined,
    strictMode: js.UndefOr[Boolean] = js.undefined,
    tokens: js.UndefOr[Boolean] = js.undefined
  ): TemplateBuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAwaitOutsideFunction)) __obj.updateDynamic("allowAwaitOutsideFunction")(allowAwaitOutsideFunction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSuperOutsideMethod)) __obj.updateDynamic("allowSuperOutsideMethod")(allowSuperOutsideMethod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUndeclaredExports)) __obj.updateDynamic("allowUndeclaredExports")(allowUndeclaredExports.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createParenthesizedExpressions)) __obj.updateDynamic("createParenthesizedExpressions")(createParenthesizedExpressions.get.asInstanceOf[js.Any])
    if (placeholderPattern != null) __obj.updateDynamic("placeholderPattern")(placeholderPattern.asInstanceOf[js.Any])
    if (placeholderWhitelist != null) __obj.updateDynamic("placeholderWhitelist")(placeholderWhitelist.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveComments)) __obj.updateDynamic("preserveComments")(preserveComments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges.get.asInstanceOf[js.Any])
    if (sourceFilename != null) __obj.updateDynamic("sourceFilename")(sourceFilename.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(startLine)) __obj.updateDynamic("startLine")(startLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateBuilderOptions]
  }
}

