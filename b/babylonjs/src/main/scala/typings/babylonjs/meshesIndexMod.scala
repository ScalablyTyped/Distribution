package typings.babylonjs

import typings.babylonjs.anon.DragAxis
import typings.babylonjs.transformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesIndexMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "AttachToBoxBehavior")
  @js.native
  class AttachToBoxBehavior protected ()
    extends typings.babylonjs.attachToBoxBehaviorMod.AttachToBoxBehavior {
    /**
      * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
      * @param ui The transform node that should be attched to the mesh
      */
    def this(ui: TransformNode) = this()
  }
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "FadeInOutBehavior")
  @js.native
  /**
    * Instatiates the FadeInOutBehavior
    */
  class FadeInOutBehavior ()
    extends typings.babylonjs.fadeInOutBehaviorMod.FadeInOutBehavior
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "MultiPointerScaleBehavior")
  @js.native
  /**
    * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
    */
  class MultiPointerScaleBehavior ()
    extends typings.babylonjs.multiPointerScaleBehaviorMod.MultiPointerScaleBehavior
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "PointerDragBehavior")
  @js.native
  /**
    * Creates a pointer drag behavior that can be attached to a mesh
    * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
    */
  class PointerDragBehavior ()
    extends typings.babylonjs.pointerDragBehaviorMod.PointerDragBehavior {
    def this(options: DragAxis) = this()
  }
  /* static members */
  object PointerDragBehavior {
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "PointerDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "PointerDragBehavior._AnyMouseID")
    @js.native
    def _AnyMouseID: js.Any = js.native
    inline def _AnyMouseID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AnyMouseID")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "PointerDragBehavior._planeScene")
    @js.native
    def _planeScene: js.Any = js.native
    inline def _planeScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_planeScene")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "SixDofDragBehavior")
  @js.native
  /**
    * Instantiates a behavior that when attached to a mesh will allow the mesh to be dragged around based on directions and origin of the pointer's ray
    */
  class SixDofDragBehavior ()
    extends typings.babylonjs.sixDofDragBehaviorMod.SixDofDragBehavior
  /* static members */
  object SixDofDragBehavior {
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "SixDofDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "SixDofDragBehavior._virtualScene")
    @js.native
    def _virtualScene: js.Any = js.native
    inline def _virtualScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_virtualScene")(x.asInstanceOf[js.Any])
  }
}
