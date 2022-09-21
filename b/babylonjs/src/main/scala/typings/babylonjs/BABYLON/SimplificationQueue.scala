package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplificationQueue extends StObject {
  
  /* private */ var _getSimplifier: Any
  
  /* private */ var _simplificationArray: Any
  
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
  
  /**
    * Gets a boolean indicating that the process is still running
    */
  var running: Boolean
}
object SimplificationQueue {
  
  inline def apply(
    _getSimplifier: Any,
    _simplificationArray: Any,
    addTask: ISimplificationTask => Unit,
    executeNext: () => Unit,
    runSimplification: ISimplificationTask => Unit,
    running: Boolean
  ): SimplificationQueue = {
    val __obj = js.Dynamic.literal(_getSimplifier = _getSimplifier.asInstanceOf[js.Any], _simplificationArray = _simplificationArray.asInstanceOf[js.Any], addTask = js.Any.fromFunction1(addTask), executeNext = js.Any.fromFunction0(executeNext), runSimplification = js.Any.fromFunction1(runSimplification), running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplificationQueue]
  }
  
  extension [Self <: SimplificationQueue](x: Self) {
    
    inline def setAddTask(value: ISimplificationTask => Unit): Self = StObject.set(x, "addTask", js.Any.fromFunction1(value))
    
    inline def setExecuteNext(value: () => Unit): Self = StObject.set(x, "executeNext", js.Any.fromFunction0(value))
    
    inline def setRunSimplification(value: ISimplificationTask => Unit): Self = StObject.set(x, "runSimplification", js.Any.fromFunction1(value))
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def set_getSimplifier(value: Any): Self = StObject.set(x, "_getSimplifier", value.asInstanceOf[js.Any])
    
    inline def set_simplificationArray(value: Any): Self = StObject.set(x, "_simplificationArray", value.asInstanceOf[js.Any])
  }
}
