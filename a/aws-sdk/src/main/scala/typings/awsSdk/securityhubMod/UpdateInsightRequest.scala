package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInsightRequest extends js.Object {
  /**
    * The updated filters that define this insight.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.native
  /**
    * The updated GroupBy attribute that defines this insight.
    */
  var GroupByAttribute: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN of the insight that you want to update.
    */
  var InsightArn: NonEmptyString = js.native
  /**
    * The updated name for the insight.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}

object UpdateInsightRequest {
  @scala.inline
  def apply(InsightArn: NonEmptyString): UpdateInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInsightRequest]
  }
  @scala.inline
  implicit class UpdateInsightRequestOps[Self <: UpdateInsightRequest] (val x: Self) extends AnyVal {
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
    def setInsightArn(value: NonEmptyString): Self = this.set("InsightArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: AwsSecurityFindingFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setGroupByAttribute(value: NonEmptyString): Self = this.set("GroupByAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupByAttribute: Self = this.set("GroupByAttribute", js.undefined)
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

