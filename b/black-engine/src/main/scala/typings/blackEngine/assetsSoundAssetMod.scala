package typings.blackEngine

import typings.blackEngine.assetsAssetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsSoundAssetMod {
  
  @JSImport("black-engine/assets/SoundAsset", "SoundAsset")
  @js.native
  open class SoundAsset protected () extends Asset {
    def this(name: String, url: String) = this()
    
    /* private */ var mUrl: Any = js.native
    
    /* private */ var mXHR: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
