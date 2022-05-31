package typings.babylonjs

import typings.babylonjs.behaviorMod.Behavior
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.transformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachToBoxBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/attachToBoxBehavior", "AttachToBoxBehavior")
  @js.native
  class AttachToBoxBehavior protected ()
    extends StObject
       with Behavior[Mesh] {
    /**
      * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
      * @param ui The transform node that should be attched to the mesh
      */
    def this(ui: TransformNode) = this()
    
    /* private */ var _closestFace: js.Any = js.native
    
    /* private */ var _faceVectors: js.Any = js.native
    
    /* private */ var _lookAtTmpMatrix: js.Any = js.native
    
    /* private */ var _lookAtToRef: js.Any = js.native
    
    /* private */ var _onRenderObserver: js.Any = js.native
    
    /* private */ var _scene: js.Any = js.native
    
    /* private */ var _target: js.Any = js.native
    
    /* private */ var _tmpMatrix: js.Any = js.native
    
    /* private */ var _tmpVector: js.Any = js.native
    
    /* private */ var _zeroVector: js.Any = js.native
    
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: Mesh): Unit = js.native
    
    /**
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    
    /**
      * The distance from the bottom of the face that the UI should be attached to (default: 0.15)
      */
    var distanceAwayFromBottomOfFace: Double = js.native
    
    /**
      * The distance away from the face of the mesh that the UI should be attached to (default: 0.15)
      */
    var distanceAwayFromFace: Double = js.native
    
    /**
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** gets or sets behavior's name */
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ var ui: js.Any = js.native
  }
}
