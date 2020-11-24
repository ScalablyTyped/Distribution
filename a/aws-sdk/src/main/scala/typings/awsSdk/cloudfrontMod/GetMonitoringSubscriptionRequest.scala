package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMonitoringSubscriptionRequest extends js.Object {
  
  /**
    * The ID of the distribution that you are getting metrics information for.
    */
  var DistributionId: String = js.native
}
object GetMonitoringSubscriptionRequest {
  
  @scala.inline
  def apply(DistributionId: String): GetMonitoringSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMonitoringSubscriptionRequest]
  }
  
  @scala.inline
  implicit class GetMonitoringSubscriptionRequestOps[Self <: GetMonitoringSubscriptionRequest] (val x: Self) extends AnyVal {
    
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
    def setDistributionId(value: String): Self = this.set("DistributionId", value.asInstanceOf[js.Any])
  }
}
