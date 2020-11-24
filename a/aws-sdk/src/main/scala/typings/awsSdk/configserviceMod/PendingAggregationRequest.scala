package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingAggregationRequest extends js.Object {
  
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The region requesting to aggregate data. 
    */
  var RequesterAwsRegion: js.UndefOr[AwsRegion] = js.native
}
object PendingAggregationRequest {
  
  @scala.inline
  def apply(): PendingAggregationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingAggregationRequest]
  }
  
  @scala.inline
  implicit class PendingAggregationRequestOps[Self <: PendingAggregationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequesterAccountId(value: AccountId): Self = this.set("RequesterAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterAccountId: Self = this.set("RequesterAccountId", js.undefined)
    
    @scala.inline
    def setRequesterAwsRegion(value: AwsRegion): Self = this.set("RequesterAwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterAwsRegion: Self = this.set("RequesterAwsRegion", js.undefined)
  }
}
