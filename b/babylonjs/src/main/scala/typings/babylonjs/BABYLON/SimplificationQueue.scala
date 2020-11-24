package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimplificationQueue extends js.Object {
  
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
  
  @scala.inline
  implicit class SimplificationQueueOps[Self <: SimplificationQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_simplificationArray(value: js.Any): Self = this.set("_simplificationArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTask(value: ISimplificationTask => Unit): Self = this.set("addTask", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteNext(value: () => Unit): Self = this.set("executeNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSimplifier(value: js.Any): Self = this.set("getSimplifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunSimplification(value: ISimplificationTask => Unit): Self = this.set("runSimplification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
  }
}
