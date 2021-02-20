package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeModelPackageOutput extends StObject {
  
  /**
    * Whether the model package is certified for listing on AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  
  /**
    * A timestamp specifying when the model package was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
  
  /**
    * Details about inference jobs that can be run with models based on this model package.
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsSdk.sagemakerMod.ModelPackageArn = js.native
  
  /**
    * A brief summary of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The name of the model package being described.
    */
  var ModelPackageName: EntityName = js.native
  
  /**
    * The current status of the model package.
    */
  var ModelPackageStatus: typings.awsSdk.sagemakerMod.ModelPackageStatus = js.native
  
  /**
    * Details about the current status of the model package.
    */
  var ModelPackageStatusDetails: typings.awsSdk.sagemakerMod.ModelPackageStatusDetails = js.native
  
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.SourceAlgorithmSpecification] = js.native
  
  /**
    * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.native
}
object DescribeModelPackageOutput {
  
  @scala.inline
  def apply(
    CreationTime: CreationTime,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus,
    ModelPackageStatusDetails: ModelPackageStatusDetails
  ): DescribeModelPackageOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any], ModelPackageStatusDetails = ModelPackageStatusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageOutput]
  }
  
  @scala.inline
  implicit class DescribeModelPackageOutputMutableBuilder[Self <: DescribeModelPackageOutput] (val x: Self) extends AnyVal {
    
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
    def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    @scala.inline
    def setModelPackageName(value: EntityName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageStatus(value: ModelPackageStatus): Self = StObject.set(x, "ModelPackageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageStatusDetails(value: ModelPackageStatusDetails): Self = StObject.set(x, "ModelPackageStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAlgorithmSpecification(value: SourceAlgorithmSpecification): Self = StObject.set(x, "SourceAlgorithmSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAlgorithmSpecificationUndefined: Self = StObject.set(x, "SourceAlgorithmSpecification", js.undefined)
    
    @scala.inline
    def setValidationSpecification(value: ModelPackageValidationSpecification): Self = StObject.set(x, "ValidationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSpecificationUndefined: Self = StObject.set(x, "ValidationSpecification", js.undefined)
  }
}
