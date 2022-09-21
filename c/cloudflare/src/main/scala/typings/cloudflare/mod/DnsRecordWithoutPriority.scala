package typings.cloudflare.mod

import typings.cloudflare.cloudflareStrings.MX
import typings.cloudflare.cloudflareStrings.SRV
import typings.cloudflare.cloudflareStrings.URI
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRecordWithoutPriority
  extends StObject
     with DnsRecord {
  
  var content: String
  
  var name: String
  
  var proxied: js.UndefOr[Boolean] = js.undefined
  
  var ttl: Double
  
  var `type`: Exclude[RecordTypes, MX | SRV | URI]
}
object DnsRecordWithoutPriority {
  
  inline def apply(content: String, name: String, ttl: Double, `type`: Exclude[RecordTypes, MX | SRV | URI]): DnsRecordWithoutPriority = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsRecordWithoutPriority]
  }
  
  extension [Self <: DnsRecordWithoutPriority](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProxied(value: Boolean): Self = StObject.set(x, "proxied", value.asInstanceOf[js.Any])
    
    inline def setProxiedUndefined: Self = StObject.set(x, "proxied", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setType(value: Exclude[RecordTypes, MX | SRV | URI]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
