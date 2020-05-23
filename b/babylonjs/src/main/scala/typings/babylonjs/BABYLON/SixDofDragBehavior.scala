package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SixDofDragBehavior extends Behavior[Mesh] {
  var _moving: js.Any
  var _ownerNode: js.Any
  var _pointerObserver: js.Any
  var _scene: js.Any
  var _sceneRenderObserver: js.Any
  var _startingOrientation: js.Any
  var _targetPosition: js.Any
  var _virtualDragMesh: js.Any
  var _virtualOriginMesh: js.Any
  /**
    * The id of the pointer that is currently interacting with the behavior (-1 when no pointer is active)
    */
  var currentDraggingPointerID: Double
  /**
    * If camera controls should be detached during the drag
    */
  var detachCameraControls: Boolean
  /**
    * The distance towards the target drag position to move each frame. This can be useful to avoid jitter. Set this to 1 for no delay. (Default: 0.2)
    */
  var dragDeltaRatio: Double
  /**
    * If the behavior is currently in a dragging state
    */
  var dragging: Boolean
  /**
    *  Fires each time a drag ends (eg. mouse release after drag)
    */
  var onDragEndObservable: Observable[js.Object]
  /**
    * Fires each time a drag starts
    */
  var onDragStartObservable: Observable[js.Object]
  /**
    * If the object should rotate to face the drag origin
    */
  var rotateDraggedObject: Boolean
  /**
    * How much faster the object should move when the controller is moving towards it. This is useful to bring objects that are far away from the user to them faster. Set this to 0 to avoid any speed increase. (Default: 3)
    */
  var zDragFactor: js.Any
  /**
    * In the case of multiplea active cameras, the cameraToUseForPointers should be used if set instead of active camera
    */
  /* private */ def _pointerCamera: js.Any
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MSixDofDragBehavior: String
}

object SixDofDragBehavior {
  @scala.inline
  def apply(
    _moving: js.Any,
    _ownerNode: js.Any,
    _pointerCamera: () => js.Any,
    _pointerObserver: js.Any,
    _scene: js.Any,
    _sceneRenderObserver: js.Any,
    _startingOrientation: js.Any,
    _targetPosition: js.Any,
    _virtualDragMesh: js.Any,
    _virtualOriginMesh: js.Any,
    attach: Mesh => Unit,
    currentDraggingPointerID: Double,
    detach: () => Unit,
    detachCameraControls: Boolean,
    dragDeltaRatio: Double,
    dragging: Boolean,
    init: () => Unit,
    name: () => String,
    onDragEndObservable: Observable[js.Object],
    onDragStartObservable: Observable[js.Object],
    rotateDraggedObject: Boolean,
    zDragFactor: js.Any
  ): SixDofDragBehavior = {
    val __obj = js.Dynamic.literal(_moving = _moving.asInstanceOf[js.Any], _ownerNode = _ownerNode.asInstanceOf[js.Any], _pointerCamera = js.Any.fromFunction0(_pointerCamera), _pointerObserver = _pointerObserver.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _sceneRenderObserver = _sceneRenderObserver.asInstanceOf[js.Any], _startingOrientation = _startingOrientation.asInstanceOf[js.Any], _targetPosition = _targetPosition.asInstanceOf[js.Any], _virtualDragMesh = _virtualDragMesh.asInstanceOf[js.Any], _virtualOriginMesh = _virtualOriginMesh.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), currentDraggingPointerID = currentDraggingPointerID.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), detachCameraControls = detachCameraControls.asInstanceOf[js.Any], dragDeltaRatio = dragDeltaRatio.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), name = js.Any.fromFunction0(name), onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], rotateDraggedObject = rotateDraggedObject.asInstanceOf[js.Any], zDragFactor = zDragFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SixDofDragBehavior]
  }
}

