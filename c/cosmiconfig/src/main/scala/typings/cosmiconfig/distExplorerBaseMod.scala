package typings.cosmiconfig

import typings.cosmiconfig.cosmiconfigMod.Loader
import typings.cosmiconfig.distTypesMod.Cache
import typings.cosmiconfig.distTypesMod.CosmiconfigResult
import typings.cosmiconfig.distTypesMod.ExplorerOptions
import typings.cosmiconfig.distTypesMod.ExplorerOptionsSync
import typings.cosmiconfig.distTypesMod.LoadedFileContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig/dist/ExplorerBase", JSImport.Namespace)
@js.native
object distExplorerBaseMod extends js.Object {
  @js.native
  class ExplorerBase[T /* <: ExplorerOptions | ExplorerOptionsSync */] protected () extends js.Object {
    def this(options: T) = this()
    val config: T = js.native
    val loadCache: js.UndefOr[Cache] = js.native
    var loadPackageProp: js.Any = js.native
    val searchCache: js.UndefOr[Cache] = js.native
    var validateConfig: js.Any = js.native
    def clearCaches(): Unit = js.native
    def clearLoadCache(): Unit = js.native
    def clearSearchCache(): Unit = js.native
    /* protected */ def getLoaderEntryForFile(filepath: String): Loader = js.native
    /* protected */ def loadedContentToCosmiconfigResult(filepath: String, loadedContent: LoadedFileContent): CosmiconfigResult = js.native
    /* protected */ def nextDirectoryToSearch(currentDir: String, currentResult: CosmiconfigResult): String | Null = js.native
    /* protected */ def shouldSearchStopWithResult(result: CosmiconfigResult): Boolean = js.native
    /* protected */ def validateFilePath(filepath: String): Unit = js.native
  }
  
  def getExtensionDescription(filepath: String): String = js.native
}

