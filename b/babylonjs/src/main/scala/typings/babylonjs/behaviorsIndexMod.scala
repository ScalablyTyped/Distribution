package typings.babylonjs

import typings.babylonjs.anon.DragAxis
import typings.babylonjs.easingMod.BackEase
import typings.babylonjs.easingMod.ExponentialEase
import typings.babylonjs.transformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsIndexMod {
  
  @JSImport("babylonjs/Behaviors/index", "AttachToBoxBehavior")
  @js.native
  class AttachToBoxBehavior protected ()
    extends typings.babylonjs.meshesIndexMod.AttachToBoxBehavior {
    /**
      * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
      * @param ui The transform node that should be attched to the mesh
      */
    def this(ui: TransformNode) = this()
  }
  
  @JSImport("babylonjs/Behaviors/index", "AutoRotationBehavior")
  @js.native
  class AutoRotationBehavior ()
    extends typings.babylonjs.camerasIndexMod.AutoRotationBehavior
  
  @JSImport("babylonjs/Behaviors/index", "BouncingBehavior")
  @js.native
  class BouncingBehavior ()
    extends typings.babylonjs.camerasIndexMod.BouncingBehavior
  /* static members */
  object BouncingBehavior {
    
    @JSImport("babylonjs/Behaviors/index", "BouncingBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The easing function used by animations
      */
    @JSImport("babylonjs/Behaviors/index", "BouncingBehavior.EasingFunction")
    @js.native
    def EasingFunction: BackEase = js.native
    inline def EasingFunction_=(x: BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * The easing mode used by animations
      */
    @JSImport("babylonjs/Behaviors/index", "BouncingBehavior.EasingMode")
    @js.native
    def EasingMode: Double = js.native
    inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/index", "FadeInOutBehavior")
  @js.native
  /**
    * Instatiates the FadeInOutBehavior
    */
  class FadeInOutBehavior ()
    extends typings.babylonjs.meshesIndexMod.FadeInOutBehavior
  
  @JSImport("babylonjs/Behaviors/index", "FramingBehavior")
  @js.native
  class FramingBehavior ()
    extends typings.babylonjs.camerasIndexMod.FramingBehavior
  /* static members */
  object FramingBehavior {
    
    @JSImport("babylonjs/Behaviors/index", "FramingBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The easing function used by animations
      */
    @JSImport("babylonjs/Behaviors/index", "FramingBehavior.EasingFunction")
    @js.native
    def EasingFunction: ExponentialEase = js.native
    inline def EasingFunction_=(x: ExponentialEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * The easing mode used by animations
      */
    @JSImport("babylonjs/Behaviors/index", "FramingBehavior.EasingMode")
    @js.native
    def EasingMode: Double = js.native
    inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
    
    /**
      * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
      */
    @JSImport("babylonjs/Behaviors/index", "FramingBehavior.FitFrustumSidesMode")
    @js.native
    def FitFrustumSidesMode: Double = js.native
    inline def FitFrustumSidesMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FitFrustumSidesMode")(x.asInstanceOf[js.Any])
    
    /**
      * The camera can move all the way towards the mesh.
      */
    @JSImport("babylonjs/Behaviors/index", "FramingBehavior.IgnoreBoundsSizeMode")
    @js.native
    def IgnoreBoundsSizeMode: Double = js.native
    inline def IgnoreBoundsSizeMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IgnoreBoundsSizeMode")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/index", "MultiPointerScaleBehavior")
  @js.native
  /**
    * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
    */
  class MultiPointerScaleBehavior ()
    extends typings.babylonjs.meshesIndexMod.MultiPointerScaleBehavior
  
  @JSImport("babylonjs/Behaviors/index", "PointerDragBehavior")
  @js.native
  /**
    * Creates a pointer drag behavior that can be attached to a mesh
    * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
    */
  class PointerDragBehavior ()
    extends typings.babylonjs.meshesIndexMod.PointerDragBehavior {
    def this(options: DragAxis) = this()
  }
  /* static members */
  object PointerDragBehavior {
    
    @JSImport("babylonjs/Behaviors/index", "PointerDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/index", "PointerDragBehavior._AnyMouseID")
    @js.native
    def _AnyMouseID: js.Any = js.native
    inline def _AnyMouseID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AnyMouseID")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Behaviors/index", "PointerDragBehavior._planeScene")
    @js.native
    def _planeScene: js.Any = js.native
    inline def _planeScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_planeScene")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/index", "SixDofDragBehavior")
  @js.native
  /**
    * Instantiates a behavior that when attached to a mesh will allow the mesh to be dragged around based on directions and origin of the pointer's ray
    */
  class SixDofDragBehavior ()
    extends typings.babylonjs.meshesIndexMod.SixDofDragBehavior
  /* static members */
  object SixDofDragBehavior {
    
    @JSImport("babylonjs/Behaviors/index", "SixDofDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/index", "SixDofDragBehavior._virtualScene")
    @js.native
    def _virtualScene: js.Any = js.native
    inline def _virtualScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_virtualScene")(x.asInstanceOf[js.Any])
  }
}
