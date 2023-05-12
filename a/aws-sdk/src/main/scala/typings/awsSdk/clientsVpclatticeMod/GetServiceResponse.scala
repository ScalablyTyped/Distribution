package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var arn: js.UndefOr[ServiceArn] = js.undefined
  
  /**
    * The type of IAM policy.
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The date and time that the service was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
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
  var failureCode: js.UndefOr[FailureCode] = js.undefined
  
  /**
    * The failure message.
    */
  var failureMessage: js.UndefOr[FailureMessage] = js.undefined
  
  /**
    * The ID of the service.
    */
  var id: js.UndefOr[ServiceId] = js.undefined
  
  /**
    * The date and time that the service was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the service.
    */
  var name: js.UndefOr[ServiceName] = js.undefined
  
  /**
    * The status of the service.
    */
  var status: js.UndefOr[ServiceStatus] = js.undefined
}
object GetServiceResponse {
  
  inline def apply(): GetServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCustomDomainName(value: ServiceCustomDomainName): Self = StObject.set(x, "customDomainName", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainNameUndefined: Self = StObject.set(x, "customDomainName", js.undefined)
    
    inline def setDnsEntry(value: DnsEntry): Self = StObject.set(x, "dnsEntry", value.asInstanceOf[js.Any])
    
    inline def setDnsEntryUndefined: Self = StObject.set(x, "dnsEntry", js.undefined)
    
    inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureMessage(value: FailureMessage): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setId(value: ServiceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: ServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
