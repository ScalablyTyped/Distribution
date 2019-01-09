package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define an abstract asset task used with a AssetsManager class to load assets into a scene
  */
@JSGlobal("BABYLON.AbstractAssetTask")
@js.native
abstract class AbstractAssetTask protected () extends js.Object {
  /**
    * Creates a new AssetsManager
    * @param name defines the name of the task
    */
  def this(/**
    * Task name
    */ name: java.lang.String) = this()
  var _errorObject: js.Any = js.native
  var _isCompleted: js.Any = js.native
  var _taskState: js.Any = js.native
  /**
    * Gets the current error object (if task is in error)
    */
  val errorObject: babylonjsLib.Anon_Exception = js.native
  /**
    * Get if the task is completed
    */
  val isCompleted: scala.Boolean = js.native
  /**
    * Task name
    */ var name: java.lang.String = js.native
  var onDoneCallback: js.Any = js.native
  var onErrorCallback: js.Any = js.native
  /**
    * Gets the current state of the task
    */
  val taskState: AssetTaskState = js.native
  /**
    * Internal only
    * @hidden
    */
  def _setErrorObject(): scala.Unit = js.native
  def _setErrorObject(message: java.lang.String): scala.Unit = js.native
  def _setErrorObject(message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
    * Callback called when the task is not successful
    */
  def onError(task: js.Any): scala.Unit = js.native
  def onError(task: js.Any, message: java.lang.String): scala.Unit = js.native
  def onError(task: js.Any, message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: js.Any): scala.Unit = js.native
  /**
    * Reset will set the task state back to INIT, so the next load call of the assets manager will execute this task again.
    * This can be used with failed tasks that have the reason for failure fixed.
    */
  def reset(): scala.Unit = js.native
  /**
    * Execute the current task
    * @param scene defines the scene where you want your assets to be loaded
    * @param onSuccess is a callback called when the task is successfully executed
    * @param onError is a callback called if an error occurs
    */
  def run(
    scene: Scene,
    onSuccess: js.Function0[scala.Unit],
    onError: js.Function2[
      /* message */ js.UndefOr[java.lang.String], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Execute the current task
    * @param scene defines the scene where you want your assets to be loaded
    * @param onSuccess is a callback called when the task is successfully executed
    * @param onError is a callback called if an error occurs
    */
  def runTask(
    scene: Scene,
    onSuccess: js.Function0[scala.Unit],
    onError: js.Function2[
      /* message */ js.UndefOr[java.lang.String], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

