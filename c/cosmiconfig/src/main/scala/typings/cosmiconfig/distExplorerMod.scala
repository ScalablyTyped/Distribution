package typings.cosmiconfig

import typings.cosmiconfig.distExplorerBaseMod.ExplorerBase
import typings.cosmiconfig.distTypesMod.CosmiconfigResult
import typings.cosmiconfig.distTypesMod.ExplorerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExplorerMod {
  
  @JSImport("cosmiconfig/dist/Explorer", "Explorer")
  @js.native
  open class Explorer protected () extends ExplorerBase[ExplorerOptions] {
    def this(options: ExplorerOptions) = this()
    
    /* private */ var createCosmiconfigResult: Any = js.native
    
    def load(filepath: String): js.Promise[CosmiconfigResult] = js.native
    
    /* private */ var loadFileContent: Any = js.native
    
    /* private */ var loadSearchPlace: Any = js.native
    
    def search(): js.Promise[CosmiconfigResult] = js.native
    def search(searchFrom: String): js.Promise[CosmiconfigResult] = js.native
    
    /* private */ var searchDirectory: Any = js.native
    
    /* private */ var searchFromDirectory: Any = js.native
  }
}
