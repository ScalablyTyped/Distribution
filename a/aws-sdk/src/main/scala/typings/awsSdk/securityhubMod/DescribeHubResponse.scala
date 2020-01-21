package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHubResponse extends js.Object {
  /**
    * The ARN of the Hub resource retrieved.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time when Security Hub was enabled in the account.
    */
  var SubscribedAt: js.UndefOr[NonEmptyString] = js.native
}

object DescribeHubResponse {
  @scala.inline
  def apply(HubArn: NonEmptyString = null, SubscribedAt: NonEmptyString = null): DescribeHubResponse = {
    val __obj = js.Dynamic.literal()
    if (HubArn != null) __obj.updateDynamic("HubArn")(HubArn.asInstanceOf[js.Any])
    if (SubscribedAt != null) __obj.updateDynamic("SubscribedAt")(SubscribedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHubResponse]
  }
}

