package typings.babylonjs.BABYLON

import typings.babylonjs.XRViewerPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRCamera
  extends StObject
     with FreeCamera {
  
  /* private */ var _firstFrame: Any = js.native
  
  /**
    * The last XRViewerPose from the current XRFrame
    * @hidden
    */
  var _lastXRViewerPose: js.UndefOr[XRViewerPose] = js.native
  
  /* private */ var _referenceQuaternion: Any = js.native
  
  /* private */ var _referencedPosition: Any = js.native
  
  /* private */ var _rotate180: Any = js.native
  
  /* private */ var _setTrackingState: Any = js.native
  
  /* private */ var _trackingState: Any = js.native
  
  /** @hidden */
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
