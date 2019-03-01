package typings
package atBabelTemplateLib.atBabelTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateBuilderOptions
  extends atBabelParserLib.atBabelParserMod.ParserOptions {
  /**
    * A pattern to search for when looking for Identifier and StringLiteral nodes that should be considered placeholders. `false` will
    * disable placeholder searching entirely, leaving only the `placeholderWhitelist` value to find placeholders.
    */
  var placeholderPattern: js.UndefOr[stdLib.RegExp | atBabelTemplateLib.atBabelTemplateLibNumbers.`false`] = js.undefined
  /**
    * A set of placeholder names to automatically accept. Items in this list do not need to match the given placeholder pattern.
    */
  var placeholderWhitelist: js.UndefOr[lodashLib.lodashMod.Global.Set[java.lang.String]] = js.undefined
  /**
    * Set this to `true` to preserve any comments from the `code` parameter.
    */
  var preserveComments: js.UndefOr[scala.Boolean] = js.undefined
}

object TemplateBuilderOptions {
  @scala.inline
  def apply(
    allowAwaitOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined,
    allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined,
    allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined,
    allowSuperOutsideMethod: js.UndefOr[scala.Boolean] = js.undefined,
    placeholderPattern: stdLib.RegExp | atBabelTemplateLib.atBabelTemplateLibNumbers.`false` = null,
    placeholderWhitelist: lodashLib.lodashMod.Global.Set[java.lang.String] = null,
    plugins: js.Array[atBabelParserLib.atBabelParserMod.ParserPlugin] = null,
    preserveComments: js.UndefOr[scala.Boolean] = js.undefined,
    ranges: js.UndefOr[scala.Boolean] = js.undefined,
    sourceFilename: java.lang.String = null,
    sourceType: atBabelParserLib.atBabelParserLibStrings.script | atBabelParserLib.atBabelParserLibStrings.module | atBabelParserLib.atBabelParserLibStrings.unambiguous = null,
    startLine: scala.Int | scala.Double = null,
    strictMode: js.UndefOr[scala.Boolean] = js.undefined,
    tokens: js.UndefOr[scala.Boolean] = js.undefined
  ): TemplateBuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAwaitOutsideFunction)) __obj.updateDynamic("allowAwaitOutsideFunction")(allowAwaitOutsideFunction)
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere)
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction)
    if (!js.isUndefined(allowSuperOutsideMethod)) __obj.updateDynamic("allowSuperOutsideMethod")(allowSuperOutsideMethod)
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

