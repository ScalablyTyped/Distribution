package typings.babylonjs

import typings.babylonjs.webXRAnchorSystemMod.IWebXRAnchorSystemOptions
import typings.babylonjs.webXRBackgroundRemoverMod.IWebXRBackgroundRemoverOptions
import typings.babylonjs.webXRControllerPointerSelectionMod.IWebXRControllerPointerSelectionOptions
import typings.babylonjs.webXRControllerTeleportationMod.IWebXRTeleportationOptions
import typings.babylonjs.webXRHitTestLegacyMod.IWebXRHitTestOptions
import typings.babylonjs.webXRPlaneDetectorMod.IWebXRPlaneDetectorOptions
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/features/index", JSImport.Namespace)
@js.native
object featuresIndexMod extends js.Object {
  @js.native
  class IWebXRControllerPhysicsOptions ()
    extends typings.babylonjs.webXRControllerPhysicsMod.IWebXRControllerPhysicsOptions
  
  @js.native
  class WebXRAnchorSystem protected ()
    extends typings.babylonjs.webXRAnchorSystemMod.WebXRAnchorSystem {
    /**
      * constructs a new anchor system
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param _options configuration object for this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRAnchorSystemOptions) = this()
  }
  
  @js.native
  class WebXRBackgroundRemover protected ()
    extends typings.babylonjs.webXRBackgroundRemoverMod.WebXRBackgroundRemover {
    /**
      * constructs a new background remover module
      * @param _xrSessionManager the session manager for this module
      * @param options read-only options to be used in this module
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * read-only options to be used in this module
      */
    options: IWebXRBackgroundRemoverOptions
    ) = this()
  }
  
  @js.native
  class WebXRControllerPhysics protected ()
    extends typings.babylonjs.webXRControllerPhysicsMod.WebXRControllerPhysics {
    /**
      * Construct a new Controller Physics Feature
      * @param _xrSessionManager the corresponding xr session manager
      * @param _options options to create this feature with
      */
    def this(
      _xrSessionManager: WebXRSessionManager,
      _options: typings.babylonjs.webXRControllerPhysicsMod.IWebXRControllerPhysicsOptions
    ) = this()
  }
  
  @js.native
  class WebXRControllerPointerSelection protected ()
    extends typings.babylonjs.webXRControllerPointerSelectionMod.WebXRControllerPointerSelection {
    /**
      * constructs a new background remover module
      * @param _xrSessionManager the session manager for this module
      * @param _options read-only options to be used in this module
      */
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRControllerPointerSelectionOptions) = this()
  }
  
  @js.native
  class WebXRHitTestLegacy protected ()
    extends typings.babylonjs.webXRHitTestLegacyMod.WebXRHitTestLegacy {
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
    options: IWebXRHitTestOptions
    ) = this()
  }
  
  @js.native
  class WebXRMotionControllerTeleportation protected ()
    extends typings.babylonjs.webXRControllerTeleportationMod.WebXRMotionControllerTeleportation {
    /**
      * constructs a new anchor system
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param _options configuration object for this feature
      */
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRTeleportationOptions) = this()
  }
  
  @js.native
  class WebXRPlaneDetector protected ()
    extends typings.babylonjs.webXRPlaneDetectorMod.WebXRPlaneDetector {
    /**
      * construct a new Plane Detector
      * @param _xrSessionManager an instance of xr Session manager
      * @param _options configuration to use when constructing this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRPlaneDetectorOptions) = this()
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object WebXRBackgroundRemover extends js.Object {
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
  
  /* static members */
  @js.native
  object WebXRControllerPhysics extends js.Object {
    /**
      * The module's name
      */
    val Name: String = js.native
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the webxr specs version
      */
    val Version: Double = js.native
  }
  
  /* static members */
  @js.native
  object WebXRControllerPointerSelection extends js.Object {
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
    var _idCounter: js.Any = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object WebXRMotionControllerTeleportation extends js.Object {
    /**
      * The module's name
      */
    val Name: String = js.native
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the webxr specs version
      */
    val Version: Double = js.native
  }
  
  /* static members */
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
  
}

