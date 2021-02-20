package typings.cordovaPluginMediaCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
  var capture: Capture = js.native
}
object Device {
  
  @scala.inline
  def apply(capture: Capture): Device = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: Capture): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
  }
}
