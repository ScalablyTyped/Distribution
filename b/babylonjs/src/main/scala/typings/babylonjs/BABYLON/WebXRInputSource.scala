package typings.babylonjs.BABYLON

import typings.babylonjs.XRFrame
import typings.babylonjs.XRInputSource
import typings.babylonjs.XRPose
import typings.babylonjs.XRReferenceSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRInputSource extends StObject {
  
  /* private */ var _disposed: Any = js.native
  
  /**
    * The last XRPose the was calculated on the current XRFrame
    * @hidden
    */
  var _lastXRPose: js.UndefOr[XRPose] = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _tmpVector: Any = js.native
  
  /* private */ var _uniqueId: Any = js.native
  
  /**
    * Disposes of the object
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets a world space ray coming from the pointer or grip
    * @param result the resulting ray
    * @param gripIfAvailable use the grip mesh instead of the pointer, if available
    */
  def getWorldPointerRayToRef(result: Ray): Unit = js.native
  def getWorldPointerRayToRef(result: Ray, gripIfAvailable: Boolean): Unit = js.native
  
  /**
    * Represents the part of the controller that is held. This may not exist if the controller is the head mounted display itself, if that's the case only the pointer from the head will be available
    */
  var grip: js.UndefOr[AbstractMesh] = js.native
  
  /** The underlying input source for the controller  */
  var inputSource: XRInputSource = js.native
  
  /**
    * If available, this is the gamepad object related to this controller.
    * Using this object it is possible to get click events and trackpad changes of the
    * webxr controller that is currently being used.
    */
  var motionController: js.UndefOr[WebXRAbstractMotionController] = js.native
  
  /**
    * Event that fires when the controller is removed/disposed.
    * The object provided as event data is this controller, after associated assets were disposed.
    * uniqueId is still available.
    */
  var onDisposeObservable: Observable[WebXRInputSource] = js.native
  
  /**
    * Will be triggered when the mesh associated with the motion controller is done loading.
    * It is also possible that this will never trigger (!) if no mesh was loaded, or if the developer decides to load a different mesh
    * A shortened version of controller -> motion controller -> on mesh loaded.
    */
  var onMeshLoadedObservable: Observable[AbstractMesh] = js.native
  
  /**
    * Observers registered here will trigger when a motion controller profile was assigned to this xr controller
    */
  var onMotionControllerInitObservable: Observable[WebXRAbstractMotionController] = js.native
  
  /**
    * Pointer which can be used to select objects or attach a visible laser to
    */
  var pointer: AbstractMesh = js.native
  
  /**
    * Get this controllers unique id
    */
  def uniqueId: String = js.native
  
  /**
    * Updates the controller pose based on the given XRFrame
    * @param xrFrame xr frame to update the pose with
    * @param referenceSpace reference space to use
    * @param xrCamera the xr camera, used for parenting
    */
  def updateFromXRFrame(xrFrame: XRFrame, referenceSpace: XRReferenceSpace, xrCamera: WebXRCamera): Unit = js.native
}
