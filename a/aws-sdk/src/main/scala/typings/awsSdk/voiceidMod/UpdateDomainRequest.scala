package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainRequest extends StObject {
  
  /**
    * A brief description of the domain.
    */
  var Description: js.UndefOr[typings.awsSdk.voiceidMod.Description] = js.undefined
  
  /**
    * The identifier of the domain to be updated.
    */
  var DomainId: typings.awsSdk.voiceidMod.DomainId
  
  /**
    * The name of the domain.
    */
  var Name: DomainName
  
  /**
    * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of your data. Changing the domain's associated KMS key immediately triggers an asynchronous process to remove dependency on the old KMS key, such that the domain's data can only be accessed using the new KMS key. The domain's ServerSideEncryptionUpdateDetails contains the details for this process.
    */
  var ServerSideEncryptionConfiguration: typings.awsSdk.voiceidMod.ServerSideEncryptionConfiguration
}
object UpdateDomainRequest {
  
  inline def apply(
    DomainId: DomainId,
    Name: DomainName,
    ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration
  ): UpdateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainRequest]
  }
  
  extension [Self <: UpdateDomainRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setName(value: DomainName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
  }
}
