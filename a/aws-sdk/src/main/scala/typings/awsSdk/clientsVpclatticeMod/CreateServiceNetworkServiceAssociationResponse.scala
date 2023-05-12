package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceNetworkServiceAssociationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the association.
    */
  var arn: js.UndefOr[ServiceNetworkServiceAssociationArn] = js.undefined
  
  /**
    * The account that created the association.
    */
  var createdBy: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The custom domain name of the service.
    */
  var customDomainName: js.UndefOr[ServiceCustomDomainName] = js.undefined
  
  /**
    * The DNS name of the service.
    */
  var dnsEntry: js.UndefOr[DnsEntry] = js.undefined
  
  /**
    * The ID of the association.
    */
  var id: js.UndefOr[ServiceNetworkServiceAssociationIdentifier] = js.undefined
  
  /**
    * The operation's status.
    */
  var status: js.UndefOr[ServiceNetworkServiceAssociationStatus] = js.undefined
}
object CreateServiceNetworkServiceAssociationResponse {
  
  inline def apply(): CreateServiceNetworkServiceAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceNetworkServiceAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceNetworkServiceAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceNetworkServiceAssociationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedBy(value: AccountId): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCustomDomainName(value: ServiceCustomDomainName): Self = StObject.set(x, "customDomainName", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainNameUndefined: Self = StObject.set(x, "customDomainName", js.undefined)
    
    inline def setDnsEntry(value: DnsEntry): Self = StObject.set(x, "dnsEntry", value.asInstanceOf[js.Any])
    
    inline def setDnsEntryUndefined: Self = StObject.set(x, "dnsEntry", js.undefined)
    
    inline def setId(value: ServiceNetworkServiceAssociationIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(value: ServiceNetworkServiceAssociationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
