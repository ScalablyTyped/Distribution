package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrainingJobRequest extends js.Object {
  /**
    * The name of the training job.
    */
  var TrainingJobName: typings.awsSdk.sagemakerMod.TrainingJobName = js.native
}

object DescribeTrainingJobRequest {
  @scala.inline
  def apply(TrainingJobName: TrainingJobName): DescribeTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrainingJobRequest]
  }
}

