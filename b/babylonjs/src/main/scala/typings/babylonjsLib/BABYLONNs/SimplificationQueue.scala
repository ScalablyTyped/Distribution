package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Queue used to order the simplification tasks
  * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
  */
@JSGlobal("BABYLON.SimplificationQueue")
@js.native
/**
  * Creates a new queue
  */
class SimplificationQueue () extends js.Object {
  var _simplificationArray: js.Any = js.native
  var getSimplifier: js.Any = js.native
  /**
    * Gets a boolean indicating that the process is still running
    */
  var running: scala.Boolean = js.native
  /**
    * Adds a new simplification task
    * @param task defines a task to add
    */
  def addTask(task: ISimplificationTask): scala.Unit = js.native
  /**
    * Execute next task
    */
  def executeNext(): scala.Unit = js.native
  /**
    * Execute a simplification task
    * @param task defines the task to run
    */
  def runSimplification(task: ISimplificationTask): scala.Unit = js.native
}

