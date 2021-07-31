package typings.cosmiconfig

import typings.cosmiconfig.explorerBaseMod.ExplorerBase
import typings.cosmiconfig.typesMod.CosmiconfigResult
import typings.cosmiconfig.typesMod.ExplorerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object explorerMod {
  
  @JSImport("cosmiconfig/dist/Explorer", "Explorer")
  @js.native
  class Explorer protected () extends ExplorerBase[ExplorerOptions] {
    def this(options: ExplorerOptions) = this()
    
    var createCosmiconfigResult: js.Any = js.native
    
    def load(filepath: String): js.Promise[CosmiconfigResult] = js.native
    
    var loadFileContent: js.Any = js.native
    
    var loadSearchPlace: js.Any = js.native
    
    def search(): js.Promise[CosmiconfigResult] = js.native
    def search(searchFrom: String): js.Promise[CosmiconfigResult] = js.native
    
    var searchDirectory: js.Any = js.native
    
    var searchFromDirectory: js.Any = js.native
  }
}
