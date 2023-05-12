package typings.babylonjs

import typings.babylonjs.behaviorsBehaviorMod.Behavior
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.xRWebXRExperienceHelperMod.WebXRExperienceHelper
import typings.babylonjs.xRWebXRFeaturesManagerMod.WebXRFeaturesManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsMeshesHandConstraintBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/handConstraintBehavior", "HandConstraintBehavior")
  @js.native
  /**
    * Builds a hand constraint behavior
    */
  open class HandConstraintBehavior ()
    extends StObject
       with Behavior[TransformNode] {
    
    /* private */ var _eyeTracking: Any = js.native
    
    /* private */ var _getHandPose: Any = js.native
    
    /* private */ var _handTracking: Any = js.native
    
    /* private */ var _node: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _sceneRenderObserver: Any = js.native
    
    /* private */ var _setVisibility: Any = js.native
    
    /* private */ var _zoneAxis: Any = js.native
    
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: TransformNode): Unit = js.native
    
    /**
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    
    /** Disable the behavior */
    def disable(): Unit = js.native
    
    /** Enable the behavior */
    def enable(): Unit = js.native
    
    /**
      * The radius in meters around the center of the hand that the user must gaze inside for the attached node to be enabled and appear.
      * Used with HandConstraintVisibility.GAZE_FOCUS
      */
    var gazeProximityRadius: Double = js.native
    
    /**
      * Sets the HandConstraintVisibility level for the hand constraint
      */
    var handConstraintVisibility: HandConstraintVisibility = js.native
    
    /**
      * Set the hand this behavior should follow. If set to "none", it will follow any visible hand (prioritising the left one).
      */
    var handedness: XRHandedness = js.native
    
    /**
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /**
      * Rate of interpolation of position and rotation of the attached node.
      * Higher values will give a slower interpolation.
      */
    var lerpTime: Double = js.native
    
    /**
      * Links the behavior to the XR experience in which to retrieve hand transform information.
      * @param xr xr experience
      */
    def linkToXRExperience(xr: WebXRExperienceHelper): Unit = js.native
    def linkToXRExperience(xr: WebXRFeaturesManager): Unit = js.native
    
    /** gets or sets behavior's name */
    /* CompleteClass */
    var name: String = js.native
    /** gets or sets behavior's name */
    @JSName("name")
    def name_MHandConstraintBehavior: String = js.native
    
    /**
      * Orientation mode of the node attached to this behavior
      */
    var nodeOrientationMode: HandConstraintOrientation = js.native
    
    /**
      * A number from 0.0 to 1.0, marking how restricted the direction the palm faces is for the attached node to be enabled.
      * A 1 means the palm must be directly facing the user before the node is enabled, a 0 means it is always enabled.
      * Used with HandConstraintVisibility.PALM_UP
      */
    var palmUpStrictness: Double = js.native
    
    /**
      * Offset distance from the hand in meters
      */
    var targetOffset: Double = js.native
    
    /**
      * Where to place the node regarding the center of the hand.
      */
    var targetZone: HandConstraintZone = js.native
    
    /**
      * Orientation mode of the 4 zones around the hand
      */
    var zoneOrientationMode: HandConstraintOrientation = js.native
  }
  
  @js.native
  sealed trait HandConstraintOrientation extends StObject
  @JSImport("babylonjs/Behaviors/Meshes/handConstraintBehavior", "HandConstraintOrientation")
  @js.native
  object HandConstraintOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HandConstraintOrientation & Double] = js.native
    
    /**
      * Orientation is determined by the rotation of the palm
      */
    @js.native
    sealed trait HAND_ROTATION
      extends StObject
         with HandConstraintOrientation
    /* 1 */ val HAND_ROTATION: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintOrientation.HAND_ROTATION & Double = js.native
    
    /**
      * Orientation is towards the camera
      */
    @js.native
    sealed trait LOOK_AT_CAMERA
      extends StObject
         with HandConstraintOrientation
    /* 0 */ val LOOK_AT_CAMERA: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintOrientation.LOOK_AT_CAMERA & Double = js.native
  }
  
  @js.native
  sealed trait HandConstraintVisibility extends StObject
  @JSImport("babylonjs/Behaviors/Meshes/handConstraintBehavior", "HandConstraintVisibility")
  @js.native
  object HandConstraintVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HandConstraintVisibility & Double] = js.native
    
    /**
      * Constraint is always visible
      */
    @js.native
    sealed trait ALWAYS_VISIBLE
      extends StObject
         with HandConstraintVisibility
    /* 0 */ val ALWAYS_VISIBLE: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility.ALWAYS_VISIBLE & Double = js.native
    
    /**
      * Constraint is only visible when the user is looking at the constraint.
      * Uses XR Eye Tracking if enabled/available, otherwise uses camera direction
      */
    @js.native
    sealed trait GAZE_FOCUS
      extends StObject
         with HandConstraintVisibility
    /* 2 */ val GAZE_FOCUS: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility.GAZE_FOCUS & Double = js.native
    
    /**
      * Constraint is only visible when the palm is up and the user is looking at it
      */
    @js.native
    sealed trait PALM_AND_GAZE
      extends StObject
         with HandConstraintVisibility
    /* 3 */ val PALM_AND_GAZE: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility.PALM_AND_GAZE & Double = js.native
    
    /**
      * Constraint is only visible when the palm is up
      */
    @js.native
    sealed trait PALM_UP
      extends StObject
         with HandConstraintVisibility
    /* 1 */ val PALM_UP: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintVisibility.PALM_UP & Double = js.native
  }
  
  @js.native
  sealed trait HandConstraintZone extends StObject
  @JSImport("babylonjs/Behaviors/Meshes/handConstraintBehavior", "HandConstraintZone")
  @js.native
  object HandConstraintZone extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HandConstraintZone & Double] = js.native
    
    /**
      * Above finger tips
      */
    @js.native
    sealed trait ABOVE_FINGER_TIPS
      extends StObject
         with HandConstraintZone
    /* 0 */ val ABOVE_FINGER_TIPS: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone.ABOVE_FINGER_TIPS & Double = js.native
    
    /**
      * Below the wrist
      */
    @js.native
    sealed trait BELOW_WRIST
      extends StObject
         with HandConstraintZone
    /* 3 */ val BELOW_WRIST: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone.BELOW_WRIST & Double = js.native
    
    /**
      * Next to the thumb
      */
    @js.native
    sealed trait RADIAL_SIDE
      extends StObject
         with HandConstraintZone
    /* 1 */ val RADIAL_SIDE: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone.RADIAL_SIDE & Double = js.native
    
    /**
      * Next to the pinky finger
      */
    @js.native
    sealed trait ULNAR_SIDE
      extends StObject
         with HandConstraintZone
    /* 2 */ val ULNAR_SIDE: typings.babylonjs.behaviorsMeshesHandConstraintBehaviorMod.HandConstraintZone.ULNAR_SIDE & Double = js.native
  }
}
