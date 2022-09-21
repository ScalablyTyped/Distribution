package typings.blackEngine

import typings.blackEngine.assetLoaderMod.AssetLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageAssetLoaderMod {
  
  @JSImport("black-engine/assets/loaders/ImageAssetLoader", "ImageAssetLoader")
  @js.native
  open class ImageAssetLoader protected () extends AssetLoader {
    def this(url: String) = this()
    
    /* private */ var mImageElement: Any = js.native
  }
}
