package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCamera extends TargetCamera {
  
  /** @hidden */
  def _collideWithWorld(displacement: Vector3): Unit = js.native
  
  var _collider: js.Any = js.native
  
  var _collisionMask: js.Any = js.native
  
  var _diffPosition: js.Any = js.native
  
  /** @hidden */
  var _localDirection: Vector3 = js.native
  
  var _needMoveForGravity: js.Any = js.native
  
  var _newPosition: js.Any = js.native
  
  var _oldPosition: js.Any = js.native
  
  var _onCollisionPositionChange: js.Any = js.native
  
  /** @hidden */
  var _transformedDirection: Vector3 = js.native
  
  /**
    * Gets the input sensibility for a mouse input. (default is 2000.0)
    * Higher values reduce sensitivity.
    */
  def angularSensibility: Double = js.native
  /**
    * Sets the input sensibility for a mouse input. (default is 2000.0)
    * Higher values reduce sensitivity.
    */
  def angularSensibility_=(value: Double): Unit = js.native
  
  /**
    * Enable or disable gravity on the camera.
    */
  var applyGravity: Boolean = js.native
  
  /**
    * Enable or disable collisions of the camera with the rest of the scene objects.
    */
  var checkCollisions: Boolean = js.native
  
  /**
    * Define a collision mask to limit the list of object the camera can collide with
    */
  def collisionMask: Double = js.native
  def collisionMask_=(mask: Double): Unit = js.native
  
  /**
    * Define the collision ellipsoid of the camera.
    * This is helpful to simulate a camera body like the player body around the camera
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#arcrotatecamera
    */
  var ellipsoid: Vector3 = js.native
  
  /**
    * Define an offset for the position of the ellipsoid around the camera.
    * This can be helpful to determine the center of the body near the gravity center of the body
    * instead of its head.
    */
  var ellipsoidOffset: Vector3 = js.native
  
  /**
    * Define the input manager associated to the camera.
    */
  @JSName("inputs")
  var inputs_FreeCamera: FreeCameraInputsManager = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the backward move of the camera.
    */
  def keysDown: js.Array[Double] = js.native
  def keysDown_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the downward move of the camera.
    */
  def keysDownward: js.Array[Double] = js.native
  def keysDownward_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the left strafe move of the camera.
    */
  def keysLeft: js.Array[Double] = js.native
  def keysLeft_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the right strafe move of the camera.
    */
  def keysRight: js.Array[Double] = js.native
  def keysRight_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the forward move of the camera.
    */
  def keysUp: js.Array[Double] = js.native
  def keysUp_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the upward move of the camera.
    */
  def keysUpward: js.Array[Double] = js.native
  def keysUpward_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Event raised when the camera collide with a mesh in the scene.
    */
  def onCollide(collidedMesh: AbstractMesh): Unit = js.native
}
