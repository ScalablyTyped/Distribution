package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xrstandardthumbstick extends StObject {
  
  var `xr-standard-thumbstick`: Xaxis
  
  var `xr-standard-touchpad`: Xaxis
}
object Xrstandardthumbstick {
  
  inline def apply(`xr-standard-thumbstick`: Xaxis, `xr-standard-touchpad`: Xaxis): Xrstandardthumbstick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xrstandardthumbstick]
  }
  
  extension [Self <: Xrstandardthumbstick](x: Self) {
    
    inline def `setXr-standard-thumbstick`(value: Xaxis): Self = StObject.set(x, "xr-standard-thumbstick", value.asInstanceOf[js.Any])
    
    inline def `setXr-standard-touchpad`(value: Xaxis): Self = StObject.set(x, "xr-standard-touchpad", value.asInstanceOf[js.Any])
  }
}
