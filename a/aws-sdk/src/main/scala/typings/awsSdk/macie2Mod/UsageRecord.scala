package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecord extends js.Object {
  /**
    * The unique identifier for the AWS account that the data applies to.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
    */
  var freeTrialStartDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * An array of objects that contains usage data and quotas for the account. Each object contains the data for a specific usage metric and the corresponding quota.
    */
  var usage: js.UndefOr[listOfUsageByAccount] = js.native
}

object UsageRecord {
  @scala.inline
  def apply(): UsageRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageRecord]
  }
  @scala.inline
  implicit class UsageRecordOps[Self <: UsageRecord] (val x: Self) extends AnyVal {
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
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setFreeTrialStartDate(value: timestampIso8601): Self = this.set("freeTrialStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeTrialStartDate: Self = this.set("freeTrialStartDate", js.undefined)
    @scala.inline
    def setUsageVarargs(value: UsageByAccount*): Self = this.set("usage", js.Array(value :_*))
    @scala.inline
    def setUsage(value: listOfUsageByAccount): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}

