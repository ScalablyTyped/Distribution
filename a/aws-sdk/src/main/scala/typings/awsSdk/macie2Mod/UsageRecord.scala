package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecord extends js.Object {
  /**
    * The AWS account ID for the account that the data applies to.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the free trial period started for the account. This value is null if the account didn't participate in the free trial.
    */
  var freeTrialStartDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * An array of objects that contains usage data and quotas for the account. Each object contains the data for a specific usage metric and the corresponding quota.
    */
  var usage: js.UndefOr[listOfUsageByAccount] = js.native
}

object UsageRecord {
  @scala.inline
  def apply(
    accountId: string = null,
    freeTrialStartDate: timestampIso8601 = null,
    usage: listOfUsageByAccount = null
  ): UsageRecord = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (freeTrialStartDate != null) __obj.updateDynamic("freeTrialStartDate")(freeTrialStartDate.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageRecord]
  }
}

