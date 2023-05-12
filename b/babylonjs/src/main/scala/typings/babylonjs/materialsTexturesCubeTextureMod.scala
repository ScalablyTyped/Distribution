package typings.babylonjs

import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesCubeTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/cubeTexture", "CubeTexture")
  @js.native
  open class CubeTexture protected () extends BaseTexture {
    /**
      * Creates a cube texture to use with reflection for instance. It can be based upon dds or six images as well
      * as prefiltered data.
      * @param rootUrl defines the url of the texture or the root name of the six images
      * @param sceneOrEngine defines the scene or engine the texture is attached to
      * @param extensions defines the suffixes add to the picture name in case six images are in use like _px.jpg...
      * @param noMipmap defines if mipmaps should be created or not
      * @param files defines the six files to load for the different faces in that order: px, py, pz, nx, ny, nz
      * @param onLoad defines a callback triggered at the end of the file load if no errors occurred
      * @param onError defines a callback triggered in case of error during load
      * @param format defines the internal format to use for the texture once loaded
      * @param prefiltered defines whether or not the texture is created from prefiltered data
      * @param forcedExtension defines the extensions to use (force a special type of file to load) in case it is different from the file name
      * @param createPolynomials defines whether or not to create polynomial harmonics from the texture data if necessary
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @param loaderOptions options to be passed to the loader
      * @param useSRGBBuffer Defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU) (default: false)
      * @returns the cube texture
      */
    def this(
      rootUrl: String,
      sceneOrEngine: Scene | ThinEngine,
      extensions: js.UndefOr[Nullable[js.Array[String]]],
      noMipmap: js.UndefOr[Boolean],
      files: js.UndefOr[Nullable[js.Array[String]]],
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      onError: js.UndefOr[
            Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
          ],
      format: js.UndefOr[Double],
      prefiltered: js.UndefOr[Boolean],
      forcedExtension: js.UndefOr[Any],
      createPolynomials: js.UndefOr[Boolean],
      lodScale: js.UndefOr[Double],
      lodOffset: js.UndefOr[Double],
      loaderOptions: js.UndefOr[Any],
      useSRGBBuffer: js.UndefOr[Boolean]
    ) = this()
    
    /* private */ var _boundingBoxSize: Any = js.native
    
    /* private */ var _createPolynomials: Any = js.native
    
    /* private */ var _delayedOnError: Any = js.native
    
    /* private */ var _delayedOnLoad: Any = js.native
    
    /* private */ var _extensions: Any = js.native
    
    /** @internal */
    var _files: Nullable[js.Array[String]] = js.native
    
    /* protected */ var _forcedExtension: Nullable[String] = js.native
    
    /* private */ var _format: Any = js.native
    
    /* private */ var _loadTexture: Any = js.native
    
    /* private */ var _loaderOptions: Any = js.native
    
    /* private */ var _lodOffset: Any = js.native
    
    /* private */ var _lodScale: Any = js.native
    
    /* private */ var _noMipmap: Any = js.native
    
    /* protected */ var _rotationY: Double = js.native
    
    /* private */ var _textureMatrix: Any = js.native
    
    /* private */ var _textureMatrixRefraction: Any = js.native
    
    /* private */ var _useSRGBBuffer: Any = js.native
    
    /**
      * Gets or sets the center of the bounding box associated with the cube texture.
      * It must define where the camera used to render the texture was set
      * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/reflectionTexture#using-local-cubemap-mode
      */
    var boundingBoxPosition: Vector3 = js.native
    
    /**
      * Returns the bounding box size
      * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/reflectionTexture#using-local-cubemap-mode
      */
    def boundingBoxSize: Vector3 = js.native
    /**
      * Gets or sets the size of the bounding box associated with the cube texture
      * When defined, the cubemap will switch to local mode
      * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
      * @example https://www.babylonjs-playground.com/#RNASML
      */
    def boundingBoxSize_=(value: Vector3): Unit = js.native
    
    def delayLoad(forcedExtension: String): Unit = js.native
    
    /**
      * Gets the forced extension (if any)
      */
    def forcedExtension: Nullable[String] = js.native
    
    /**
      * Observable triggered once the texture has been loaded.
      */
    var onLoadObservable: Observable[CubeTexture] = js.native
    
    /**
      * Gets texture matrix rotation angle around Y axis radians.
      */
    def rotationY: Double = js.native
    /**
      * Sets texture matrix rotation angle around Y axis in radians.
      */
    def rotationY_=(value: Double): Unit = js.native
    
    /**
      * Sets the reflection texture matrix
      * @param value Reflection texture matrix
      */
    def setReflectionTextureMatrix(value: Matrix): Unit = js.native
    
    /**
      * Update the url (and optional buffer) of this texture if url was null during construction.
      * @param url the url of the texture
      * @param forcedExtension defines the extension to use
      * @param onLoad callback called when the texture is loaded  (defaults to null)
      * @param prefiltered Defines whether the updated texture is prefiltered or not
      * @param onError callback called if there was an error during the loading process (defaults to null)
      * @param extensions defines the suffixes add to the picture name in case six images are in use like _px.jpg...
      * @param delayLoad defines if the texture should be loaded now (false by default)
      * @param files defines the six files to load for the different faces in that order: px, py, pz, nx, ny, nz
      */
    def updateURL(
      url: String,
      forcedExtension: js.UndefOr[String],
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      prefiltered: js.UndefOr[Boolean],
      onError: js.UndefOr[
          Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
        ],
      extensions: js.UndefOr[Nullable[js.Array[String]]],
      delayLoad: js.UndefOr[Boolean],
      files: js.UndefOr[Nullable[js.Array[String]]]
    ): Unit = js.native
    
    /**
      * The url of the texture
      */
    var url: String = js.native
  }
  /* static members */
  object CubeTexture {
    
    @JSImport("babylonjs/Materials/Textures/cubeTexture", "CubeTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a cube texture from an array of image urls
      * @param files defines an array of image urls
      * @param scene defines the hosting scene
      * @param noMipmap specifies if mip maps are not used
      * @returns a cube texture
      */
    inline def CreateFromImages(files: js.Array[String], scene: Scene): CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromImages")(files.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[CubeTexture]
    inline def CreateFromImages(files: js.Array[String], scene: Scene, noMipmap: Boolean): CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromImages")(files.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], noMipmap.asInstanceOf[js.Any])).asInstanceOf[CubeTexture]
    
    /**
      * Creates and return a texture created from prefilterd data by tools like IBL Baker or Lys.
      * @param url defines the url of the prefiltered texture
      * @param scene defines the scene the texture is attached to
      * @param forcedExtension defines the extension of the file if different from the url
      * @param createPolynomials defines whether or not to create polynomial harmonics from the texture data if necessary
      * @returns the prefiltered texture
      */
    inline def CreateFromPrefilteredData(url: String, scene: Scene): CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromPrefilteredData")(url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[CubeTexture]
    inline def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: Any): CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromPrefilteredData")(url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], forcedExtension.asInstanceOf[js.Any])).asInstanceOf[CubeTexture]
    inline def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: Any, createPolynomials: Boolean): CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromPrefilteredData")(url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], forcedExtension.asInstanceOf[js.Any], createPolynomials.asInstanceOf[js.Any])).asInstanceOf[CubeTexture]
    inline def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: Unit, createPolynomials: Boolean): CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromPrefilteredData")(url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], forcedExtension.asInstanceOf[js.Any], createPolynomials.asInstanceOf[js.Any])).asInstanceOf[CubeTexture]
    
    /**
      * Parses text to create a cube texture
      * @param parsedTexture define the serialized text to read from
      * @param scene defines the hosting scene
      * @param rootUrl defines the root url of the cube texture
      * @returns a cube texture
      */
    inline def Parse(parsedTexture: Any, scene: Scene, rootUrl: String): CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[CubeTexture]
  }
}
