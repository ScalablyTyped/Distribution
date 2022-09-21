package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CubeTexture")
@js.native
open class CubeTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.CubeTexture {
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
    sceneOrEngine: typings.babylonjs.BABYLON.Scene | typings.babylonjs.BABYLON.ThinEngine,
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
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object CubeTexture {
  
  @JSGlobal("BABYLON.CubeTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a cube texture from an array of image urls
    * @param files defines an array of image urls
    * @param scene defines the hosting scene
    * @param noMipmap specifies if mip maps are not used
    * @returns a cube texture
    */
  inline def CreateFromImages(files: js.Array[String], scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromImages")(files.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.CubeTexture]
  inline def CreateFromImages(files: js.Array[String], scene: typings.babylonjs.BABYLON.Scene, noMipmap: Boolean): typings.babylonjs.BABYLON.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromImages")(files.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], noMipmap.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.CubeTexture]
  
  /**
    * Creates and return a texture created from prefilterd data by tools like IBL Baker or Lys.
    * @param url defines the url of the prefiltered texture
    * @param scene defines the scene the texture is attached to
    * @param forcedExtension defines the extension of the file if different from the url
    * @param createPolynomials defines whether or not to create polynomial harmonics from the texture data if necessary
    * @returns the prefiltered texture
    */
  inline def CreateFromPrefilteredData(url: String, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromPrefilteredData")(url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.CubeTexture]
  inline def CreateFromPrefilteredData(url: String, scene: typings.babylonjs.BABYLON.Scene, forcedExtension: Any): typings.babylonjs.BABYLON.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromPrefilteredData")(url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], forcedExtension.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.CubeTexture]
  inline def CreateFromPrefilteredData(
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    forcedExtension: Any,
    createPolynomials: Boolean
  ): typings.babylonjs.BABYLON.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromPrefilteredData")(url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], forcedExtension.asInstanceOf[js.Any], createPolynomials.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.CubeTexture]
  inline def CreateFromPrefilteredData(
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    forcedExtension: Unit,
    createPolynomials: Boolean
  ): typings.babylonjs.BABYLON.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromPrefilteredData")(url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], forcedExtension.asInstanceOf[js.Any], createPolynomials.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.CubeTexture]
  
  /**
    * Parses text to create a cube texture
    * @param parsedTexture define the serialized text to read from
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url of the cube texture
    * @returns a cube texture
    */
  inline def Parse(parsedTexture: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.CubeTexture]
}
