package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceNetworkServiceAssociationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the association.
    */
  var arn: js.UndefOr[ServiceNetworkServiceAssociationArn] = js.undefined
  
  /**
    * The date and time that the association was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
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
    * The failure code.
    */
  var failureCode: js.UndefOr[String] = js.undefined
  
  /**
    * The failure message.
    */
  var failureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the service network and service association.
    */
  var id: js.UndefOr[ServiceNetworkServiceAssociationIdentifier] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var serviceArn: js.UndefOr[ServiceArn] = js.undefined
  
  /**
    * The ID of the service.
    */
  var serviceId: js.UndefOr[ServiceId] = js.undefined
  
  /**
    * The name of the service.
    */
  var serviceName: js.UndefOr[ServiceName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service network.
    */
  var serviceNetworkArn: js.UndefOr[ServiceNetworkArn] = js.undefined
  
  /**
    * The ID of the service network.
    */
  var serviceNetworkId: js.UndefOr[ServiceNetworkId] = js.undefined
  
  /**
    * The name of the service network.
    */
  var serviceNetworkName: js.UndefOr[ServiceNetworkName] = js.undefined
  
  /**
    * The status of the association.
    */
  var status: js.UndefOr[ServiceNetworkServiceAssociationStatus] = js.undefined
}
object GetServiceNetworkServiceAssociationResponse {
  
  inline def apply(): GetServiceNetworkServiceAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceNetworkServiceAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceNetworkServiceAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceNetworkServiceAssociationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: AccountId): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCustomDomainName(value: ServiceCustomDomainName): Self = StObject.set(x, "customDomainName", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainNameUndefined: Self = StObject.set(x, "customDomainName", js.undefined)
    
    inline def setDnsEntry(value: DnsEntry): Self = StObject.set(x, "dnsEntry", value.asInstanceOf[js.Any])
    
    inline def setDnsEntryUndefined: Self = StObject.set(x, "dnsEntry", js.undefined)
    
    inline def setFailureCode(value: String): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setId(value: ServiceNetworkServiceAssociationIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setServiceArn(value: ServiceArn): Self = StObject.set(x, "serviceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "serviceArn", js.undefined)
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceNetworkArn(value: ServiceNetworkArn): Self = StObject.set(x, "serviceNetworkArn", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkArnUndefined: Self = StObject.set(x, "serviceNetworkArn", js.undefined)
    
    inline def setServiceNetworkId(value: ServiceNetworkId): Self = StObject.set(x, "serviceNetworkId", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkIdUndefined: Self = StObject.set(x, "serviceNetworkId", js.undefined)
    
    inline def setServiceNetworkName(value: ServiceNetworkName): Self = StObject.set(x, "serviceNetworkName", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkNameUndefined: Self = StObject.set(x, "serviceNetworkName", js.undefined)
    
    inline def setStatus(value: ServiceNetworkServiceAssociationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
