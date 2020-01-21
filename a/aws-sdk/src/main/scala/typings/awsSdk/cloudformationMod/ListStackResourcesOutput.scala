package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackResourcesOutput extends js.Object {
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of StackResourceSummary structures.
    */
  var StackResourceSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.StackResourceSummaries] = js.native
}

object ListStackResourcesOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, StackResourceSummaries: StackResourceSummaries = null): ListStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StackResourceSummaries != null) __obj.updateDynamic("StackResourceSummaries")(StackResourceSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackResourcesOutput]
  }
}

