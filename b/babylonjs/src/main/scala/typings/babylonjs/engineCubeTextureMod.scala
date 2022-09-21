package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineCubeTextureMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /** @hidden */
      def _cascadeLoadFiles(
        scene: Nullable[Scene],
        onfinish: js.Function1[/* images */ js.Array[js.typedarray.ArrayBuffer], Unit],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): Unit = js.native
      
      /** @hidden */
      def _cascadeLoadImgs(
        scene: Nullable[Scene],
        texture: InternalTexture,
        onfinish: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* images */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): Unit = js.native
      def _cascadeLoadImgs(
        scene: Nullable[Scene],
        texture: InternalTexture,
        onfinish: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* images */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        mimeType: String
      ): Unit = js.native
      
      /**
        * Creates a depth stencil cube texture.
        * This is only available in WebGL 2.
        * @param size The size of face edge in the cube texture.
        * @param options The options defining the cube texture.
        * @param rtWrapper The render target wrapper for which the depth/stencil texture must be created
        * @returns The cube texture
        */
      def _createDepthStencilCubeTexture(size: Double, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
      
      /** @hidden */
      def _partialLoadFile(
        url: String,
        index: Double,
        loadedFiles: js.Array[js.typedarray.ArrayBuffer],
        onfinish: js.Function1[/* files */ js.Array[js.typedarray.ArrayBuffer], Unit],
        onErrorCallBack: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): Unit = js.native
      
      /** @hidden */
      def _partialLoadImg(
        url: String,
        index: Double,
        loadedImages: js.Array[HTMLImageElement | ImageBitmap],
        scene: Nullable[Scene],
        texture: InternalTexture,
        onfinish: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* images */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        onErrorCallBack: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[Any], Unit]]
      ): Unit = js.native
      def _partialLoadImg(
        url: String,
        index: Double,
        loadedImages: js.Array[HTMLImageElement | ImageBitmap],
        scene: Nullable[Scene],
        texture: InternalTexture,
        onfinish: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* images */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        onErrorCallBack: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[Any], Unit]],
        mimeType: String
      ): Unit = js.native
      
      /**
        * @hidden
        */
      def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean): Unit = js.native
      def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean, maxLevel: Double): Unit = js.native
      
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
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any
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
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
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
        * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
        * @returns the cube texture as an InternalTexture
        */
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: Any,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: Any,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Unit,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: Any,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Unit,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: Any,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      
      /** @hidden */
      def createCubeTextureBase(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        beforeLoadCubeDataCallback: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* data */ js.typedarray.ArrayBufferView | js.Array[js.typedarray.ArrayBufferView], 
                Unit
              ]
            ],
        imageHandler: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* imgs */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createCubeTextureBase(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        beforeLoadCubeDataCallback: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* data */ js.typedarray.ArrayBufferView | js.Array[js.typedarray.ArrayBufferView], 
                Unit
              ]
            ],
        imageHandler: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* imgs */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
    }
  }
}
