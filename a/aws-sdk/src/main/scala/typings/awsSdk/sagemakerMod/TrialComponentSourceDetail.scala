package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentSourceDetail extends js.Object {
  /**
    * Information about a processing job that's the source of a trial component.
    */
  var ProcessingJob: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingJob] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  /**
    * Information about a training job that's the source of a trial component.
    */
  var TrainingJob: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJob] = js.native
  /**
    * Information about a transform job that's the source of the trial component.
    */
  var TransformJob: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJob] = js.native
}

object TrialComponentSourceDetail {
  @scala.inline
  def apply(): TrialComponentSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentSourceDetail]
  }
  @scala.inline
  implicit class TrialComponentSourceDetailOps[Self <: TrialComponentSourceDetail] (val x: Self) extends AnyVal {
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
    def setProcessingJob(value: ProcessingJob): Self = this.set("ProcessingJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingJob: Self = this.set("ProcessingJob", js.undefined)
    @scala.inline
    def setSourceArn(value: TrialComponentSourceArn): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
    @scala.inline
    def setTrainingJob(value: TrainingJob): Self = this.set("TrainingJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingJob: Self = this.set("TrainingJob", js.undefined)
    @scala.inline
    def setTransformJob(value: TransformJob): Self = this.set("TransformJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformJob: Self = this.set("TransformJob", js.undefined)
  }
  
}

