package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplificationQueue extends js.Object {
  var _simplificationArray: js.Any
  var getSimplifier: js.Any
  /**
    * Gets a boolean indicating that the process is still running
    */
  var running: Boolean
  /**
    * Adds a new simplification task
    * @param task defines a task to add
    */
  def addTask(task: ISimplificationTask): Unit
  /**
    * Execute next task
    */
  def executeNext(): Unit
  /**
    * Execute a simplification task
    * @param task defines the task to run
    */
  def runSimplification(task: ISimplificationTask): Unit
}

object SimplificationQueue {
  @scala.inline
  def apply(
    _simplificationArray: js.Any,
    addTask: ISimplificationTask => Unit,
    executeNext: () => Unit,
    getSimplifier: js.Any,
    runSimplification: ISimplificationTask => Unit,
    running: Boolean
  ): SimplificationQueue = {
    val __obj = js.Dynamic.literal(_simplificationArray = _simplificationArray.asInstanceOf[js.Any], addTask = js.Any.fromFunction1(addTask), executeNext = js.Any.fromFunction0(executeNext), getSimplifier = getSimplifier.asInstanceOf[js.Any], runSimplification = js.Any.fromFunction1(runSimplification), running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplificationQueue]
  }
}

