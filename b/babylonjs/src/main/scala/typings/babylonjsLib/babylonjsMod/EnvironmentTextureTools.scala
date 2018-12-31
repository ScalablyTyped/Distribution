package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets of helpers addressing the serialization and deserialization of environment texture
  * stored in a BabylonJS env file.
  * Those files are usually stored as .env files.
  */
@JSImport("babylonjs", "EnvironmentTextureTools")
@js.native
class EnvironmentTextureTools ()
  extends babylonjsLib.BABYLONNs.EnvironmentTextureTools

/**
  * Sets of helpers addressing the serialization and deserialization of environment texture
  * stored in a BabylonJS env file.
  * Those files are usually stored as .env files.
  */
@JSImport("babylonjs", "EnvironmentTextureTools")
@js.native
object EnvironmentTextureTools extends js.Object {
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
  /**
    * Creates an environment texture from a loaded cube texture.
    * @param texture defines the cube texture to convert in env file
    * @return a promise containing the environment data if succesfull.
    */
  def CreateEnvTextureAsync(texture: babylonjsLib.BABYLONNs.CubeTexture): js.Promise[stdLib.ArrayBuffer] = js.native
  /**
    * Gets the environment info from an env file.
    * @param data The array buffer containing the .env bytes.
    * @returns the environment file info (the json header) if successfully parsed.
    */
  def GetEnvInfo(data: stdLib.ArrayBuffer): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.EnvironmentTextureInfo] = js.native
  /**
    * Uploads the texture info contained in the env file to the GPU.
    * @param texture defines the internal texture to upload to
    * @param arrayBuffer defines the buffer cotaining the data to load
    * @param info defines the texture info retrieved through the GetEnvInfo method
    * @returns a promise
    */
  def UploadEnvLevelsAsync(
    texture: babylonjsLib.BABYLONNs.InternalTexture,
    arrayBuffer: js.Any,
    info: babylonjsLib.BABYLONNs.EnvironmentTextureInfo
  ): js.Promise[scala.Unit] = js.native
  /**
    * Uploads spherical polynomials information to the texture.
    * @param texture defines the texture we are trying to upload the information to
    * @param info defines the environment texture info retrieved through the GetEnvInfo method
    */
  def UploadEnvSpherical(
    texture: babylonjsLib.BABYLONNs.InternalTexture,
    info: babylonjsLib.BABYLONNs.EnvironmentTextureInfo
  ): scala.Unit = js.native
  /**
    * Uploads the levels of image data to the GPU.
    * @param texture defines the internal texture to upload to
    * @param imageData defines the array buffer views of image data [mipmap][face]
    * @returns a promise
    */
  def UploadLevelsAsync(
    texture: babylonjsLib.BABYLONNs.InternalTexture,
    imageData: js.Array[js.Array[stdLib.ArrayBufferView]]
  ): js.Promise[scala.Unit] = js.native
}

