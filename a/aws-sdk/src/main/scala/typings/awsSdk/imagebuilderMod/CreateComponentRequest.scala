package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentRequest extends StObject {
  
  /**
    * The change description of the component. Describes what change has been made in this version, or what makes this version different from other versions of this component.
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The idempotency token of the component.
    */
  var clientToken: ClientToken
  
  /**
    * The data of the component. Used to specify the data inline. Either data or uri can be used to specify the data within the component.
    */
  var data: js.UndefOr[InlineComponentData] = js.undefined
  
  /**
    * The description of the component. Describes the contents of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the KMS key that should be used to encrypt this component.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the component.
    */
  var name: ResourceName
  
  /**
    * The platform of the component.
    */
  var platform: Platform
  
  /**
    * The semantic version of the component. This version follows the semantic version syntax. For example, major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
    */
  var semanticVersion: VersionNumber
  
  /**
    *  The operating system (OS) version supported by the component. If the OS information is available, a prefix match is performed against the parent image OS version during image recipe creation. 
    */
  var supportedOsVersions: js.UndefOr[OsVersionList] = js.undefined
  
  /**
    * The tags of the component.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The uri of the component. Must be an S3 URL and the requester must have permission to access the S3 bucket. If you use S3, you can specify component content up to your service quota. Either data or uri can be used to specify the data within the component.
    */
  var uri: js.UndefOr[Uri] = js.undefined
}
object CreateComponentRequest {
  
  inline def apply(clientToken: ClientToken, name: ResourceName, platform: Platform, semanticVersion: VersionNumber): CreateComponentRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentRequest]
  }
  
  extension [Self <: CreateComponentRequest](x: Self) {
    
    inline def setChangeDescription(value: NonEmptyString): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
    
    inline def setChangeDescriptionUndefined: Self = StObject.set(x, "changeDescription", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setData(value: InlineComponentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersion(value: VersionNumber): Self = StObject.set(x, "semanticVersion", value.asInstanceOf[js.Any])
    
    inline def setSupportedOsVersions(value: OsVersionList): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedOsVersionsUndefined: Self = StObject.set(x, "supportedOsVersions", js.undefined)
    
    inline def setSupportedOsVersionsVarargs(value: OsVersion*): Self = StObject.set(x, "supportedOsVersions", js.Array(value :_*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
