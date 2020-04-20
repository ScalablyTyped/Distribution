package typings.babylonjs.BABYLON

import typings.babylonjs.AnonException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AbstractAssetTask")
@js.native
abstract class AbstractAssetTask protected () extends js.Object {
  /**
    * Creates a new AssetsManager
    * @param name defines the name of the task
    */
  def this(/**
    * Task name
    */ name: String) = this()
  var _errorObject: js.Any = js.native
  var _isCompleted: js.Any = js.native
  var _taskState: js.Any = js.native
  /**
    * Task name
    */ var name: String = js.native
  var onDoneCallback: js.Any = js.native
  var onErrorCallback: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  def _setErrorObject(): Unit = js.native
  def _setErrorObject(message: String): Unit = js.native
  def _setErrorObject(message: String, exception: js.Any): Unit = js.native
  /**
    * Gets the current error object (if task is in error)
    */
  def errorObject: AnonException = js.native
  /**
    * Get if the task is completed
    */
  def isCompleted: Boolean = js.native
  /**
    * Callback called when the task is not successful
    */
  def onError(task: js.Any): Unit = js.native
  def onError(task: js.Any, message: String): Unit = js.native
  def onError(task: js.Any, message: String, exception: js.Any): Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: js.Any): Unit = js.native
  /**
    * Reset will set the task state back to INIT, so the next load call of the assets manager will execute this task again.
    * This can be used with failed tasks that have the reason for failure fixed.
    */
  def reset(): Unit = js.native
  /**
    * Execute the current task
    * @param scene defines the scene where you want your assets to be loaded
    * @param onSuccess is a callback called when the task is successfully executed
    * @param onError is a callback called if an error occurs
    */
  def run(
    scene: Scene,
    onSuccess: js.Function0[Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  /**
    * Execute the current task
    * @param scene defines the scene where you want your assets to be loaded
    * @param onSuccess is a callback called when the task is successfully executed
    * @param onError is a callback called if an error occurs
    */
  def runTask(
    scene: Scene,
    onSuccess: js.Function0[Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  /**
    * Gets the current state of the task
    */
  def taskState: AssetTaskState = js.native
}

