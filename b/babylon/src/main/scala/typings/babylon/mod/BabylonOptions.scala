package typings.babylon.mod

import typings.babylon.babylonStrings.module
import typings.babylon.babylonStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabylonOptions extends js.Object {
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, a return statement at the top level raises an error. Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
  var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined
  /**
    * Array containing the plugins that you want to enable.
    */
  var plugins: js.UndefOr[js.Array[PluginName]] = js.undefined
  /**
    * Correlate output AST nodes with their source filename. Useful when
    * generating code and source maps from the ASTs of multiple input files.
    */
  var sourceFilename: js.UndefOr[String] = js.undefined
  /**
    * Indicate the mode the code should be parsed in. Can be either "script" or "module".
    */
  var sourceType: js.UndefOr[script | module] = js.undefined
}

object BabylonOptions {
  @scala.inline
  def apply(
    allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined,
    allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined,
    allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[PluginName] = null,
    sourceFilename: String = null,
    sourceType: script | module = null
  ): BabylonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSuperOutsideMethod)) __obj.updateDynamic("allowSuperOutsideMethod")(allowSuperOutsideMethod.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (sourceFilename != null) __obj.updateDynamic("sourceFilename")(sourceFilename.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabylonOptions]
  }
}

