package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRPlaneDetector
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _detectedPlanes: Any = js.native
  
  /* private */ var _enabled: Any = js.native
  
  /**
    * avoiding using Array.find for global support.
    * @param xrPlane the plane to find in the array
    */
  /* private */ var _findIndexInPlaneArray: Any = js.native
  
  /* private */ var _init: Any = js.native
  
  /* private */ var _lastFrameDetected: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _updatePlaneWithXRPlane: Any = js.native
  
  /**
    * Observers registered here will be executed when a new plane was added to the session
    */
  var onPlaneAddedObservable: Observable[IWebXRPlane] = js.native
  
  /**
    * Observers registered here will be executed when a plane is no longer detected in the session
    */
  var onPlaneRemovedObservable: Observable[IWebXRPlane] = js.native
  
  /**
    * Observers registered here will be executed when an existing plane updates (for example - expanded)
    * This can execute N times every frame
    */
  var onPlaneUpdatedObservable: Observable[IWebXRPlane] = js.native
}
