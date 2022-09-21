package typings.braintree.anon

import typings.braintree.braintreeStrings.held
import typings.braintree.braintreeStrings.hold_pending
import typings.braintree.braintreeStrings.refunded
import typings.braintree.braintreeStrings.release_pending
import typings.braintree.braintreeStrings.released
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Held extends StObject {
  
  var Held: held
  
  var HoldPending: hold_pending
  
  var Refunded: refunded
  
  var ReleasePending: release_pending
  
  var Released: released
}
object Held {
  
  inline def apply(): Held = {
    val __obj = js.Dynamic.literal(Held = "held", HoldPending = "hold_pending", Refunded = "refunded", ReleasePending = "release_pending", Released = "released")
    __obj.asInstanceOf[Held]
  }
  
  extension [Self <: Held](x: Self) {
    
    inline def setHeld(value: held): Self = StObject.set(x, "Held", value.asInstanceOf[js.Any])
    
    inline def setHoldPending(value: hold_pending): Self = StObject.set(x, "HoldPending", value.asInstanceOf[js.Any])
    
    inline def setRefunded(value: refunded): Self = StObject.set(x, "Refunded", value.asInstanceOf[js.Any])
    
    inline def setReleasePending(value: release_pending): Self = StObject.set(x, "ReleasePending", value.asInstanceOf[js.Any])
    
    inline def setReleased(value: released): Self = StObject.set(x, "Released", value.asInstanceOf[js.Any])
  }
}
