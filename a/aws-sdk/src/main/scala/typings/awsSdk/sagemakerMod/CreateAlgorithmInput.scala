package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAlgorithmInput extends StObject {
  
  /**
    * A description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The name of the algorithm.
    */
  var AlgorithmName: EntityName = js.native
  
  /**
    * Whether to certify the algorithm so that it can be listed in AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  
  /**
    * Specifies details about inference jobs that the algorithm runs, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the algorithm supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the algorithm supports for inference.  
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  
  /**
    * Specifies details about training jobs run by this algorithm, including the following:   The Amazon ECR path of the container and the version digest of the algorithm.   The hyperparameters that the algorithm supports.   The instance types that the algorithm supports for training.   Whether the algorithm supports distributed training.   The metrics that the algorithm emits to Amazon CloudWatch.   Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.   The input channels that the algorithm supports for training data. For example, an algorithm might support train, validation, and test channels.  
    */
  var TrainingSpecification: typings.awsSdk.sagemakerMod.TrainingSpecification = js.native
  
  /**
    * Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the algorithm's training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to test the algorithm's inference code.
    */
  var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.native
}
object CreateAlgorithmInput {
  
  @scala.inline
  def apply(AlgorithmName: EntityName, TrainingSpecification: TrainingSpecification): CreateAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any], TrainingSpecification = TrainingSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlgorithmInput]
  }
  
  @scala.inline
  implicit class CreateAlgorithmInputMutableBuilder[Self <: CreateAlgorithmInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmDescription(value: EntityDescription): Self = StObject.set(x, "AlgorithmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmDescriptionUndefined: Self = StObject.set(x, "AlgorithmDescription", js.undefined)
    
    @scala.inline
    def setAlgorithmName(value: EntityName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertifyForMarketplace(value: CertifyForMarketplace): Self = StObject.set(x, "CertifyForMarketplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertifyForMarketplaceUndefined: Self = StObject.set(x, "CertifyForMarketplace", js.undefined)
    
    @scala.inline
    def setInferenceSpecification(value: InferenceSpecification): Self = StObject.set(x, "InferenceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceSpecificationUndefined: Self = StObject.set(x, "InferenceSpecification", js.undefined)
    
    @scala.inline
    def setTrainingSpecification(value: TrainingSpecification): Self = StObject.set(x, "TrainingSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSpecification(value: AlgorithmValidationSpecification): Self = StObject.set(x, "ValidationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSpecificationUndefined: Self = StObject.set(x, "ValidationSpecification", js.undefined)
  }
}
