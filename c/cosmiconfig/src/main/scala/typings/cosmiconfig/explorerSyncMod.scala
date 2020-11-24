package typings.cosmiconfig

import typings.cosmiconfig.explorerBaseMod.ExplorerBase
import typings.cosmiconfig.typesMod.CosmiconfigResult
import typings.cosmiconfig.typesMod.ExplorerOptionsSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cosmiconfig/dist/ExplorerSync", JSImport.Namespace)
@js.native
object explorerSyncMod extends js.Object {
  
  @js.native
  class ExplorerSync protected () extends ExplorerBase[ExplorerOptionsSync] {
    def this(options: ExplorerOptionsSync) = this()
    
    var createCosmiconfigResultSync: js.Any = js.native
    
    var loadFileContentSync: js.Any = js.native
    
    var loadSearchPlaceSync: js.Any = js.native
    
    def loadSync(filepath: String): CosmiconfigResult = js.native
    
    var searchDirectorySync: js.Any = js.native
    
    var searchFromDirectorySync: js.Any = js.native
    
    def searchSync(): CosmiconfigResult = js.native
    def searchSync(searchFrom: String): CosmiconfigResult = js.native
  }
}
