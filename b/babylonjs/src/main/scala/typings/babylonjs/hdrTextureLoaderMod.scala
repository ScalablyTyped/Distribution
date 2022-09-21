package typings.babylonjs

import typings.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import typings.babylonjs.internalTextureMod.InternalTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdrTextureLoaderMod {
  
  @JSImport("babylonjs/Materials/Textures/Loaders/hdrTextureLoader", "_HDRTextureLoader")
  @js.native
  open class HDRTextureLoader ()
    extends StObject
       with IInternalTextureLoader {
    
    /**
      * Uploads the cube texture data to the WebGL texture. It has already been bound.
      */
    def loadCubeData(): Unit = js.native
    
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
