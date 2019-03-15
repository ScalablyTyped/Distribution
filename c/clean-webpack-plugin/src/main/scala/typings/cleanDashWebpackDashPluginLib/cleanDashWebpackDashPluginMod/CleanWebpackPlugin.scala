package typings
package cleanDashWebpackDashPluginLib.cleanDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CleanWebpackPlugin extends js.Object {
  val cleanAfterEveryBuildPatterns: js.Any
  val cleanOnceBeforeBuildPatterns: js.Any
  val cleanStaleWebpackAssets: js.Any
  var currentAssets: js.Any
  val dangerouslyAllowCleanPatternsOutsideProject: js.Any
  val dry: js.Any
  var initialClean: js.Any
  var outputPath: js.Any
  val protectWebpackAssets: js.Any
  val verbose: js.Any
  @JSName("apply")
  def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit
  def handleDone(stats: webpackLib.webpackMod.Stats): scala.Unit
  /**
    * Initially remove files from output directory prior to build.
    *
    * Only happens once.
    *
    * Warning: It is recommended to initially clean your build directory outside of webpack to minimize unexpected behavior.
    */
  def handleInitial(): scala.Unit
  def removeFiles(patterns: js.Array[java.lang.String]): scala.Unit
}

object CleanWebpackPlugin {
  @scala.inline
  def apply(
    apply: webpackLib.webpackMod.Compiler => scala.Unit,
    cleanAfterEveryBuildPatterns: js.Any,
    cleanOnceBeforeBuildPatterns: js.Any,
    cleanStaleWebpackAssets: js.Any,
    currentAssets: js.Any,
    dangerouslyAllowCleanPatternsOutsideProject: js.Any,
    dry: js.Any,
    handleDone: webpackLib.webpackMod.Stats => scala.Unit,
    handleInitial: () => scala.Unit,
    initialClean: js.Any,
    outputPath: js.Any,
    protectWebpackAssets: js.Any,
    removeFiles: js.Array[java.lang.String] => scala.Unit,
    verbose: js.Any
  ): CleanWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), cleanAfterEveryBuildPatterns = cleanAfterEveryBuildPatterns, cleanOnceBeforeBuildPatterns = cleanOnceBeforeBuildPatterns, cleanStaleWebpackAssets = cleanStaleWebpackAssets, currentAssets = currentAssets, dangerouslyAllowCleanPatternsOutsideProject = dangerouslyAllowCleanPatternsOutsideProject, dry = dry, handleDone = js.Any.fromFunction1(handleDone), handleInitial = js.Any.fromFunction0(handleInitial), initialClean = initialClean, outputPath = outputPath, protectWebpackAssets = protectWebpackAssets, removeFiles = js.Any.fromFunction1(removeFiles), verbose = verbose)
  
    __obj.asInstanceOf[CleanWebpackPlugin]
  }
}

