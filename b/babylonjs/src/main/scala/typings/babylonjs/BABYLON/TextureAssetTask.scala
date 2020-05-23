package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureAssetTask
  extends AbstractAssetTask
     with ITextureAssetTask[Texture] {
  /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  var invertY: js.UndefOr[Boolean] = js.native
  /**
    * Defines if mipmap should not be generated (default is false)
    */
  var noMipmap: js.UndefOr[Boolean] = js.native
  /**
    * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  var samplingMode: Double = js.native
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: TextureAssetTask): Unit = js.native
  def onError(task: TextureAssetTask, message: String): Unit = js.native
  def onError(task: TextureAssetTask, message: String, exception: js.Any): Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: TextureAssetTask): Unit = js.native
}

