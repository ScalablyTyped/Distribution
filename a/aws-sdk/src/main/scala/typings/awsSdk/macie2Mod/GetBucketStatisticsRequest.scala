package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketStatisticsRequest extends js.Object {
  /**
    * The unique identifier for the AWS account.
    */
  var accountId: js.UndefOr[string] = js.native
}

object GetBucketStatisticsRequest {
  @scala.inline
  def apply(accountId: string = null): GetBucketStatisticsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketStatisticsRequest]
  }
}

