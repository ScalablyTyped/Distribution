package typings.cesium

import typings.cesium.mod.CompressedTextureBuffer
import typings.cesium.mod.ImageryProvider
import typings.cesium.mod.ImageryTypes
import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneImageryProviderMod {
  
  @JSImport("cesium/Source/Scene/ImageryProvider", JSImport.Default)
  @js.native
  open class default () extends ImageryProvider
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/ImageryProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def loadImage(imageryProvider: ImageryProvider, url: String): js.UndefOr[js.Promise[ImageryTypes | CompressedTextureBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(imageryProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[ImageryTypes | CompressedTextureBuffer]]]
    /**
      * Loads an image from a given URL.  If the server referenced by the URL already has
      * too many requests pending, this function will instead return undefined, indicating
      * that the request should be retried later.
      * @param imageryProvider - The imagery provider for the URL.
      * @param url - The URL of the image.
      * @returns A promise for the image that will resolve when the image is available, or
      *          undefined if there are too many active requests to the server, and the request should be retried later.
      */
    inline def loadImage(imageryProvider: ImageryProvider, url: Resource): js.UndefOr[js.Promise[ImageryTypes | CompressedTextureBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(imageryProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[ImageryTypes | CompressedTextureBuffer]]]
  }
}
