package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowCamera extends TargetCamera {
  
  var _checkLimits: js.Any = js.native
  
  var _follow: js.Any = js.native
  
  /**
    * Define how fast the camera can accelerate to follow it s target.
    */
  var cameraAcceleration: Double = js.native
  
  /**
    * Define a height offset between the camera and the object it follows.
    * It can help following an object from the top (like a car chaing a plane)
    */
  var heightOffset: Double = js.native
  
  /**
    * Defines the input associated with the camera.
    */
  @JSName("inputs")
  var inputs_FollowCamera: FollowCameraInputsManager = js.native
  
  /**
    * Define the target of the camera.
    */
  @JSName("lockedTarget")
  var lockedTarget_FollowCamera: Nullable[AbstractMesh] = js.native
  
  /**
    * Minimum allowed height of camera position relative to target object.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerHeightOffsetLimit: Nullable[Double] = js.native
  
  /**
    * Minimum allowed distance of the camera to the axis of rotation
    * (The camera can not get closer).
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerRadiusLimit: Nullable[Double] = js.native
  
  /**
    * Minimum allowed angle to camera position relative to target object.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerRotationOffsetLimit: Nullable[Double] = js.native
  
  /**
    * Define the speed limit of the camera following an object.
    */
  var maxCameraSpeed: Double = js.native
  
  /**
    * Distance the follow camera should follow an object at
    */
  var radius: Double = js.native
  
  /**
    * Define a rotation offset between the camera and the object it follows
    */
  var rotationOffset: Double = js.native
  
  /**
    * Maximum allowed height of camera position relative to target object.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperHeightOffsetLimit: Nullable[Double] = js.native
  
  /**
    * Maximum allowed distance of the camera to the axis of rotation
    * (The camera can not get further).
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperRadiusLimit: Nullable[Double] = js.native
  
  /**
    * Maximum allowed angle to camera position relative to target object.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperRotationOffsetLimit: Nullable[Double] = js.native
}
