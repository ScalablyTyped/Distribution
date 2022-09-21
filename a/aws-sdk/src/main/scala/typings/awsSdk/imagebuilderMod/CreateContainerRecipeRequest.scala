package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerRecipeRequest extends StObject {
  
  /**
    * The client token used to make this request idempotent.
    */
  var clientToken: ClientToken
  
  /**
    * Components for build and test that are included in the container recipe.
    */
  var components: ComponentConfigurationList
  
  /**
    * The type of container to create.
    */
  var containerType: ContainerType
  
  /**
    * The description of the container recipe.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Dockerfile template used to build your image as an inline data blob.
    */
  var dockerfileTemplateData: js.UndefOr[InlineDockerFileTemplate] = js.undefined
  
  /**
    * The Amazon S3 URI for the Dockerfile that will be used to build your container image.
    */
  var dockerfileTemplateUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * Specifies the operating system version for the base image.
    */
  var imageOsVersionOverride: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A group of options that can be used to configure an instance for building and testing container images.
    */
  var instanceConfiguration: js.UndefOr[InstanceConfiguration] = js.undefined
  
  /**
    * Identifies which KMS key is used to encrypt the container image.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the container recipe.
    */
  var name: ResourceName
  
  /**
    * The base image for the container recipe.
    */
  var parentImage: NonEmptyString
  
  /**
    * Specifies the operating system platform when you use a custom base image.
    */
  var platformOverride: js.UndefOr[Platform] = js.undefined
  
  /**
    * The semantic version of the container recipe. This version follows the semantic version syntax.  The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign values for the first three, and can filter on all of them.  Assignment: For the first three nodes you can assign any positive integer value, including zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the fourth node.  Patterns: You can use any numeric pattern that adheres to the assignment requirements for the nodes that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as 2021.01.01. 
    */
  var semanticVersion: VersionNumber
  
  /**
    * Tags that are attached to the container recipe.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The destination repository for the container image.
    */
  var targetRepository: TargetContainerRepository
  
  /**
    * The working directory for use during build and test workflows.
    */
  var workingDirectory: js.UndefOr[NonEmptyString] = js.undefined
}
object CreateContainerRecipeRequest {
  
  inline def apply(
    clientToken: ClientToken,
    components: ComponentConfigurationList,
    containerType: ContainerType,
    name: ResourceName,
    parentImage: NonEmptyString,
    semanticVersion: VersionNumber,
    targetRepository: TargetContainerRepository
  ): CreateContainerRecipeRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], containerType = containerType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentImage = parentImage.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any], targetRepository = targetRepository.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerRecipeRequest]
  }
  
  extension [Self <: CreateContainerRecipeRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: ComponentConfigurationList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: ComponentConfiguration*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setContainerType(value: ContainerType): Self = StObject.set(x, "containerType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDockerfileTemplateData(value: InlineDockerFileTemplate): Self = StObject.set(x, "dockerfileTemplateData", value.asInstanceOf[js.Any])
    
    inline def setDockerfileTemplateDataUndefined: Self = StObject.set(x, "dockerfileTemplateData", js.undefined)
    
    inline def setDockerfileTemplateUri(value: Uri): Self = StObject.set(x, "dockerfileTemplateUri", value.asInstanceOf[js.Any])
    
    inline def setDockerfileTemplateUriUndefined: Self = StObject.set(x, "dockerfileTemplateUri", js.undefined)
    
    inline def setImageOsVersionOverride(value: NonEmptyString): Self = StObject.set(x, "imageOsVersionOverride", value.asInstanceOf[js.Any])
    
    inline def setImageOsVersionOverrideUndefined: Self = StObject.set(x, "imageOsVersionOverride", js.undefined)
    
    inline def setInstanceConfiguration(value: InstanceConfiguration): Self = StObject.set(x, "instanceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigurationUndefined: Self = StObject.set(x, "instanceConfiguration", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentImage(value: NonEmptyString): Self = StObject.set(x, "parentImage", value.asInstanceOf[js.Any])
    
    inline def setPlatformOverride(value: Platform): Self = StObject.set(x, "platformOverride", value.asInstanceOf[js.Any])
    
    inline def setPlatformOverrideUndefined: Self = StObject.set(x, "platformOverride", js.undefined)
    
    inline def setSemanticVersion(value: VersionNumber): Self = StObject.set(x, "semanticVersion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargetRepository(value: TargetContainerRepository): Self = StObject.set(x, "targetRepository", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectory(value: NonEmptyString): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
