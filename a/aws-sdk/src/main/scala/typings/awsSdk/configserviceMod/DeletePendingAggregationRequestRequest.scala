package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePendingAggregationRequestRequest extends js.Object {
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: AccountId = js.native
  /**
    * The region requesting to aggregate data.
    */
  var RequesterAwsRegion: AwsRegion = js.native
}

object DeletePendingAggregationRequestRequest {
  @scala.inline
  def apply(RequesterAccountId: AccountId, RequesterAwsRegion: AwsRegion): DeletePendingAggregationRequestRequest = {
    val __obj = js.Dynamic.literal(RequesterAccountId = RequesterAccountId.asInstanceOf[js.Any], RequesterAwsRegion = RequesterAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePendingAggregationRequestRequest]
  }
  @scala.inline
  implicit class DeletePendingAggregationRequestRequestOps[Self <: DeletePendingAggregationRequestRequest] (val x: Self) extends AnyVal {
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
    def setRequesterAwsRegion(value: AwsRegion): Self = this.set("RequesterAwsRegion", value.asInstanceOf[js.Any])
  }
  
}

