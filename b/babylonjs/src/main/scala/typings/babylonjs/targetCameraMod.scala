package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/targetCamera", JSImport.Namespace)
@js.native
object targetCameraMod extends js.Object {
  @js.native
  class TargetCamera protected () extends Camera {
    /**
      * Instantiates a target camera that takes a mesh or position as a target and continues to look at it while it moves.
      * This is the base of the follow, arc rotate cameras and Free camera
      * @see http://doc.babylonjs.com/features/cameras
      * @param name Defines the name of the camera in the scene
      * @param position Defines the start position of the camera in the scene
      * @param scene Defines the scene the camera belongs to
      * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean) = this()
    var _cachedQuaternionRotationZ: js.Any = js.native
    var _cachedRotationZ: js.Any = js.native
    /** @hidden */
    var _camMatrix: Matrix = js.native
    /** @hidden */
    var _cameraRotationMatrix: Matrix = js.native
    /** @hidden */
    var _cameraTransformMatrix: Matrix = js.native
    /** @hidden */
    var _currentTarget: Vector3 = js.native
    var _defaultUp: js.Any = js.native
    var _getRigCamPositionAndTarget: js.Any = js.native
    var _globalCurrentTarget: Vector3 = js.native
    var _globalCurrentUpVector: Vector3 = js.native
    /** @hidden */
    var _initialFocalDistance: Double = js.native
    /** @hidden */
    var _referencePoint: Vector3 = js.native
    /**
      * Update the up vector to apply the rotation of the camera (So if you changed the camera rotation.z this will let you update the up vector as well)
      * @returns the current camera
      */
    var _rotateUpVectorWithCameraRotationMatrix: js.Any = js.native
    var _storedPosition: js.Any = js.native
    var _storedRotation: js.Any = js.native
    var _storedRotationQuaternion: js.Any = js.native
    var _tmpQuaternion: js.Any = js.native
    /** @hidden */
    var _transformedReferencePoint: Vector3 = js.native
    /** @hidden */
    var _viewMatrix: Matrix = js.native
    /**
      * Define the current direction the camera is moving to
      */
    var cameraDirection: Vector3 = js.native
    /**
      * Define the current rotation the camera is rotating to
      */
    var cameraRotation: Vector2 = js.native
    /**
      * Define the current target of the camera as an object or a position.
      */
    var lockedTarget: js.Any = js.native
    /**
      * Add constraint to the camera to prevent it to move freely in all directions and
      * around all axis.
      */
    var noRotationConstraint: Boolean = js.native
    /**
      * Define the current rotation of the camera
      */
    var rotation: Vector3 = js.native
    /**
      * Define the current rotation of the camera as a quaternion to prevent Gimbal lock
      */
    var rotationQuaternion: Quaternion = js.native
    /**
      * Define the current speed of the camera
      */
    var speed: Double = js.native
    /**
      * When set, the up vector of the camera will be updated by the rotation of the camera
      */
    var updateUpVectorFromRotation: Boolean = js.native
    /** @hidden */
    def _computeLocalCameraSpeed(): Double = js.native
    /* protected */ def _computeViewMatrix(position: Vector3, target: Vector3, up: Vector3): Unit = js.native
    /** @hidden */
    def _decideIfNeedsToMove(): Boolean = js.native
    /** @hidden */
    def _getLockedTargetPosition(): Nullable[Vector3] = js.native
    /** @hidden */
    def _reset(): Unit = js.native
    /** @hidden */
    def _updatePosition(): Unit = js.native
    /**
      * Gets the position in front of the camera at a given distance.
      * @param distance The distance from the camera we want the position to be
      * @returns the position
      */
    def getFrontPosition(distance: Double): Vector3 = js.native
    /**
      * Return the current target position of the camera. This value is expressed in local space.
      * @returns the target position
      */
    def getTarget(): Vector3 = js.native
    /**
      * Defines the target the camera should look at.
      * @param target Defines the new target as a Vector or a mesh
      */
    def setTarget(target: Vector3): Unit = js.native
  }
  
  /* static members */
  @js.native
  object TargetCamera extends js.Object {
    var _RigCamTransformMatrix: js.Any = js.native
    var _TargetFocalPoint: js.Any = js.native
    var _TargetTransformMatrix: js.Any = js.native
  }
  
}

