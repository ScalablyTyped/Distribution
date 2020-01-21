package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStepOutput extends js.Object {
  /**
    * The step details for the requested step identifier.
    */
  var Step: js.UndefOr[typings.awsSdk.emrMod.Step] = js.native
}

object DescribeStepOutput {
  @scala.inline
  def apply(Step: Step = null): DescribeStepOutput = {
    val __obj = js.Dynamic.literal()
    if (Step != null) __obj.updateDynamic("Step")(Step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStepOutput]
  }
}

