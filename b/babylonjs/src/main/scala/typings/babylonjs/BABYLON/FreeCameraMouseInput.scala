package typings.babylonjs.BABYLON

import typings.babylonjs.anon.OffsetX
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraMouseInput
  extends StObject
     with ICameraInput[FreeCamera] {
  
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
