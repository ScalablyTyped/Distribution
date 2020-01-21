package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSetOutput extends js.Object {
  /**
    * The specified stack set.
    */
  var StackSet: js.UndefOr[typings.awsSdk.cloudformationMod.StackSet] = js.native
}

object DescribeStackSetOutput {
  @scala.inline
  def apply(StackSet: StackSet = null): DescribeStackSetOutput = {
    val __obj = js.Dynamic.literal()
    if (StackSet != null) __obj.updateDynamic("StackSet")(StackSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackSetOutput]
  }
}

