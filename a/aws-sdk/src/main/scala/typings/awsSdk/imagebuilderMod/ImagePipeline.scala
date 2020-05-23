package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePipeline extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image pipeline.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this image pipeline was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The date on which this image pipeline was last run.
    */
  var dateLastRun: js.UndefOr[DateTime] = js.native
  /**
    * The date on which this image pipeline will next be run.
    */
  var dateNextRun: js.UndefOr[DateTime] = js.native
  /**
    * The date on which this image pipeline was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  /**
    * The description of the image pipeline.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
    */
  var distributionConfigurationArn: js.UndefOr[Arn] = js.native
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default. 
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
    */
  var imageRecipeArn: js.UndefOr[Arn] = js.native
  /**
    * The image tests configuration of the image pipeline.
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
    */
  var infrastructureConfigurationArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the image pipeline.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The platform of the image pipeline.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The schedule of the image pipeline.
    */
  var schedule: js.UndefOr[Schedule] = js.native
  /**
    * The status of the image pipeline.
    */
  var status: js.UndefOr[PipelineStatus] = js.native
  /**
    * The tags of this image pipeline.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object ImagePipeline {
  @scala.inline
  def apply(
    arn: ImageBuilderArn = null,
    dateCreated: DateTime = null,
    dateLastRun: DateTime = null,
    dateNextRun: DateTime = null,
    dateUpdated: DateTime = null,
    description: NonEmptyString = null,
    distributionConfigurationArn: Arn = null,
    enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined,
    imageRecipeArn: Arn = null,
    imageTestsConfiguration: ImageTestsConfiguration = null,
    infrastructureConfigurationArn: Arn = null,
    name: ResourceName = null,
    platform: Platform = null,
    schedule: Schedule = null,
    status: PipelineStatus = null,
    tags: TagMap = null
  ): ImagePipeline = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (dateLastRun != null) __obj.updateDynamic("dateLastRun")(dateLastRun.asInstanceOf[js.Any])
    if (dateNextRun != null) __obj.updateDynamic("dateNextRun")(dateNextRun.asInstanceOf[js.Any])
    if (dateUpdated != null) __obj.updateDynamic("dateUpdated")(dateUpdated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (distributionConfigurationArn != null) __obj.updateDynamic("distributionConfigurationArn")(distributionConfigurationArn.asInstanceOf[js.Any])
    if (!js.isUndefined(enhancedImageMetadataEnabled)) __obj.updateDynamic("enhancedImageMetadataEnabled")(enhancedImageMetadataEnabled.get.asInstanceOf[js.Any])
    if (imageRecipeArn != null) __obj.updateDynamic("imageRecipeArn")(imageRecipeArn.asInstanceOf[js.Any])
    if (imageTestsConfiguration != null) __obj.updateDynamic("imageTestsConfiguration")(imageTestsConfiguration.asInstanceOf[js.Any])
    if (infrastructureConfigurationArn != null) __obj.updateDynamic("infrastructureConfigurationArn")(infrastructureConfigurationArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePipeline]
  }
}

