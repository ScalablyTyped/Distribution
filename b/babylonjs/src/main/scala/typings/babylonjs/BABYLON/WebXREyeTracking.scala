package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXREyeTracking
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _eyeTrackingEndListener: Any = js.native
  
  /* private */ var _eyeTrackingStartListener: Any = js.native
  
  /* private */ var _gazeRay: Any = js.native
  
  /* private */ var _init: Any = js.native
  
  /* private */ var _latestEyeSpace: Any = js.native
  
  /**
    * Get a reference to the gaze ray. This data is valid while eye tracking persists, and will be set to null when gaze data is no longer available
    * @returns a reference to the gaze ray if it exists and is valid, returns null otherwise.
    */
  def getEyeGaze(): Nullable[Ray] = js.native
  
  /**
    * Returns whether the gaze data is valid or not
    * @returns true if the data is valid
    */
  def isEyeGazeValid: Boolean = js.native
  
  /**
    * This observable will notify registered observers when eye tracking ends
    */
  val onEyeTrackingEndedObservable: Observable[Unit] = js.native
  
  /**
    * This observable will notify registered observers on each frame that has valid tracking
    */
  val onEyeTrackingFrameUpdateObservable: Observable[Ray] = js.native
  
  /**
    * This observable will notify registered observers when eye tracking starts
    */
  val onEyeTrackingStartedObservable: Observable[Ray] = js.native
}
