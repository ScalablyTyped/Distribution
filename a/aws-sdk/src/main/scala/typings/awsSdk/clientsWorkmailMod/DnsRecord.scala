package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRecord extends StObject {
  
  /**
    * The DNS hostname.- For example, domain.example.com.
    */
  var Hostname: js.UndefOr[String] = js.undefined
  
  /**
    * The RFC 1035 record type. Possible values: CNAME, A, MX.
    */
  var Type: js.UndefOr[String] = js.undefined
  
  /**
    * The value returned by the DNS for a query to that hostname and record type.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object DnsRecord {
  
  inline def apply(): DnsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRecord]
  }
  
  extension [Self <: DnsRecord](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
