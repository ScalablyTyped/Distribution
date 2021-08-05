package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alert extends StObject {
  
  var alert: js.UndefOr[js.Object] = js.undefined
  
  var button: js.UndefOr[js.Object] = js.undefined
}
object Alert {
  
  inline def apply(): Alert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alert]
  }
  
  extension [Self <: Alert](x: Self) {
    
    inline def setAlert(value: js.Object): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
    
    inline def setButton(value: js.Object): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
  }
}
