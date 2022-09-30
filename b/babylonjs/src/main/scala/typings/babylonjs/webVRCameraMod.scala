package typings.babylonjs

import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webVRControllerMod.WebVRController
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webVRCameraMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.webVRCameraMod.PoseControlled because var conflicts: position, rotationQuaternion. Inlined devicePosition, deviceRotationQuaternion, rawPose, deviceScaleFactor, updateFromDevice */ @JSImport("babylonjs/Cameras/VR/webVRCamera", "WebVRFreeCamera")
  @js.native
  open class WebVRFreeCamera protected () extends FreeCamera {
    /**
      * Instantiates a WebVRFreeCamera.
      * @param name The name of the WebVRFreeCamera
      * @param position The starting anchor position for the camera
      * @param scene The scene the camera belongs to
      * @param _webVROptions a set of customizable options for the webVRCamera
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Unit, _webVROptions: WebVROptions) = this()
    def this(name: String, position: Vector3, scene: Scene, _webVROptions: WebVROptions) = this()
    
    /* private */ var _attached: Any = js.native
    
    /**
      * @internal
      * Get current device position in babylon world
      */
    def _computeDevicePosition(): Unit = js.native
    
    /* private */ var _correctPositionIfNotTrackPosition: Any = js.native
    
    /* private */ var _defaultHeight: Any = js.native
    
    /* protected */ var _descendants: js.Array[Node] = js.native
    
    /* private */ var _detachIfAttached: Any = js.native
    
    /* private */ var _deviceRoomPosition: Any = js.native
    
    /** @internal */
    var _deviceRoomRotationQuaternion: Quaternion = js.native
    
    /* private */ var _deviceToWorld: Any = js.native
    
    /* private */ var _frameData: Any = js.native
    
    /* private */ var _leftController: Any = js.native
    
    /* private */ var _lightOnControllers: Any = js.native
    
    /* private */ var _onGamepadConnectedObserver: Any = js.native
    
    /* private */ var _onGamepadDisconnectedObserver: Any = js.native
    
    /* private */ var _onVREnabled: Any = js.native
    
    /* private */ var _oneVector: Any = js.native
    
    /* private */ var _poseSet: Any = js.native
    
    /* private */ var _rightController: Any = js.native
    
    /* protected */ var _setRigMode: Any = js.native
    
    /* private */ var _specsVersion: Any = js.native
    
    /* private */ var _standingMatrix: Any = js.native
    
    /* private */ var _tmpMatrix: Any = js.native
    
    /* private */ var _updateCacheCalled: Any = js.native
    
    /* private */ var _updateCacheWhenTrackingDisabledObserver: Any = js.native
    
    /**
      * @internal
      * The vrDisplay tied to the camera. See https://developer.mozilla.org/en-US/docs/Web/API/VRDisplay
      */
    var _vrDevice: Any = js.native
    
    /* private */ var _webVROptions: Any = js.native
    
    /* private */ var _workingMatrix: Any = js.native
    
    /* private */ var _workingVector: Any = js.native
    
    /* private */ var _worldToDevice: Any = js.native
    
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
      * @param name The name of the controller to retrieve
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
    var onPoseUpdatedFromDeviceObservable: Observable[Any] = js.native
    
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
  }
  
  trait DevicePose extends StObject {
    
    /**
      * The angularAcceleration of the device, values in array are [x,y,z].
      */
    val angularAcceleration: Nullable[js.typedarray.Float32Array]
    
    /**
      * The angularVelocity of the device, values in array are [x,y,z].
      */
    val angularVelocity: Nullable[js.typedarray.Float32Array]
    
    /**
      * The linearAcceleration of the device, values in array are [x,y,z].
      */
    val linearAcceleration: Nullable[js.typedarray.Float32Array]
    
    /**
      * The linearVelocity of the device, values in array are [x,y,z].
      */
    val linearVelocity: Nullable[js.typedarray.Float32Array]
    
    /**
      * The orientation of the device in a quaternion array, values in array are [x,y,z,w].
      */
    val orientation: Nullable[js.typedarray.Float32Array]
    
    /**
      * The position of the device, values in array are [x,y,z].
      */
    val position: Nullable[js.typedarray.Float32Array]
  }
  object DevicePose {
    
    inline def apply(): DevicePose = {
      val __obj = js.Dynamic.literal(angularAcceleration = null, angularVelocity = null, linearAcceleration = null, linearVelocity = null, orientation = null, position = null)
      __obj.asInstanceOf[DevicePose]
    }
    
    extension [Self <: DevicePose](x: Self) {
      
      inline def setAngularAcceleration(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "angularAcceleration", value.asInstanceOf[js.Any])
      
      inline def setAngularAccelerationNull: Self = StObject.set(x, "angularAcceleration", null)
      
      inline def setAngularVelocity(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
      
      inline def setAngularVelocityNull: Self = StObject.set(x, "angularVelocity", null)
      
      inline def setLinearAcceleration(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "linearAcceleration", value.asInstanceOf[js.Any])
      
      inline def setLinearAccelerationNull: Self = StObject.set(x, "linearAcceleration", null)
      
      inline def setLinearVelocity(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "linearVelocity", value.asInstanceOf[js.Any])
      
      inline def setLinearVelocityNull: Self = StObject.set(x, "linearVelocity", null)
      
      inline def setOrientation(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
      
      inline def setPosition(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionNull: Self = StObject.set(x, "position", null)
    }
  }
  
  trait PoseControlled extends StObject {
    
    /**
      * The position of the device in babylon space.
      */
    var devicePosition: js.UndefOr[Vector3] = js.undefined
    
    /**
      * The rotation quaternion of the device in babylon space.
      */
    var deviceRotationQuaternion: Quaternion
    
    /**
      * The scale of the device to be used when translating from device space to babylon space.
      */
    var deviceScaleFactor: Double
    
    /**
      * The position of the object in babylon space.
      */
    var position: Vector3
    
    /**
      * The raw pose coming from the device.
      */
    var rawPose: Nullable[DevicePose]
    
    /**
      * The rotation quaternion of the object in babylon space.
      */
    var rotationQuaternion: Quaternion
    
    /**
      * Updates the poseControlled values based on the input device pose.
      * @param poseData the pose data to update the object with
      */
    def updateFromDevice(poseData: DevicePose): Unit
  }
  object PoseControlled {
    
    inline def apply(
      deviceRotationQuaternion: Quaternion,
      deviceScaleFactor: Double,
      position: Vector3,
      rotationQuaternion: Quaternion,
      updateFromDevice: DevicePose => Unit
    ): PoseControlled = {
      val __obj = js.Dynamic.literal(deviceRotationQuaternion = deviceRotationQuaternion.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], updateFromDevice = js.Any.fromFunction1(updateFromDevice), rawPose = null)
      __obj.asInstanceOf[PoseControlled]
    }
    
    extension [Self <: PoseControlled](x: Self) {
      
      inline def setDevicePosition(value: Vector3): Self = StObject.set(x, "devicePosition", value.asInstanceOf[js.Any])
      
      inline def setDevicePositionUndefined: Self = StObject.set(x, "devicePosition", js.undefined)
      
      inline def setDeviceRotationQuaternion(value: Quaternion): Self = StObject.set(x, "deviceRotationQuaternion", value.asInstanceOf[js.Any])
      
      inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRawPose(value: Nullable[DevicePose]): Self = StObject.set(x, "rawPose", value.asInstanceOf[js.Any])
      
      inline def setRawPoseNull: Self = StObject.set(x, "rawPose", null)
      
      inline def setRotationQuaternion(value: Quaternion): Self = StObject.set(x, "rotationQuaternion", value.asInstanceOf[js.Any])
      
      inline def setUpdateFromDevice(value: DevicePose => Unit): Self = StObject.set(x, "updateFromDevice", js.Any.fromFunction1(value))
    }
  }
  
  trait WebVROptions extends StObject {
    
    /**
      * Should the native controller meshes be initialized. (default: true)
      */
    var controllerMeshes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you'd like to provide your own button to the VRHelper. (default: standard babylon vr button)
      */
    var customVRButton: js.UndefOr[HTMLButtonElement] = js.undefined
    
    /**
      * To change the default offset from the ground to account for user's height in meters. Will be scaled by positionScale. (default: 1.7)
      */
    var defaultHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Creating a default HemiLight only on controllers. (default: true)
      */
    var defaultLightingOnControllers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If there are more than one VRDisplays, this will choose the display matching this name. (default: pick first vrDisplay)
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the scale of the vrDevice in babylon space. (default: 1)
      */
    var positionScale: js.UndefOr[Double] = js.undefined
    
    /**
      * To change the length of the ray for gaze/controllers. Will be scaled by positionScale. (default: 100)
      */
    var rayLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets if the webVR camera should be tracked to the vrDevice. (default: true)
      */
    var trackPosition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you don't want to use the default VR button of the helper. (default: false)
      */
    var useCustomVRButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If multiview should be used if available (default: false)
      */
    var useMultiview: js.UndefOr[Boolean] = js.undefined
  }
  object WebVROptions {
    
    inline def apply(): WebVROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebVROptions]
    }
    
    extension [Self <: WebVROptions](x: Self) {
      
      inline def setControllerMeshes(value: Boolean): Self = StObject.set(x, "controllerMeshes", value.asInstanceOf[js.Any])
      
      inline def setControllerMeshesUndefined: Self = StObject.set(x, "controllerMeshes", js.undefined)
      
      inline def setCustomVRButton(value: HTMLButtonElement): Self = StObject.set(x, "customVRButton", value.asInstanceOf[js.Any])
      
      inline def setCustomVRButtonUndefined: Self = StObject.set(x, "customVRButton", js.undefined)
      
      inline def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      inline def setDefaultLightingOnControllers(value: Boolean): Self = StObject.set(x, "defaultLightingOnControllers", value.asInstanceOf[js.Any])
      
      inline def setDefaultLightingOnControllersUndefined: Self = StObject.set(x, "defaultLightingOnControllers", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPositionScale(value: Double): Self = StObject.set(x, "positionScale", value.asInstanceOf[js.Any])
      
      inline def setPositionScaleUndefined: Self = StObject.set(x, "positionScale", js.undefined)
      
      inline def setRayLength(value: Double): Self = StObject.set(x, "rayLength", value.asInstanceOf[js.Any])
      
      inline def setRayLengthUndefined: Self = StObject.set(x, "rayLength", js.undefined)
      
      inline def setTrackPosition(value: Boolean): Self = StObject.set(x, "trackPosition", value.asInstanceOf[js.Any])
      
      inline def setTrackPositionUndefined: Self = StObject.set(x, "trackPosition", js.undefined)
      
      inline def setUseCustomVRButton(value: Boolean): Self = StObject.set(x, "useCustomVRButton", value.asInstanceOf[js.Any])
      
      inline def setUseCustomVRButtonUndefined: Self = StObject.set(x, "useCustomVRButton", js.undefined)
      
      inline def setUseMultiview(value: Boolean): Self = StObject.set(x, "useMultiview", value.asInstanceOf[js.Any])
      
      inline def setUseMultiviewUndefined: Self = StObject.set(x, "useMultiview", js.undefined)
    }
  }
}
