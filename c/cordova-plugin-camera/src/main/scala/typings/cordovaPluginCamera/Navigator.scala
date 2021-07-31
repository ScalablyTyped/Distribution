package typings.cordovaPluginCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /**
    * This plugin provides an API for taking pictures and for choosing images from the system's image library.
    */
  var camera: Camera
}
object Navigator {
  
  @scala.inline
  def apply(camera: Camera): Navigator = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
  }
}
