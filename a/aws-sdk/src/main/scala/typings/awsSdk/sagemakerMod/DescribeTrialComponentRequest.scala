package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrialComponentRequest extends js.Object {
  /**
    * The name of the trial component to describe.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}

object DescribeTrialComponentRequest {
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName): DescribeTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrialComponentRequest]
  }
}

