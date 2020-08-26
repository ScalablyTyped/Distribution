package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageStatisticsFilter extends js.Object {
  /**
    * The operator to use in the condition. If the value for the key property is accountId, this value must be CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE, LT, LTE, or NE.
    */
  var comparator: js.UndefOr[UsageStatisticsFilterComparator] = js.native
  /**
    * The field to use in the condition.
    */
  var key: js.UndefOr[UsageStatisticsFilterKey] = js.native
  /**
    * An array that lists values to use in the condition, based on the value for the field specified by the key property. If the value for the key property is accountId, this array can specify multiple values. Otherwise, this array can specify only one value. Valid values for each supported field are: accountId - The unique identifier for an AWS account. freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started for an account. serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly quota. total - A string that represents the current, estimated month-to-date cost for an account.
    */
  var values: js.UndefOr[listOfString] = js.native
}

object UsageStatisticsFilter {
  @scala.inline
  def apply(): UsageStatisticsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatisticsFilter]
  }
  @scala.inline
  implicit class UsageStatisticsFilterOps[Self <: UsageStatisticsFilter] (val x: Self) extends AnyVal {
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
    def setComparator(value: UsageStatisticsFilterComparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setKey(value: UsageStatisticsFilterKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValuesVarargs(value: string*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: listOfString): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

