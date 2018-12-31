package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A follow camera takes a mesh as a target and follows it as it moves. Both a free camera version followCamera and
  * an arc rotate version arcFollowCamera are available.
  * @see http://doc.babylonjs.com/features/cameras#follow-camera
  */
@JSGlobal("BABYLON.FollowCamera")
@js.native
class FollowCamera protected () extends TargetCamera {
  /**
    * Instantiates the follow camera.
    * @see http://doc.babylonjs.com/features/cameras#follow-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the position of the camera
    * @param scene Define the scene the camera belong to
    * @param lockedTarget Define the target of the camera
    */
  def this(name: java.lang.String, position: Vector3, scene: Scene) = this()
  def this(name: java.lang.String, position: Vector3, scene: Scene, lockedTarget: Nullable[AbstractMesh]) = this()
  var _follow: js.Any = js.native
  /**
    * Define how fast the camera can accelerate to follow it s target.
    */
  var cameraAcceleration: scala.Double = js.native
  /**
    * Define a height offset between the camera and the object it follows.
    * It can help following an object from the top (like a car chaing a plane)
    */
  var heightOffset: scala.Double = js.native
  /**
    * Define the target of the camera.
    */
  @JSName("lockedTarget")
  var lockedTarget_FollowCamera: Nullable[AbstractMesh] = js.native
  /**
    * Define the speed limit of the camera following an object.
    */
  var maxCameraSpeed: scala.Double = js.native
  /**
    * Distance the follow camera should follow an object at
    */
  var radius: scala.Double = js.native
  /**
    * Define a rotation offset between the camera and the object it follows
    */
  var rotationOffset: scala.Double = js.native
}

