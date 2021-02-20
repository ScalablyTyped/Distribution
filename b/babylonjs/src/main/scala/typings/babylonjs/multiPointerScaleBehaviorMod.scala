package typings.babylonjs

import typings.babylonjs.behaviorMod.Behavior
import typings.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiPointerScaleBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/multiPointerScaleBehavior", "MultiPointerScaleBehavior")
  @js.native
  /**
    * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
    */
  class MultiPointerScaleBehavior () extends Behavior[Mesh] {
    
    var _dragBehaviorA: js.Any = js.native
    
    var _dragBehaviorB: js.Any = js.native
    
    var _getCurrentDistance: js.Any = js.native
    
    var _initialScale: js.Any = js.native
    
    var _ownerNode: js.Any = js.native
    
    var _sceneRenderObserver: js.Any = js.native
    
    var _startDistance: js.Any = js.native
    
    var _targetScale: js.Any = js.native
    
    /**
      *  The name of the behavior
      */
    @JSName("name")
    def name_MMultiPointerScaleBehavior: String = js.native
  }
}
