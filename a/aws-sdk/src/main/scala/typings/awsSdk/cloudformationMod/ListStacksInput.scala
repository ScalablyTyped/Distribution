package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStacksInput extends js.Object {
  /**
    * A string that identifies the next page of stacks that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified status codes. For a complete list of stack status codes, see the StackStatus parameter of the Stack data type.
    */
  var StackStatusFilter: js.UndefOr[typings.awsSdk.cloudformationMod.StackStatusFilter] = js.native
}

object ListStacksInput {
  @scala.inline
  def apply(NextToken: NextToken = null, StackStatusFilter: StackStatusFilter = null): ListStacksInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StackStatusFilter != null) __obj.updateDynamic("StackStatusFilter")(StackStatusFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStacksInput]
  }
}

