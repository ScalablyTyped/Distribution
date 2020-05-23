package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CubeTextureAssetTask
  extends AbstractAssetTask
     with ITextureAssetTask[CubeTexture] {
  /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Defines the explicit list of files (undefined by default)
    */
  var files: js.UndefOr[js.Array[String]] = js.native
  /**
    * Defines if mipmaps should not be generated (default is false)
    */
  var noMipmap: js.UndefOr[Boolean] = js.native
  /**
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  var url: String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: CubeTextureAssetTask): Unit = js.native
  def onError(task: CubeTextureAssetTask, message: String): Unit = js.native
  def onError(task: CubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: CubeTextureAssetTask): Unit = js.native
}

