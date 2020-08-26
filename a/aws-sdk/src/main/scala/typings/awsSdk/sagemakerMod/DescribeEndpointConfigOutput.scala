package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointConfigOutput extends js.Object {
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: Timestamp = js.native
  var DataCaptureConfig: js.UndefOr[typings.awsSdk.sagemakerMod.DataCaptureConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typings.awsSdk.sagemakerMod.EndpointConfigArn = js.native
  /**
    * Name of the Amazon SageMaker endpoint configuration.
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName = js.native
  /**
    * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * An array of ProductionVariant objects, one for each model that you want to host at this endpoint.
    */
  var ProductionVariants: ProductionVariantList = js.native
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
  implicit class DescribeEndpointConfigOutputOps[Self <: DescribeEndpointConfigOutput] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointConfigArn(value: EndpointConfigArn): Self = this.set("EndpointConfigArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointConfigName(value: EndpointConfigName): Self = this.set("EndpointConfigName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductionVariantsVarargs(value: ProductionVariant*): Self = this.set("ProductionVariants", js.Array(value :_*))
    @scala.inline
    def setProductionVariants(value: ProductionVariantList): Self = this.set("ProductionVariants", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataCaptureConfig(value: DataCaptureConfig): Self = this.set("DataCaptureConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataCaptureConfig: Self = this.set("DataCaptureConfig", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
  
}

