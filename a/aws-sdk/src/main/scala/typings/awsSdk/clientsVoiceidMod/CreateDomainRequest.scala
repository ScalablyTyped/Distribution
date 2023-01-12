package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainRequest extends StObject {
  
  /**
    * The idempotency token for creating a new domain. If not provided, Amazon Web Services SDK populates this field.
    */
  var ClientToken: js.UndefOr[ClientTokenString] = js.undefined
  
  /**
    * A brief description of the domain.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Description] = js.undefined
  
  /**
    * The name of the domain.
    */
  var Name: DomainName
  
  /**
    * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of your data. Refer to  Amazon Connect Voice ID encryption at rest for more details on how the KMS key is used. 
    */
  var ServerSideEncryptionConfiguration: typings.awsSdk.clientsVoiceidMod.ServerSideEncryptionConfiguration
  
  /**
    * A list of tags you want added to the domain.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDomainRequest {
  
  inline def apply(Name: DomainName, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: DomainName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
