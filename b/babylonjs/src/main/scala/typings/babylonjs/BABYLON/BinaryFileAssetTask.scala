package typings.babylonjs.BABYLON

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryFileAssetTask extends AbstractAssetTask {
  /**
    * Gets the lodaded data (as an array buffer)
    */
  var data: ArrayBuffer = js.native
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: BinaryFileAssetTask): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: String): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: String, exception: js.Any): Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: BinaryFileAssetTask): Unit = js.native
}

