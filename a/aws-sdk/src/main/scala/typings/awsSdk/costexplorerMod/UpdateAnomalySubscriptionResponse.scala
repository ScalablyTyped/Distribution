package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnomalySubscriptionResponse extends js.Object {
  
  /**
    *  A cost anomaly subscription ARN. 
    */
  var SubscriptionArn: GenericString = js.native
}
object UpdateAnomalySubscriptionResponse {
  
  @scala.inline
  def apply(SubscriptionArn: GenericString): UpdateAnomalySubscriptionResponse = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalySubscriptionResponse]
  }
  
  @scala.inline
  implicit class UpdateAnomalySubscriptionResponseOps[Self <: UpdateAnomalySubscriptionResponse] (val x: Self) extends AnyVal {
    
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
    def setSubscriptionArn(value: GenericString): Self = this.set("SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
