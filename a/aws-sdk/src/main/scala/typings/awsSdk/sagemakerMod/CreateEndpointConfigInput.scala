package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointConfigInput extends js.Object {
  var DataCaptureConfig: js.UndefOr[typings.awsSdk.sagemakerMod.DataCaptureConfig] = js.native
  /**
    * The name of the endpoint configuration. You specify this name in a CreateEndpoint request. 
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName = js.native
  /**
    * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The KmsKeyId can be any of the following formats:    Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias    The KMS key policy must grant permission to the IAM role that you specify in your CreateEndpoint, UpdateEndpoint requests. For more information, refer to the AWS Key Management Service section Using Key Policies in AWS KMS    Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes are encrypted using a hardware module on the instance. You can't request a KmsKeyId when using an instance type with local storage. If any of the models that you specify in the ProductionVariants parameter use nitro-based instances with local storage, do not specify a value for the KmsKeyId parameter. If you specify a value for KmsKeyId when using any nitro-based instances with local storage, the call to CreateEndpointConfig fails. For a list of instance types that support local instance storage, see Instance Store Volumes. For more information about local instance storage encryption, see SSD Instance Store Volumes. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * An list of ProductionVariant objects, one for each model that you want to host at this endpoint.
    */
  var ProductionVariants: ProductionVariantList = js.native
  /**
    * A list of key-value pairs. For more information, see Using Cost Allocation Tags in the  AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateEndpointConfigInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName, ProductionVariants: ProductionVariantList): CreateEndpointConfigInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], ProductionVariants = ProductionVariants.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointConfigInput]
  }
  @scala.inline
  implicit class CreateEndpointConfigInputOps[Self <: CreateEndpointConfigInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

