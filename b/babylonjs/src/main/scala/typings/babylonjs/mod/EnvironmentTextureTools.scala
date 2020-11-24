package typings.babylonjs.mod

import typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfo
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EnvironmentTextureTools")
@js.native
class EnvironmentTextureTools ()
  extends typings.babylonjs.legacyMod.EnvironmentTextureTools
/* static members */
@JSImport("babylonjs", "EnvironmentTextureTools")
@js.native
object EnvironmentTextureTools extends js.Object {
  
  /**
    * Creates an environment texture from a loaded cube texture.
    * @param texture defines the cube texture to convert in env file
    * @return a promise containing the environment data if succesfull.
    */
  def CreateEnvTextureAsync(texture: typings.babylonjs.baseTextureMod.BaseTexture): js.Promise[ArrayBuffer] = js.native
  
  /**
    * Creates the ArrayBufferViews used for initializing environment texture image data.
    * @param data the image data
    * @param info parameters that determine what views will be created for accessing the underlying buffer
    * @return the views described by info providing access to the underlying buffer
    */
  def CreateImageDataArrayBufferViews(data: ArrayBufferView, info: EnvironmentTextureInfo): js.Array[js.Array[ArrayBufferView]] = js.native
  
  /**
    * Gets the environment info from an env file.
    * @param data The array buffer containing the .env bytes.
    * @returns the environment file info (the json header) if successfully parsed.
    */
  def GetEnvInfo(data: ArrayBufferView): Nullable[EnvironmentTextureInfo] = js.native
  
  /**
    * Uploads the texture info contained in the env file to the GPU.
    * @param texture defines the internal texture to upload to
    * @param data defines the data to load
    * @param info defines the texture info retrieved through the GetEnvInfo method
    * @returns a promise
    */
  def UploadEnvLevelsAsync(
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: EnvironmentTextureInfo
  ): js.Promise[Unit] = js.native
  
  /**
    * Uploads spherical polynomials information to the texture.
    * @param texture defines the texture we are trying to upload the information to
    * @param info defines the environment texture info retrieved through the GetEnvInfo method
    */
  def UploadEnvSpherical(texture: typings.babylonjs.internalTextureMod.InternalTexture, info: EnvironmentTextureInfo): Unit = js.native
  
  /**
    * Uploads the levels of image data to the GPU.
    * @param texture defines the internal texture to upload to
    * @param imageData defines the array buffer views of image data [mipmap][face]
    * @returns a promise
    */
  def UploadLevelsAsync(
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    imageData: js.Array[js.Array[ArrayBufferView]]
  ): js.Promise[Unit] = js.native
  
  /**
    * Creates a JSON representation of the spherical data.
    * @param texture defines the texture containing the polynomials
    * @return the JSON representation of the spherical info
    */
  var _CreateEnvTextureIrradiance: js.Any = js.native
  
  /**
    * Magic number identifying the env file.
    */
  var _MagicBytes: js.Any = js.native
  
  var _OnImageReadyAsync: js.Any = js.native
  
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}
