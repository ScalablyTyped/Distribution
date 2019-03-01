package typings
package cleanDashWebpackDashPluginLib.cleanDashWebpackDashPluginMod.CleanWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Allow the plugin to clean folders outside of the webpack root
    */
  var allowExternal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to `true` to emulate deletion without actually removing any files.
    */
  var dry: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Instead of removing whole path recursively,
    * remove all path's content with exclusion of provided immediate children.
    * Good for not removing shared files from build directories.
    */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Absolute path to your webpack root folder (paths appended to this)
    * Default: root of your package
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Write logs to the console.
    */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, remove files on recompile.
    */
  var watch: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowExternal: js.UndefOr[scala.Boolean] = js.undefined,
    dry: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String] = null,
    root: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    watch: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExternal)) __obj.updateDynamic("allowExternal")(allowExternal)
    if (!js.isUndefined(dry)) __obj.updateDynamic("dry")(dry)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Options]
  }
}

