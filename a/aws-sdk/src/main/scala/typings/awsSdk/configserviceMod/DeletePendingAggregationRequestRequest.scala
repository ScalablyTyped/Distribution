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
}

