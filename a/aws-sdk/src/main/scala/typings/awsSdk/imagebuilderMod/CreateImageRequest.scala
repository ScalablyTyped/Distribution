package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs of your pipeline. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default. 
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  /**
    *  The image tests configuration of the image. 
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which your image will be built and tested. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
  /**
    *  The tags of the image. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateImageRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    imageRecipeArn: ImageRecipeArn,
    infrastructureConfigurationArn: InfrastructureConfigurationArn
  ): CreateImageRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRequest]
  }
  @scala.inline
  implicit class CreateImageRequestOps[Self <: CreateImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = this.set("imageRecipeArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = this.set("infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = this.set("distributionConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionConfigurationArn: Self = this.set("distributionConfigurationArn", js.undefined)
    @scala.inline
    def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = this.set("enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedImageMetadataEnabled: Self = this.set("enhancedImageMetadataEnabled", js.undefined)
    @scala.inline
    def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = this.set("imageTestsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTestsConfiguration: Self = this.set("imageTestsConfiguration", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

