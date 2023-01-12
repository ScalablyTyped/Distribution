package typings.cloudflare.mod

import typings.cloudflare.cloudflareStrings.MX
import typings.cloudflare.cloudflareStrings.URI
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRecordWithPriority
  extends StObject
     with DnsRecord {
  
  var content: String
  
  var name: String
  
  var priority: Double
  
  var proxied: js.UndefOr[Boolean] = js.undefined
  
  var ttl: Double
  
  var `type`: Extract[RecordTypes, MX | URI]
}
object DnsRecordWithPriority {
  
  inline def apply(
    content: String,
    name: String,
    priority: Double,
    ttl: Double,
    `type`: Extract[RecordTypes, MX | URI]
  ): DnsRecordWithPriority = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsRecordWithPriority]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsRecordWithPriority] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProxied(value: Boolean): Self = StObject.set(x, "proxied", value.asInstanceOf[js.Any])
    
    inline def setProxiedUndefined: Self = StObject.set(x, "proxied", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setType(value: Extract[RecordTypes, MX | URI]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
