package typings
package cleanDashWebpackDashPluginLib.cleanDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clean-webpack-plugin", JSImport.Default)
@js.native
class default () extends CleanWebpackPlugin {
  def this(options: Options) = this()
  /* CompleteClass */
  override val cleanAfterEveryBuildPatterns: js.Any = js.native
  /* CompleteClass */
  override val cleanOnceBeforeBuildPatterns: js.Any = js.native
  /* CompleteClass */
  override val cleanStaleWebpackAssets: js.Any = js.native
  /* CompleteClass */
  override var currentAssets: js.Any = js.native
  /* CompleteClass */
  override val dangerouslyAllowCleanPatternsOutsideProject: js.Any = js.native
  /* CompleteClass */
  override val dry: js.Any = js.native
  /* CompleteClass */
  override var initialClean: js.Any = js.native
  /* CompleteClass */
  override var outputPath: js.Any = js.native
  /* CompleteClass */
  override val protectWebpackAssets: js.Any = js.native
  /* CompleteClass */
  override val verbose: js.Any = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit = js.native
  /* CompleteClass */
  override def handleDone(stats: webpackLib.webpackMod.Stats): scala.Unit = js.native
  /**
    * Initially remove files from output directory prior to build.
    *
    * Only happens once.
    *
    * Warning: It is recommended to initially clean your build directory outside of webpack to minimize unexpected behavior.
    */
  /* CompleteClass */
  override def handleInitial(): scala.Unit = js.native
  /* CompleteClass */
  override def removeFiles(patterns: js.Array[java.lang.String]): scala.Unit = js.native
}

