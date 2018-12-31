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

