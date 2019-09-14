package typings.atBabelParser.atBabelParserMod

import typings.atBabelParser.atBabelParserStrings.module
import typings.atBabelParser.atBabelParserStrings.script
import typings.atBabelParser.atBabelParserStrings.unambiguous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  /**
    * By default, await use is not allowed outside of an async function.
    * Set this to true to accept such code.
    */
  var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, a return statement at the top level raises an error.
    * Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
  var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, exported identifiers must refer to a declared variable.
    * Set this to true to allow export statements to reference undeclared variables.
    */
  var allowUndeclaredExports: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, the parser adds information about parentheses by setting
    * `extra.parenthesized` to `true` as needed.
    * When this option is `true` the parser creates `ParenthesizedExpression`
    * AST nodes instead of using the `extra` property.
    */
  var createParenthesizedExpressions: js.UndefOr[Boolean] = js.undefined
  /**
    * Array containing the plugins that you want to enable.
    */
  var plugins: js.UndefOr[js.Array[ParserPlugin]] = js.undefined
  /**
    * Adds a ranges property to each node: [node.start, node.end]
    */
  var ranges: js.UndefOr[Boolean] = js.undefined
  /**
    * Correlate output AST nodes with their source filename.
    * Useful when generating code and source maps from the ASTs of multiple input files.
    */
  var sourceFilename: js.UndefOr[String] = js.undefined
  /**
    * Indicate the mode the code should be parsed in.
    * Can be one of "script", "module", or "unambiguous". Defaults to "script".
    * "unambiguous" will make @babel/parser attempt to guess, based on the presence
    * of ES6 import or export statements.
    * Files with ES6 imports and exports are considered "module" and are otherwise "script".
    */
  var sourceType: js.UndefOr[script | module | unambiguous] = js.undefined
  /**
    * By default, the first line of code parsed is treated as line 1.
    * You can provide a line number to alternatively start with.
    * Useful for integration with other source tools.
    */
  var startLine: js.UndefOr[Double] = js.undefined
  /**
    * Should the parser work in strict mode.
    * Defaults to true if sourceType === 'module'. Otherwise, false.
    */
  var strictMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Adds all parsed tokens to a tokens property on the File node.
    */
  var tokens: js.UndefOr[Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.undefined,
    allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined,
    allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined,
    allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined,
    allowUndeclaredExports: js.UndefOr[Boolean] = js.undefined,
    createParenthesizedExpressions: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[ParserPlugin] = null,
    ranges: js.UndefOr[Boolean] = js.undefined,
    sourceFilename: String = null,
    sourceType: script | module | unambiguous = null,
    startLine: Int | Double = null,
    strictMode: js.UndefOr[Boolean] = js.undefined,
    tokens: js.UndefOr[Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAwaitOutsideFunction)) __obj.updateDynamic("allowAwaitOutsideFunction")(allowAwaitOutsideFunction)
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere)
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction)
    if (!js.isUndefined(allowSuperOutsideMethod)) __obj.updateDynamic("allowSuperOutsideMethod")(allowSuperOutsideMethod)
    if (!js.isUndefined(allowUndeclaredExports)) __obj.updateDynamic("allowUndeclaredExports")(allowUndeclaredExports)
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

