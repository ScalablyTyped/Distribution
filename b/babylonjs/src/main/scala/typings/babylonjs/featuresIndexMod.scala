package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.webXRAnchorSystemMod.IWebXRAnchorSystemOptions
import typings.babylonjs.webXRBackgroundRemoverMod.IWebXRBackgroundRemoverOptions
import typings.babylonjs.webXRControllerPointerSelectionMod.IWebXRControllerPointerSelectionOptions
import typings.babylonjs.webXRControllerTeleportationMod.IWebXRTeleportationOptions
import typings.babylonjs.webXRHandTrackingMod.IWebXRHandTrackingOptions
import typings.babylonjs.webXRHitTestLegacyMod.IWebXRLegacyHitTestOptions
import typings.babylonjs.webXRHitTestMod.IWebXRHitTestOptions
import typings.babylonjs.webXRInputSourceMod.WebXRInputSource
import typings.babylonjs.webXRPlaneDetectorMod.IWebXRPlaneDetectorOptions
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresIndexMod {
  
  @JSImport("babylonjs/XR/features/index", "IWebXRControllerPhysicsOptions")
  @js.native
  class IWebXRControllerPhysicsOptions ()
    extends typings.babylonjs.webXRControllerPhysicsMod.IWebXRControllerPhysicsOptions
  
  @JSImport("babylonjs/XR/features/index", "WebXRAbstractFeature")
  @js.native
  abstract class WebXRAbstractFeature protected ()
    extends typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature {
    /**
      * Construct a new (abstract) WebXR feature
      * @param _xrSessionManager the xr session manager for this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRAnchorSystem")
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
  /* static members */
  object WebXRAnchorSystem {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRAnchorSystem.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRAnchorSystem.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRBackgroundRemover")
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
  /* static members */
  object WebXRBackgroundRemover {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRBackgroundRemover.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRBackgroundRemover.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRControllerPhysics")
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
  /* static members */
  object WebXRControllerPhysics {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRControllerPhysics.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the webxr specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRControllerPhysics.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRControllerPointerSelection")
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
  /* static members */
  object WebXRControllerPointerSelection {
    
    @JSImport("babylonjs/XR/features/index", "WebXRControllerPointerSelection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRControllerPointerSelection.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRControllerPointerSelection.Version")
    @js.native
    val Version: Double = js.native
    
    @JSImport("babylonjs/XR/features/index", "WebXRControllerPointerSelection._idCounter")
    @js.native
    def _idCounter: js.Any = js.native
    @scala.inline
    def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRFeaturePointSystem")
  @js.native
  class WebXRFeaturePointSystem protected ()
    extends typings.babylonjs.webXRFeaturePointSystemMod.WebXRFeaturePointSystem {
    /**
      * construct the feature point system
      * @param _xrSessionManager an instance of xr Session manager
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
  }
  /* static members */
  object WebXRFeaturePointSystem {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRFeaturePointSystem.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRFeaturePointSystem.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRHand")
  @js.native
  class WebXRHand protected ()
    extends typings.babylonjs.webXRHandTrackingMod.WebXRHand {
    /**
      * Construct a new hand object
      * @param xrController the controller to which the hand correlates
      * @param trackedMeshes the meshes to be used to track the hand joints
      * @param _handMesh an optional hand mesh. if not provided, ours will be used
      * @param _rigMapping an optional rig mapping for the hand mesh. if not provided, ours will be used
      * @param disableDefaultHandMesh should the default mesh creation be disabled
      */
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh]
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: AbstractMesh
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: js.UndefOr[scala.Nothing],
      _rigMapping: js.Array[String]
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: AbstractMesh,
      _rigMapping: js.Array[String]
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: js.UndefOr[scala.Nothing],
      _rigMapping: js.UndefOr[scala.Nothing],
      disableDefaultHandMesh: Boolean
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: js.UndefOr[scala.Nothing],
      _rigMapping: js.Array[String],
      disableDefaultHandMesh: Boolean
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: AbstractMesh,
      _rigMapping: js.UndefOr[scala.Nothing],
      disableDefaultHandMesh: Boolean
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: AbstractMesh,
      _rigMapping: js.Array[String],
      disableDefaultHandMesh: Boolean
    ) = this()
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRHandTracking")
  @js.native
  class WebXRHandTracking protected ()
    extends typings.babylonjs.webXRHandTrackingMod.WebXRHandTracking {
    /**
      * Creates a new instance of the hit test feature
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param options options to use when constructing this feature
      */
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * options to use when constructing this feature
      */
    options: IWebXRHandTrackingOptions
    ) = this()
  }
  /* static members */
  object WebXRHandTracking {
    
    @JSImport("babylonjs/XR/features/index", "WebXRHandTracking")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRHandTracking.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRHandTracking.Version")
    @js.native
    val Version: Double = js.native
    
    @JSImport("babylonjs/XR/features/index", "WebXRHandTracking._idCounter")
    @js.native
    def _idCounter: js.Any = js.native
    @scala.inline
    def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRHitTest")
  @js.native
  class WebXRHitTest protected ()
    extends typings.babylonjs.webXRHitTestMod.WebXRHitTest {
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
  }
  /* static members */
  object WebXRHitTest {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRHitTest.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRHitTest.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRHitTestLegacy")
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
    options: IWebXRLegacyHitTestOptions
    ) = this()
  }
  /* static members */
  object WebXRHitTestLegacy {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRHitTestLegacy.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRHitTestLegacy.Version")
    @js.native
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
    @JSImport("babylonjs/XR/features/index", "WebXRHitTestLegacy.XRHitTestWithRay")
    @js.native
    def XRHitTestWithRay(xrSession: XRSession, xrRay: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = js.native
    @JSImport("babylonjs/XR/features/index", "WebXRHitTestLegacy.XRHitTestWithRay")
    @js.native
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
    @JSImport("babylonjs/XR/features/index", "WebXRHitTestLegacy.XRHitTestWithSelectEvent")
    @js.native
    def XRHitTestWithSelectEvent(event: XRInputSourceEvent, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = js.native
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRMotionControllerTeleportation")
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
  /* static members */
  object WebXRMotionControllerTeleportation {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRMotionControllerTeleportation.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the webxr specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRMotionControllerTeleportation.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @JSImport("babylonjs/XR/features/index", "WebXRPlaneDetector")
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
  object WebXRPlaneDetector {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/index", "WebXRPlaneDetector.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/index", "WebXRPlaneDetector.Version")
    @js.native
    val Version: Double = js.native
  }
}
