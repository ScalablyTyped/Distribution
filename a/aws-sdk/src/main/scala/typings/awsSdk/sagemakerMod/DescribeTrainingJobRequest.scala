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
  @scala.inline
  implicit class DescribeTrainingJobRequestOps[Self <: DescribeTrainingJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTrainingJobName(value: TrainingJobName): Self = this.set("TrainingJobName", value.asInstanceOf[js.Any])
  }
  
}

