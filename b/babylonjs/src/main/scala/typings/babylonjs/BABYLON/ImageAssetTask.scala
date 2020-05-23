package typings.babylonjs.BABYLON

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageAssetTask extends AbstractAssetTask {
  /**
    * Gets the loaded images
    */
  var image: HTMLImageElement = js.native
  /**
    * Defines the location of the image to load
    */
  var url: String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: ImageAssetTask): Unit = js.native
  def onError(task: ImageAssetTask, message: String): Unit = js.native
  def onError(task: ImageAssetTask, message: String, exception: js.Any): Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: ImageAssetTask): Unit = js.native
}

