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
  def apply(): ImagePipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePipeline]
  }
  @scala.inline
  implicit class ImagePipelineOps[Self <: ImagePipeline] (val x: Self) extends AnyVal {
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
    def setArn(value: ImageBuilderArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDateCreated(value: DateTime): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCreated: Self = this.set("dateCreated", js.undefined)
    @scala.inline
    def setDateLastRun(value: DateTime): Self = this.set("dateLastRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateLastRun: Self = this.set("dateLastRun", js.undefined)
    @scala.inline
    def setDateNextRun(value: DateTime): Self = this.set("dateNextRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateNextRun: Self = this.set("dateNextRun", js.undefined)
    @scala.inline
    def setDateUpdated(value: DateTime): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateUpdated: Self = this.set("dateUpdated", js.undefined)
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDistributionConfigurationArn(value: Arn): Self = this.set("distributionConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionConfigurationArn: Self = this.set("distributionConfigurationArn", js.undefined)
    @scala.inline
    def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = this.set("enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedImageMetadataEnabled: Self = this.set("enhancedImageMetadataEnabled", js.undefined)
    @scala.inline
    def setImageRecipeArn(value: Arn): Self = this.set("imageRecipeArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageRecipeArn: Self = this.set("imageRecipeArn", js.undefined)
    @scala.inline
    def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = this.set("imageTestsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTestsConfiguration: Self = this.set("imageTestsConfiguration", js.undefined)
    @scala.inline
    def setInfrastructureConfigurationArn(value: Arn): Self = this.set("infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfrastructureConfigurationArn: Self = this.set("infrastructureConfigurationArn", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setStatus(value: PipelineStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

