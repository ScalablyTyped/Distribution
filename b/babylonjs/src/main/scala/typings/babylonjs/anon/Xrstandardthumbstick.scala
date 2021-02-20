package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xrstandardthumbstick extends StObject {
  
  var `xr-standard-thumbstick`: Xaxis = js.native
  
  var `xr-standard-touchpad`: Xaxis = js.native
}
object Xrstandardthumbstick {
  
  @scala.inline
  def apply(`xr-standard-thumbstick`: Xaxis, `xr-standard-touchpad`: Xaxis): Xrstandardthumbstick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xrstandardthumbstick]
  }
  
  @scala.inline
  implicit class XrstandardthumbstickMutableBuilder[Self <: Xrstandardthumbstick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setXr-standard-thumbstick`(value: Xaxis): Self = StObject.set(x, "xr-standard-thumbstick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXr-standard-touchpad`(value: Xaxis): Self = StObject.set(x, "xr-standard-touchpad", value.asInstanceOf[js.Any])
  }
}
