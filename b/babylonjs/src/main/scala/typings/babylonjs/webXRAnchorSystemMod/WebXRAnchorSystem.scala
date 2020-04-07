package typings.babylonjs.webXRAnchorSystemMod

import typings.babylonjs.XRAnchor
import typings.babylonjs.XRAnchorCreator
import typings.babylonjs.XRRigidTransform
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRHitTestLegacyMod.WebXRHitTestLegacy
import typings.babylonjs.webXRPlaneDetectorMod.WebXRPlaneDetector
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/features/WebXRAnchorSystem", "WebXRAnchorSystem")
@js.native
class WebXRAnchorSystem protected () extends WebXRAbstractFeature {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRAnchorSystemOptions) = this()
  var _enabled: js.Any = js.native
  /**
    * avoiding using Array.find for global support.
    * @param xrAnchor the plane to find in the array
    */
  var _findIndexInAnchorArray: js.Any = js.native
  var _hitTestModule: js.Any = js.native
  var _lastFrameDetected: js.Any = js.native
  var _onSelect: js.Any = js.native
  var _options: js.Any = js.native
  var _planeDetector: js.Any = js.native
  var _trackedAnchors: js.Any = js.native
  var _updateAnchorWithXRFrame: js.Any = js.native
  /**
    * Observers registered here will be executed when a new anchor was added to the session
    */
  var onAnchorAddedObservable: Observable[IWebXRAnchor] = js.native
  /**
    * Observers registered here will be executed when an anchor was removed from the session
    */
  var onAnchorRemovedObservable: Observable[IWebXRAnchor] = js.native
  /**
    * Observers registered here will be executed when an existing anchor updates
    * This can execute N times every frame
    */
  var onAnchorUpdatedObservable: Observable[IWebXRAnchor] = js.native
  /**
    * Add anchor at a specific XR point.
    *
    * @param xrRigidTransformation xr-coordinates where a new anchor should be added
    * @param anchorCreator the object o use to create an anchor with. either a session or a plane
    * @returns a promise the fulfills when the anchor was created
    */
  def addAnchorAtRigidTransformation(xrRigidTransformation: XRRigidTransform): js.Promise[XRAnchor] = js.native
  def addAnchorAtRigidTransformation(xrRigidTransformation: XRRigidTransform, anchorCreator: XRAnchorCreator): js.Promise[XRAnchor] = js.native
  /**
    * If set, it will improve performance by using the current hit-test results instead of executing a new hit-test
    * @param hitTestModule the hit-test module to use.
    */
  def setHitTestModule(hitTestModule: WebXRHitTestLegacy): Unit = js.native
  /**
    * set the plane detector to use in order to create anchors from frames
    * @param planeDetector the plane-detector module to use
    * @param enable enable plane-anchors. default is true
    */
  def setPlaneDetector(planeDetector: WebXRPlaneDetector): Unit = js.native
  def setPlaneDetector(planeDetector: WebXRPlaneDetector, enable: Boolean): Unit = js.native
}

/* static members */
@JSImport("babylonjs/XR/features/WebXRAnchorSystem", "WebXRAnchorSystem")
@js.native
object WebXRAnchorSystem extends js.Object {
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

