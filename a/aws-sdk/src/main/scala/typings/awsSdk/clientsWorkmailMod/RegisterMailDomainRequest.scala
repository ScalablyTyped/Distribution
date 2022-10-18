package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterMailDomainRequest extends StObject {
  
  /**
    * Idempotency token used when retrying requests.
    */
  var ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined
  
  /**
    * The name of the mail domain to create in WorkMail and SES.
    */
  var DomainName: WorkMailDomainName
  
  /**
    * The WorkMail organization under which you're creating the domain.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object RegisterMailDomainRequest {
  
  inline def apply(DomainName: WorkMailDomainName, OrganizationId: OrganizationId): RegisterMailDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterMailDomainRequest]
  }
  
  extension [Self <: RegisterMailDomainRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDomainName(value: WorkMailDomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
