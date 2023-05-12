package typings.cosmiconfig

import typings.cosmiconfig.distExplorerBaseMod.ExplorerBase
import typings.cosmiconfig.distTypesMod.CosmiconfigResult
import typings.cosmiconfig.distTypesMod.ExplorerOptionsSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExplorerSyncMod {
  
  @JSImport("cosmiconfig/dist/ExplorerSync", "ExplorerSync")
  @js.native
  open class ExplorerSync protected () extends ExplorerBase[ExplorerOptionsSync] {
    def this(options: ExplorerOptionsSync) = this()
    
    /* private */ var _loadFileSync: Any = js.native
    
    /* private */ var createCosmiconfigResultSync: Any = js.native
    
    /* private */ var loadFileContentSync: Any = js.native
    
    /* private */ var loadSearchPlaceSync: Any = js.native
    
    def loadSync(filepath: String): CosmiconfigResult = js.native
    
    /* private */ var searchDirectorySync: Any = js.native
    
    /* private */ var searchFromDirectorySync: Any = js.native
    
    def searchSync(): CosmiconfigResult = js.native
    def searchSync(searchFrom: String): CosmiconfigResult = js.native
  }
}
