package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalStrength extends StObject {
  
  var SignalStrength: js.UndefOr[integer] = js.native
}
object SignalStrength {
  
  @scala.inline
  def apply(): SignalStrength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalStrength]
  }
  
  @scala.inline
  implicit class SignalStrengthMutableBuilder[Self <: SignalStrength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignalStrength(value: integer): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthUndefined: Self = StObject.set(x, "SignalStrength", js.undefined)
  }
}
