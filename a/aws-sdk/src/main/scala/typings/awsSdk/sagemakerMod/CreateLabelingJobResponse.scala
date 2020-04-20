package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLabelingJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to identify the labeling job.
    */
  var LabelingJobArn: typings.awsSdk.sagemakerMod.LabelingJobArn = js.native
}

object CreateLabelingJobResponse {
  @scala.inline
  def apply(LabelingJobArn: LabelingJobArn): CreateLabelingJobResponse = {
    val __obj = js.Dynamic.literal(LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelingJobResponse]
  }
}

