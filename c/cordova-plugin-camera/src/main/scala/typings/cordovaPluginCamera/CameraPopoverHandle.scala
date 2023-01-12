package typings.cordovaPluginCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A handle to the popover dialog created by navigator.camera.getPicture. Used on iOS only.
  */
trait CameraPopoverHandle extends StObject {
  
  /**
    * Set the position of the popover.
    * @param popoverOptions the CameraPopoverOptions that specify the new position.
    */
  def setPosition(popoverOptions: CameraPopoverOptions): Unit
}
object CameraPopoverHandle {
  
  inline def apply(setPosition: CameraPopoverOptions => Unit): CameraPopoverHandle = {
    val __obj = js.Dynamic.literal(setPosition = js.Any.fromFunction1(setPosition))
    __obj.asInstanceOf[CameraPopoverHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraPopoverHandle] (val x: Self) extends AnyVal {
    
    inline def setSetPosition(value: CameraPopoverOptions => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
  }
}
