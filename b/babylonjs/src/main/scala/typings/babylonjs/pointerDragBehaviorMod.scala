package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.DragAxis
import typings.babylonjs.anon.DragDistance
import typings.babylonjs.anon.DragPlanePoint
import typings.babylonjs.behaviorMod.Behavior
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.rayMod.Ray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Behaviors/Meshes/pointerDragBehavior", JSImport.Namespace)
@js.native
object pointerDragBehaviorMod extends js.Object {
  @js.native
  /**
    * Creates a pointer drag behavior that can be attached to a mesh
    * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
    */
  class PointerDragBehavior () extends Behavior[AbstractMesh] {
    def this(options: DragAxis) = this()
    var _alternatePickedPoint: js.Any = js.native
    var _attachedElement: js.Any = js.native
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
    var _useAlternatePickedPointAboveMaxDragAngle: Boolean = js.native
    var _useAlternatePickedPointAboveMaxDragAngleDragSpeed: js.Any = js.native
    var _worldDragAxis: js.Any = js.native
    /**
      * Abstract mesh the behavior is set on
      */
    var attachedNode: AbstractMesh = js.native
    /**
      * The id of the pointer that is currently interacting with the behavior (-1 when no pointer is active)
      */
    var currentDraggingPointerID: Double = js.native
    /**
      * If camera controls should be detached during the drag
      */
    var detachCameraControls: Boolean = js.native
    /**
      * The distance towards the target drag position to move each frame. This can be useful to avoid jitter. Set this to 1 for no delay. (Default: 0.2)
      */
    var dragDeltaRatio: Double = js.native
    /**
      * If the behavior is currently in a dragging state
      */
    var dragging: Boolean = js.native
    /**
      *  If the drag behavior will react to drag events (Default: true)
      */
    var enabled: Boolean = js.native
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
    /** gets or sets behavior's name */
    /* CompleteClass */
    override var name: String = js.native
    /**
      *  Fires each time a drag ends (eg. mouse release after drag)
      */
    var onDragEndObservable: Observable[DragPlanePoint] = js.native
    /**
      *  Fires each time the attached mesh is dragged with the pointer
      *  * delta between last drag position and current drag position in world space
      *  * dragDistance along the drag axis
      *  * dragPlaneNormal normal of the current drag plane used during the drag
      *  * dragPlanePoint in world space where the drag intersects the drag plane
      */
    var onDragObservable: Observable[DragDistance] = js.native
    /**
      *  Fires each time a drag begins (eg. mouse down on mesh)
      */
    var onDragStartObservable: Observable[DragPlanePoint] = js.native
    /**
      * If pointer events should start and release the drag (Default: true)
      */
    var startAndReleaseDragOnPointerEvents: Boolean = js.native
    /**
      * If the drag plane orientation should be updated during the dragging (Default: true)
      */
    var updateDragPlane: Boolean = js.native
    /**
      * If set, the drag plane/axis will be rotated based on the attached mesh's world rotation (Default: true)
      */
    var useObjectOrientationForDragging: Boolean = js.native
    def attach(ownerNode: AbstractMesh, predicate: js.Function1[/* m */ AbstractMesh, Boolean]): Unit = js.native
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: AbstractMesh): Unit = js.native
    /**
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    /**
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    /**
      *  The name of the behavior
      */
    @JSName("name")
    def name_MPointerDragBehavior: String = js.native
    /**
      * Gets the options used by the behavior
      */
    def options: DragAxis = js.native
    /**
      * Sets the options used by the behavior
      */
    def options(options: DragAxis): js.Any = js.native
    /**
      * Force relase the drag action by code.
      */
    def releaseDrag(): Unit = js.native
    /**
      * Simulates the start of a pointer drag event on the behavior
      * @param pointerId pointerID of the pointer that should be simulated (Default: Any mouse pointer ID)
      * @param fromRay initial ray of the pointer to be simulated (Default: Ray from camera to attached mesh)
      * @param startPickedPoint picked point of the pointer to be simulated (Default: attached mesh position)
      */
    def startDrag(): Unit = js.native
    def startDrag(pointerId: Double): Unit = js.native
    def startDrag(pointerId: Double, fromRay: Ray): Unit = js.native
    def startDrag(pointerId: Double, fromRay: Ray, startPickedPoint: Vector3): Unit = js.native
    /**
      * Predicate to determine if it is valid to move the object to a new position when it is moved
      */
    def validateDrag(targetPosition: Vector3): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PointerDragBehavior extends js.Object {
    var _AnyMouseID: js.Any = js.native
    var _planeScene: js.Any = js.native
  }
  
}

