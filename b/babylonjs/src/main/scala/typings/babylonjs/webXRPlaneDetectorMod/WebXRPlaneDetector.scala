package typings.babylonjs.webXRPlaneDetectorMod

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/WebXRPlaneDetector", "WebXRPlaneDetector")
@js.native
class WebXRPlaneDetector protected () extends WebXRAbstractFeature {
  /**
    * construct a new Plane Detector
    * @param _xrSessionManager an instance of xr Session manager
    * @param _options configuration to use when constructing this feature
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRPlaneDetectorOptions) = this()
  
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
/* static members */
@JSImport("babylonjs/XR/features/WebXRPlaneDetector", "WebXRPlaneDetector")
@js.native
object WebXRPlaneDetector extends js.Object {
  
  /**
    * The module's name
    */
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  val Version: Double = js.native
}
