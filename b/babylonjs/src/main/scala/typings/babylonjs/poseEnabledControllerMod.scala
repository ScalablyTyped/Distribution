package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.targetCameraMod.TargetCamera
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webVRCameraMod.DevicePose
import typings.babylonjs.webVRCameraMod.PoseControlled
import typings.std.GamepadButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poseEnabledControllerMod {
  
  @JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledController")
  @js.native
  open class PoseEnabledController protected ()
    extends typings.babylonjs.gamepadMod.Gamepad
       with PoseControlled {
    /**
      * Creates a new PoseEnabledController from a gamepad
      * @param browserGamepad the gamepad that the PoseEnabledController should be created from
      */
    def this(browserGamepad: Any) = this()
    
    /* protected */ var _calculatedPosition: Vector3 = js.native
    
    /* private */ var _calculatedRotation: Any = js.native
    
    /* private */ var _deviceRoomPosition: Any = js.native
    
    /* private */ var _deviceRoomRotationQuaternion: Any = js.native
    
    /**
      * Internal, matrix used to convert room space to babylon space
      * @hidden
      */
    var _deviceToWorld: Matrix = js.native
    
    /**
      * @param fixedPosition
      * @hidden
      */
    def _disableTrackPosition(fixedPosition: Vector3): Unit = js.native
    
    /* private */ var _draggedRoomRotation: Any = js.native
    
    /* private */ var _leftHandSystemQuaternion: Any = js.native
    
    /* private */ var _maxRotationDistFromHeadset: Any = js.native
    
    /**
      * Internal, the mesh attached to the controller
      * @hidden
      */
    var _mesh: Nullable[AbstractMesh] = js.native
    
    /**
      * @hidden
      */
    var _meshAttachedObservable: Observable[AbstractMesh] = js.native
    
    /**
      * Node to be used when casting a ray from the controller
      * @hidden
      */
    var _pointingPoseNode: Nullable[TransformNode] = js.native
    
    /* private */ var _poseControlledCamera: Any = js.native
    
    /* private */ var _trackPosition: Any = js.native
    
    /**
      * Updates only the pose device and mesh without doing any button event checking
      */
    /* protected */ def _updatePoseAndMesh(): Unit = js.native
    
    /* private */ var _workingMatrix: Any = js.native
    
    /**
      * Attaches a mesh to the controller
      * @param mesh the mesh to be attached
      */
    def attachToMesh(mesh: AbstractMesh): Unit = js.native
    
    /**
      * Attaches the controllers mesh to a camera
      * @param camera the camera the mesh should be attached to
      */
    def attachToPoseControlledCamera(camera: TargetCamera): Unit = js.native
    
    /**
      * The type of controller (Eg. Windows mixed reality)
      */
    var controllerType: PoseEnabledControllerType = js.native
    
    /**
      * The device position in babylon space
      */
    @JSName("devicePosition")
    var devicePosition_PoseEnabledController: Vector3 = js.native
    
    /**
      * The rotation quaternion of the device in babylon space.
      */
    /* CompleteClass */
    var deviceRotationQuaternion: Quaternion = js.native
    
    /**
      * The scale of the device to be used when translating from device space to babylon space.
      */
    /* CompleteClass */
    var deviceScaleFactor: Double = js.native
    
    /**
      * Gets the ray of the controller in the direction the controller is pointing
      * @param length the length the resulting ray should be
      * @returns a ray in the direction the controller is pointing
      */
    def getForwardRay(): Ray = js.native
    def getForwardRay(length: Double): Ray = js.native
    
    /**
      * If the controller is used in a webXR session
      */
    var isXR: Boolean = js.native
    
    /**
      * The mesh that is attached to the controller
      */
    def mesh: Nullable[AbstractMesh] = js.native
    
    /**
      * The position of the object in babylon space.
      */
    /* CompleteClass */
    var position: Vector3 = js.native
    
    /**
      * The raw pose coming from the device.
      */
    /* CompleteClass */
    var rawPose: Nullable[DevicePose] = js.native
    /**
      * The raw pose from the device
      */
    @JSName("rawPose")
    var rawPose_PoseEnabledController: DevicePose = js.native
    
    /**
      * The rotation quaternion of the object in babylon space.
      */
    /* CompleteClass */
    var rotationQuaternion: Quaternion = js.native
    
    /**
      * Updates the poseControlled values based on the input device pose.
      * @param poseData the pose data to update the object with
      */
    /* CompleteClass */
    override def updateFromDevice(poseData: DevicePose): Unit = js.native
  }
  /* static members */
  object PoseEnabledController {
    
    /**
      * Name of the child mesh that can be used to cast a ray from the controller
      */
    @JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledController.POINTING_POSE")
    @js.native
    val POINTING_POSE: String = js.native
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerHelper")
  @js.native
  open class PoseEnabledControllerHelper () extends StObject
  /* static members */
  object PoseEnabledControllerHelper {
    
    @JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
      * @param vrGamepad the gamepad to initialized
      * @returns a vr controller of the type the gamepad identified as
      */
    inline def InitiateController(vrGamepad: Any): typings.babylonjs.gamepadMod.Gamepad = ^.asInstanceOf[js.Dynamic].applyDynamic("InitiateController")(vrGamepad.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.gamepadMod.Gamepad]
    
    /** @hidden */
    @JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerHelper._ControllerFactories")
    @js.native
    def _ControllerFactories: js.Array[GamePadFactory] = js.native
    inline def _ControllerFactories_=(x: js.Array[GamePadFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ControllerFactories")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerHelper._DefaultControllerFactory")
    @js.native
    def _DefaultControllerFactory: Nullable[js.Function1[/* gamepadInfo */ Any, typings.babylonjs.gamepadMod.Gamepad]] = js.native
    inline def _DefaultControllerFactory_=(x: Nullable[js.Function1[/* gamepadInfo */ Any, typings.babylonjs.gamepadMod.Gamepad]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultControllerFactory")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait PoseEnabledControllerType extends StObject
  @JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerType")
  @js.native
  object PoseEnabledControllerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PoseEnabledControllerType & Double] = js.native
    
    /**
      * Google Daydream
      */
    @js.native
    sealed trait DAYDREAM
      extends StObject
         with PoseEnabledControllerType
    /* 4 */ val DAYDREAM: typings.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.DAYDREAM & Double = js.native
    
    /**
      * Samsung gear VR
      */
    @js.native
    sealed trait GEAR_VR
      extends StObject
         with PoseEnabledControllerType
    /* 3 */ val GEAR_VR: typings.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.GEAR_VR & Double = js.native
    
    /**
      * Generic
      */
    @js.native
    sealed trait GENERIC
      extends StObject
         with PoseEnabledControllerType
    /* 5 */ val GENERIC: typings.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.GENERIC & Double = js.native
    
    /**
      * Oculus Rift
      */
    @js.native
    sealed trait OCULUS
      extends StObject
         with PoseEnabledControllerType
    /* 1 */ val OCULUS: typings.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.OCULUS & Double = js.native
    
    /**
      * HTC Vive
      */
    @js.native
    sealed trait VIVE
      extends StObject
         with PoseEnabledControllerType
    /* 0 */ val VIVE: typings.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.VIVE & Double = js.native
    
    /**
      * Windows mixed reality
      */
    @js.native
    sealed trait WINDOWS
      extends StObject
         with PoseEnabledControllerType
    /* 2 */ val WINDOWS: typings.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.WINDOWS & Double = js.native
  }
  
  trait ExtendedGamepadButton
    extends StObject
       with GamepadButton
  object ExtendedGamepadButton {
    
    inline def apply(pressed: Boolean, touched: Boolean, value: Double): ExtendedGamepadButton = {
      val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedGamepadButton]
    }
  }
  
  trait GamePadFactory extends StObject {
    
    /**
      * Returns whether or not the current gamepad can be created for this type of controller.
      * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
      * @returns true if it can be created, otherwise false
      */
    def canCreate(gamepadInfo: Any): Boolean
    
    /**
      * Creates a new instance of the Gamepad.
      * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
      * @returns the new gamepad instance
      */
    def create(gamepadInfo: Any): typings.babylonjs.gamepadMod.Gamepad
  }
  object GamePadFactory {
    
    inline def apply(canCreate: Any => Boolean, create: Any => typings.babylonjs.gamepadMod.Gamepad): GamePadFactory = {
      val __obj = js.Dynamic.literal(canCreate = js.Any.fromFunction1(canCreate), create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[GamePadFactory]
    }
    
    extension [Self <: GamePadFactory](x: Self) {
      
      inline def setCanCreate(value: Any => Boolean): Self = StObject.set(x, "canCreate", js.Any.fromFunction1(value))
      
      inline def setCreate(value: Any => typings.babylonjs.gamepadMod.Gamepad): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  trait MutableGamepadButton extends StObject {
    
    /**
      * If the button/trigger is currently pressed
      */
    var pressed: Boolean
    
    /**
      * If the button/trigger is currently touched
      */
    var touched: Boolean
    
    /**
      * Value of the button/trigger
      */
    var value: Double
  }
  object MutableGamepadButton {
    
    inline def apply(pressed: Boolean, touched: Boolean, value: Double): MutableGamepadButton = {
      val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableGamepadButton]
    }
    
    extension [Self <: MutableGamepadButton](x: Self) {
      
      inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
