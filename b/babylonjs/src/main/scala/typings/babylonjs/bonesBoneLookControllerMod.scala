package typings.babylonjs

import typings.babylonjs.anon.AdjustPitch
import typings.babylonjs.bonesBoneMod.Bone
import typings.babylonjs.mathsMathDotaxisMod.Space
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bonesBoneLookControllerMod {
  
  @JSImport("babylonjs/Bones/boneLookController", "BoneLookController")
  @js.native
  open class BoneLookController protected () extends StObject {
    /**
      * Create a BoneLookController
      * @param mesh the TransformNode that the bone belongs to
      * @param bone the bone that will be looking to the target
      * @param target the target Vector3 to look at
      * @param options optional settings:
      * * maxYaw: the maximum angle the bone will yaw to
      * * minYaw: the minimum angle the bone will yaw to
      * * maxPitch: the maximum angle the bone will pitch to
      * * minPitch: the minimum angle the bone will yaw to
      * * slerpAmount: set the between 0 and 1 to make the bone slerp to the target.
      * * upAxis: the up axis of the coordinate system
      * * upAxisSpace: the space that the up axis is in - Space.BONE, Space.LOCAL (default), or Space.WORLD.
      * * yawAxis: set yawAxis if the bone does not yaw on the y axis
      * * pitchAxis: set pitchAxis if the bone does not pitch on the x axis
      * * adjustYaw: used to make an adjustment to the yaw of the bone
      * * adjustPitch: used to make an adjustment to the pitch of the bone
      * * adjustRoll: used to make an adjustment to the roll of the bone
      * @param options.maxYaw
      * @param options.minYaw
      * @param options.maxPitch
      * @param options.minPitch
      * @param options.slerpAmount
      * @param options.upAxis
      * @param options.upAxisSpace
      * @param options.yawAxis
      * @param options.pitchAxis
      * @param options.adjustYaw
      * @param options.adjustPitch
      * @param options.adjustRoll
      **/
    def this(mesh: TransformNode, bone: Bone, target: Vector3) = this()
    def this(mesh: TransformNode, bone: Bone, target: Vector3, options: AdjustPitch) = this()
    
    /* private */ var _boneQuat: Any = js.native
    
    /* private */ var _firstFrameSkipped: Any = js.native
    
    /* private */ var _fowardAxis: Any = js.native
    
    /* private */ var _getAngleBetween: Any = js.native
    
    /* private */ var _getAngleDiff: Any = js.native
    
    /* private */ var _isAngleBetween: Any = js.native
    
    /* private */ var _maxPitch: Any = js.native
    
    /* private */ var _maxPitchTan: Any = js.native
    
    /* private */ var _maxYaw: Any = js.native
    
    /* private */ var _maxYawCos: Any = js.native
    
    /* private */ var _maxYawSin: Any = js.native
    
    /* private */ var _midYawConstraint: Any = js.native
    
    /* private */ var _minPitch: Any = js.native
    
    /* private */ var _minPitchTan: Any = js.native
    
    /* private */ var _minYaw: Any = js.native
    
    /* private */ var _minYawCos: Any = js.native
    
    /* private */ var _minYawSin: Any = js.native
    
    /* private */ var _slerping: Any = js.native
    
    /* private */ var _transformYawPitch: Any = js.native
    
    /* private */ var _transformYawPitchInv: Any = js.native
    
    /* private */ var _updateLinkedTransformRotation: Any = js.native
    
    /* private */ var _yawRange: Any = js.native
    
    /**
      * Used to make an adjustment to the pitch of the bone
      */
    var adjustPitch: Double = js.native
    
    /**
      * Used to make an adjustment to the roll of the bone
      */
    var adjustRoll: Double = js.native
    
    /**
      * Used to make an adjustment to the yaw of the bone
      */
    var adjustYaw: Double = js.native
    
    /**
      * The bone that will be looking to the target
      */
    var bone: Bone = js.native
    
    /**
      * Gets or sets the maximum pitch angle that the bone can look to
      */
    def maxPitch: Double = js.native
    def maxPitch_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the maximum yaw angle that the bone can look to
      */
    def maxYaw: Double = js.native
    def maxYaw_=(value: Double): Unit = js.native
    
    /**
      * The TransformNode that the bone is attached to
      * Name kept as mesh for back compatibility
      */
    var mesh: TransformNode = js.native
    
    /**
      * Gets or sets the minimum pitch angle that the bone can look to
      */
    def minPitch: Double = js.native
    def minPitch_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the minimum yaw angle that the bone can look to
      */
    def minYaw: Double = js.native
    def minYaw_=(value: Double): Unit = js.native
    
    /**
      * The amount to slerp (spherical linear interpolation) to the target.  Set this to a value between 0 and 1 (a value of 1 disables slerp)
      */
    var slerpAmount: Double = js.native
    
    /**
      * The target Vector3 that the bone will look at
      */
    var target: Vector3 = js.native
    
    /**
      * The up axis of the coordinate system that is used when the bone is rotated
      */
    var upAxis: Vector3 = js.native
    
    /**
      * The space that the up axis is in - Space.BONE, Space.LOCAL (default), or Space.WORLD
      */
    var upAxisSpace: Space = js.native
    
    /**
      * Update the bone to look at the target.  This should be called before the scene is rendered (use scene.registerBeforeRender())
      */
    def update(): Unit = js.native
  }
  /* static members */
  object BoneLookController {
    
    @JSImport("babylonjs/Bones/boneLookController", "BoneLookController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/boneLookController", "BoneLookController._TmpMats")
    @js.native
    def _TmpMats: Any = js.native
    inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/boneLookController", "BoneLookController._TmpQuat")
    @js.native
    def _TmpQuat: Any = js.native
    inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/boneLookController", "BoneLookController._TmpVecs")
    @js.native
    def _TmpVecs: Any = js.native
    inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
  }
}
