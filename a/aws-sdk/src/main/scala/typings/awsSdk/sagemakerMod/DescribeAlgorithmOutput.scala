package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAlgorithmOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typings.awsSdk.sagemakerMod.AlgorithmArn = js.native
  
  /**
    * A brief summary about the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The name of the algorithm being described.
    */
  var AlgorithmName: EntityName = js.native
  
  /**
    * The current status of the algorithm.
    */
  var AlgorithmStatus: typings.awsSdk.sagemakerMod.AlgorithmStatus = js.native
  
  /**
    * Details about the current status of the algorithm.
    */
  var AlgorithmStatusDetails: typings.awsSdk.sagemakerMod.AlgorithmStatusDetails = js.native
  
  /**
    * Whether the algorithm is certified to be listed in AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  
  /**
    * A timestamp specifying when the algorithm was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
  
  /**
    * Details about inference jobs that the algorithm runs.
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  
  /**
    * The product identifier of the algorithm.
    */
  var ProductId: js.UndefOr[typings.awsSdk.sagemakerMod.ProductId] = js.native
  
  /**
    * Details about training jobs run by this algorithm.
    */
  var TrainingSpecification: typings.awsSdk.sagemakerMod.TrainingSpecification = js.native
  
  /**
    * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
    */
  var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.native
}
object DescribeAlgorithmOutput {
  
  @scala.inline
  def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    AlgorithmStatusDetails: AlgorithmStatusDetails,
    CreationTime: CreationTime,
    TrainingSpecification: TrainingSpecification
  ): DescribeAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], AlgorithmStatusDetails = AlgorithmStatusDetails.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], TrainingSpecification = TrainingSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmOutput]
  }
  
  @scala.inline
  implicit class DescribeAlgorithmOutputMutableBuilder[Self <: DescribeAlgorithmOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: AlgorithmArn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmDescription(value: EntityDescription): Self = StObject.set(x, "AlgorithmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmDescriptionUndefined: Self = StObject.set(x, "AlgorithmDescription", js.undefined)
    
    @scala.inline
    def setAlgorithmName(value: EntityName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmStatus(value: AlgorithmStatus): Self = StObject.set(x, "AlgorithmStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmStatusDetails(value: AlgorithmStatusDetails): Self = StObject.set(x, "AlgorithmStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertifyForMarketplace(value: CertifyForMarketplace): Self = StObject.set(x, "CertifyForMarketplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertifyForMarketplaceUndefined: Self = StObject.set(x, "CertifyForMarketplace", js.undefined)
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceSpecification(value: InferenceSpecification): Self = StObject.set(x, "InferenceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceSpecificationUndefined: Self = StObject.set(x, "InferenceSpecification", js.undefined)
    
    @scala.inline
    def setProductId(value: ProductId): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    @scala.inline
    def setTrainingSpecification(value: TrainingSpecification): Self = StObject.set(x, "TrainingSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSpecification(value: AlgorithmValidationSpecification): Self = StObject.set(x, "ValidationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSpecificationUndefined: Self = StObject.set(x, "ValidationSpecification", js.undefined)
  }
}
