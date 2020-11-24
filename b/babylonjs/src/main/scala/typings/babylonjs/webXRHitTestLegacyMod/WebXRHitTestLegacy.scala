package typings.babylonjs.webXRHitTestLegacyMod

import typings.babylonjs.XRHitResult
import typings.babylonjs.XRInputSourceEvent
import typings.babylonjs.XRRay
import typings.babylonjs.XRReferenceSpace
import typings.babylonjs.XRSession
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.sceneMod.IDisposable because Already inherited
- typings.babylonjs.webXRFeaturesManagerMod.IWebXRFeature because Already inherited
- typings.babylonjs.webXRHitTestLegacyMod.IWebXRHitTestFeature because var conflicts: attached, dependsOn, disableAutoAttach, isDisposed, xrNativeFeatureName. Inlined onHitTestResultObservable */ @JSImport("babylonjs/XR/features/WebXRHitTestLegacy", "WebXRHitTestLegacy")
@js.native
class WebXRHitTestLegacy protected () extends WebXRAbstractFeature {
  /**
    * Creates a new instance of the (legacy version) hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(
    _xrSessionManager: WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRLegacyHitTestOptions
  ) = this()
  
  var _direction: js.Any = js.native
  
  var _mat: js.Any = js.native
  
  var _onHitTestResults: js.Any = js.native
  
  var _onSelect: js.Any = js.native
  
  var _onSelectEnabled: js.Any = js.native
  
  var _origin: js.Any = js.native
  
  /**
    * Populated with the last native XR Hit Results
    */
  var lastNativeXRHitResults: js.Array[XRHitResult] = js.native
  
  /**
    * Triggered when new babylon (transformed) hit test results are available
    */
  var onHitTestResultObservable: Observable[js.Array[IWebXRLegacyHitResult]] = js.native
  
  /**
    * options to use when constructing this feature
    */
  val options: IWebXRLegacyHitTestOptions = js.native
}
/* static members */
@JSImport("babylonjs/XR/features/WebXRHitTestLegacy", "WebXRHitTestLegacy")
@js.native
object WebXRHitTestLegacy extends js.Object {
  
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
  
  /**
    * execute a hit test with an XR Ray
    *
    * @param xrSession a native xrSession that will execute this hit test
    * @param xrRay the ray (position and direction) to use for ray-casting
    * @param referenceSpace native XR reference space to use for the hit-test
    * @param filter filter function that will filter the results
    * @returns a promise that resolves with an array of native XR hit result in xr coordinates system
    */
  def XRHitTestWithRay(xrSession: XRSession, xrRay: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = js.native
  def XRHitTestWithRay(
    xrSession: XRSession,
    xrRay: XRRay,
    referenceSpace: XRReferenceSpace,
    filter: js.Function1[/* result */ XRHitResult, Boolean]
  ): js.Promise[js.Array[XRHitResult]] = js.native
  
  /**
    * Execute a hit test on the current running session using a select event returned from a transient input (such as touch)
    * @param event the (select) event to use to select with
    * @param referenceSpace the reference space to use for this hit test
    * @returns a promise that resolves with an array of native XR hit result in xr coordinates system
    */
  def XRHitTestWithSelectEvent(event: XRInputSourceEvent, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = js.native
}
