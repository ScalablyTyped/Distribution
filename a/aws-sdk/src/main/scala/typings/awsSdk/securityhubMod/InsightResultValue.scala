package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightResultValue extends js.Object {
  /**
    * The number of findings returned for each GroupByAttributeValue.
    */
  var Count: Integer = js.native
  /**
    * The value of the attribute that the findings are grouped by for the insight whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttributeValue: NonEmptyString = js.native
}

object InsightResultValue {
  @scala.inline
  def apply(Count: Integer, GroupByAttributeValue: NonEmptyString): InsightResultValue = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GroupByAttributeValue = GroupByAttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightResultValue]
  }
  @scala.inline
  implicit class InsightResultValueOps[Self <: InsightResultValue] (val x: Self) extends AnyVal {
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
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupByAttributeValue(value: NonEmptyString): Self = this.set("GroupByAttributeValue", value.asInstanceOf[js.Any])
  }
  
}

