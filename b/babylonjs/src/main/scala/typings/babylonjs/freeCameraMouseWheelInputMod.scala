package typings.babylonjs

import typings.babylonjs.baseCameraMouseWheelInputMod.BaseCameraMouseWheelInput
import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.mathAxisMod.Coordinate
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object freeCameraMouseWheelInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/freeCameraMouseWheelInput", "FreeCameraMouseWheelInput")
  @js.native
  class FreeCameraMouseWheelInput () extends BaseCameraMouseWheelInput {
    
    var _moveRelative: js.Any = js.native
    
    var _moveScene: js.Any = js.native
    
    var _rotateRelative: js.Any = js.native
    
    /**
      * Update the camera according to any configured properties for the 3
      * mouse-wheel axis.
      */
    var _updateCamera: js.Any = js.native
    
    /**
      * These are set to the desired default behaviour.
      */
    var _wheelXAction: js.Any = js.native
    
    var _wheelXActionCoordinate: js.Any = js.native
    
    var _wheelYAction: js.Any = js.native
    
    var _wheelYActionCoordinate: js.Any = js.native
    
    var _wheelZAction: js.Any = js.native
    
    var _wheelZActionCoordinate: js.Any = js.native
    
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
