package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneOptimizer
  extends StObject
     with IDisposable {
  
  /* private */ var _checkCurrentState: Any = js.native
  
  /* private */ var _currentFrameRate: Any = js.native
  
  /* private */ var _currentPriorityLevel: Any = js.native
  
  /* private */ var _improvementMode: Any = js.native
  
  /* private */ var _isRunning: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _sceneDisposeObserver: Any = js.native
  
  /* private */ var _targetFrameRate: Any = js.native
  
  /* private */ var _trackerDuration: Any = js.native
  
  /**
    * Gets the current frame rate checked by the SceneOptimizer
    */
  def currentFrameRate: Double = js.native
  
  /**
    * Gets the current priority level (0 at start)
    */
  def currentPriorityLevel: Double = js.native
  
  /**
    * Gets or sets a boolean indicating if the optimizer is in improvement mode
    */
  def isInImprovementMode: Boolean = js.native
  def isInImprovementMode_=(value: Boolean): Unit = js.native
  
  /**
    * Defines an observable called when the optimizer is not able to reach the target frame rate
    */
  var onFailureObservable: Observable[SceneOptimizer] = js.native
  
  /**
    * Defines an observable called when the optimizer enables an optimization
    */
  var onNewOptimizationAppliedObservable: Observable[SceneOptimization] = js.native
  
  /**
    * Defines an observable called when the optimizer reaches the target frame rate
    */
  var onSuccessObservable: Observable[SceneOptimizer] = js.native
  
  /**
    * Gets the list of active optimizations
    */
  def optimizations: js.Array[SceneOptimization] = js.native
  
  /**
    * Reset the optimizer to initial step (current priority level = 0)
    */
  def reset(): Unit = js.native
  
  /**
    * Start the optimizer. By default it will try to reach a specific framerate
    * but if the optimizer is set with improvementMode === true then it will run all optimization while frame rate is above the target frame rate
    */
  def start(): Unit = js.native
  
  /**
    * Stops the current optimizer
    */
  def stop(): Unit = js.native
  
  /**
    * Gets or sets the current target frame rate (60 by default)
    */
  def targetFrameRate: Double = js.native
  /**
    * Gets or sets the current target frame rate (60 by default)
    */
  def targetFrameRate_=(value: Double): Unit = js.native
  
  /**
    * Gets or sets the current interval between two checks (every 2000ms by default)
    */
  def trackerDuration: Double = js.native
  /**
    * Gets or sets the current interval between two checks (every 2000ms by default)
    */
  def trackerDuration_=(value: Double): Unit = js.native
}
