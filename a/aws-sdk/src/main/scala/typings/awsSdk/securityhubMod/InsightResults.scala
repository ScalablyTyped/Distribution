package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightResults extends js.Object {
  /**
    * The attribute that the findings are grouped by for the insight whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttribute: NonEmptyString = js.native
  /**
    * The ARN of the insight whose results are returned by the GetInsightResults operation.
    */
  var InsightArn: NonEmptyString = js.native
  /**
    * The list of insight result values returned by the GetInsightResults operation.
    */
  var ResultValues: InsightResultValueList = js.native
}

object InsightResults {
  @scala.inline
  def apply(GroupByAttribute: NonEmptyString, InsightArn: NonEmptyString, ResultValues: InsightResultValueList): InsightResults = {
    val __obj = js.Dynamic.literal(GroupByAttribute = GroupByAttribute.asInstanceOf[js.Any], InsightArn = InsightArn.asInstanceOf[js.Any], ResultValues = ResultValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightResults]
  }
  @scala.inline
  implicit class InsightResultsOps[Self <: InsightResults] (val x: Self) extends AnyVal {
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
    def setGroupByAttribute(value: NonEmptyString): Self = this.set("GroupByAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsightArn(value: NonEmptyString): Self = this.set("InsightArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultValuesVarargs(value: InsightResultValue*): Self = this.set("ResultValues", js.Array(value :_*))
    @scala.inline
    def setResultValues(value: InsightResultValueList): Self = this.set("ResultValues", value.asInstanceOf[js.Any])
  }
  
}

