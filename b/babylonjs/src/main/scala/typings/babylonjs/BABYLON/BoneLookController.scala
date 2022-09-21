package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoneLookController extends StObject {
  
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
