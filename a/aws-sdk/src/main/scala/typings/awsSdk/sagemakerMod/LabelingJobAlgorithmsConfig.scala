package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobAlgorithmsConfig extends StObject {
  
  /**
    * At the end of an auto-label job Ground Truth sends the Amazon Resource Name (ARN) of the final model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by providing the ARN of the model here. 
    */
  var InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the following ARNs:    Image classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/image-classification     Text classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/text-classification     Object detection   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/object-detection     Semantic Segmentation   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/semantic-segmentation   
    */
  var LabelingJobAlgorithmSpecificationArn: typings.awsSdk.sagemakerMod.LabelingJobAlgorithmSpecificationArn
  
  /**
    * Provides configuration information for a labeling job.
    */
  var LabelingJobResourceConfig: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobResourceConfig] = js.undefined
}
object LabelingJobAlgorithmsConfig {
  
  @scala.inline
  def apply(LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn): LabelingJobAlgorithmsConfig = {
    val __obj = js.Dynamic.literal(LabelingJobAlgorithmSpecificationArn = LabelingJobAlgorithmSpecificationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobAlgorithmsConfig]
  }
  
  @scala.inline
  implicit class LabelingJobAlgorithmsConfigMutableBuilder[Self <: LabelingJobAlgorithmsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialActiveLearningModelArn(value: ModelArn): Self = StObject.set(x, "InitialActiveLearningModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialActiveLearningModelArnUndefined: Self = StObject.set(x, "InitialActiveLearningModelArn", js.undefined)
    
    @scala.inline
    def setLabelingJobAlgorithmSpecificationArn(value: LabelingJobAlgorithmSpecificationArn): Self = StObject.set(x, "LabelingJobAlgorithmSpecificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobResourceConfig(value: LabelingJobResourceConfig): Self = StObject.set(x, "LabelingJobResourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobResourceConfigUndefined: Self = StObject.set(x, "LabelingJobResourceConfig", js.undefined)
  }
}
