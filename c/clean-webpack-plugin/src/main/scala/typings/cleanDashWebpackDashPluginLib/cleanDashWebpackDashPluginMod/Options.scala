package typings
package cleanDashWebpackDashPluginLib.cleanDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Removes files after every build (including watch mode) that match this pattern.
    * Used for files that are not created directly by Webpack.
    *
    * Use !negative patterns to exclude files
    *
    * default: disabled
    */
  var cleanAfterEveryBuildPatterns: js.Array[java.lang.String]
  /**
    * Removes files once prior to Webpack compilation
    *   Not included in rebuilds (watch mode)
    *
    * Use !negative patterns to exclude files
    *
    * default: ['**\/ *']
    */
  var cleanOnceBeforeBuildPatterns: js.Array[java.lang.String]
  /**
    * Automatically remove all unused webpack assets on rebuild
    *
    * default: true
    */
  var cleanStaleWebpackAssets: scala.Boolean
  /**
    * Allow clean patterns outside of process.cwd()
    *
    * requires dry option to be explicitly set
    *
    * default: false
    */
  var dangerouslyAllowCleanPatternsOutsideProject: scala.Boolean
  /**
    * Simulate the removal of files
    *
    * default: false
    */
  var dry: scala.Boolean
  /**
    * Do not allow removal of current webpack assets
    *
    * default: true
    */
  var protectWebpackAssets: scala.Boolean
  /**
    * Write Logs to Console
    * (Always enabled when dry is true)
    *
    * default: false
    */
  var verbose: scala.Boolean
}

object Options {
  @scala.inline
  def apply(
    cleanAfterEveryBuildPatterns: js.Array[java.lang.String],
    cleanOnceBeforeBuildPatterns: js.Array[java.lang.String],
    cleanStaleWebpackAssets: scala.Boolean,
    dangerouslyAllowCleanPatternsOutsideProject: scala.Boolean,
    dry: scala.Boolean,
    protectWebpackAssets: scala.Boolean,
    verbose: scala.Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(cleanAfterEveryBuildPatterns = cleanAfterEveryBuildPatterns, cleanOnceBeforeBuildPatterns = cleanOnceBeforeBuildPatterns, cleanStaleWebpackAssets = cleanStaleWebpackAssets, dangerouslyAllowCleanPatternsOutsideProject = dangerouslyAllowCleanPatternsOutsideProject, dry = dry, protectWebpackAssets = protectWebpackAssets, verbose = verbose)
  
    __obj.asInstanceOf[Options]
  }
}

