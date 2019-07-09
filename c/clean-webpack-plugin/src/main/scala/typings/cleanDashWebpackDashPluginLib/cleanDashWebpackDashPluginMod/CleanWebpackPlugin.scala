package typings
package cleanDashWebpackDashPluginLib.cleanDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clean-webpack-plugin", "CleanWebpackPlugin")
@js.native
class CleanWebpackPlugin () extends js.Object {
  def this(options: Options) = this()
  val cleanAfterEveryBuildPatterns: js.Any = js.native
  val cleanOnceBeforeBuildPatterns: js.Any = js.native
  val cleanStaleWebpackAssets: js.Any = js.native
  var currentAssets: js.Any = js.native
  val dangerouslyAllowCleanPatternsOutsideProject: js.Any = js.native
  val dry: js.Any = js.native
  var initialClean: js.Any = js.native
  var outputPath: js.Any = js.native
  val protectWebpackAssets: js.Any = js.native
  val verbose: js.Any = js.native
  @JSName("apply")
  def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit = js.native
  def handleDone(stats: webpackLib.webpackMod.Stats): scala.Unit = js.native
  /**
    * Initially remove files from output directory prior to build.
    *
    * Only happens once.
    *
    * Warning: It is recommended to initially clean your build directory outside of webpack to minimize unexpected behavior.
    */
  def handleInitial(compilation: Compilation): scala.Unit = js.native
  def removeFiles(patterns: js.Array[java.lang.String]): scala.Unit = js.native
}

