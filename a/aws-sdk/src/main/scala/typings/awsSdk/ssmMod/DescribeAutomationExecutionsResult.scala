package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutomationExecutionsResult extends js.Object {
  /**
    * The list of details about each automation execution which has occurred which matches the filter specification, if any.
    */
  var AutomationExecutionMetadataList: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionMetadataList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeAutomationExecutionsResult {
  @scala.inline
  def apply(
    AutomationExecutionMetadataList: AutomationExecutionMetadataList = null,
    NextToken: NextToken = null
  ): DescribeAutomationExecutionsResult = {
    val __obj = js.Dynamic.literal()
    if (AutomationExecutionMetadataList != null) __obj.updateDynamic("AutomationExecutionMetadataList")(AutomationExecutionMetadataList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutomationExecutionsResult]
  }
}

