package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsConfigChange extends StObject {
  
  /**
    * An array that contains one DnsRecord object for each Route 53 record that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsRecords: DnsRecordList = js.native
}
object DnsConfigChange {
  
  @scala.inline
  def apply(DnsRecords: DnsRecordList): DnsConfigChange = {
    val __obj = js.Dynamic.literal(DnsRecords = DnsRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsConfigChange]
  }
  
  @scala.inline
  implicit class DnsConfigChangeMutableBuilder[Self <: DnsConfigChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsRecords(value: DnsRecordList): Self = StObject.set(x, "DnsRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsRecordsVarargs(value: DnsRecord*): Self = StObject.set(x, "DnsRecords", js.Array(value :_*))
  }
}
