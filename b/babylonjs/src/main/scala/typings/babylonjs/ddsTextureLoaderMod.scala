package typings.babylonjs

import typings.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddsTextureLoaderMod {
  
  @JSImport("babylonjs/Materials/Textures/Loaders/ddsTextureLoader", "_DDSTextureLoader")
  @js.native
  open class DDSTextureLoader ()
    extends StObject
       with IInternalTextureLoader {
    
    def loadCubeData(
      imgs: js.Array[js.typedarray.ArrayBufferView],
      texture: InternalTexture,
      createPolynomials: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]]
    ): Unit = js.native
    /**
      * Uploads the cube texture data to the WebGL texture. It has already been bound.
      * @param imgs contains the cube maps
      * @param texture defines the BabylonJS internal texture
      * @param createPolynomials will be true if polynomials have been requested
      * @param onLoad defines the callback to trigger once the texture is ready
      */
    def loadCubeData(
      imgs: js.typedarray.ArrayBufferView,
      texture: InternalTexture,
      createPolynomials: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]]
    ): Unit = js.native
    
    /**
      * Uploads the 2D texture data to the WebGL texture. It has already been bound once in the callback.
      * @param data contains the texture data
      * @param texture defines the BabylonJS internal texture
      * @param callback defines the method to call once ready to upload
      */
    def loadData(
      data: js.typedarray.ArrayBufferView,
      texture: InternalTexture,
      callback: js.Function5[
          /* width */ Double, 
          /* height */ Double, 
          /* loadMipmap */ Boolean, 
          /* isCompressed */ Boolean, 
          /* done */ js.Function0[Unit], 
          Unit
        ]
    ): Unit = js.native
  }
}
