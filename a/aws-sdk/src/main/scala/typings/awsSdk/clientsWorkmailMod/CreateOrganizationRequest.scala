package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganizationRequest extends StObject {
  
  /**
    * The organization alias.
    */
  var Alias: OrganizationName
  
  /**
    * The idempotency token associated with the request.
    */
  var ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined
  
  /**
    * The AWS Directory Service directory ID.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.DirectoryId] = js.undefined
  
  /**
    * The email domains to associate with the organization.
    */
  var Domains: js.UndefOr[typings.awsSdk.clientsWorkmailMod.Domains] = js.undefined
  
  /**
    * When true, allows organization interoperability between WorkMail and Microsoft Exchange. If true, you must include a AD Connector directory ID in the request.
    */
  var EnableInteroperability: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a customer managed key from AWS KMS.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsWorkmailMod.KmsKeyArn] = js.undefined
}
object CreateOrganizationRequest {
  
  inline def apply(Alias: OrganizationName): CreateOrganizationRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganizationRequest]
  }
  
  extension [Self <: CreateOrganizationRequest](x: Self) {
    
    inline def setAlias(value: OrganizationName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setDomains(value: Domains): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "Domains", js.Array(value*))
    
    inline def setEnableInteroperability(value: Boolean): Self = StObject.set(x, "EnableInteroperability", value.asInstanceOf[js.Any])
    
    inline def setEnableInteroperabilityUndefined: Self = StObject.set(x, "EnableInteroperability", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
