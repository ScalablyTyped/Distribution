package typings.babylonjs

import typings.babylonjs.anon.DragAxis
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsMeshesIndexMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "AttachToBoxBehavior")
  @js.native
  open class AttachToBoxBehavior protected ()
    extends typings.babylonjs.behaviorsMeshesAttachToBoxBehaviorMod.AttachToBoxBehavior {
    /**
      * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
      * @param _ui The transform node that should be attached to the mesh
      */
    def this(_ui: TransformNode) = this()
  }
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "BaseSixDofDragBehavior")
  @js.native
  open class BaseSixDofDragBehavior ()
    extends typings.babylonjs.behaviorsMeshesBaseSixDofDragBehaviorMod.BaseSixDofDragBehavior
  /* static members */
  object BaseSixDofDragBehavior {
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "BaseSixDofDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "BaseSixDofDragBehavior._virtualScene")
    @js.native
    def _virtualScene: Scene = js.native
    inline def _virtualScene_=(x: Scene): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_virtualScene")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "FadeInOutBehavior")
  @js.native
  /**
    * Instantiates the FadeInOutBehavior
    */
  open class FadeInOutBehavior ()
    extends typings.babylonjs.behaviorsMeshesFadeInOutBehaviorMod.FadeInOutBehavior
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "FollowBehavior")
  @js.native
  open class FollowBehavior ()
    extends typings.babylonjs.behaviorsMeshesFollowBehaviorMod.FollowBehavior
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "HandConstraintBehavior")
  @js.native
  /**
    * Builds a hand constraint behavior
    */
  open class HandConstraintBehavior ()
    extends typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintBehavior
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "HandConstraintOrientation")
  @js.native
  object HandConstraintOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintOrientation & Double
      ] = js.native
    
    /* 1 */ val HAND_ROTATION: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintOrientation.HAND_ROTATION & Double = js.native
    
    /* 0 */ val LOOK_AT_CAMERA: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintOrientation.LOOK_AT_CAMERA & Double = js.native
  }
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "HandConstraintVisibility")
  @js.native
  object HandConstraintVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility & Double
      ] = js.native
    
    /* 0 */ val ALWAYS_VISIBLE: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility.ALWAYS_VISIBLE & Double = js.native
    
    /* 2 */ val GAZE_FOCUS: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility.GAZE_FOCUS & Double = js.native
    
    /* 3 */ val PALM_AND_GAZE: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility.PALM_AND_GAZE & Double = js.native
    
    /* 1 */ val PALM_UP: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility.PALM_UP & Double = js.native
  }
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "HandConstraintZone")
  @js.native
  object HandConstraintZone extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone & Double
      ] = js.native
    
    /* 0 */ val ABOVE_FINGER_TIPS: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone.ABOVE_FINGER_TIPS & Double = js.native
    
    /* 3 */ val BELOW_WRIST: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone.BELOW_WRIST & Double = js.native
    
    /* 1 */ val RADIAL_SIDE: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone.RADIAL_SIDE & Double = js.native
    
    /* 2 */ val ULNAR_SIDE: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone.ULNAR_SIDE & Double = js.native
  }
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "MultiPointerScaleBehavior")
  @js.native
  /**
    * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
    */
  open class MultiPointerScaleBehavior ()
    extends typings.babylonjs.behaviorsMeshesMultiPointerScaleBehaviorMod.MultiPointerScaleBehavior
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "PointerDragBehavior")
  @js.native
  /**
    * Creates a pointer drag behavior that can be attached to a mesh
    * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
    * @param options.dragAxis
    * @param options.dragPlaneNormal
    */
  open class PointerDragBehavior ()
    extends typings.babylonjs.behaviorsMeshesPointerDragBehaviorMod.PointerDragBehavior {
    def this(options: DragAxis) = this()
  }
  /* static members */
  object PointerDragBehavior {
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "PointerDragBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "PointerDragBehavior._AnyMouseId")
    @js.native
    def _AnyMouseId: Any = js.native
    inline def _AnyMouseId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AnyMouseId")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Behaviors/Meshes/index", "PointerDragBehavior._PlaneScene")
    @js.native
    def _PlaneScene: Any = js.native
    inline def _PlaneScene_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PlaneScene")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "SixDofDragBehavior")
  @js.native
  open class SixDofDragBehavior ()
    extends typings.babylonjs.behaviorsMeshesSixDofDragBehaviorMod.SixDofDragBehavior
  
  @JSImport("babylonjs/Behaviors/Meshes/index", "SurfaceMagnetismBehavior")
  @js.native
  open class SurfaceMagnetismBehavior ()
    extends typings.babylonjs.behaviorsMeshesSurfaceMagnetismBehaviorMod.SurfaceMagnetismBehavior
}
