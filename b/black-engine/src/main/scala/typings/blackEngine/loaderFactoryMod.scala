package typings.blackEngine

import typings.blackEngine.assetLoaderMod.AssetLoader
import typings.blackEngine.assetManagerMod.AssetManager
import typings.blackEngine.loaderTypeMod.LoaderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderFactoryMod {
  
  @JSImport("black-engine/assets/LoaderFactory", "LoaderFactory")
  @js.native
  open class LoaderFactory protected () extends StObject {
    def this(assetManager: AssetManager) = this()
    
    def get(`type`: String, url: LoaderType | String, args: Any*): AssetLoader = js.native
    
    var mAssetManager: AssetManager = js.native
  }
}
