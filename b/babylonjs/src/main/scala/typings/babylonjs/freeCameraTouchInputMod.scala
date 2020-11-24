package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.ICameraInput
import typings.babylonjs.freeCameraMod.FreeCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/Inputs/freeCameraTouchInput", JSImport.Namespace)
@js.native
object freeCameraTouchInputMod extends js.Object {
  
  @js.native
  /**
    * Manage the touch inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param allowMouse Defines if mouse events can be treated as touch events
    */
  class FreeCameraTouchInput () extends ICameraInput[FreeCamera] {
    def this(/**
      * Define if mouse events can be treated as touch events
      */
    allowMouse: Boolean) = this()
    
    var _observer: js.Any = js.native
    
    var _offsetX: js.Any = js.native
    
    var _offsetY: js.Any = js.native
    
    var _onLostFocus: js.Any = js.native
    
    var _pointerInput: js.Any = js.native
    
    var _pointerPressed: js.Any = js.native
    
    /**
      * Define if mouse events can be treated as touch events
      */
    var allowMouse: Boolean = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FreeCameraTouchInput: FreeCamera = js.native
    
    /**
      * Update the current camera state depending on the inputs that have been used this frame.
      * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
      */
    @JSName("checkInputs")
    def checkInputs_MFreeCameraTouchInput(): Unit = js.native
    
    /**
      * Defines the touch sensibility for rotation.
      * The higher the faster.
      */
    var touchAngularSensibility: Double = js.native
    
    /**
      * Defines the touch sensibility for move.
      * The higher the faster.
      */
    var touchMoveSensibility: Double = js.native
  }
}
