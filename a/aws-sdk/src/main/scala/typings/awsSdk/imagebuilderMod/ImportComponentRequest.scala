package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportComponentRequest extends StObject {
  
  /**
    * The change description of the component. Describes what change has been made in this version, or what makes this version different from other versions of this component. 
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The idempotency token of the component. 
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The data of the component. Used to specify the data inline. Either data or uri can be used to specify the data within the component.
    */
  var data: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The description of the component. Describes the contents of the component. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The format of the resource that you want to import as a component. 
    */
  var format: ComponentFormat = js.native
  
  /**
    * The ID of the KMS key that should be used to encrypt this component. 
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The name of the component. 
    */
  var name: ResourceName = js.native
  
  /**
    * The platform of the component. 
    */
  var platform: Platform = js.native
  
  /**
    * The semantic version of the component. This version follows the semantic version syntax. For example, major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
    */
  var semanticVersion: VersionNumber = js.native
  
  /**
    * The tags of the component. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The type of the component denotes whether the component is used to build the image or only to test it. 
    */
  var `type`: ComponentType = js.native
  
  /**
    * The uri of the component. Must be an S3 URL and the requester must have permission to access the S3 bucket. If you use S3, you can specify component content up to your service quota. Either data or uri can be used to specify the data within the component. 
    */
  var uri: js.UndefOr[Uri] = js.native
}
object ImportComponentRequest {
  
  @scala.inline
  def apply(
    clientToken: ClientToken,
    format: ComponentFormat,
    name: ResourceName,
    platform: Platform,
    semanticVersion: VersionNumber,
    `type`: ComponentType
  ): ImportComponentRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportComponentRequest]
  }
  
  @scala.inline
  implicit class ImportComponentRequestMutableBuilder[Self <: ImportComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeDescription(value: NonEmptyString): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeDescriptionUndefined: Self = StObject.set(x, "changeDescription", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: NonEmptyString): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFormat(value: ComponentFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersion(value: VersionNumber): Self = StObject.set(x, "semanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
