package typings.bonjourService

import typings.bonjourService.bonjourServiceStrings.A
import typings.bonjourService.bonjourServiceStrings.AAAA
import typings.bonjourService.bonjourServiceStrings.IPv4
import typings.bonjourService.bonjourServiceStrings.IPv6
import typings.bonjourService.bonjourServiceStrings.PTR
import typings.bonjourService.bonjourServiceStrings.SRV
import typings.bonjourService.bonjourServiceStrings.TXT
import typings.bonjourService.bonjourServiceStrings.tcp
import typings.bonjourService.bonjourServiceStrings.udp
import typings.bonjourService.keyValueMod.KeyValue
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("bonjour-service/dist/lib/service", JSImport.Default)
  @js.native
  open class default protected () extends Service {
    def this(config: ServiceConfig) = this()
  }
  
  @JSImport("bonjour-service/dist/lib/service", "Service")
  @js.native
  open class Service protected () extends EventEmitter {
    def this(config: ServiceConfig) = this()
    
    /* private */ var RecordA: Any = js.native
    
    /* private */ var RecordAAAA: Any = js.native
    
    /* private */ var RecordPTR: Any = js.native
    
    /* private */ var RecordSRV: Any = js.native
    
    /* private */ var RecordTXT: Any = js.native
    
    var activated: Boolean = js.native
    
    var addresses: js.UndefOr[js.Array[String]] = js.native
    
    var destroyed: Boolean = js.native
    
    var fqdn: String = js.native
    
    var host: String = js.native
    
    var name: String = js.native
    
    var port: Double = js.native
    
    var probe: Boolean = js.native
    
    var protocol: tcp | udp = js.native
    
    var published: Boolean = js.native
    
    def records(): js.Array[ServiceRecord] = js.native
    
    var referer: js.UndefOr[ServiceReferer] = js.native
    
    var start: js.UndefOr[Any] = js.native
    
    var stop: js.UndefOr[Any] = js.native
    
    var subtypes: js.UndefOr[js.Array[String]] = js.native
    
    var txt: js.UndefOr[Any] = js.native
    
    /* private */ var txtService: Any = js.native
    
    var `type`: String = js.native
  }
  
  trait ServiceConfig extends StObject {
    
    var fqdn: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var port: Double
    
    var probe: js.UndefOr[Boolean] = js.undefined
    
    var protocol: js.UndefOr[tcp | udp] = js.undefined
    
    var subtypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var txt: js.UndefOr[KeyValue] = js.undefined
    
    var `type`: String
  }
  object ServiceConfig {
    
    inline def apply(name: String, port: Double, `type`: String): ServiceConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    extension [Self <: ServiceConfig](x: Self) {
      
      inline def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
      
      inline def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProbe(value: Boolean): Self = StObject.set(x, "probe", value.asInstanceOf[js.Any])
      
      inline def setProbeUndefined: Self = StObject.set(x, "probe", js.undefined)
      
      inline def setProtocol(value: tcp | udp): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      inline def setSubtypesUndefined: Self = StObject.set(x, "subtypes", js.undefined)
      
      inline def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value*))
      
      inline def setTxt(value: KeyValue): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
      
      inline def setTxtUndefined: Self = StObject.set(x, "txt", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceRecord extends StObject {
    
    var data: KeyValue | String | Any
    
    var name: String
    
    var ttl: Double
    
    var `type`: PTR | SRV | TXT | A | AAAA
  }
  object ServiceRecord {
    
    inline def apply(data: KeyValue | String | Any, name: String, ttl: Double, `type`: PTR | SRV | TXT | A | AAAA): ServiceRecord = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceRecord]
    }
    
    extension [Self <: ServiceRecord](x: Self) {
      
      inline def setData(value: KeyValue | String | Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setType(value: PTR | SRV | TXT | A | AAAA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceReferer extends StObject {
    
    var address: String
    
    var family: IPv4 | IPv6
    
    var port: Double
    
    var size: Double
  }
  object ServiceReferer {
    
    inline def apply(address: String, family: IPv4 | IPv6, port: Double, size: Double): ServiceReferer = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceReferer]
    }
    
    extension [Self <: ServiceReferer](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: IPv4 | IPv6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
