package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraEventType extends StObject
@JSImport("cesium", "CameraEventType")
@js.native
object CameraEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraEventType & Double] = js.native
  
  /**
    * A left mouse button press followed by moving the mouse and releasing the button.
    */
  @js.native
  sealed trait LEFT_DRAG
    extends StObject
       with CameraEventType
  /* 0 */ val LEFT_DRAG: typings.cesium.mod.CameraEventType.LEFT_DRAG & Double = js.native
  
  /**
    * A middle mouse button press followed by moving the mouse and releasing the button.
    */
  @js.native
  sealed trait MIDDLE_DRAG
    extends StObject
       with CameraEventType
  /* 2 */ val MIDDLE_DRAG: typings.cesium.mod.CameraEventType.MIDDLE_DRAG & Double = js.native
  
  /**
    * A two-finger touch on a touch surface.
    */
  @js.native
  sealed trait PINCH
    extends StObject
       with CameraEventType
  /* 4 */ val PINCH: typings.cesium.mod.CameraEventType.PINCH & Double = js.native
  
  /**
    * A right mouse button press followed by moving the mouse and releasing the button.
    */
  @js.native
  sealed trait RIGHT_DRAG
    extends StObject
       with CameraEventType
  /* 1 */ val RIGHT_DRAG: typings.cesium.mod.CameraEventType.RIGHT_DRAG & Double = js.native
  
  /**
    * Scrolling the middle mouse button.
    */
  @js.native
  sealed trait WHEEL
    extends StObject
       with CameraEventType
  /* 3 */ val WHEEL: typings.cesium.mod.CameraEventType.WHEEL & Double = js.native
}
