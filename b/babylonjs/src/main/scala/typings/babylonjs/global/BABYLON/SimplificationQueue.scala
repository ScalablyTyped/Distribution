package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISimplificationTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SimplificationQueue")
@js.native
/**
  * Creates a new queue
  */
open class SimplificationQueue ()
  extends StObject
     with typings.babylonjs.BABYLON.SimplificationQueue {
  
  /* private */ /* CompleteClass */
  var _getSimplifier: Any = js.native
  
  /* private */ /* CompleteClass */
  var _simplificationArray: Any = js.native
  
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
  
  /**
    * Gets a boolean indicating that the process is still running
    */
  /* CompleteClass */
  var running: Boolean = js.native
}
