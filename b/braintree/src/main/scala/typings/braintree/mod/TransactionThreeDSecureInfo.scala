package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionThreeDSecureInfo extends StObject {
  
  var enrolled: String = js.native
  
  var liabilityShiftPossible: Boolean = js.native
  
  var liabilityShifted: Boolean = js.native
  
  var status: String = js.native
}
object TransactionThreeDSecureInfo {
  
  @scala.inline
  def apply(enrolled: String, liabilityShiftPossible: Boolean, liabilityShifted: Boolean, status: String): TransactionThreeDSecureInfo = {
    val __obj = js.Dynamic.literal(enrolled = enrolled.asInstanceOf[js.Any], liabilityShiftPossible = liabilityShiftPossible.asInstanceOf[js.Any], liabilityShifted = liabilityShifted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionThreeDSecureInfo]
  }
  
  @scala.inline
  implicit class TransactionThreeDSecureInfoMutableBuilder[Self <: TransactionThreeDSecureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnrolled(value: String): Self = StObject.set(x, "enrolled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShiftPossible(value: Boolean): Self = StObject.set(x, "liabilityShiftPossible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
