package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsEntry extends StObject {
  
  /**
    * The domain name of the service.
    */
  var domainName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the hosted zone.
    */
  var hostedZoneId: js.UndefOr[String] = js.undefined
}
object DnsEntry {
  
  inline def apply(): DnsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsEntry] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
  }
}
