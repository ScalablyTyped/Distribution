package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlgorithmOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typings.awsSdk.sagemakerMod.AlgorithmArn
  
  /**
    * A brief summary about the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the algorithm being described.
    */
  var AlgorithmName: EntityName
  
  /**
    * The current status of the algorithm.
    */
  var AlgorithmStatus: typings.awsSdk.sagemakerMod.AlgorithmStatus
  
  /**
    * Details about the current status of the algorithm.
    */
  var AlgorithmStatusDetails: typings.awsSdk.sagemakerMod.AlgorithmStatusDetails
  
  /**
    * Whether the algorithm is certified to be listed in Amazon Web Services Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.sagemakerMod.CertifyForMarketplace] = js.undefined
  
  /**
    * A timestamp specifying when the algorithm was created.
    */
  var CreationTime: js.Date
  
  /**
    * Details about inference jobs that the algorithm runs.
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.InferenceSpecification] = js.undefined
  
  /**
    * The product identifier of the algorithm.
    */
  var ProductId: js.UndefOr[typings.awsSdk.sagemakerMod.ProductId] = js.undefined
  
  /**
    * Details about training jobs run by this algorithm.
    */
  var TrainingSpecification: typings.awsSdk.sagemakerMod.TrainingSpecification
  
  /**
    * Details about configurations for one or more training jobs that SageMaker runs to test the algorithm.
    */
  var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined
}
object DescribeAlgorithmOutput {
  
  inline def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    AlgorithmStatusDetails: AlgorithmStatusDetails,
    CreationTime: js.Date,
    TrainingSpecification: TrainingSpecification
  ): DescribeAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], AlgorithmStatusDetails = AlgorithmStatusDetails.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], TrainingSpecification = TrainingSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmOutput]
  }
  
  extension [Self <: DescribeAlgorithmOutput](x: Self) {
    
    inline def setAlgorithmArn(value: AlgorithmArn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmDescription(value: EntityDescription): Self = StObject.set(x, "AlgorithmDescription", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmDescriptionUndefined: Self = StObject.set(x, "AlgorithmDescription", js.undefined)
    
    inline def setAlgorithmName(value: EntityName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmStatus(value: AlgorithmStatus): Self = StObject.set(x, "AlgorithmStatus", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmStatusDetails(value: AlgorithmStatusDetails): Self = StObject.set(x, "AlgorithmStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setCertifyForMarketplace(value: CertifyForMarketplace): Self = StObject.set(x, "CertifyForMarketplace", value.asInstanceOf[js.Any])
    
    inline def setCertifyForMarketplaceUndefined: Self = StObject.set(x, "CertifyForMarketplace", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setInferenceSpecification(value: InferenceSpecification): Self = StObject.set(x, "InferenceSpecification", value.asInstanceOf[js.Any])
    
    inline def setInferenceSpecificationUndefined: Self = StObject.set(x, "InferenceSpecification", js.undefined)
    
    inline def setProductId(value: ProductId): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    inline def setTrainingSpecification(value: TrainingSpecification): Self = StObject.set(x, "TrainingSpecification", value.asInstanceOf[js.Any])
    
    inline def setValidationSpecification(value: AlgorithmValidationSpecification): Self = StObject.set(x, "ValidationSpecification", value.asInstanceOf[js.Any])
    
    inline def setValidationSpecificationUndefined: Self = StObject.set(x, "ValidationSpecification", js.undefined)
  }
}
