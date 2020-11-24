package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisableStandardsRequest extends js.Object {
  
  /**
    * The ARNs of the standards subscriptions to disable.
    */
  var StandardsSubscriptionArns: typings.awsSdk.securityhubMod.StandardsSubscriptionArns = js.native
}
object BatchDisableStandardsRequest {
  
  @scala.inline
  def apply(StandardsSubscriptionArns: StandardsSubscriptionArns): BatchDisableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArns = StandardsSubscriptionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisableStandardsRequest]
  }
  
  @scala.inline
  implicit class BatchDisableStandardsRequestOps[Self <: BatchDisableStandardsRequest] (val x: Self) extends AnyVal {
    
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
    def setStandardsSubscriptionArnsVarargs(value: NonEmptyString*): Self = this.set("StandardsSubscriptionArns", js.Array(value :_*))
    
    @scala.inline
    def setStandardsSubscriptionArns(value: StandardsSubscriptionArns): Self = this.set("StandardsSubscriptionArns", value.asInstanceOf[js.Any])
  }
}
