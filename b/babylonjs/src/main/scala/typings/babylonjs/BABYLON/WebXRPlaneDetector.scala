package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRPlaneDetector extends WebXRAbstractFeature {
  
  var _detectedPlanes: js.Any = js.native
  
  var _enabled: js.Any = js.native
  
  var _init: js.Any = js.native
  
  var _lastFrameDetected: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _updatePlaneWithXRPlane: js.Any = js.native
  
  /**
    * avoiding using Array.find for global support.
    * @param xrPlane the plane to find in the array
    */
  var findIndexInPlaneArray: js.Any = js.native
  
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
