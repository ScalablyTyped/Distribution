package typings.babylonjs

import org.scalablytyped.runtime.NumberDictionary
import typings.babylonjs.anon.DRAG
import typings.babylonjs.anon.Delta
import typings.babylonjs.anon.Position
import typings.babylonjs.behaviorsBehaviorMod.Behavior
import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsMeshesBaseSixDofDragBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/baseSixDofDragBehavior", "BaseSixDofDragBehavior")
  @js.native
  open class BaseSixDofDragBehavior ()
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
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: Mesh): Unit = js.native
    
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
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    
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
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /**
      *  Returns true if the attached mesh is currently moving with this behavior
      */
    def isMoving: Boolean = js.native
    
    /** gets or sets behavior's name */
    /* CompleteClass */
    var name: String = js.native
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
    var onDragObservable: Observable[Delta] = js.native
    
    /**
      * Fires each time a drag starts
      */
    var onDragStartObservable: Observable[Position] = js.native
    
    /**
      * How much faster the object should move when the controller is moving towards it. This is useful to bring objects that are far away from the user to them faster. Set this to 0 to avoid any speed increase. (Default: 3)
      */
    var zDragFactor: Double = js.native
  }
  /* static members */
  object BaseSixDofDragBehavior {
    
    @JSImport("babylonjs/Behaviors/Meshes/baseSixDofDragBehavior", "BaseSixDofDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/Meshes/baseSixDofDragBehavior", "BaseSixDofDragBehavior._virtualScene")
    @js.native
    def _virtualScene: Scene = js.native
    inline def _virtualScene_=(x: Scene): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_virtualScene")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Data store to track virtual pointers movement
    */
  trait VirtualMeshInfo extends StObject {
    
    var dragMesh: AbstractMesh
    
    var dragging: Boolean
    
    var lastDragPosition: Vector3
    
    var lastOriginPosition: Vector3
    
    var moving: Boolean
    
    var originMesh: AbstractMesh
    
    var pivotMesh: AbstractMesh
    
    var startingOrientation: Quaternion
    
    var startingPivotOrientation: Quaternion
    
    var startingPivotPosition: Vector3
    
    var startingPosition: Vector3
  }
  object VirtualMeshInfo {
    
    inline def apply(
      dragMesh: AbstractMesh,
      dragging: Boolean,
      lastDragPosition: Vector3,
      lastOriginPosition: Vector3,
      moving: Boolean,
      originMesh: AbstractMesh,
      pivotMesh: AbstractMesh,
      startingOrientation: Quaternion,
      startingPivotOrientation: Quaternion,
      startingPivotPosition: Vector3,
      startingPosition: Vector3
    ): VirtualMeshInfo = {
      val __obj = js.Dynamic.literal(dragMesh = dragMesh.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], lastDragPosition = lastDragPosition.asInstanceOf[js.Any], lastOriginPosition = lastOriginPosition.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], originMesh = originMesh.asInstanceOf[js.Any], pivotMesh = pivotMesh.asInstanceOf[js.Any], startingOrientation = startingOrientation.asInstanceOf[js.Any], startingPivotOrientation = startingPivotOrientation.asInstanceOf[js.Any], startingPivotPosition = startingPivotPosition.asInstanceOf[js.Any], startingPosition = startingPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualMeshInfo]
    }
    
    extension [Self <: VirtualMeshInfo](x: Self) {
      
      inline def setDragMesh(value: AbstractMesh): Self = StObject.set(x, "dragMesh", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setLastDragPosition(value: Vector3): Self = StObject.set(x, "lastDragPosition", value.asInstanceOf[js.Any])
      
      inline def setLastOriginPosition(value: Vector3): Self = StObject.set(x, "lastOriginPosition", value.asInstanceOf[js.Any])
      
      inline def setMoving(value: Boolean): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
      
      inline def setOriginMesh(value: AbstractMesh): Self = StObject.set(x, "originMesh", value.asInstanceOf[js.Any])
      
      inline def setPivotMesh(value: AbstractMesh): Self = StObject.set(x, "pivotMesh", value.asInstanceOf[js.Any])
      
      inline def setStartingOrientation(value: Quaternion): Self = StObject.set(x, "startingOrientation", value.asInstanceOf[js.Any])
      
      inline def setStartingPivotOrientation(value: Quaternion): Self = StObject.set(x, "startingPivotOrientation", value.asInstanceOf[js.Any])
      
      inline def setStartingPivotPosition(value: Vector3): Self = StObject.set(x, "startingPivotPosition", value.asInstanceOf[js.Any])
      
      inline def setStartingPosition(value: Vector3): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    }
  }
}
