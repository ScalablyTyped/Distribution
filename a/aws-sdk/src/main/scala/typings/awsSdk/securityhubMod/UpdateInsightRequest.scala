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
  def apply(
    InsightArn: NonEmptyString,
    Filters: AwsSecurityFindingFilters = null,
    GroupByAttribute: NonEmptyString = null,
    Name: NonEmptyString = null
  ): UpdateInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (GroupByAttribute != null) __obj.updateDynamic("GroupByAttribute")(GroupByAttribute.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInsightRequest]
  }
}

