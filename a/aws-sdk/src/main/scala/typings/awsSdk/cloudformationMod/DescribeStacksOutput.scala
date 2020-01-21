package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStacksOutput extends js.Object {
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of stack structures.
    */
  var Stacks: js.UndefOr[typings.awsSdk.cloudformationMod.Stacks] = js.native
}

object DescribeStacksOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Stacks: Stacks = null): DescribeStacksOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Stacks != null) __obj.updateDynamic("Stacks")(Stacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStacksOutput]
  }
}

