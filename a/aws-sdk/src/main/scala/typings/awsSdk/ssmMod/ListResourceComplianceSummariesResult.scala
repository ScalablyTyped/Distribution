package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceComplianceSummariesResult extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * A summary count for specified or targeted managed instances. Summary count includes information about compliant and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that you specify. 
    */
  var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.native
}

object ListResourceComplianceSummariesResult {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    ResourceComplianceSummaryItems: ResourceComplianceSummaryItemList = null
  ): ListResourceComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceComplianceSummaryItems != null) __obj.updateDynamic("ResourceComplianceSummaryItems")(ResourceComplianceSummaryItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceComplianceSummariesResult]
  }
}

