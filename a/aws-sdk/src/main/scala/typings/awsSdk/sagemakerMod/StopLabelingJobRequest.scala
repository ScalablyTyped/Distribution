package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopLabelingJobRequest extends js.Object {
  /**
    * The name of the labeling job to stop.
    */
  var LabelingJobName: typings.awsSdk.sagemakerMod.LabelingJobName = js.native
}

object StopLabelingJobRequest {
  @scala.inline
  def apply(LabelingJobName: LabelingJobName): StopLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopLabelingJobRequest]
  }
  @scala.inline
  implicit class StopLabelingJobRequestOps[Self <: StopLabelingJobRequest] (val x: Self) extends AnyVal {
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
    def setLabelingJobName(value: LabelingJobName): Self = this.set("LabelingJobName", value.asInstanceOf[js.Any])
  }
  
}

