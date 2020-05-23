package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISimplificationTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SimplificationQueue")
@js.native
/**
  * Creates a new queue
  */
class SimplificationQueue ()
  extends typings.babylonjs.BABYLON.SimplificationQueue {
  /* CompleteClass */
  override var _simplificationArray: js.Any = js.native
  /* CompleteClass */
  override var getSimplifier: js.Any = js.native
  /**
    * Gets a boolean indicating that the process is still running
    */
  /* CompleteClass */
  override var running: Boolean = js.native
  /**
    * Adds a new simplification task
    * @param task defines a task to add
    */
  /* CompleteClass */
  override def addTask(task: ISimplificationTask): Unit = js.native
  /**
    * Execute next task
    */
  /* CompleteClass */
  override def executeNext(): Unit = js.native
  /**
    * Execute a simplification task
    * @param task defines the task to run
    */
  /* CompleteClass */
  override def runSimplification(task: ISimplificationTask): Unit = js.native
}

