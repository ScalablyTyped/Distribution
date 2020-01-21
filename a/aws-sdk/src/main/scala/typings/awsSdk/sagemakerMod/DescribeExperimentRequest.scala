package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExperimentRequest extends js.Object {
  /**
    * The name of the experiment to describe.
    */
  var ExperimentName: ExperimentEntityName = js.native
}

object DescribeExperimentRequest {
  @scala.inline
  def apply(ExperimentName: ExperimentEntityName): DescribeExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeExperimentRequest]
  }
}

