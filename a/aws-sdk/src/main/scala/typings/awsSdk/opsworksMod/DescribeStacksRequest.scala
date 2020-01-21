package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStacksRequest extends js.Object {
  /**
    * An array of stack IDs that specify the stacks to be described. If you omit this parameter, DescribeStacks returns a description of every stack.
    */
  var StackIds: js.UndefOr[Strings] = js.native
}

object DescribeStacksRequest {
  @scala.inline
  def apply(StackIds: Strings = null): DescribeStacksRequest = {
    val __obj = js.Dynamic.literal()
    if (StackIds != null) __obj.updateDynamic("StackIds")(StackIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStacksRequest]
  }
}

