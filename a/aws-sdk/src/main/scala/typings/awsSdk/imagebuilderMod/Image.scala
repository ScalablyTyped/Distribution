package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setDistributionConfiguration(value: DistributionConfiguration): Self = this.set("distributionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionConfiguration: Self = this.set("distributionConfiguration", js.undefined)
    
    @scala.inline
    def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = this.set("enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedImageMetadataEnabled: Self = this.set("enhancedImageMetadataEnabled", js.undefined)
    
    @scala.inline
    def setImageRecipe(value: ImageRecipe): Self = this.set("imageRecipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRecipe: Self = this.set("imageRecipe", js.undefined)
    
    @scala.inline
    def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = this.set("imageTestsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTestsConfiguration: Self = this.set("imageTestsConfiguration", js.undefined)
    
    @scala.inline
    def setInfrastructureConfiguration(value: InfrastructureConfiguration): Self = this.set("infrastructureConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfrastructureConfiguration: Self = this.set("infrastructureConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOsVersion(value: OsVersion): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setOutputResources(value: OutputResources): Self = this.set("outputResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputResources: Self = this.set("outputResources", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setSourcePipelineArn(value: Arn): Self = this.set("sourcePipelineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePipelineArn: Self = this.set("sourcePipelineArn", js.undefined)
    
    @scala.inline
    def setSourcePipelineName(value: ResourceName): Self = this.set("sourcePipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePipelineName: Self = this.set("sourcePipelineName", js.undefined)
    
    @scala.inline
    def setState(value: ImageState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionNumber): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
