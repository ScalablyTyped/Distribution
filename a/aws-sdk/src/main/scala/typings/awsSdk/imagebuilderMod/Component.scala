package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The change description of the component.
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The data of the component.
    */
  var data: js.UndefOr[ComponentData] = js.undefined
  
  /**
    * The date that the component was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The encryption status of the component.
    */
  var encrypted: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The KMS key identifier used to encrypt the component.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the component.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The owner of the component.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The platform of the component.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The operating system (OS) version supported by the component. If the OS information is available, a prefix match is performed against the parent image OS version during image recipe creation. 
    */
  var supportedOsVersions: js.UndefOr[OsVersionList] = js.undefined
  
  /**
    * The tags associated with the component.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of the component denotes whether the component is used to build the image or only to test it.
    */
  var `type`: js.UndefOr[ComponentType] = js.undefined
  
  /**
    * The version of the component.
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object Component {
  
  inline def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setChangeDescription(value: NonEmptyString): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
    
    inline def setChangeDescriptionUndefined: Self = StObject.set(x, "changeDescription", js.undefined)
    
    inline def setData(value: ComponentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncrypted(value: NullableBoolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSupportedOsVersions(value: OsVersionList): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedOsVersionsUndefined: Self = StObject.set(x, "supportedOsVersions", js.undefined)
    
    inline def setSupportedOsVersionsVarargs(value: OsVersion*): Self = StObject.set(x, "supportedOsVersions", js.Array(value :_*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
