package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractAssetTask extends StObject {
  
  /* private */ var _errorObject: Any = js.native
  
  /* private */ var _isCompleted: Any = js.native
  
  /* private */ var _onDoneCallback: Any = js.native
  
  /* private */ var _onErrorCallback: Any = js.native
  
  /**
    * Internal only
    * @internal
    */
  def _setErrorObject(): Unit = js.native
  def _setErrorObject(message: String): Unit = js.native
  def _setErrorObject(message: String, exception: Any): Unit = js.native
  def _setErrorObject(message: Unit, exception: Any): Unit = js.native
  
  /* private */ var _taskState: Any = js.native
  
  /**
    * Gets the current error object (if task is in error)
    */
  def errorObject: Exception = js.native
  
  /**
    * Get if the task is completed
    */
  def isCompleted: Boolean = js.native
  
  /**
    * Task name
    */ var name: String = js.native
  
  /**
    * Callback called when the task is not successful
    */
  def onError(task: Any): Unit = js.native
  def onError(task: Any, message: String): Unit = js.native
  def onError(task: Any, message: String, exception: Any): Unit = js.native
  def onError(task: Any, message: Unit, exception: Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: Any): Unit = js.native
  
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
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
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
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
  ): Unit = js.native
  
  /**
    * Gets the current state of the task
    */
  def taskState: AssetTaskState = js.native
}
