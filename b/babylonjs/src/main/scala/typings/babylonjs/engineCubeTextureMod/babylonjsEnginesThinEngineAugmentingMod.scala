package typings.babylonjs.engineCubeTextureMod

import typings.babylonjs.depthTextureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  
  @js.native
  trait ThinEngine extends js.Object {
    
    /** @hidden */
    def _cascadeLoadFiles(
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[ArrayBuffer], Unit],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    
    /** @hidden */
    def _cascadeLoadImgs(
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    def _cascadeLoadImgs(
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      mimeType: String
    ): Unit = js.native
    
    /**
      * Creates a depth stencil cube texture.
      * This is only available in WebGL 2.
      * @param size The size of face edge in the cube texture.
      * @param options The options defining the cube texture.
      * @returns The cube texture
      */
    def _createDepthStencilCubeTexture(size: Double, options: DepthTextureCreationOptions): InternalTexture = js.native
    
    /** @hidden */
    def _partialLoadFile(
      url: String,
      index: Double,
      loadedFiles: js.Array[ArrayBuffer],
      onfinish: js.Function1[/* files */ js.Array[ArrayBuffer], Unit],
      onErrorCallBack: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    
    /** @hidden */
    def _partialLoadImg(
      url: String,
      index: Double,
      loadedImages: js.Array[HTMLImageElement],
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
      onErrorCallBack: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    def _partialLoadImg(
      url: String,
      index: Double,
      loadedImages: js.Array[HTMLImageElement],
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
      onErrorCallBack: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      mimeType: String
    ): Unit = js.native
    
    /**
      * @hidden
      */
    def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean): Unit = js.native
    
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: js.UndefOr[scala.Nothing],
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[InternalTexture],
      loaderOptions: js.Any
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: js.UndefOr[scala.Nothing],
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: Double,
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[InternalTexture],
      loaderOptions: js.Any
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[InternalTexture],
      loaderOptions: js.Any
    ): InternalTexture = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: Double,
      forcedExtension: js.Any
    ): InternalTexture = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials if a polynomial sphere should be created for the cube texture
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: Double,
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double
    ): InternalTexture = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials if a polynomial sphere should be created for the cube texture
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @param fallback defines texture to use while falling back when (compressed) texture file not found.
      * @param loaderOptions options to be passed to the loader
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: Double,
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[InternalTexture],
      loaderOptions: js.Any
    ): InternalTexture = js.native
  }
}
