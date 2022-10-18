package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the domain.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Arn] = js.undefined
  
  /**
    * The timestamp showing when the domain is created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The client-provided description of the domain.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Description] = js.undefined
  
  /**
    * The service-generated identifier for the domain.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * The current status of the domain.
    */
  var DomainStatus: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainStatus] = js.undefined
  
  /**
    * The client-provided name for the domain.
    */
  var Name: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The server-side encryption configuration containing the KMS key identifier you want Voice ID to use to encrypt your data.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsVoiceidMod.ServerSideEncryptionConfiguration] = js.undefined
  
  /**
    * Details about the most recent server-side encryption configuration update. When the server-side encryption configuration is changed, dependency on the old KMS key is removed through an asynchronous process. When this update is complete, the domain's data can only be accessed using the new KMS key.
    */
  var ServerSideEncryptionUpdateDetails: js.UndefOr[typings.awsSdk.clientsVoiceidMod.ServerSideEncryptionUpdateDetails] = js.undefined
  
  /**
    * The timestamp showing the domain's last update.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DomainSummary {
  
  inline def apply(): DomainSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainSummary]
  }
  
  extension [Self <: DomainSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
    
    inline def setName(value: DomainName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
    
    inline def setServerSideEncryptionUpdateDetails(value: ServerSideEncryptionUpdateDetails): Self = StObject.set(x, "ServerSideEncryptionUpdateDetails", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUpdateDetailsUndefined: Self = StObject.set(x, "ServerSideEncryptionUpdateDetails", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
