package typings.atBabelTemplate.atBabelTemplateMod

import typings.atBabelParser.atBabelParserMod.ParserOptions
import typings.atBabelParser.atBabelParserMod.ParserPlugin
import typings.atBabelParser.atBabelParserStrings.module
import typings.atBabelParser.atBabelParserStrings.script
import typings.atBabelParser.atBabelParserStrings.unambiguous
import typings.atBabelTemplate.atBabelTemplateNumbers.`false`
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
    createParenthesizedExpressions: js.UndefOr[Boolean] = js.undefined,
    placeholderPattern: RegExp | `false` = null,
    placeholderWhitelist: Set[String] = null,
    plugins: js.Array[ParserPlugin] = null,
    preserveComments: js.UndefOr[Boolean] = js.undefined,
    ranges: js.UndefOr[Boolean] = js.undefined,
    sourceFilename: String = null,
    sourceType: script | module | unambiguous = null,
    startLine: Int | Double = null,
    strictMode: js.UndefOr[Boolean] = js.undefined,
    tokens: js.UndefOr[Boolean] = js.undefined
  ): TemplateBuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAwaitOutsideFunction)) __obj.updateDynamic("allowAwaitOutsideFunction")(allowAwaitOutsideFunction)
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere)
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction)
    if (!js.isUndefined(allowSuperOutsideMethod)) __obj.updateDynamic("allowSuperOutsideMethod")(allowSuperOutsideMethod)
    if (!js.isUndefined(createParenthesizedExpressions)) __obj.updateDynamic("createParenthesizedExpressions")(createParenthesizedExpressions)
    if (placeholderPattern != null) __obj.updateDynamic("placeholderPattern")(placeholderPattern.asInstanceOf[js.Any])
    if (placeholderWhitelist != null) __obj.updateDynamic("placeholderWhitelist")(placeholderWhitelist)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(preserveComments)) __obj.updateDynamic("preserveComments")(preserveComments)
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges)
    if (sourceFilename != null) __obj.updateDynamic("sourceFilename")(sourceFilename)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (startLine != null) __obj.updateDynamic("startLine")(startLine.asInstanceOf[js.Any])
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode)
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[TemplateBuilderOptions]
  }
}

