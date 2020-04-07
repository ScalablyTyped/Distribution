package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.freeCameraInputsManagerMod.FreeCameraInputsManager
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.targetCameraMod.TargetCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/freeCamera", JSImport.Namespace)
@js.native
object freeCameraMod extends js.Object {
  @js.native
  class FreeCamera protected () extends TargetCamera {
    /**
      * Instantiates a Free Camera.
      * This represents a free type of camera. It can be useful in First Person Shooter game for instance.
      * Please consider using the new UniversalCamera instead as it adds more functionality like touch to this camera.
      * @see http://doc.babylonjs.com/features/cameras#universal-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the start position of the camera in the scene
      * @param scene Define the scene the camera belongs to
      * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean) = this()
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
      * Enable or disable gravity on the camera.
      */
    var applyGravity: Boolean = js.native
    /**
      * Enable or disable collisions of the camera with the rest of the scene objects.
      */
    var checkCollisions: Boolean = js.native
    /**
      * Define the collision ellipsoid of the camera.
      * This is helpful to simulate a camera body like the player body around the camera
      * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#arcrotatecamera
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
    /** @hidden */
    def _collideWithWorld(displacement: Vector3): Unit = js.native
    /**
      * Gets the input sensibility for a mouse input. (default is 2000.0)
      * Higher values reduce sensitivity.
      */
    def angularSensibility(): Double = js.native
    /**
      * Sets the input sensibility for a mouse input. (default is 2000.0)
      * Higher values reduce sensitivity.
      */
    def angularSensibility(value: Double): js.Any = js.native
    /**
      * Define a collision mask to limit the list of object the camera can collide with
      */
    def collisionMask(): Double = js.native
    def collisionMask(mask: Double): js.Any = js.native
    /**
      * Gets or Set the list of keyboard keys used to control the backward move of the camera.
      */
    def keysDown(): js.Array[Double] = js.native
    def keysDown(value: js.Array[Double]): js.Any = js.native
    /**
      * Gets or Set the list of keyboard keys used to control the left strafe move of the camera.
      */
    def keysLeft(): js.Array[Double] = js.native
    def keysLeft(value: js.Array[Double]): js.Any = js.native
    /**
      * Gets or Set the list of keyboard keys used to control the right strafe move of the camera.
      */
    def keysRight(): js.Array[Double] = js.native
    def keysRight(value: js.Array[Double]): js.Any = js.native
    /**
      * Gets or Set the list of keyboard keys used to control the forward move of the camera.
      */
    def keysUp(): js.Array[Double] = js.native
    def keysUp(value: js.Array[Double]): js.Any = js.native
    /**
      * Event raised when the camera collide with a mesh in the scene.
      */
    def onCollide(collidedMesh: AbstractMesh): Unit = js.native
  }
  
}

