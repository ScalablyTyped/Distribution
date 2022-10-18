package typings.blackEngine

import typings.blackEngine.assetsAssetManagerMod.AssetManager
import typings.blackEngine.assetsLoaderTypeMod.LoaderType
import typings.blackEngine.assetsLoadersAssetLoaderMod.AssetLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsLoaderFactoryMod {
  
  @JSImport("black-engine/assets/LoaderFactory", "LoaderFactory")
  @js.native
  open class LoaderFactory protected () extends StObject {
    def this(assetManager: AssetManager) = this()
    
    def get(`type`: String, url: LoaderType | String, args: Any*): AssetLoader = js.native
    
    var mAssetManager: AssetManager = js.native
  }
}
