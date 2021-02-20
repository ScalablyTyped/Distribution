package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "CubeTexture")
@js.native
class CubeTexture protected ()
  extends typings.babylonjs.texturesIndexMod.CubeTexture {
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
}
/* static members */
object CubeTexture {
  
  /**
    * Creates a cube texture from an array of image urls
    * @param files defines an array of image urls
    * @param scene defines the hosting scene
    * @param noMipmap specifies if mip maps are not used
    * @returns a cube texture
    */
  @JSImport("babylonjs/Materials/index", "CubeTexture.CreateFromImages")
  @js.native
  def CreateFromImages(files: js.Array[String], scene: Scene): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
  @JSImport("babylonjs/Materials/index", "CubeTexture.CreateFromImages")
  @js.native
  def CreateFromImages(files: js.Array[String], scene: Scene, noMipmap: Boolean): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
  
  /**
    * Creates and return a texture created from prefilterd data by tools like IBL Baker or Lys.
    * @param url defines the url of the prefiltered texture
    * @param scene defines the scene the texture is attached to
    * @param forcedExtension defines the extension of the file if different from the url
    * @param createPolynomials defines whether or not to create polynomial harmonics from the texture data if necessary
    * @return the prefiltered texture
    */
  @JSImport("babylonjs/Materials/index", "CubeTexture.CreateFromPrefilteredData")
  @js.native
  def CreateFromPrefilteredData(url: String, scene: Scene): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
  @JSImport("babylonjs/Materials/index", "CubeTexture.CreateFromPrefilteredData")
  @js.native
  def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: js.UndefOr[scala.Nothing], createPolynomials: Boolean): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
  @JSImport("babylonjs/Materials/index", "CubeTexture.CreateFromPrefilteredData")
  @js.native
  def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: js.Any): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
  @JSImport("babylonjs/Materials/index", "CubeTexture.CreateFromPrefilteredData")
  @js.native
  def CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: js.Any, createPolynomials: Boolean): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
  
  /**
    * Parses text to create a cube texture
    * @param parsedTexture define the serialized text to read from
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url of the cube texture
    * @returns a cube texture
    */
  @JSImport("babylonjs/Materials/index", "CubeTexture.Parse")
  @js.native
  def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
}
