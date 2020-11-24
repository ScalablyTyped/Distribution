package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscriber extends js.Object {
  
  /**
    *  The email address or SNS Amazon Resource Name (ARN), depending on the Type. 
    */
  var Address: js.UndefOr[SubscriberAddress] = js.native
  
  /**
    *  Indicates if the subscriber accepts the notifications. 
    */
  var Status: js.UndefOr[SubscriberStatus] = js.native
  
  /**
    *  The notification delivery channel. 
    */
  var Type: js.UndefOr[SubscriberType] = js.native
}
object Subscriber {
  
  @scala.inline
  def apply(): Subscriber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscriber]
  }
  
  @scala.inline
  implicit class SubscriberOps[Self <: Subscriber] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: SubscriberAddress): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setStatus(value: SubscriberStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setType(value: SubscriberType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
