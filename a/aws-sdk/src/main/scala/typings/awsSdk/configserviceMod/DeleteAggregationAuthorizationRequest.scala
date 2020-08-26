package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAggregationAuthorizationRequest extends js.Object {
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: AccountId = js.native
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: AwsRegion = js.native
}

object DeleteAggregationAuthorizationRequest {
  @scala.inline
  def apply(AuthorizedAccountId: AccountId, AuthorizedAwsRegion: AwsRegion): DeleteAggregationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizedAccountId = AuthorizedAccountId.asInstanceOf[js.Any], AuthorizedAwsRegion = AuthorizedAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAggregationAuthorizationRequest]
  }
  @scala.inline
  implicit class DeleteAggregationAuthorizationRequestOps[Self <: DeleteAggregationAuthorizationRequest] (val x: Self) extends AnyVal {
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
    def setAuthorizedAccountId(value: AccountId): Self = this.set("AuthorizedAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizedAwsRegion(value: AwsRegion): Self = this.set("AuthorizedAwsRegion", value.asInstanceOf[js.Any])
  }
  
}

