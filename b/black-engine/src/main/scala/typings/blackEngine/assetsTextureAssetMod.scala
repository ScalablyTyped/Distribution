package typings.blackEngine

import typings.blackEngine.assetsAssetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsTextureAssetMod {
  
  @JSImport("black-engine/assets/TextureAsset", "TextureAsset")
  @js.native
  open class TextureAsset protected () extends Asset {
    def this(name: String, url: String) = this()
    
    /* private */ var mImageLoader: Any = js.native
    
    var mScale: Double = js.native
    
    /* private */ var mUrl: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
