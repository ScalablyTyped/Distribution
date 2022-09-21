package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsConfigChange extends StObject {
  
  /**
    * An array that contains one DnsRecord object for each Route 53 record that you want Cloud Map to create when you register an instance.
    */
  var DnsRecords: DnsRecordList
}
object DnsConfigChange {
  
  inline def apply(DnsRecords: DnsRecordList): DnsConfigChange = {
    val __obj = js.Dynamic.literal(DnsRecords = DnsRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsConfigChange]
  }
  
  extension [Self <: DnsConfigChange](x: Self) {
    
    inline def setDnsRecords(value: DnsRecordList): Self = StObject.set(x, "DnsRecords", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordsVarargs(value: DnsRecord*): Self = StObject.set(x, "DnsRecords", js.Array(value*))
  }
}
