package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobAlgorithmsConfig extends js.Object {
  /**
    * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by providing the ARN of the model here. 
    */
  var InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.native
  /**
    * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the following ARNs:    Image classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/image-classification     Text classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/text-classification     Object detection   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/object-detection     Semantic Segmentation   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/semantic-segmentation   
    */
  var LabelingJobAlgorithmSpecificationArn: typings.awsSdk.sagemakerMod.LabelingJobAlgorithmSpecificationArn = js.native
  /**
    * Provides configuration information for a labeling job.
    */
  var LabelingJobResourceConfig: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobResourceConfig] = js.native
}

object LabelingJobAlgorithmsConfig {
  @scala.inline
  def apply(LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn): LabelingJobAlgorithmsConfig = {
    val __obj = js.Dynamic.literal(LabelingJobAlgorithmSpecificationArn = LabelingJobAlgorithmSpecificationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobAlgorithmsConfig]
  }
  @scala.inline
  implicit class LabelingJobAlgorithmsConfigOps[Self <: LabelingJobAlgorithmsConfig] (val x: Self) extends AnyVal {
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
    def setLabelingJobAlgorithmSpecificationArn(value: LabelingJobAlgorithmSpecificationArn): Self = this.set("LabelingJobAlgorithmSpecificationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialActiveLearningModelArn(value: ModelArn): Self = this.set("InitialActiveLearningModelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialActiveLearningModelArn: Self = this.set("InitialActiveLearningModelArn", js.undefined)
    @scala.inline
    def setLabelingJobResourceConfig(value: LabelingJobResourceConfig): Self = this.set("LabelingJobResourceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelingJobResourceConfig: Self = this.set("LabelingJobResourceConfig", js.undefined)
  }
  
}

