package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.camerasFreeCameraMod.FreeCamera
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import typings.babylonjs.xRWebXRTypesMod.WebXRTrackingState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRWebXRCameraMod {
  
  @JSImport("babylonjs/XR/webXRCamera", "WebXRCamera")
  @js.native
  open class WebXRCamera protected () extends FreeCamera {
    /**
      * Creates a new webXRCamera, this should only be set at the camera after it has been updated by the xrSessionManager
      * @param name the name of the camera
      * @param scene the scene to add the camera to
      * @param _xrSessionManager a constructed xr session manager
      */
    def this(name: String, scene: Scene, _xrSessionManager: WebXRSessionManager) = this()
    
    /* private */ var _firstFrame: Any = js.native
    
    /**
      * The last XRViewerPose from the current XRFrame
      * @internal
      */
    var _lastXRViewerPose: js.UndefOr[XRViewerPose] = js.native
    
    /* private */ var _referenceQuaternion: Any = js.native
    
    /* private */ var _referencedPosition: Any = js.native
    
    /* private */ var _rotate180: Any = js.native
    
    /* private */ var _setTrackingState: Any = js.native
    
    /* private */ var _trackingState: Any = js.native
    
    /** @internal */
    def _updateForDualEyeDebugging(): Unit = js.native
    
    /* private */ var _updateFromXRSession: Any = js.native
    
    /* private */ var _updateNumberOfRigCameras: Any = js.native
    
    /* private */ var _updateReferenceSpace: Any = js.native
    
    /* private */ var _xrSessionManager: Any = js.native
    
    /**
      * Should position compensation execute on first frame.
      * This is used when copying the position from a native (non XR) camera
      */
    var compensateOnFirstFrame: Boolean = js.native
    
    /**
      *  Observable raised after camera teleportation
      */
    var onAfterCameraTeleport: Observable[Vector3] = js.native
    
    /**
      * Observable raised before camera teleportation
      */
    var onBeforeCameraTeleport: Observable[Vector3] = js.native
    
    /**
      * Notifies when the camera's tracking state has changed.
      * Notice - will also be triggered when tracking has started (at the beginning of the session)
      */
    var onTrackingStateChanged: Observable[WebXRTrackingState] = js.native
    
    /**
      * Return the user's height, unrelated to the current ground.
      * This will be the y position of this camera, when ground level is 0.
      */
    def realWorldHeight: Double = js.native
    
    /**
      * Sets this camera's transformation based on a non-vr camera
      * @param otherCamera the non-vr camera to copy the transformation from
      * @param resetToBaseReferenceSpace should XR reset to the base reference space
      */
    def setTransformationFromNonVRCamera(): Unit = js.native
    def setTransformationFromNonVRCamera(otherCamera: Unit, resetToBaseReferenceSpace: Boolean): Unit = js.native
    def setTransformationFromNonVRCamera(otherCamera: Camera): Unit = js.native
    def setTransformationFromNonVRCamera(otherCamera: Camera, resetToBaseReferenceSpace: Boolean): Unit = js.native
    
    /**
      * Get the current XR tracking state of the camera
      */
    def trackingState: WebXRTrackingState = js.native
  }
  /* static members */
  object WebXRCamera {
    
    @JSImport("babylonjs/XR/webXRCamera", "WebXRCamera")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/XR/webXRCamera", "WebXRCamera._ScaleReadOnly")
    @js.native
    def _ScaleReadOnly: Any = js.native
    inline def _ScaleReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ScaleReadOnly")(x.asInstanceOf[js.Any])
  }
}
