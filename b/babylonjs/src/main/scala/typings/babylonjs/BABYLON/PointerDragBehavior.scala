package typings.babylonjs.BABYLON

import typings.babylonjs.anon.DragAxisDragPlaneNormal
import typings.babylonjs.anon.DragPlaneNormal
import typings.babylonjs.anon.PointerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerDragBehavior
  extends StObject
     with Behavior[AbstractMesh] {
  
  /* private */ var _activeDragButton: Any = js.native
  
  /* private */ var _alternatePickedPoint: Any = js.native
  
  /* private */ var _attachedToElement: Any = js.native
  
  /* private */ var _beforeRenderObserver: Any = js.native
  
  /* private */ var _debugMode: Any = js.native
  
  /* private */ var _dragDelta: Any = js.native
  
  /* private */ var _dragPlane: Any = js.native
  
  /* private */ var _enabled: Any = js.native
  
  /* private */ var _lastPointerRay: Any = js.native
  
  /* private */ var _localAxis: Any = js.native
  
  /* private */ var _lookAt: Any = js.native
  
  /* protected */ def _moveDrag(ray: Ray): Unit = js.native
  
  /* private */ var _moving: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _pickWithRayOnDragPlane: Any = js.native
  
  /* private */ var _pointA: Any = js.native
  
  /* private */ var _pointC: Any = js.native
  
  /* private */ var _pointerObserver: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* protected */ def _startDrag(pointerId: Double): Unit = js.native
  /* protected */ def _startDrag(pointerId: Double, fromRay: Unit, startPickedPoint: Vector3): Unit = js.native
  /* protected */ def _startDrag(pointerId: Double, fromRay: Ray): Unit = js.native
  /* protected */ def _startDrag(pointerId: Double, fromRay: Ray, startPickedPoint: Vector3): Unit = js.native
  
  /* private */ var _startDragRay: Any = js.native
  
  /* private */ var _targetPosition: Any = js.native
  
  /* private */ var _tmpVector: Any = js.native
  
  /* private */ var _updateDragPlanePosition: Any = js.native
  
  /**
    * @internal
    */
  var _useAlternatePickedPointAboveMaxDragAngle: Boolean = js.native
  
  /* private */ var _useAlternatePickedPointAboveMaxDragAngleDragSpeed: Any = js.native
  
  /* private */ var _worldDragAxis: Any = js.native
  
  def attach(ownerNode: AbstractMesh, predicate: js.Function1[/* m */ AbstractMesh, Boolean]): Unit = js.native
  
  /**
    * Abstract mesh the behavior is set on
    */
  var attachedNode: AbstractMesh = js.native
  
  /**
    * Get or set the currentDraggingPointerId
    * @deprecated Please use currentDraggingPointerId instead
    */
  def currentDraggingPointerID: Double = js.native
  def currentDraggingPointerID_=(currentDraggingPointerID: Double): Unit = js.native
  
  /**
    * The id of the pointer that is currently interacting with the behavior (-1 when no pointer is active)
    */
  var currentDraggingPointerId: Double = js.native
  
  /**
    * If camera controls should be detached during the drag
    */
  var detachCameraControls: Boolean = js.native
  
  /**
    * Butttons that can be used to initiate a drag
    */
  var dragButtons: js.Array[Double] = js.native
  
  /**
    * The distance towards the target drag position to move each frame. This can be useful to avoid jitter. Set this to 1 for no delay. (Default: 0.2)
    */
  var dragDeltaRatio: Double = js.native
  
  /**
    * If the behavior is currently in a dragging state
    */
  var dragging: Boolean = js.native
  
  def enabled: Boolean = js.native
  /**
    *  If the drag behavior will react to drag events (Default: true)
    */
  def enabled_=(value: Boolean): Unit = js.native
  
  /**
    * The last position where the pointer hit the drag plane in world space
    */
  var lastDragPosition: Vector3 = js.native
  
  /**
    * The maximum tolerated angle between the drag plane and dragging pointer rays to trigger pointer events. Set to 0 to allow any angle (default: 0)
    */
  var maxDragAngle: Double = js.native
  
  /**
    *  If the attached mesh should be moved when dragged
    */
  var moveAttached: Boolean = js.native
  
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MPointerDragBehavior: String = js.native
  
  /**
    *  Fires each time a drag ends (eg. mouse release after drag)
    */
  var onDragEndObservable: Observable[PointerId] = js.native
  
  /**
    *  Fires each time the attached mesh is dragged with the pointer
    *  * delta between last drag position and current drag position in world space
    *  * dragDistance along the drag axis
    *  * dragPlaneNormal normal of the current drag plane used during the drag
    *  * dragPlanePoint in world space where the drag intersects the drag plane
    */
  var onDragObservable: Observable[DragPlaneNormal] = js.native
  
  /**
    *  Fires each time a drag begins (eg. mouse down on mesh)
    */
  var onDragStartObservable: Observable[PointerId] = js.native
  
  /**
    *  Fires each time behavior enabled state changes
    */
  var onEnabledObservable: Observable[Boolean] = js.native
  
  /**
    * Gets the options used by the behavior
    */
  def options: DragAxisDragPlaneNormal = js.native
  /**
    * Sets the options used by the behavior
    */
  def options_=(options: DragAxisDragPlaneNormal): Unit = js.native
  
  /**
    * Force release the drag action by code.
    */
  def releaseDrag(): Unit = js.native
  
  /**
    * If pointer events should start and release the drag (Default: true)
    */
  var startAndReleaseDragOnPointerEvents: Boolean = js.native
  
  /**
    * Simulates the start of a pointer drag event on the behavior
    * @param pointerId pointerID of the pointer that should be simulated (Default: Any mouse pointer ID)
    * @param fromRay initial ray of the pointer to be simulated (Default: Ray from camera to attached mesh)
    * @param startPickedPoint picked point of the pointer to be simulated (Default: attached mesh position)
    */
  def startDrag(): Unit = js.native
  def startDrag(pointerId: Double): Unit = js.native
  def startDrag(pointerId: Double, fromRay: Unit, startPickedPoint: Vector3): Unit = js.native
  def startDrag(pointerId: Double, fromRay: Ray): Unit = js.native
  def startDrag(pointerId: Double, fromRay: Ray, startPickedPoint: Vector3): Unit = js.native
  def startDrag(pointerId: Unit, fromRay: Unit, startPickedPoint: Vector3): Unit = js.native
  def startDrag(pointerId: Unit, fromRay: Ray): Unit = js.native
  def startDrag(pointerId: Unit, fromRay: Ray, startPickedPoint: Vector3): Unit = js.native
  
  /**
    * If the drag plane orientation should be updated during the dragging (Default: true)
    */
  var updateDragPlane: Boolean = js.native
  
  /**
    * If set, the drag plane/axis will be rotated based on the attached mesh's world rotation (Default: true)
    */
  var useObjectOrientationForDragging: Boolean = js.native
  
  /**
    * Predicate to determine if it is valid to move the object to a new position when it is moved
    * @param targetPosition
    */
  def validateDrag(targetPosition: Vector3): Boolean = js.native
}
