package typings.babylonjs

import typings.babylonjs.anon.DragAxis
import typings.babylonjs.easingMod.BackEase
import typings.babylonjs.easingMod.ExponentialEase
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsIndexMod {
  
  @JSImport("babylonjs/Behaviors/index", "AttachToBoxBehavior")
  @js.native
  open class AttachToBoxBehavior protected ()
    extends typings.babylonjs.meshesIndexMod.AttachToBoxBehavior {
    /**
      * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
      * @param _ui The transform node that should be attached to the mesh
      */
    def this(_ui: TransformNode) = this()
  }
  
  @JSImport("babylonjs/Behaviors/index", "AutoRotationBehavior")
  @js.native
  open class AutoRotationBehavior ()
    extends typings.babylonjs.camerasIndexMod.AutoRotationBehavior
  
  @JSImport("babylonjs/Behaviors/index", "BaseSixDofDragBehavior")
  @js.native
  open class BaseSixDofDragBehavior ()
    extends typings.babylonjs.meshesIndexMod.BaseSixDofDragBehavior
  /* static members */
  object BaseSixDofDragBehavior {
    
    @JSImport("babylonjs/Behaviors/index", "BaseSixDofDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/index", "BaseSixDofDragBehavior._virtualScene")
    @js.native
    def _virtualScene: Scene = js.native
    inline def _virtualScene_=(x: Scene): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_virtualScene")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/index", "BouncingBehavior")
  @js.native
  open class BouncingBehavior ()
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
    * Instantiates the FadeInOutBehavior
    */
  open class FadeInOutBehavior ()
    extends typings.babylonjs.meshesIndexMod.FadeInOutBehavior
  
  @JSImport("babylonjs/Behaviors/index", "FollowBehavior")
  @js.native
  open class FollowBehavior ()
    extends typings.babylonjs.meshesIndexMod.FollowBehavior
  
  @JSImport("babylonjs/Behaviors/index", "FramingBehavior")
  @js.native
  open class FramingBehavior ()
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
  
  @JSImport("babylonjs/Behaviors/index", "HandConstraintBehavior")
  @js.native
  /**
    * Builds a hand constraint behavior
    */
  open class HandConstraintBehavior ()
    extends typings.babylonjs.meshesIndexMod.HandConstraintBehavior
  
  @JSImport("babylonjs/Behaviors/index", "HandConstraintOrientation")
  @js.native
  object HandConstraintOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.handConstraintBehaviorMod.HandConstraintOrientation & Double] = js.native
    
    /* 1 */ val HAND_ROTATION: typings.babylonjs.handConstraintBehaviorMod.HandConstraintOrientation.HAND_ROTATION & Double = js.native
    
    /* 0 */ val LOOK_AT_CAMERA: typings.babylonjs.handConstraintBehaviorMod.HandConstraintOrientation.LOOK_AT_CAMERA & Double = js.native
  }
  
  @JSImport("babylonjs/Behaviors/index", "HandConstraintVisibility")
  @js.native
  object HandConstraintVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.handConstraintBehaviorMod.HandConstraintVisibility & Double] = js.native
    
    /* 0 */ val ALWAYS_VISIBLE: typings.babylonjs.handConstraintBehaviorMod.HandConstraintVisibility.ALWAYS_VISIBLE & Double = js.native
    
    /* 2 */ val GAZE_FOCUS: typings.babylonjs.handConstraintBehaviorMod.HandConstraintVisibility.GAZE_FOCUS & Double = js.native
    
    /* 3 */ val PALM_AND_GAZE: typings.babylonjs.handConstraintBehaviorMod.HandConstraintVisibility.PALM_AND_GAZE & Double = js.native
    
    /* 1 */ val PALM_UP: typings.babylonjs.handConstraintBehaviorMod.HandConstraintVisibility.PALM_UP & Double = js.native
  }
  
  @JSImport("babylonjs/Behaviors/index", "HandConstraintZone")
  @js.native
  object HandConstraintZone extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.handConstraintBehaviorMod.HandConstraintZone & Double] = js.native
    
    /* 0 */ val ABOVE_FINGER_TIPS: typings.babylonjs.handConstraintBehaviorMod.HandConstraintZone.ABOVE_FINGER_TIPS & Double = js.native
    
    /* 3 */ val BELOW_WRIST: typings.babylonjs.handConstraintBehaviorMod.HandConstraintZone.BELOW_WRIST & Double = js.native
    
    /* 1 */ val RADIAL_SIDE: typings.babylonjs.handConstraintBehaviorMod.HandConstraintZone.RADIAL_SIDE & Double = js.native
    
    /* 2 */ val ULNAR_SIDE: typings.babylonjs.handConstraintBehaviorMod.HandConstraintZone.ULNAR_SIDE & Double = js.native
  }
  
  @JSImport("babylonjs/Behaviors/index", "MultiPointerScaleBehavior")
  @js.native
  /**
    * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
    */
  open class MultiPointerScaleBehavior ()
    extends typings.babylonjs.meshesIndexMod.MultiPointerScaleBehavior
  
  @JSImport("babylonjs/Behaviors/index", "PointerDragBehavior")
  @js.native
  /**
    * Creates a pointer drag behavior that can be attached to a mesh
    * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
    * @param options.dragAxis
    * @param options.dragPlaneNormal
    */
  open class PointerDragBehavior ()
    extends typings.babylonjs.meshesIndexMod.PointerDragBehavior {
    def this(options: DragAxis) = this()
  }
  /* static members */
  object PointerDragBehavior {
    
    @JSImport("babylonjs/Behaviors/index", "PointerDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/index", "PointerDragBehavior._AnyMouseId")
    @js.native
    def _AnyMouseId: Any = js.native
    inline def _AnyMouseId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AnyMouseId")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Behaviors/index", "PointerDragBehavior._PlaneScene")
    @js.native
    def _PlaneScene: Any = js.native
    inline def _PlaneScene_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PlaneScene")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/index", "SixDofDragBehavior")
  @js.native
  open class SixDofDragBehavior ()
    extends typings.babylonjs.meshesIndexMod.SixDofDragBehavior
  
  @JSImport("babylonjs/Behaviors/index", "SurfaceMagnetismBehavior")
  @js.native
  open class SurfaceMagnetismBehavior ()
    extends typings.babylonjs.meshesIndexMod.SurfaceMagnetismBehavior
}
