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
  def apply(): BatchDisableStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisableStandardsResponse]
  }
  @scala.inline
  implicit class BatchDisableStandardsResponseOps[Self <: BatchDisableStandardsResponse] (val x: Self) extends AnyVal {
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
    def setStandardsSubscriptionsVarargs(value: StandardsSubscription*): Self = this.set("StandardsSubscriptions", js.Array(value :_*))
    @scala.inline
    def setStandardsSubscriptions(value: StandardsSubscriptions): Self = this.set("StandardsSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardsSubscriptions: Self = this.set("StandardsSubscriptions", js.undefined)
  }
  
}

