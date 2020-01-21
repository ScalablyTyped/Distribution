package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrialRequest extends js.Object {
  /**
    * The name of the trial to describe.
    */
  var TrialName: ExperimentEntityName = js.native
}

object DescribeTrialRequest {
  @scala.inline
  def apply(TrialName: ExperimentEntityName): DescribeTrialRequest = {
    val __obj = js.Dynamic.literal(TrialName = TrialName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTrialRequest]
  }
}

