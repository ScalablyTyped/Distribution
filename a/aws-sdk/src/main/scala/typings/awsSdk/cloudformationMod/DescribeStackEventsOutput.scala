package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackEventsOutput extends js.Object {
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of StackEvents structures.
    */
  var StackEvents: js.UndefOr[typings.awsSdk.cloudformationMod.StackEvents] = js.native
}

object DescribeStackEventsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, StackEvents: StackEvents = null): DescribeStackEventsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StackEvents != null) __obj.updateDynamic("StackEvents")(StackEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackEventsOutput]
  }
}

