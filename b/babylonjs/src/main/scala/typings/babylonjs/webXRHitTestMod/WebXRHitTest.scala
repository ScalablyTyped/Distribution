package typings.babylonjs.webXRHitTestMod

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.sceneMod.IDisposable because Already inherited
- typings.babylonjs.webXRFeaturesManagerMod.IWebXRFeature because Already inherited
- typings.babylonjs.webXRHitTestLegacyMod.IWebXRHitTestFeature because var conflicts: attached, dependsOn, disableAutoAttach, isDisposed, xrNativeFeatureName. Inlined onHitTestResultObservable */ @JSImport("babylonjs/XR/features/WebXRHitTest", "WebXRHitTest")
@js.native
class WebXRHitTest protected () extends WebXRAbstractFeature {
  /**
    * Creates a new instance of the hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(
    _xrSessionManager: WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRHitTestOptions
  ) = this()
  
  var _processWebXRHitTestResult: js.Any = js.native
  
  var _tmpMat: js.Any = js.native
  
  var _tmpPos: js.Any = js.native
  
  var _tmpQuat: js.Any = js.native
  
  var _transientXrHitTestSource: js.Any = js.native
  
  var _xrHitTestSource: js.Any = js.native
  
  /**
    * When set to true, each hit test will have its own position/rotation objects
    * When set to false, position and rotation objects will be reused for each hit test. It is expected that
    * the developers will clone them or copy them as they see fit.
    */
  var autoCloneTransformation: Boolean = js.native
  
  var initHitTestSource: js.Any = js.native
  
  /**
    * Triggered when new babylon (transformed) hit test results are available
    * Note - this will be called when results come back from the device. It can be an empty array!!
    */
  var onHitTestResultObservable: Observable[js.Array[IWebXRHitResult]] = js.native
  
  /**
    * options to use when constructing this feature
    */
  val options: IWebXRHitTestOptions = js.native
  
  /**
    * Use this to temporarily pause hit test checks.
    */
  var paused: Boolean = js.native
}
/* static members */
@JSImport("babylonjs/XR/features/WebXRHitTest", "WebXRHitTest")
@js.native
object WebXRHitTest extends js.Object {
  
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
