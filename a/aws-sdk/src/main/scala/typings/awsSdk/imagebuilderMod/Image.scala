package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this image was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The distribution configuration used when creating this image.
    */
  var distributionConfiguration: js.UndefOr[DistributionConfiguration] = js.native
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default. 
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * The image recipe used when creating the image.
    */
  var imageRecipe: js.UndefOr[ImageRecipe] = js.native
  /**
    * The image tests configuration used when creating this image.
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    * The infrastructure used when creating this image.
    */
  var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.native
  /**
    * The name of the image.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019. 
    */
  var osVersion: js.UndefOr[OsVersion] = js.native
  /**
    * The output resources produced when creating this image.
    */
  var outputResources: js.UndefOr[OutputResources] = js.native
  /**
    * The platform of the image.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that created this image.
    */
  var sourcePipelineArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the image pipeline that created this image.
    */
  var sourcePipelineName: js.UndefOr[ResourceName] = js.native
  /**
    * The state of the image.
    */
  var state: js.UndefOr[ImageState] = js.native
  /**
    * The tags of the image.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The semantic version of the image.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}

object Image {
  @scala.inline
  def apply(
    arn: ImageBuilderArn = null,
    dateCreated: DateTime = null,
    distributionConfiguration: DistributionConfiguration = null,
    enhancedImageMetadataEnabled: js.UndefOr[Boolean] = js.undefined,
    imageRecipe: ImageRecipe = null,
    imageTestsConfiguration: ImageTestsConfiguration = null,
    infrastructureConfiguration: InfrastructureConfiguration = null,
    name: ResourceName = null,
    osVersion: OsVersion = null,
    outputResources: OutputResources = null,
    platform: Platform = null,
    sourcePipelineArn: Arn = null,
    sourcePipelineName: ResourceName = null,
    state: ImageState = null,
    tags: TagMap = null,
    version: VersionNumber = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (distributionConfiguration != null) __obj.updateDynamic("distributionConfiguration")(distributionConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(enhancedImageMetadataEnabled)) __obj.updateDynamic("enhancedImageMetadataEnabled")(enhancedImageMetadataEnabled.asInstanceOf[js.Any])
    if (imageRecipe != null) __obj.updateDynamic("imageRecipe")(imageRecipe.asInstanceOf[js.Any])
    if (imageTestsConfiguration != null) __obj.updateDynamic("imageTestsConfiguration")(imageTestsConfiguration.asInstanceOf[js.Any])
    if (infrastructureConfiguration != null) __obj.updateDynamic("infrastructureConfiguration")(infrastructureConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion.asInstanceOf[js.Any])
    if (outputResources != null) __obj.updateDynamic("outputResources")(outputResources.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (sourcePipelineArn != null) __obj.updateDynamic("sourcePipelineArn")(sourcePipelineArn.asInstanceOf[js.Any])
    if (sourcePipelineName != null) __obj.updateDynamic("sourcePipelineName")(sourcePipelineName.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

