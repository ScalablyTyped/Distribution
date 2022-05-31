package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.AdjustPitch
import typings.babylonjs.boneMod.Bone
import typings.babylonjs.mathAxisMod.Space
import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boneLookControllerMod {
  
  @JSImport("babylonjs/Bones/boneLookController", "BoneLookController")
  @js.native
  class BoneLookController protected () extends StObject {
    /**
      * Create a BoneLookController
      * @param mesh the mesh that the bone belongs to
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
      **/
    def this(mesh: AbstractMesh, bone: Bone, target: Vector3) = this()
    def this(mesh: AbstractMesh, bone: Bone, target: Vector3, options: AdjustPitch) = this()
    
    /* private */ var _boneQuat: js.Any = js.native
    
    /* private */ var _firstFrameSkipped: js.Any = js.native
    
    /* private */ var _fowardAxis: js.Any = js.native
    
    /* private */ var _getAngleBetween: js.Any = js.native
    
    /* private */ var _getAngleDiff: js.Any = js.native
    
    /* private */ var _isAngleBetween: js.Any = js.native
    
    /* private */ var _maxPitch: js.Any = js.native
    
    /* private */ var _maxPitchTan: js.Any = js.native
    
    /* private */ var _maxYaw: js.Any = js.native
    
    /* private */ var _maxYawCos: js.Any = js.native
    
    /* private */ var _maxYawSin: js.Any = js.native
    
    /* private */ var _midYawConstraint: js.Any = js.native
    
    /* private */ var _minPitch: js.Any = js.native
    
    /* private */ var _minPitchTan: js.Any = js.native
    
    /* private */ var _minYaw: js.Any = js.native
    
    /* private */ var _minYawCos: js.Any = js.native
    
    /* private */ var _minYawSin: js.Any = js.native
    
    /* private */ var _slerping: js.Any = js.native
    
    /* private */ var _transformYawPitch: js.Any = js.native
    
    /* private */ var _transformYawPitchInv: js.Any = js.native
    
    /* private */ var _yawRange: js.Any = js.native
    
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
      * The mesh that the bone is attached to
      */
    var mesh: AbstractMesh = js.native
    
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
    
    @JSImport("babylonjs/Bones/boneLookController", "BoneLookController._tmpMats")
    @js.native
    def _tmpMats: js.Any = js.native
    inline def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/boneLookController", "BoneLookController._tmpQuat")
    @js.native
    def _tmpQuat: js.Any = js.native
    inline def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/boneLookController", "BoneLookController._tmpVecs")
    @js.native
    def _tmpVecs: js.Any = js.native
    inline def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
  }
}
