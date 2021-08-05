package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalStrength extends StObject {
  
  var SignalStrength: js.UndefOr[integer] = js.undefined
}
object SignalStrength {
  
  inline def apply(): SignalStrength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalStrength]
  }
  
  extension [Self <: SignalStrength](x: Self) {
    
    inline def setSignalStrength(value: integer): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    inline def setSignalStrengthUndefined: Self = StObject.set(x, "SignalStrength", js.undefined)
  }
}
