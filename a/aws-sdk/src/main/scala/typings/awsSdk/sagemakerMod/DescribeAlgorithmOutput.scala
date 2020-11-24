package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAlgorithmOutput extends js.Object {
  
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
  implicit class DescribeAlgorithmOutputOps[Self <: DescribeAlgorithmOutput] (val x: Self) extends AnyVal {
    
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
    def setAlgorithmArn(value: AlgorithmArn): Self = this.set("AlgorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmName(value: EntityName): Self = this.set("AlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmStatus(value: AlgorithmStatus): Self = this.set("AlgorithmStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmStatusDetails(value: AlgorithmStatusDetails): Self = this.set("AlgorithmStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingSpecification(value: TrainingSpecification): Self = this.set("TrainingSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmDescription(value: EntityDescription): Self = this.set("AlgorithmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithmDescription: Self = this.set("AlgorithmDescription", js.undefined)
    
    @scala.inline
    def setCertifyForMarketplace(value: CertifyForMarketplace): Self = this.set("CertifyForMarketplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertifyForMarketplace: Self = this.set("CertifyForMarketplace", js.undefined)
    
    @scala.inline
    def setInferenceSpecification(value: InferenceSpecification): Self = this.set("InferenceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferenceSpecification: Self = this.set("InferenceSpecification", js.undefined)
    
    @scala.inline
    def setProductId(value: ProductId): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    
    @scala.inline
    def setValidationSpecification(value: AlgorithmValidationSpecification): Self = this.set("ValidationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationSpecification: Self = this.set("ValidationSpecification", js.undefined)
  }
}
