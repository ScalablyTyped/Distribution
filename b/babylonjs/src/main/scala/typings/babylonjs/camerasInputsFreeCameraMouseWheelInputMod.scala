package typings.babylonjs

import typings.babylonjs.camerasFreeCameraMod.FreeCamera
import typings.babylonjs.camerasInputsBaseCameraMouseWheelInputMod.BaseCameraMouseWheelInput
import typings.babylonjs.mathsMathDotaxisMod.Coordinate
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasInputsFreeCameraMouseWheelInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/freeCameraMouseWheelInput", "FreeCameraMouseWheelInput")
  @js.native
  open class FreeCameraMouseWheelInput () extends BaseCameraMouseWheelInput {
    
    /* private */ var _moveRelative: Any = js.native
    
    /* private */ var _moveScene: Any = js.native
    
    /* private */ var _rotateRelative: Any = js.native
    
    /**
      * Update the camera according to any configured properties for the 3
      * mouse-wheel axis.
      */
    /* private */ var _updateCamera: Any = js.native
    
    /**
      * Update one property of the camera.
      * @param value
      * @param cameraProperty
      * @param coordinate
      */
    /* private */ var _updateCameraProperty: Any = js.native
    
    /**
      * These are set to the desired default behaviour.
      */
    /* private */ var _wheelXAction: Any = js.native
    
    /* private */ var _wheelXActionCoordinate: Any = js.native
    
    /* private */ var _wheelYAction: Any = js.native
    
    /* private */ var _wheelYActionCoordinate: Any = js.native
    
    /* private */ var _wheelZAction: Any = js.native
    
    /* private */ var _wheelZActionCoordinate: Any = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FreeCameraMouseWheelInput: FreeCamera = js.native
    
    /**
      * Called for each rendered frame.
      */
    @JSName("checkInputs")
    def checkInputs_MFreeCameraMouseWheelInput(): Unit = js.native
    
    /**
      * Get the configured movement axis (relative to camera's orientation) the
      * mouse wheel's X axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelXMoveRelative: Nullable[Coordinate] = js.native
    /**
      * Set which movement axis (relative to camera's orientation) the mouse
      * wheel's X axis controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelXMoveRelative_=(axis: Nullable[Coordinate]): Unit = js.native
    
    /**
      * Get the configured movement axis (relative to the scene) the mouse wheel's
      * X axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelXMoveScene: Nullable[Coordinate] = js.native
    /**
      * Set which movement axis (relative to the scene) the mouse wheel's X axis
      * controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelXMoveScene_=(axis: Nullable[Coordinate]): Unit = js.native
    
    /**
      * Get the configured rotation axis (relative to camera's orientation) the
      * mouse wheel's X axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelXRotateRelative: Nullable[Coordinate] = js.native
    /**
      * Set which rotation axis (relative to camera's orientation) the mouse
      * wheel's X axis controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelXRotateRelative_=(axis: Nullable[Coordinate]): Unit = js.native
    
    /**
      * Get the configured movement axis (relative to camera's orientation) the
      * mouse wheel's Y axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelYMoveRelative: Nullable[Coordinate] = js.native
    /**
      * Set which movement axis (relative to camera's orientation) the mouse
      * wheel's Y axis controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelYMoveRelative_=(axis: Nullable[Coordinate]): Unit = js.native
    
    /**
      * Get the configured movement axis (relative to the scene) the mouse wheel's
      * Y axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelYMoveScene: Nullable[Coordinate] = js.native
    /**
      * Set which movement axis (relative to the scene) the mouse wheel's Y axis
      * controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelYMoveScene_=(axis: Nullable[Coordinate]): Unit = js.native
    
    /**
      * Get the configured rotation axis (relative to camera's orientation) the
      * mouse wheel's Y axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelYRotateRelative: Nullable[Coordinate] = js.native
    /**
      * Set which rotation axis (relative to camera's orientation) the mouse
      * wheel's Y axis controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelYRotateRelative_=(axis: Nullable[Coordinate]): Unit = js.native
    
    /**
      * Get the configured movement axis (relative to camera's orientation) the
      * mouse wheel's Z axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelZMoveRelative: Nullable[Coordinate] = js.native
    /**
      * Set which movement axis (relative to camera's orientation) the mouse
      * wheel's Z axis controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelZMoveRelative_=(axis: Nullable[Coordinate]): Unit = js.native
    
    /**
      * Get the configured movement axis (relative to the scene) the mouse wheel's
      * Z axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelZMoveScene: Nullable[Coordinate] = js.native
    /**
      * Set which movement axis (relative to the scene) the mouse wheel's Z axis
      * controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelZMoveScene_=(axis: Nullable[Coordinate]): Unit = js.native
    
    /**
      * Get the configured rotation axis (relative to camera's orientation) the
      * mouse wheel's Z axis controls.
      * @returns The configured axis or null if none.
      */
    def wheelZRotateRelative: Nullable[Coordinate] = js.native
    /**
      * Set which rotation axis (relative to camera's orientation) the mouse
      * wheel's Z axis controls.
      * @param axis The axis to be moved. Set null to clear.
      */
    def wheelZRotateRelative_=(axis: Nullable[Coordinate]): Unit = js.native
  }
}
