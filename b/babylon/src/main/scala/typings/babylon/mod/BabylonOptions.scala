package typings.babylon.mod

import typings.babylon.babylonStrings.module
import typings.babylon.babylonStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabylonOptions extends js.Object {
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
  /**
    * By default, a return statement at the top level raises an error. Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
  var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.native
  /**
    * Array containing the plugins that you want to enable.
    */
  var plugins: js.UndefOr[js.Array[PluginName]] = js.native
  /**
    * Correlate output AST nodes with their source filename. Useful when
    * generating code and source maps from the ASTs of multiple input files.
    */
  var sourceFilename: js.UndefOr[String] = js.native
  /**
    * Indicate the mode the code should be parsed in. Can be either "script" or "module".
    */
  var sourceType: js.UndefOr[script | module] = js.native
}

object BabylonOptions {
  @scala.inline
  def apply(): BabylonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabylonOptions]
  }
  @scala.inline
  implicit class BabylonOptionsOps[Self <: BabylonOptions] (val x: Self) extends AnyVal {
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
    def setPluginsVarargs(value: PluginName*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[PluginName]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setSourceFilename(value: String): Self = this.set("sourceFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFilename: Self = this.set("sourceFilename", js.undefined)
    @scala.inline
    def setSourceType(value: script | module): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
  
}

