package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointConfigOutput extends StObject {
  
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: Timestamp
  
  var DataCaptureConfig: js.UndefOr[typings.awsSdk.sagemakerMod.DataCaptureConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typings.awsSdk.sagemakerMod.EndpointConfigArn
  
  /**
    * Name of the Amazon SageMaker endpoint configuration.
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName
  
  /**
    * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * An array of ProductionVariant objects, one for each model that you want to host at this endpoint.
    */
  var ProductionVariants: ProductionVariantList
}
object DescribeEndpointConfigOutput {
  
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName,
    ProductionVariants: ProductionVariantList
  ): DescribeEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], ProductionVariants = ProductionVariants.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointConfigOutput]
  }
  
  @scala.inline
  implicit class DescribeEndpointConfigOutputMutableBuilder[Self <: DescribeEndpointConfigOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCaptureConfig(value: DataCaptureConfig): Self = StObject.set(x, "DataCaptureConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCaptureConfigUndefined: Self = StObject.set(x, "DataCaptureConfig", js.undefined)
    
    @scala.inline
    def setEndpointConfigArn(value: EndpointConfigArn): Self = StObject.set(x, "EndpointConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setProductionVariants(value: ProductionVariantList): Self = StObject.set(x, "ProductionVariants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductionVariantsVarargs(value: ProductionVariant*): Self = StObject.set(x, "ProductionVariants", js.Array(value :_*))
  }
}
