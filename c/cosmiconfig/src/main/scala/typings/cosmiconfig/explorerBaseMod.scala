package typings.cosmiconfig

import typings.cosmiconfig.mod.Loader
import typings.cosmiconfig.typesMod.Cache
import typings.cosmiconfig.typesMod.CosmiconfigResult
import typings.cosmiconfig.typesMod.ExplorerOptions
import typings.cosmiconfig.typesMod.ExplorerOptionsSync
import typings.cosmiconfig.typesMod.LoadedFileContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object explorerBaseMod {
  
  @JSImport("cosmiconfig/dist/ExplorerBase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cosmiconfig/dist/ExplorerBase", "ExplorerBase")
  @js.native
  open class ExplorerBase[T /* <: ExplorerOptions | ExplorerOptionsSync */] protected () extends StObject {
    def this(options: T) = this()
    
    def clearCaches(): Unit = js.native
    
    def clearLoadCache(): Unit = js.native
    
    def clearSearchCache(): Unit = js.native
    
    /* protected */ val config: T = js.native
    
    /* protected */ def getLoaderEntryForFile(filepath: String): Loader = js.native
    
    /* protected */ val loadCache: js.UndefOr[Cache] = js.native
    
    /* private */ var loadPackageProp: Any = js.native
    
    /* protected */ def loadedContentToCosmiconfigResult(filepath: String, loadedContent: LoadedFileContent): CosmiconfigResult = js.native
    
    /* protected */ def nextDirectoryToSearch(currentDir: String, currentResult: CosmiconfigResult): String | Null = js.native
    
    /* protected */ val searchCache: js.UndefOr[Cache] = js.native
    
    /* protected */ def shouldSearchStopWithResult(result: CosmiconfigResult): Boolean = js.native
    
    /* private */ var validateConfig: Any = js.native
    
    /* protected */ def validateFilePath(filepath: String): Unit = js.native
  }
  
  inline def getExtensionDescription(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionDescription")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
}
