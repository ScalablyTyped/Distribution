package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  /**
    * The endpoint of the subscription.
    */
  var EndPoint: js.UndefOr[SubscriptionEndPointType] = js.native
  
  /**
    * The protocol of the subscription.
    */
  var Protocol: js.UndefOr[SubscriptionProtocolType] = js.native
  
  /**
    * The ID of the subscription.
    */
  var SubscriptionId: js.UndefOr[IdType] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
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
    def setEndPoint(value: SubscriptionEndPointType): Self = this.set("EndPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPoint: Self = this.set("EndPoint", js.undefined)
    
    @scala.inline
    def setProtocol(value: SubscriptionProtocolType): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: IdType): Self = this.set("SubscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionId: Self = this.set("SubscriptionId", js.undefined)
  }
}
