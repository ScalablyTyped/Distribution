package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image.  Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to that object as follows:   Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either left off entirely, or they are specified as wildcards, for example: x.x.x.   Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;   Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.   
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * Indicates the type of build that created this image. The build can be initiated in the following ways:    USER_INITIATED – A manual pipeline build request.    SCHEDULED – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from EventBridge.    IMPORT – A VM import created the image to use as the base image for the recipe.  
    */
  var buildType: js.UndefOr[BuildType] = js.undefined
  
  /**
    * The recipe that is used to create an Image Builder container image.
    */
  var containerRecipe: js.UndefOr[ContainerRecipe] = js.undefined
  
  /**
    * The date on which this image was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The distribution configuration used when creating this image.
    */
  var distributionConfiguration: js.UndefOr[DistributionConfiguration] = js.undefined
  
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default.
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The image recipe used when creating the image.
    */
  var imageRecipe: js.UndefOr[ImageRecipe] = js.undefined
  
  /**
    * The image tests configuration used when creating this image.
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.undefined
  
  /**
    * The infrastructure used when creating this image.
    */
  var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.undefined
  
  /**
    * The name of the image.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019.
    */
  var osVersion: js.UndefOr[OsVersion] = js.undefined
  
  /**
    * The output resources produced when creating this image.
    */
  var outputResources: js.UndefOr[OutputResources] = js.undefined
  
  /**
    * The platform of the image.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that created this image.
    */
  var sourcePipelineArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the image pipeline that created this image.
    */
  var sourcePipelineName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The state of the image.
    */
  var state: js.UndefOr[ImageState] = js.undefined
  
  /**
    * The tags of the image.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Specifies whether this is an AMI or container image.
    */
  var `type`: js.UndefOr[ImageType] = js.undefined
  
  /**
    * The semantic version of the image.  The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign values for the first three, and can filter on all of them.  Assignment: For the first three nodes you can assign any positive integer value, including zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the fourth node.  Patterns: You can use any numeric pattern that adheres to the assignment requirements for the nodes that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as 2021.01.01.  Filtering: With semantic versioning, you have the flexibility to use wildcards (x) to specify the most recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in any node, all nodes to the right of the first wildcard must also be wildcards. 
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBuildType(value: BuildType): Self = StObject.set(x, "buildType", value.asInstanceOf[js.Any])
    
    inline def setBuildTypeUndefined: Self = StObject.set(x, "buildType", js.undefined)
    
    inline def setContainerRecipe(value: ContainerRecipe): Self = StObject.set(x, "containerRecipe", value.asInstanceOf[js.Any])
    
    inline def setContainerRecipeUndefined: Self = StObject.set(x, "containerRecipe", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDistributionConfiguration(value: DistributionConfiguration): Self = StObject.set(x, "distributionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDistributionConfigurationUndefined: Self = StObject.set(x, "distributionConfiguration", js.undefined)
    
    inline def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = StObject.set(x, "enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    
    inline def setEnhancedImageMetadataEnabledUndefined: Self = StObject.set(x, "enhancedImageMetadataEnabled", js.undefined)
    
    inline def setImageRecipe(value: ImageRecipe): Self = StObject.set(x, "imageRecipe", value.asInstanceOf[js.Any])
    
    inline def setImageRecipeUndefined: Self = StObject.set(x, "imageRecipe", js.undefined)
    
    inline def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = StObject.set(x, "imageTestsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageTestsConfigurationUndefined: Self = StObject.set(x, "imageTestsConfiguration", js.undefined)
    
    inline def setInfrastructureConfiguration(value: InfrastructureConfiguration): Self = StObject.set(x, "infrastructureConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureConfigurationUndefined: Self = StObject.set(x, "infrastructureConfiguration", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsVersion(value: OsVersion): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setOutputResources(value: OutputResources): Self = StObject.set(x, "outputResources", value.asInstanceOf[js.Any])
    
    inline def setOutputResourcesUndefined: Self = StObject.set(x, "outputResources", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSourcePipelineArn(value: Arn): Self = StObject.set(x, "sourcePipelineArn", value.asInstanceOf[js.Any])
    
    inline def setSourcePipelineArnUndefined: Self = StObject.set(x, "sourcePipelineArn", js.undefined)
    
    inline def setSourcePipelineName(value: ResourceName): Self = StObject.set(x, "sourcePipelineName", value.asInstanceOf[js.Any])
    
    inline def setSourcePipelineNameUndefined: Self = StObject.set(x, "sourcePipelineName", js.undefined)
    
    inline def setState(value: ImageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
