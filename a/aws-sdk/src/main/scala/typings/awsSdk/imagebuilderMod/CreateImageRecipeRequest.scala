package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageRecipeRequest extends StObject {
  
  /**
    * The block device mappings of the image recipe. 
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.undefined
  
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken
  
  /**
    * The components of the image recipe. 
    */
  var components: ComponentConfigurationList
  
  /**
    *  The description of the image recipe. 
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of the image recipe. 
    */
  var name: ResourceName
  
  /**
    * The parent image of the image recipe. The value of the string can be the ARN of the parent image or an AMI ID. The format for the ARN follows this example: arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/xxxx.x.x. You can provide the specific version that you want to use, or you can use a wildcard in all of the fields. If you enter an AMI ID for the string value, you must have access to the AMI, and the AMI must be in the same Region in which you are using Image Builder. 
    */
  var parentImage: NonEmptyString
  
  /**
    * The semantic version of the image recipe. 
    */
  var semanticVersion: VersionNumber
  
  /**
    *  The tags of the image recipe. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The working directory to be used during build and test workflows.
    */
  var workingDirectory: js.UndefOr[NonEmptyString] = js.undefined
}
object CreateImageRecipeRequest {
  
  inline def apply(
    clientToken: ClientToken,
    components: ComponentConfigurationList,
    name: ResourceName,
    parentImage: NonEmptyString,
    semanticVersion: VersionNumber
  ): CreateImageRecipeRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentImage = parentImage.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRecipeRequest]
  }
  
  extension [Self <: CreateImageRecipeRequest](x: Self) {
    
    inline def setBlockDeviceMappings(value: InstanceBlockDeviceMappings): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "blockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value :_*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: ComponentConfigurationList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: ComponentConfiguration*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentImage(value: NonEmptyString): Self = StObject.set(x, "parentImage", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersion(value: VersionNumber): Self = StObject.set(x, "semanticVersion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkingDirectory(value: NonEmptyString): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
