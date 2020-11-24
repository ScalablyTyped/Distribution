package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBrokerPropertiesResponse extends js.Object {
  
  val DeliveryCount: Double = js.native
  
  val LockToken: String = js.native
  
  val LockedUntil: DateString = js.native
  
  val SequenceNumber: Double = js.native
}
object IBrokerPropertiesResponse {
  
  @scala.inline
  def apply(DeliveryCount: Double, LockToken: String, LockedUntil: DateString, SequenceNumber: Double): IBrokerPropertiesResponse = {
    val __obj = js.Dynamic.literal(DeliveryCount = DeliveryCount.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], LockedUntil = LockedUntil.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrokerPropertiesResponse]
  }
  
  @scala.inline
  implicit class IBrokerPropertiesResponseOps[Self <: IBrokerPropertiesResponse] (val x: Self) extends AnyVal {
    
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
    def setDeliveryCount(value: Double): Self = this.set("DeliveryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockToken(value: String): Self = this.set("LockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUntil(value: DateString): Self = this.set("LockedUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: Double): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
  }
}
