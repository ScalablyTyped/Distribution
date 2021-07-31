package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsEntry extends StObject {
  
  /**
    * The DNS name.
    */
  var DnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the private hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.undefined
}
object DnsEntry {
  
  @scala.inline
  def apply(): DnsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsEntry]
  }
  
  @scala.inline
  implicit class DnsEntryMutableBuilder[Self <: DnsEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsName(value: String): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: String): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
  }
}
