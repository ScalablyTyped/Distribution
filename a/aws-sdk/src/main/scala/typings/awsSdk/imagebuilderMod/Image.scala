package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
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
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    @scala.inline
    def setDistributionConfiguration(value: DistributionConfiguration): Self = StObject.set(x, "distributionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionConfigurationUndefined: Self = StObject.set(x, "distributionConfiguration", js.undefined)
    
    @scala.inline
    def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = StObject.set(x, "enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedImageMetadataEnabledUndefined: Self = StObject.set(x, "enhancedImageMetadataEnabled", js.undefined)
    
    @scala.inline
    def setImageRecipe(value: ImageRecipe): Self = StObject.set(x, "imageRecipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRecipeUndefined: Self = StObject.set(x, "imageRecipe", js.undefined)
    
    @scala.inline
    def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = StObject.set(x, "imageTestsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTestsConfigurationUndefined: Self = StObject.set(x, "imageTestsConfiguration", js.undefined)
    
    @scala.inline
    def setInfrastructureConfiguration(value: InfrastructureConfiguration): Self = StObject.set(x, "infrastructureConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureConfigurationUndefined: Self = StObject.set(x, "infrastructureConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOsVersion(value: OsVersion): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setOutputResources(value: OutputResources): Self = StObject.set(x, "outputResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputResourcesUndefined: Self = StObject.set(x, "outputResources", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setSourcePipelineArn(value: Arn): Self = StObject.set(x, "sourcePipelineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePipelineArnUndefined: Self = StObject.set(x, "sourcePipelineArn", js.undefined)
    
    @scala.inline
    def setSourcePipelineName(value: ResourceName): Self = StObject.set(x, "sourcePipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePipelineNameUndefined: Self = StObject.set(x, "sourcePipelineName", js.undefined)
    
    @scala.inline
    def setState(value: ImageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
