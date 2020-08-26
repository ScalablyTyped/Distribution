package typings.babelParser.mod

import typings.babelParser.babelParserStrings.module
import typings.babelParser.babelParserStrings.script
import typings.babelParser.babelParserStrings.unambiguous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptions extends js.Object {
  /**
    * By default, await use is not allowed outside of an async function.
    * Set this to true to accept such code.
    */
  var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.native
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
  /**
    * By default, a return statement at the top level raises an error.
    * Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
  var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.native
  /**
    * By default, exported identifiers must refer to a declared variable.
    * Set this to true to allow export statements to reference undeclared variables.
    */
  var allowUndeclaredExports: js.UndefOr[Boolean] = js.native
  /**
    * By default, the parser adds information about parentheses by setting
    * `extra.parenthesized` to `true` as needed.
    * When this option is `true` the parser creates `ParenthesizedExpression`
    * AST nodes instead of using the `extra` property.
    */
  var createParenthesizedExpressions: js.UndefOr[Boolean] = js.native
  /**
    * Array containing the plugins that you want to enable.
    */
  var plugins: js.UndefOr[js.Array[ParserPlugin]] = js.native
  /**
    * Adds a ranges property to each node: [node.start, node.end]
    */
  var ranges: js.UndefOr[Boolean] = js.native
  /**
    * Correlate output AST nodes with their source filename.
    * Useful when generating code and source maps from the ASTs of multiple input files.
    */
  var sourceFilename: js.UndefOr[String] = js.native
  /**
    * Indicate the mode the code should be parsed in.
    * Can be one of "script", "module", or "unambiguous". Defaults to "script".
    * "unambiguous" will make @babel/parser attempt to guess, based on the presence
    * of ES6 import or export statements.
    * Files with ES6 imports and exports are considered "module" and are otherwise "script".
    */
  var sourceType: js.UndefOr[script | module | unambiguous] = js.native
  /**
    * By default, the first line of code parsed is treated as line 1.
    * You can provide a line number to alternatively start with.
    * Useful for integration with other source tools.
    */
  var startLine: js.UndefOr[Double] = js.native
  /**
    * Should the parser work in strict mode.
    * Defaults to true if sourceType === 'module'. Otherwise, false.
    */
  var strictMode: js.UndefOr[Boolean] = js.native
  /**
    * Adds all parsed tokens to a tokens property on the File node.
    */
  var tokens: js.UndefOr[Boolean] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
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
    def setAllowAwaitOutsideFunction(value: Boolean): Self = this.set("allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAwaitOutsideFunction: Self = this.set("allowAwaitOutsideFunction", js.undefined)
    @scala.inline
    def setAllowImportExportEverywhere(value: Boolean): Self = this.set("allowImportExportEverywhere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowImportExportEverywhere: Self = this.set("allowImportExportEverywhere", js.undefined)
    @scala.inline
    def setAllowReturnOutsideFunction(value: Boolean): Self = this.set("allowReturnOutsideFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReturnOutsideFunction: Self = this.set("allowReturnOutsideFunction", js.undefined)
    @scala.inline
    def setAllowSuperOutsideMethod(value: Boolean): Self = this.set("allowSuperOutsideMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSuperOutsideMethod: Self = this.set("allowSuperOutsideMethod", js.undefined)
    @scala.inline
    def setAllowUndeclaredExports(value: Boolean): Self = this.set("allowUndeclaredExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUndeclaredExports: Self = this.set("allowUndeclaredExports", js.undefined)
    @scala.inline
    def setCreateParenthesizedExpressions(value: Boolean): Self = this.set("createParenthesizedExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateParenthesizedExpressions: Self = this.set("createParenthesizedExpressions", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: ParserPlugin*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[ParserPlugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setRanges(value: Boolean): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setSourceFilename(value: String): Self = this.set("sourceFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFilename: Self = this.set("sourceFilename", js.undefined)
    @scala.inline
    def setSourceType(value: script | module | unambiguous): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLine: Self = this.set("startLine", js.undefined)
    @scala.inline
    def setStrictMode(value: Boolean): Self = this.set("strictMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictMode: Self = this.set("strictMode", js.undefined)
    @scala.inline
    def setTokens(value: Boolean): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
  
}

