package typings.babylonjs

import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webVRControllerMod.WebVRController
import typings.std.Float32Array
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webVRCameraMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.webVRCameraMod.PoseControlled because var conflicts: position, rotationQuaternion. Inlined devicePosition, deviceRotationQuaternion, rawPose, deviceScaleFactor, updateFromDevice */ @JSImport("babylonjs/Cameras/VR/webVRCamera", "WebVRFreeCamera")
  @js.native
  class WebVRFreeCamera protected () extends FreeCamera {
    /**
      * Instantiates a WebVRFreeCamera.
      * @param name The name of the WebVRFreeCamera
      * @param position The starting anchor position for the camera
      * @param scene The scene the camera belongs to
      * @param webVROptions a set of customizable options for the webVRCamera
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Scene, webVROptions: WebVROptions) = this()
    
    var _attached: js.Any = js.native
    
    /**
      * @hidden
      * Get current device position in babylon world
      */
    def _computeDevicePosition(): Unit = js.native
    
    var _correctPositionIfNotTrackPosition: js.Any = js.native
    
    var _defaultHeight: js.Any = js.native
    
    var _descendants: js.Array[Node] = js.native
    
    var _detachIfAttached: js.Any = js.native
    
    var _deviceRoomPosition: js.Any = js.native
    
    /** @hidden */
    var _deviceRoomRotationQuaternion: Quaternion = js.native
    
    var _deviceToWorld: js.Any = js.native
    
    var _frameData: js.Any = js.native
    
    var _leftController: js.Any = js.native
    
    var _lightOnControllers: js.Any = js.native
    
    var _onGamepadConnectedObserver: js.Any = js.native
    
    var _onGamepadDisconnectedObserver: js.Any = js.native
    
    var _onVREnabled: js.Any = js.native
    
    var _oneVector: js.Any = js.native
    
    var _poseSet: js.Any = js.native
    
    var _rightController: js.Any = js.native
    
    var _specsVersion: js.Any = js.native
    
    var _standingMatrix: js.Any = js.native
    
    var _tmpMatrix: js.Any = js.native
    
    var _updateCacheWhenTrackingDisabledObserver: js.Any = js.native
    
    /**
      * @hidden
      * The vrDisplay tied to the camera. See https://developer.mozilla.org/en-US/docs/Web/API/VRDisplay
      */
    var _vrDevice: js.Any = js.native
    
    var _workingMatrix: js.Any = js.native
    
    var _workingVector: js.Any = js.native
    
    var _worldToDevice: js.Any = js.native
    
    /**
      * References to the webVR controllers for the vrDevice.
      */
    var controllers: js.Array[WebVRController] = js.native
    
    /**
      * Gets the device distance from the ground in meters.
      * @returns the distance in meters from the vrDevice to ground in device space. If standing matrix is not supported for the vrDevice 0 is returned.
      */
    def deviceDistanceToRoomGround(): Double = js.native
    
    /**
      * Represents device position in babylon space.
      */
    var devicePosition: js.UndefOr[Vector3] = js.native
    
    /**
      * Represents device rotation in babylon space.
      */
    var deviceRotationQuaternion: Quaternion = js.native
    
    /**
      * The scale of the device to be used when translating from device space to babylon space.
      */
    var deviceScaleFactor: Double = js.native
    
    /**
      * Gets a vrController by name.
      * @param name The name of the controller to retreive
      * @returns the controller matching the name specified or null if not found
      */
    def getControllerByName(name: String): Nullable[WebVRController] = js.native
    
    /**
      * Initializes the controllers and their meshes
      */
    def initControllers(): Unit = js.native
    
    /**
      * The controller corresponding to the users left hand.
      */
    def leftController: Nullable[WebVRController] = js.native
    
    /**
      * Emits an event when a controller's mesh has been loaded;
      */
    var onControllerMeshLoadedObservable: Observable[WebVRController] = js.native
    
    /**
      * Emits an event when a controller is attached.
      */
    var onControllersAttachedObservable: Observable[js.Array[WebVRController]] = js.native
    
    /**
      * Emits an event when the HMD's pose has been updated.
      */
    var onPoseUpdatedFromDeviceObservable: Observable[_] = js.native
    
    /**
      * The rawPose of the vrDevice.
      */
    var rawPose: Nullable[DevicePose] = js.native
    
    /**
      * Calls resetPose on the vrDisplay
      * See: https://developer.mozilla.org/en-US/docs/Web/API/VRDisplay/resetPose
      */
    def resetToCurrentRotation(): Unit = js.native
    
    /**
      * If the rig cameras be used as parent instead of this camera.
      */
    var rigParenting: Boolean = js.native
    
    /**
      * The controller corresponding to the users right hand.
      */
    def rightController: Nullable[WebVRController] = js.native
    
    var updateCacheCalled: js.Any = js.native
    
    /**
      * Updates the poseControlled values based on the input device pose.
      * @param poseData Pose coming from the device
      */
    /**
      * Updates the poseControlled values based on the input device pose.
      * @param poseData the pose data to update the object with
      */
    def updateFromDevice(poseData: DevicePose): Unit = js.native
    
    /**
      * Enables the standing matrix when supported. This can be used to position the user's view the correct height from the ground.
      * @param callback will be called when the standing matrix is set. Callback parameter is if the standing matrix is supported.
      */
    def useStandingMatrix(): Unit = js.native
    def useStandingMatrix(callback: js.Function1[/* bool */ Boolean, Unit]): Unit = js.native
    
    /**
      * Enables the standing matrix when supported. This can be used to position the user's view the correct height from the ground.
      * @returns A promise with a boolean set to if the standing matrix is supported.
      */
    def useStandingMatrixAsync(): js.Promise[Boolean] = js.native
    
    var webVROptions: js.Any = js.native
  }
  
  @js.native
  trait DevicePose extends StObject {
    
    /**
      * The angularAcceleration of the device, values in array are [x,y,z].
      */
    val angularAcceleration: Nullable[Float32Array] = js.native
    
    /**
      * The angularVelocity of the device, values in array are [x,y,z].
      */
    val angularVelocity: Nullable[Float32Array] = js.native
    
    /**
      * The linearAcceleration of the device, values in array are [x,y,z].
      */
    val linearAcceleration: Nullable[Float32Array] = js.native
    
    /**
      * The linearVelocity of the device, values in array are [x,y,z].
      */
    val linearVelocity: Nullable[Float32Array] = js.native
    
    /**
      * The orientation of the device in a quaternion array, values in array are [x,y,z,w].
      */
    val orientation: Nullable[Float32Array] = js.native
    
    /**
      * The position of the device, values in array are [x,y,z].
      */
    val position: Nullable[Float32Array] = js.native
  }
  object DevicePose {
    
    @scala.inline
    def apply(): DevicePose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevicePose]
    }
    
    @scala.inline
    implicit class DevicePoseMutableBuilder[Self <: DevicePose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngularAcceleration(value: Nullable[Float32Array]): Self = StObject.set(x, "angularAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularAccelerationNull: Self = StObject.set(x, "angularAcceleration", null)
      
      @scala.inline
      def setAngularVelocity(value: Nullable[Float32Array]): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularVelocityNull: Self = StObject.set(x, "angularVelocity", null)
      
      @scala.inline
      def setLinearAcceleration(value: Nullable[Float32Array]): Self = StObject.set(x, "linearAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinearAccelerationNull: Self = StObject.set(x, "linearAcceleration", null)
      
      @scala.inline
      def setLinearVelocity(value: Nullable[Float32Array]): Self = StObject.set(x, "linearVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinearVelocityNull: Self = StObject.set(x, "linearVelocity", null)
      
      @scala.inline
      def setOrientation(value: Nullable[Float32Array]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationNull: Self = StObject.set(x, "orientation", null)
      
      @scala.inline
      def setPosition(value: Nullable[Float32Array]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionNull: Self = StObject.set(x, "position", null)
    }
  }
  
  @js.native
  trait PoseControlled extends StObject {
    
    /**
      * The position of the device in babylon space.
      */
    var devicePosition: js.UndefOr[Vector3] = js.native
    
    /**
      * The rotation quaternion of the device in babylon space.
      */
    var deviceRotationQuaternion: Quaternion = js.native
    
    /**
      * The scale of the device to be used when translating from device space to babylon space.
      */
    var deviceScaleFactor: Double = js.native
    
    /**
      * The position of the object in babylon space.
      */
    var position: Vector3 = js.native
    
    /**
      * The raw pose coming from the device.
      */
    var rawPose: Nullable[DevicePose] = js.native
    
    /**
      * The rotation quaternion of the object in babylon space.
      */
    var rotationQuaternion: Quaternion = js.native
    
    /**
      * Updates the poseControlled values based on the input device pose.
      * @param poseData the pose data to update the object with
      */
    def updateFromDevice(poseData: DevicePose): Unit = js.native
  }
  object PoseControlled {
    
    @scala.inline
    def apply(
      deviceRotationQuaternion: Quaternion,
      deviceScaleFactor: Double,
      position: Vector3,
      rotationQuaternion: Quaternion,
      updateFromDevice: DevicePose => Unit
    ): PoseControlled = {
      val __obj = js.Dynamic.literal(deviceRotationQuaternion = deviceRotationQuaternion.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], updateFromDevice = js.Any.fromFunction1(updateFromDevice))
      __obj.asInstanceOf[PoseControlled]
    }
    
    @scala.inline
    implicit class PoseControlledMutableBuilder[Self <: PoseControlled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevicePosition(value: Vector3): Self = StObject.set(x, "devicePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicePositionUndefined: Self = StObject.set(x, "devicePosition", js.undefined)
      
      @scala.inline
      def setDeviceRotationQuaternion(value: Quaternion): Self = StObject.set(x, "deviceRotationQuaternion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawPose(value: Nullable[DevicePose]): Self = StObject.set(x, "rawPose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawPoseNull: Self = StObject.set(x, "rawPose", null)
      
      @scala.inline
      def setRotationQuaternion(value: Quaternion): Self = StObject.set(x, "rotationQuaternion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateFromDevice(value: DevicePose => Unit): Self = StObject.set(x, "updateFromDevice", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WebVROptions extends StObject {
    
    /**
      * Should the native controller meshes be initialized. (default: true)
      */
    var controllerMeshes: js.UndefOr[Boolean] = js.native
    
    /**
      * If you'd like to provide your own button to the VRHelper. (default: standard babylon vr button)
      */
    var customVRButton: js.UndefOr[HTMLButtonElement] = js.native
    
    /**
      * To change the default offset from the ground to account for user's height in meters. Will be scaled by positionScale. (default: 1.7)
      */
    var defaultHeight: js.UndefOr[Double] = js.native
    
    /**
      * Creating a default HemiLight only on controllers. (default: true)
      */
    var defaultLightingOnControllers: js.UndefOr[Boolean] = js.native
    
    /**
      * If there are more than one VRDisplays, this will choose the display matching this name. (default: pick first vrDisplay)
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * Sets the scale of the vrDevice in babylon space. (default: 1)
      */
    var positionScale: js.UndefOr[Double] = js.native
    
    /**
      * To change the length of the ray for gaze/controllers. Will be scaled by positionScale. (default: 100)
      */
    var rayLength: js.UndefOr[Double] = js.native
    
    /**
      * Sets if the webVR camera should be tracked to the vrDevice. (default: true)
      */
    var trackPosition: js.UndefOr[Boolean] = js.native
    
    /**
      * If you don't want to use the default VR button of the helper. (default: false)
      */
    var useCustomVRButton: js.UndefOr[Boolean] = js.native
    
    /**
      * If multiview should be used if availible (default: false)
      */
    var useMultiview: js.UndefOr[Boolean] = js.native
  }
  object WebVROptions {
    
    @scala.inline
    def apply(): WebVROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebVROptions]
    }
    
    @scala.inline
    implicit class WebVROptionsMutableBuilder[Self <: WebVROptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControllerMeshes(value: Boolean): Self = StObject.set(x, "controllerMeshes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerMeshesUndefined: Self = StObject.set(x, "controllerMeshes", js.undefined)
      
      @scala.inline
      def setCustomVRButton(value: HTMLButtonElement): Self = StObject.set(x, "customVRButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomVRButtonUndefined: Self = StObject.set(x, "customVRButton", js.undefined)
      
      @scala.inline
      def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      @scala.inline
      def setDefaultLightingOnControllers(value: Boolean): Self = StObject.set(x, "defaultLightingOnControllers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLightingOnControllersUndefined: Self = StObject.set(x, "defaultLightingOnControllers", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setPositionScale(value: Double): Self = StObject.set(x, "positionScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionScaleUndefined: Self = StObject.set(x, "positionScale", js.undefined)
      
      @scala.inline
      def setRayLength(value: Double): Self = StObject.set(x, "rayLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRayLengthUndefined: Self = StObject.set(x, "rayLength", js.undefined)
      
      @scala.inline
      def setTrackPosition(value: Boolean): Self = StObject.set(x, "trackPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackPositionUndefined: Self = StObject.set(x, "trackPosition", js.undefined)
      
      @scala.inline
      def setUseCustomVRButton(value: Boolean): Self = StObject.set(x, "useCustomVRButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCustomVRButtonUndefined: Self = StObject.set(x, "useCustomVRButton", js.undefined)
      
      @scala.inline
      def setUseMultiview(value: Boolean): Self = StObject.set(x, "useMultiview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMultiviewUndefined: Self = StObject.set(x, "useMultiview", js.undefined)
    }
  }
}
