package typings
package atBabelParserLib.atBabelParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  /**
    * By default, await use is not allowed outside of an async function.
    * Set this to true to accept such code.
    */
  var allowAwaitOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, a return statement at the top level raises an error.
    * Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined
  var allowSuperOutsideMethod: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, the parser adds information about parentheses by setting
    * `extra.parenthesized` to `true` as needed.
    * When this option is `true` the parser creates `ParenthesizedExpression`
    * AST nodes instead of using the `extra` property.
    */
  var createParenthesizedExpressions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array containing the plugins that you want to enable.
    */
  var plugins: js.UndefOr[js.Array[ParserPlugin]] = js.undefined
  /**
    * Adds a ranges property to each node: [node.start, node.end]
    */
  var ranges: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Correlate output AST nodes with their source filename.
    * Useful when generating code and source maps from the ASTs of multiple input files.
    */
  var sourceFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicate the mode the code should be parsed in.
    * Can be one of "script", "module", or "unambiguous". Defaults to "script".
    * "unambiguous" will make @babel/parser attempt to guess, based on the presence
    * of ES6 import or export statements.
    * Files with ES6 imports and exports are considered "module" and are otherwise "script".
    */
  var sourceType: js.UndefOr[
    atBabelParserLib.atBabelParserLibStrings.script | atBabelParserLib.atBabelParserLibStrings.module | atBabelParserLib.atBabelParserLibStrings.unambiguous
  ] = js.undefined
  /**
    * By default, the first line of code parsed is treated as line 1.
    * You can provide a line number to alternatively start with.
    * Useful for integration with other source tools.
    */
  var startLine: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should the parser work in strict mode.
    * Defaults to true if sourceType === 'module'. Otherwise, false.
    */
  var strictMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Adds all parsed tokens to a tokens property on the File node.
    */
  var tokens: js.UndefOr[scala.Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    allowAwaitOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined,
    allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined,
    allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined,
    allowSuperOutsideMethod: js.UndefOr[scala.Boolean] = js.undefined,
    createParenthesizedExpressions: js.UndefOr[scala.Boolean] = js.undefined,
    plugins: js.Array[ParserPlugin] = null,
    ranges: js.UndefOr[scala.Boolean] = js.undefined,
    sourceFilename: java.lang.String = null,
    sourceType: atBabelParserLib.atBabelParserLibStrings.script | atBabelParserLib.atBabelParserLibStrings.module | atBabelParserLib.atBabelParserLibStrings.unambiguous = null,
    startLine: scala.Int | scala.Double = null,
    strictMode: js.UndefOr[scala.Boolean] = js.undefined,
    tokens: js.UndefOr[scala.Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAwaitOutsideFunction)) __obj.updateDynamic("allowAwaitOutsideFunction")(allowAwaitOutsideFunction)
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere)
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction)
    if (!js.isUndefined(allowSuperOutsideMethod)) __obj.updateDynamic("allowSuperOutsideMethod")(allowSuperOutsideMethod)
    if (!js.isUndefined(createParenthesizedExpressions)) __obj.updateDynamic("createParenthesizedExpressions")(createParenthesizedExpressions)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges)
    if (sourceFilename != null) __obj.updateDynamic("sourceFilename")(sourceFilename)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (startLine != null) __obj.updateDynamic("startLine")(startLine.asInstanceOf[js.Any])
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode)
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[ParserOptions]
  }
}

