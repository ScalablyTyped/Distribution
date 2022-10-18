package typings.babylonjs

import typings.babylonjs.anon.Position
import typings.babylonjs.behaviorsMeshesBaseSixDofDragBehaviorMod.BaseSixDofDragBehavior
import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsMeshesSixDofDragBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/sixDofDragBehavior", "SixDofDragBehavior")
  @js.native
  open class SixDofDragBehavior () extends BaseSixDofDragBehavior {
    
    /* private */ var _getPositionOffsetAround: Any = js.native
    
    /* private */ var _onePointerPositionUpdated: Any = js.native
    
    /* private */ var _sceneRenderObserver: Any = js.native
    
    /* protected */ var _startingOrientation: Quaternion = js.native
    
    /* protected */ var _startingPosition: Vector3 = js.native
    
    /* protected */ var _startingScaling: Vector3 = js.native
    
    /* protected */ def _targetDrag(worldDeltaPosition: Vector3, worldDeltaRotation: Quaternion): Unit = js.native
    
    /* protected */ def _targetDragEnd(): Unit = js.native
    
    /* protected */ def _targetDragStart(): Unit = js.native
    
    /* protected */ var _targetOrientation: Quaternion = js.native
    
    /* protected */ var _targetPosition: Vector3 = js.native
    
    /* protected */ var _targetScaling: Vector3 = js.native
    
    /* private */ var _twoPointersPositionUpdated: Any = js.native
    
    /* private */ var _virtualTransformNode: Any = js.native
    
    /**
      * Use this flag to update the target but not move the owner node towards the target
      */
    var disableMovement: Boolean = js.native
    
    /**
      * The distance towards the target drag position to move each frame. This can be useful to avoid jitter. Set this to 1 for no delay. (Default: 0.2)
      */
    var dragDeltaRatio: Double = js.native
    
    /**
      * Should the object rotate towards the camera when we start dragging it
      */
    var faceCameraOnDragStart: Boolean = js.native
    
    /**
      *  The name of the behavior
      */
    @JSName("name")
    def name_MSixDofDragBehavior: String = js.native
    
    /**
      * Fires when position is updated
      */
    var onPositionChangedObservable: Observable[Position] = js.native
    
    /**
      * If `rotateDraggedObject` is set to `true`, this parameter determines if we are only rotating around the y axis (yaw)
      */
    var rotateAroundYOnly: Boolean = js.native
    
    /**
      * If the object should rotate to face the drag origin
      */
    var rotateDraggedObject: Boolean = js.native
    
    /**
      * Should the behavior rotate 1:1 with the motion controller, when one is used.
      */
    var rotateWithMotionController: Boolean = js.native
  }
}
