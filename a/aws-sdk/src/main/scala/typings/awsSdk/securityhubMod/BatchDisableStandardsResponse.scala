package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisableStandardsResponse extends js.Object {
  /**
    * The details of the standards subscriptions that were disabled.
    */
  var StandardsSubscriptions: js.UndefOr[typings.awsSdk.securityhubMod.StandardsSubscriptions] = js.native
}

object BatchDisableStandardsResponse {
  @scala.inline
  def apply(StandardsSubscriptions: StandardsSubscriptions = null): BatchDisableStandardsResponse = {
    val __obj = js.Dynamic.literal()
    if (StandardsSubscriptions != null) __obj.updateDynamic("StandardsSubscriptions")(StandardsSubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisableStandardsResponse]
  }
}

