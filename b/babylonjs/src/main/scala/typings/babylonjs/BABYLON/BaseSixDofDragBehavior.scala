package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import typings.babylonjs.anon.DRAG
import typings.babylonjs.anon.PickInfo
import typings.babylonjs.anon.PositionVector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSixDofDragBehavior
  extends StObject
     with Behavior[Mesh] {
  
  /* private */ var _applyZOffset: Any = js.native
  
  /* private */ var _attachedToElement: Any = js.native
  
  /* private */ var _createVirtualMeshInfo: Any = js.native
  
  /* protected */ var _dragType: DRAG = js.native
  
  /* protected */ var _dragging: Double = js.native
  
  /* protected */ var _moving: Boolean = js.native
  
  /* protected */ var _ownerNode: TransformNode = js.native
  
  /**
    * In the case of multiple active cameras, the cameraToUseForPointers should be used if set instead of active camera
    */
  /* private */ def _pointerCamera: Any = js.native
  
  /* private */ var _pointerObserver: Any = js.native
  
  /* private */ var _pointerUpdate2D: Any = js.native
  
  /* private */ var _pointerUpdateXR: Any = js.native
  
  /* protected */ def _resetVirtualMeshesPosition(): Unit = js.native
  
  /* protected */ var _scene: Scene = js.native
  
  /* protected */ def _targetDrag(worldDeltaPosition: Vector3, worldDeltaRotation: Quaternion, pointerId: Double): Unit = js.native
  
  /* protected */ def _targetDragEnd(pointerId: Double): Unit = js.native
  
  /* protected */ def _targetDragStart(worldPosition: Vector3, worldRotation: Quaternion, pointerId: Double): Unit = js.native
  
  /* private */ var _tmpQuaternion: Any = js.native
  
  /* private */ var _tmpVector: Any = js.native
  
  /* protected */ var _virtualMeshesInfo: NumberDictionary[VirtualMeshInfo] = js.native
  
  /**
    * Should the behavior allow simultaneous pointers to interact with the owner node.
    */
  var allowMultiPointer: Boolean = js.native
  
  /**
    * Attaches the scale behavior the passed in mesh
    * @param ownerNode The mesh that will be scaled around once attached
    */
  def attach(ownerNode: TransformNode): Unit = js.native
  
  /**
    * Get or set the currentDraggingPointerId
    * @deprecated Please use currentDraggingPointerId instead
    */
  def currentDraggingPointerID: Double = js.native
  def currentDraggingPointerID_=(currentDraggingPointerID: Double): Unit = js.native
  
  /**
    * The id of the pointer that is currently interacting with the behavior (-1 when no pointer is active)
    */
  def currentDraggingPointerId: Double = js.native
  def currentDraggingPointerId_=(value: Double): Unit = js.native
  
  /**
    * In case of multipointer interaction, all pointer ids currently active are stored here
    */
  var currentDraggingPointerIds: js.Array[Double] = js.native
  
  /**
    / **
    * If camera controls should be detached during the drag
    */
  var detachCameraControls: Boolean = js.native
  
  /**
    * The list of child meshes that can receive drag events
    * If `null`, all child meshes will receive drag event
    */
  var draggableMeshes: Nullable[js.Array[AbstractMesh]] = js.native
  
  /**
    *  Returns true if the attached mesh is currently moving with this behavior
    */
  def isMoving: Boolean = js.native
  
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MBaseSixDofDragBehavior: String = js.native
  
  /**
    *  Fires each time a drag ends (eg. mouse release after drag)
    */
  var onDragEndObservable: Observable[js.Object] = js.native
  
  /**
    * Fires each time a drag happens
    */
  var onDragObservable: Observable[PickInfo] = js.native
  
  /**
    * Fires each time a drag starts
    */
  var onDragStartObservable: Observable[PositionVector3] = js.native
  
  /**
    * How much faster the object should move when the controller is moving towards it. This is useful to bring objects that are far away from the user to them faster. Set this to 0 to avoid any speed increase. (Default: 3)
    */
  var zDragFactor: Double = js.native
}
