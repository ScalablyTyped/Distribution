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
    *  The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested and assessed. 
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
    infrastructureConfigurationArn: InfrastructureConfigurationArn,
    distributionConfigurationArn: DistributionConfigurationArn = null,
    imageTestsConfiguration: ImageTestsConfiguration = null,
    tags: TagMap = null
  ): CreateImageRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    if (distributionConfigurationArn != null) __obj.updateDynamic("distributionConfigurationArn")(distributionConfigurationArn.asInstanceOf[js.Any])
    if (imageTestsConfiguration != null) __obj.updateDynamic("imageTestsConfiguration")(imageTestsConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRequest]
  }
}

