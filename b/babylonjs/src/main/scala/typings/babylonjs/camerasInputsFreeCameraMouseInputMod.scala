package typings.babylonjs

import typings.babylonjs.anon.OffsetX
import typings.babylonjs.camerasCameraInputsManagerMod.ICameraInput
import typings.babylonjs.camerasFreeCameraMod.FreeCamera
import typings.babylonjs.miscObservableMod.Observable
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasInputsFreeCameraMouseInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/freeCameraMouseInput", "FreeCameraMouseInput")
  @js.native
  /**
    * Manage the mouse inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/customizingCameraInputs
    * @param touchEnabled Defines if touch is enabled or not
    */
  open class FreeCameraMouseInput ()
    extends StObject
       with ICameraInput[FreeCamera] {
    def this(/**
      * Define if touch is enabled in the mouse input
      */
    touchEnabled: Boolean) = this()
    
    /* private */ var _activePointerId: Any = js.native
    
    /**
      * @internal
      * If the camera should be rotated automatically based on pointer movement
      */
    var _allowCameraRotation: Boolean = js.native
    
    /* private */ var _contextMenuBind: Any = js.native
    
    /* private */ var _currentActiveButton: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _onMouseMove: Any = js.native
    
    /* private */ var _pointerInput: Any = js.native
    
    /* private */ var _previousPosition: Any = js.native
    
    /**
      * Defines the pointer angular sensibility  along the X and Y axis or how fast is the camera rotating.
      */
    var angularSensibility: Double = js.native
    
    /**
      * Defines the buttons associated with the input to handle camera move.
      */
    var buttons: js.Array[Double] = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FreeCameraMouseInput: FreeCamera = js.native
    
    /**
      * Called on JS contextmenu event.
      * Override this method to provide functionality.
      * @param evt
      */
    def onContextMenu(evt: PointerEvent): Unit = js.native
    
    /**
      * Observable for when a pointer move event occurs containing the move offset
      */
    var onPointerMovedObservable: Observable[OffsetX] = js.native
    
    /**
      * Define if touch is enabled in the mouse input
      */
    var touchEnabled: Boolean = js.native
  }
}
