package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var arn: js.UndefOr[ServiceArn] = js.undefined
  
  /**
    * The date and time that the service was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The custom domain name of the service. 
    */
  var customDomainName: js.UndefOr[ServiceCustomDomainName] = js.undefined
  
  /**
    * DNS information about the service.
    */
  var dnsEntry: js.UndefOr[DnsEntry] = js.undefined
  
  /**
    * The ID of the service.
    */
  var id: js.UndefOr[ServiceId] = js.undefined
  
  /**
    * The date and time that the service was last updated. The format is ISO-8601.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the service.
    */
  var name: js.UndefOr[ServiceName] = js.undefined
  
  /**
    * The status.
    */
  var status: js.UndefOr[ServiceStatus] = js.undefined
}
object ServiceSummary {
  
  inline def apply(): ServiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCustomDomainName(value: ServiceCustomDomainName): Self = StObject.set(x, "customDomainName", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainNameUndefined: Self = StObject.set(x, "customDomainName", js.undefined)
    
    inline def setDnsEntry(value: DnsEntry): Self = StObject.set(x, "dnsEntry", value.asInstanceOf[js.Any])
    
    inline def setDnsEntryUndefined: Self = StObject.set(x, "dnsEntry", js.undefined)
    
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
