package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionThreeDSecureInfo extends js.Object {
  
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
  implicit class TransactionThreeDSecureInfoOps[Self <: TransactionThreeDSecureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnrolled(value: String): Self = this.set("enrolled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShiftPossible(value: Boolean): Self = this.set("liabilityShiftPossible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShifted(value: Boolean): Self = this.set("liabilityShifted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
