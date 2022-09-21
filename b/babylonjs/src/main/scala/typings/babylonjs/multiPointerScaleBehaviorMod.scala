package typings.babylonjs

import typings.babylonjs.behaviorMod.Behavior
import typings.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiPointerScaleBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/multiPointerScaleBehavior", "MultiPointerScaleBehavior")
  @js.native
  /**
    * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
    */
  open class MultiPointerScaleBehavior ()
    extends StObject
       with Behavior[Mesh] {
    
    /* private */ var _dragBehaviorA: Any = js.native
    
    /* private */ var _dragBehaviorB: Any = js.native
    
    /* private */ var _getCurrentDistance: Any = js.native
    
    /* private */ var _initialScale: Any = js.native
    
    /* private */ var _ownerNode: Any = js.native
    
    /* private */ var _sceneRenderObserver: Any = js.native
    
    /* private */ var _startDistance: Any = js.native
    
    /* private */ var _targetScale: Any = js.native
    
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
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** gets or sets behavior's name */
    /* CompleteClass */
    var name: String = js.native
    /**
      *  The name of the behavior
      */
    @JSName("name")
    def name_MMultiPointerScaleBehavior: String = js.native
  }
}
