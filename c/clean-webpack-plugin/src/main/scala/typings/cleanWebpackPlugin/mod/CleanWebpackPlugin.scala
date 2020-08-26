package typings.cleanWebpackPlugin.mod

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
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
  ): Unit = js.native
  def handleDone(
    stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats */ js.Any
  ): Unit = js.native
  /**
    * Initially remove files from output directory prior to build.
    *
    * Only happens once.
    *
    * Warning: It is recommended to initially clean your build directory outside of webpack to minimize unexpected behavior.
    */
  def handleInitial(compilation: Compilation): Unit = js.native
  def removeFiles(patterns: js.Array[String]): Unit = js.native
}

