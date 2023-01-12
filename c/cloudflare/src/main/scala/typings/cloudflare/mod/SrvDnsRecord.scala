package typings.cloudflare.mod

import typings.cloudflare.anon.Name
import typings.cloudflare.cloudflareStrings.SRV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SrvDnsRecord
  extends StObject
     with DnsRecord {
  
  var data: Name
  
  var `type`: SRV
}
object SrvDnsRecord {
  
  inline def apply(data: Name): SrvDnsRecord = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SRV")
    __obj.asInstanceOf[SrvDnsRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SrvDnsRecord] (val x: Self) extends AnyVal {
    
    inline def setData(value: Name): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: SRV): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
