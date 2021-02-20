package typings.babylonjs.mod

import typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfo
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EnvironmentTextureTools")
@js.native
class EnvironmentTextureTools ()
  extends typings.babylonjs.legacyMod.EnvironmentTextureTools
/* static members */
object EnvironmentTextureTools {
  
  @JSImport("babylonjs", "EnvironmentTextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an environment texture from a loaded cube texture.
    * @param texture defines the cube texture to convert in env file
    * @return a promise containing the environment data if succesfull.
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.CreateEnvTextureAsync")
  @js.native
  def CreateEnvTextureAsync(texture: typings.babylonjs.baseTextureMod.BaseTexture): js.Promise[ArrayBuffer] = js.native
  
  /**
    * Creates the ArrayBufferViews used for initializing environment texture image data.
    * @param data the image data
    * @param info parameters that determine what views will be created for accessing the underlying buffer
    * @return the views described by info providing access to the underlying buffer
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.CreateImageDataArrayBufferViews")
  @js.native
  def CreateImageDataArrayBufferViews(data: ArrayBufferView, info: EnvironmentTextureInfo): js.Array[js.Array[ArrayBufferView]] = js.native
  
  /**
    * Gets the environment info from an env file.
    * @param data The array buffer containing the .env bytes.
    * @returns the environment file info (the json header) if successfully parsed.
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.GetEnvInfo")
  @js.native
  def GetEnvInfo(data: ArrayBufferView): Nullable[EnvironmentTextureInfo] = js.native
  
  /**
    * Uploads the texture info contained in the env file to the GPU.
    * @param texture defines the internal texture to upload to
    * @param data defines the data to load
    * @param info defines the texture info retrieved through the GetEnvInfo method
    * @returns a promise
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.UploadEnvLevelsAsync")
  @js.native
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
  @JSImport("babylonjs", "EnvironmentTextureTools.UploadEnvSpherical")
  @js.native
  def UploadEnvSpherical(texture: typings.babylonjs.internalTextureMod.InternalTexture, info: EnvironmentTextureInfo): Unit = js.native
  
  /**
    * Uploads the levels of image data to the GPU.
    * @param texture defines the internal texture to upload to
    * @param imageData defines the array buffer views of image data [mipmap][face]
    * @returns a promise
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.UploadLevelsAsync")
  @js.native
  def UploadLevelsAsync(
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    imageData: js.Array[js.Array[ArrayBufferView]]
  ): js.Promise[Unit] = js.native
  
  /**
    * Creates a JSON representation of the spherical data.
    * @param texture defines the texture containing the polynomials
    * @return the JSON representation of the spherical info
    */
  @JSImport("babylonjs", "EnvironmentTextureTools._CreateEnvTextureIrradiance")
  @js.native
  def _CreateEnvTextureIrradiance: js.Any = js.native
  @scala.inline
  def _CreateEnvTextureIrradiance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateEnvTextureIrradiance")(x.asInstanceOf[js.Any])
  
  /**
    * Magic number identifying the env file.
    */
  @JSImport("babylonjs", "EnvironmentTextureTools._MagicBytes")
  @js.native
  def _MagicBytes: js.Any = js.native
  @scala.inline
  def _MagicBytes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MagicBytes")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "EnvironmentTextureTools._OnImageReadyAsync")
  @js.native
  def _OnImageReadyAsync: js.Any = js.native
  @scala.inline
  def _OnImageReadyAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OnImageReadyAsync")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs", "EnvironmentTextureTools._UpdateRGBDAsync")
  @js.native
  def _UpdateRGBDAsync(
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}
