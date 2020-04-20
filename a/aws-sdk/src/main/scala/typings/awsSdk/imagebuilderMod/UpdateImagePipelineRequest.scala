package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateImagePipelineRequest extends js.Object {
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    * The description of the image pipeline. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute images updated by this image pipeline. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default. 
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that you want to update. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the image recipe that will be used to configure images updated by this image pipeline. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  /**
    * The image test configuration of the image pipeline. 
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images updated by this image pipeline. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
  /**
    * The schedule of the image pipeline. 
    */
  var schedule: js.UndefOr[Schedule] = js.native
  /**
    * The status of the image pipeline. 
    */
  var status: js.UndefOr[PipelineStatus] = js.native
}

object UpdateImagePipelineRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    imagePipelineArn: ImagePipelineArn,
    imageRecipeArn: ImageRecipeArn,
    infrastructureConfigurationArn: InfrastructureConfigurationArn,
    description: NonEmptyString = null,
    distributionConfigurationArn: DistributionConfigurationArn = null,
    enhancedImageMetadataEnabled: js.UndefOr[Boolean] = js.undefined,
    imageTestsConfiguration: ImageTestsConfiguration = null,
    schedule: Schedule = null,
    status: PipelineStatus = null
  ): UpdateImagePipelineRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (distributionConfigurationArn != null) __obj.updateDynamic("distributionConfigurationArn")(distributionConfigurationArn.asInstanceOf[js.Any])
    if (!js.isUndefined(enhancedImageMetadataEnabled)) __obj.updateDynamic("enhancedImageMetadataEnabled")(enhancedImageMetadataEnabled.asInstanceOf[js.Any])
    if (imageTestsConfiguration != null) __obj.updateDynamic("imageTestsConfiguration")(imageTestsConfiguration.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImagePipelineRequest]
  }
}

