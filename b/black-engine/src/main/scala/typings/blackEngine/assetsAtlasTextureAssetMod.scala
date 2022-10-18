package typings.blackEngine

import typings.blackEngine.assetsAssetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsAtlasTextureAssetMod {
  
  @JSImport("black-engine/assets/AtlasTextureAsset", "AtlasTextureAsset")
  @js.native
  open class AtlasTextureAsset protected () extends Asset {
    def this(name: String, imageUrl: String, dataUrl: String) = this()
    
    /* private */ var mDataUrl: Any = js.native
    
    /* private */ var mImageLoader: Any = js.native
    
    /* private */ var mImageUrl: Any = js.native
    
    /* private */ var mScale: Any = js.native
    
    /* private */ var mXHR: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
