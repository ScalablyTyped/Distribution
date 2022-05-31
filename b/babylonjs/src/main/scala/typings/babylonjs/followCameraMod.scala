package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.followCameraInputsManagerMod.FollowCameraInputsManager
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.targetCameraMod.TargetCamera
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object followCameraMod {
  
  @JSImport("babylonjs/Cameras/followCamera", "ArcFollowCamera")
  @js.native
  class ArcFollowCamera protected () extends TargetCamera {
    /**
      * Instantiates a new ArcFollowCamera
      * @see https://doc.babylonjs.com/features/cameras#follow-camera
      * @param name Define the name of the camera
      * @param alpha Define the rotation angle of the camera around the logitudinal axis
      * @param beta Define the rotation angle of the camera around the elevation axis
      * @param radius Define the radius of the camera from its target point
      * @param target Define the target of the camera
      * @param scene Define the scene the camera belongs to
      */
    def this(
      name: String,
      /** The longitudinal angle of the camera */
    alpha: Double,
      /** The latitudinal angle of the camera */
    beta: Double,
      /** The radius of the camera from its target */
    radius: Double,
      /** Define the camera target (the mesh it should follow) */
    target: Nullable[AbstractMesh],
      scene: Scene
    ) = this()
    
    /* private */ var _cartesianCoordinates: js.Any = js.native
    
    /* private */ var _follow: js.Any = js.native
    
    /** Define the camera target (the mesh it should follow) */
    /* private */ var _meshTarget: js.Any = js.native
    
    /** The longitudinal angle of the camera */
    var alpha: Double = js.native
    
    /** The latitudinal angle of the camera */
    var beta: Double = js.native
    
    /** The radius of the camera from its target */
    var radius: Double = js.native
  }
  
  @JSImport("babylonjs/Cameras/followCamera", "FollowCamera")
  @js.native
  class FollowCamera protected () extends TargetCamera {
    /**
      * Instantiates the follow camera.
      * @see https://doc.babylonjs.com/features/cameras#follow-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the position of the camera
      * @param scene Define the scene the camera belong to
      * @param lockedTarget Define the target of the camera
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Scene, lockedTarget: Nullable[AbstractMesh]) = this()
    
    /* private */ var _checkLimits: js.Any = js.native
    
    /* private */ var _follow: js.Any = js.native
    
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
}
