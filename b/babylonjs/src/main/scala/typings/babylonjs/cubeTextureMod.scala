package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/cubeTexture", JSImport.Namespace)
@js.native
object cubeTextureMod extends js.Object {
  
  @js.native
  class CubeTexture protected () extends BaseTexture {
    /**
      * Creates a cube texture to use with reflection for instance. It can be based upon dds or six images as well
      * as prefiltered data.
      * @param rootUrl defines the url of the texture or the root name of the six images
      * @param null defines the scene or engine the texture is attached to
      * @param extensions defines the suffixes add to the picture name in case six images are in use like _px.jpg...
      * @param noMipmap defines if mipmaps should be created or not
      * @param files defines the six files to load for the different faces in that order: px, py, pz, nx, ny, nz
      * @param onLoad defines a callback triggered at the end of the file load if no errors occured
      * @param onError defines a callback triggered in case of error during load
      * @param format defines the internal format to use for the texture once loaded
      * @param prefiltered defines whether or not the texture is created from prefiltered data
      * @param forcedExtension defines the extensions to use (force a special type of file to load) in case it is different from the file name
      * @param createPolynomials defines whether or not to create polynomial harmonics from the texture data if necessary
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @param loaderOptions options to be passed to the loader
      * @return the cube texture
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
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
            ]
          ],
      format: js.UndefOr[Double],
      prefiltered: js.UndefOr[Boolean],
      forcedExtension: js.UndefOr[js.Any],
      createPolynomials: js.UndefOr[Boolean],
      lodScale: js.UndefOr[Double],
      lodOffset: js.UndefOr[Double],
      loaderOptions: js.UndefOr[js.Any]
    ) = this()
    
    var _boundingBoxSize: js.Any = js.native
    
    var _createPolynomials: js.Any = js.native
    
    var _delayedOnLoad: js.Any = js.native
    
    var _extensions: js.Any = js.native
    
    var _files: js.Any = js.native
    
    var _forcedExtension: Nullable[String] = js.native
    
    var _format: js.Any = js.native
    
    var _loaderOptions: js.Any = js.native
    
    var _noMipmap: js.Any = js.native
    
    var _rotationY: Double = js.native
    
    var _textureMatrix: js.Any = js.native
    
    /**
      * Gets or sets the center of the bounding box associated with the cube texture.
      * It must define where the camera used to render the texture was set
      * @see https://doc.babylonjs.com/how_to/reflect#using-local-cubemap-mode
      */
    var boundingBoxPosition: Vector3 = js.native
    
    /**
      * Returns the bounding box size
      * @see https://doc.babylonjs.com/how_to/reflect#using-local-cubemap-mode
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
      */
    def updateURL(url: String): Unit = js.native
    def updateURL(
      url: String,
      forcedExtension: js.UndefOr[scala.Nothing],
      onLoad: js.UndefOr[scala.Nothing],
      prefiltered: Boolean
    ): Unit = js.native
    def updateURL(url: String, forcedExtension: js.UndefOr[scala.Nothing], onLoad: js.Function0[Unit]): Unit = js.native
    def updateURL(
      url: String,
      forcedExtension: js.UndefOr[scala.Nothing],
      onLoad: js.Function0[Unit],
      prefiltered: Boolean
    ): Unit = js.native
    def updateURL(url: String, forcedExtension: String): Unit = js.native
    def updateURL(url: String, forcedExtension: String, onLoad: js.UndefOr[scala.Nothing], prefiltered: Boolean): Unit = js.native
    def updateURL(url: String, forcedExtension: String, onLoad: js.Function0[Unit]): Unit = js.native
    def updateURL(url: String, forcedExtension: String, onLoad: js.Function0[Unit], prefiltered: Boolean): Unit = js.native
    
    /**
      * The url of the texture
      */
    var url: String = js.native
  }
  /* static members */
  @js.native
  object CubeTexture extends js.Object {
    
    /**
      * Creates a cube texture from an array of image urls
      * @param files defines an array of image urls
      * @param scene defines the hosting scene
      * @param noMipmap specifies if mip maps are not used
      * @returns a cube texture
      */
    def CreateFromImages(files: js.Array[String], scene: Scene): CubeTexture = js.native
    def CreateFromImages(files: js.Array[String], scene: Scene, noMipmap: Boolean): CubeTexture = js.native
    
    /**
      * Creates and return a texture created from prefilterd data by tools like IBL Baker or Lys.
      * @param url defines the url of the prefiltered texture
      * @param scene defines the scene the texture is attached to
      * @param forcedExtension defines the extension of the file if different from the url
      * @param createPolynomials defines whether or not to create polynomial harmonics from the texture data if necessary
      * @return the prefiltered texture
      */
    def CreateFromPrefilteredData(url: String, scene: Scene): CubeTexture = js.native
    def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: js.UndefOr[scala.Nothing], createPolynomials: Boolean): CubeTexture = js.native
    def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: js.Any): CubeTexture = js.native
    def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: js.Any, createPolynomials: Boolean): CubeTexture = js.native
    
    /**
      * Parses text to create a cube texture
      * @param parsedTexture define the serialized text to read from
      * @param scene defines the hosting scene
      * @param rootUrl defines the root url of the cube texture
      * @returns a cube texture
      */
    def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): CubeTexture = js.native
  }
}
