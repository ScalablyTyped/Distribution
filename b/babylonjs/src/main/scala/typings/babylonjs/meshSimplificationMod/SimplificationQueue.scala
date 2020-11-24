package typings.babylonjs.meshSimplificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/meshSimplification", "SimplificationQueue")
@js.native
/**
  * Creates a new queue
  */
class SimplificationQueue () extends js.Object {
  
  var _simplificationArray: js.Any = js.native
  
  /**
    * Adds a new simplification task
    * @param task defines a task to add
    */
  def addTask(task: ISimplificationTask): Unit = js.native
  
  /**
    * Execute next task
    */
  def executeNext(): Unit = js.native
  
  var getSimplifier: js.Any = js.native
  
  /**
    * Execute a simplification task
    * @param task defines the task to run
    */
  def runSimplification(task: ISimplificationTask): Unit = js.native
  
  /**
    * Gets a boolean indicating that the process is still running
    */
  var running: Boolean = js.native
}
