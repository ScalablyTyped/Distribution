package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRecipe extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The block device mappings to apply when creating images from this recipe.
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.undefined
  
  /**
    * The components of the image recipe.
    */
  var components: js.UndefOr[ComponentConfigurationList] = js.undefined
  
  /**
    * The date on which this image recipe was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the image recipe.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the image recipe.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The owner of the image recipe.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The parent image of the image recipe.
    */
  var parentImage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The platform of the image recipe.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The tags of the image recipe.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The version of the image recipe.
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  /**
    * The working directory to be used during build and test workflows.
    */
  var workingDirectory: js.UndefOr[NonEmptyString] = js.undefined
}
object ImageRecipe {
  
  @scala.inline
  def apply(): ImageRecipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageRecipe]
  }
  
  @scala.inline
  implicit class ImageRecipeMutableBuilder[Self <: ImageRecipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappings(value: InstanceBlockDeviceMappings): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "blockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setComponents(value: ComponentConfigurationList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setComponentsVarargs(value: ComponentConfiguration*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setParentImage(value: NonEmptyString): Self = StObject.set(x, "parentImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentImageUndefined: Self = StObject.set(x, "parentImage", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWorkingDirectory(value: NonEmptyString): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
