package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/internalTextureLoader", JSImport.Namespace)
@js.native
object internalTextureLoaderMod extends js.Object {
  @js.native
  trait IInternalTextureLoader extends js.Object {
    /**
      * Defines wether the loader supports cascade loading the different faces.
      */
    var supportCascades: Boolean = js.native
    /**
      * This returns if the loader support the current file information.
      * @param extension defines the file extension of the file being loaded
      * @returns true if the loader can load the specified file
      */
    def canLoad(extension: String): Boolean = js.native
    def loadCubeData(
      data: js.Array[ArrayBufferView],
      texture: InternalTexture,
      createPolynomials: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    /**
      * Uploads the cube texture data to the WebGL texture. It has already been bound.
      * @param data contains the texture data
      * @param texture defines the BabylonJS internal texture
      * @param createPolynomials will be true if polynomials have been requested
      * @param onLoad defines the callback to trigger once the texture is ready
      * @param onError defines the callback to trigger in case of error
      */
    def loadCubeData(
      data: ArrayBufferView,
      texture: InternalTexture,
      createPolynomials: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    /**
      * Uploads the 2D texture data to the WebGL texture. It has already been bound once in the callback.
      * @param data contains the texture data
      * @param texture defines the BabylonJS internal texture
      * @param callback defines the method to call once ready to upload
      */
    def loadData(
      data: ArrayBufferView,
      texture: InternalTexture,
      callback: js.Function6[
          /* width */ Double, 
          /* height */ Double, 
          /* loadMipmap */ Boolean, 
          /* isCompressed */ Boolean, 
          /* done */ js.Function0[Unit], 
          /* loadFailed */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Unit = js.native
  }
  
}

