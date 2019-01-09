package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A behavior that when attached to a mesh will allow the mesh to be dragged around the screen based on pointer events
  */
@JSGlobal("BABYLON.PointerDragBehavior")
@js.native
/**
  * Creates a pointer drag behavior that can be attached to a mesh
  * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
  */
class PointerDragBehavior () extends Behavior[Mesh] {
  def this(options: babylonjsLib.Anon_DragAxis) = this()
  var _alternatePickedPoint: js.Any = js.native
  var _attachedElement: js.Any = js.native
  var _attachedNode: js.Any = js.native
  var _beforeRenderObserver: js.Any = js.native
  var _debugMode: js.Any = js.native
  var _dragDelta: js.Any = js.native
  var _dragPlane: js.Any = js.native
  var _lastPointerRay: js.Any = js.native
  var _lineA: js.Any = js.native
  var _lineB: js.Any = js.native
  var _localAxis: js.Any = js.native
  var _lookAt: js.Any = js.native
  var _moveDrag: js.Any = js.native
  var _moving: js.Any = js.native
  var _options: js.Any = js.native
  var _pickWithRayOnDragPlane: js.Any = js.native
  var _pointA: js.Any = js.native
  var _pointB: js.Any = js.native
  var _pointC: js.Any = js.native
  var _pointerObserver: js.Any = js.native
  var _scene: js.Any = js.native
  var _startDrag: js.Any = js.native
  var _startDragRay: js.Any = js.native
  var _targetPosition: js.Any = js.native
  var _tmpVector: js.Any = js.native
  var _updateDragPlanePosition: js.Any = js.native
  /**
    * @hidden
    */
  var _useAlternatePickedPointAboveMaxDragAngle: scala.Boolean = js.native
  var _worldDragAxis: js.Any = js.native
  /**
    * The id of the pointer that is currently interacting with the behavior (-1 when no pointer is active)
    */
  var currentDraggingPointerID: scala.Double = js.native
  /**
    * If camera controls should be detached during the drag
    */
  var detachCameraControls: scala.Boolean = js.native
  /**
    * The distance towards the target drag position to move each frame. This can be useful to avoid jitter. Set this to 1 for no delay. (Default: 0.2)
    */
  var dragDeltaRatio: scala.Double = js.native
  /**
    * If the behavior is currently in a dragging state
    */
  var dragging: scala.Boolean = js.native
  /**
    *  If the drag behavior will react to drag events (Default: true)
    */
  var enabled: scala.Boolean = js.native
  /**
    * The last position where the pointer hit the drag plane in world space
    */
  var lastDragPosition: Vector3 = js.native
  /**
    * The maximum tolerated angle between the drag plane and dragging pointer rays to trigger pointer events. Set to 0 to allow any angle (default: 0)
    */
  var maxDragAngle: scala.Double = js.native
  /**
    *  If the attached mesh should be moved when dragged
    */
  var moveAttached: scala.Boolean = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    *  Fires each time a drag ends (eg. mouse release after drag)
    */
  var onDragEndObservable: Observable[babylonjsLib.Anon_DragPlanePoint] = js.native
  /**
    *  Fires each time the attached mesh is dragged with the pointer
    *  * delta between last drag position and current drag position in world space
    *  * dragDistance along the drag axis
    *  * dragPlaneNormal normal of the current drag plane used during the drag
    *  * dragPlanePoint in world space where the drag intersects the drag plane
    */
  var onDragObservable: Observable[babylonjsLib.Anon_DeltaDragDistance] = js.native
  /**
    *  Fires each time a drag begins (eg. mouse down on mesh)
    */
  var onDragStartObservable: Observable[babylonjsLib.Anon_DragPlanePoint] = js.native
  /**
    * If the drag plane orientation should be updated during the dragging (Default: true)
    */
  var updateDragPlane: scala.Boolean = js.native
  /**
    * If set, the drag plane/axis will be rotated based on the attached mesh's world rotation (Default: true)
    */
  var useObjectOrienationForDragging: scala.Boolean = js.native
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: Mesh): scala.Unit = js.native
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): scala.Unit = js.native
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): scala.Unit = js.native
  /**
    * Force relase the drag action by code.
    */
  def releaseDrag(): scala.Unit = js.native
  /**
    * Simulates the start of a pointer drag event on the behavior
    * @param pointerId pointerID of the pointer that should be simulated (Default: Any mouse pointer ID)
    * @param fromRay initial ray of the pointer to be simulated (Default: Ray from camera to attached mesh)
    * @param startPickedPoint picked point of the pointer to be simulated (Default: attached mesh position)
    */
  def startDrag(): scala.Unit = js.native
  def startDrag(pointerId: scala.Double): scala.Unit = js.native
  def startDrag(pointerId: scala.Double, fromRay: Ray): scala.Unit = js.native
  def startDrag(pointerId: scala.Double, fromRay: Ray, startPickedPoint: Vector3): scala.Unit = js.native
}

/**
  * A behavior that when attached to a mesh will allow the mesh to be dragged around the screen based on pointer events
  */
@JSGlobal("BABYLON.PointerDragBehavior")
@js.native
object PointerDragBehavior extends js.Object {
  var _AnyMouseID: js.Any = js.native
  var _planeScene: js.Any = js.native
}

