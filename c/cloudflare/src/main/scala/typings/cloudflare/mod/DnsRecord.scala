package typings.cloudflare.mod

import typings.cloudflare.anon.Name
import typings.cloudflare.cloudflareStrings.MX
import typings.cloudflare.cloudflareStrings.SRV
import typings.cloudflare.cloudflareStrings.URI
import typings.std.Exclude
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cloudflare.mod.DnsRecordWithPriority
  - typings.cloudflare.mod.DnsRecordWithoutPriority
  - typings.cloudflare.mod.SrvDnsRecord
*/
trait DnsRecord extends StObject
object DnsRecord {
  
  inline def DnsRecordWithPriority(
    content: String,
    name: String,
    priority: Double,
    ttl: Double,
    `type`: Extract[RecordTypes, MX | URI]
  ): typings.cloudflare.mod.DnsRecordWithPriority = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudflare.mod.DnsRecordWithPriority]
  }
  
  inline def DnsRecordWithoutPriority(content: String, name: String, ttl: Double, `type`: Exclude[RecordTypes, MX | SRV | URI]): typings.cloudflare.mod.DnsRecordWithoutPriority = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudflare.mod.DnsRecordWithoutPriority]
  }
  
  inline def SrvDnsRecord(data: Name): typings.cloudflare.mod.SrvDnsRecord = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SRV")
    __obj.asInstanceOf[typings.cloudflare.mod.SrvDnsRecord]
  }
}
