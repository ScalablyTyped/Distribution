package typings.bonjour

import org.scalablytyped.runtime.StringDictionary
import typings.bonjour.bonjourStrings.down
import typings.bonjour.bonjourStrings.tcp
import typings.bonjour.bonjourStrings.udp
import typings.bonjour.bonjourStrings.udp4
import typings.bonjour.bonjourStrings.udp6
import typings.bonjour.bonjourStrings.up
import typings.node.Buffer
import typings.node.dgramMod.RemoteInfo
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Bonjour = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Bonjour]
  inline def apply(opts: BonjourOptions): Bonjour = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Bonjour]
  
  @JSImport("bonjour", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BaseService extends StObject {
    
    var fqdn: String
    
    var host: String
    
    var name: String
    
    var port: Double
    
    var protocol: String
    
    var subtypes: js.Array[String]
    
    var txt: StringDictionary[String]
    
    var `type`: String
  }
  object BaseService {
    
    inline def apply(
      fqdn: String,
      host: String,
      name: String,
      port: Double,
      protocol: String,
      subtypes: js.Array[String],
      txt: StringDictionary[String],
      `type`: String
    ): BaseService = {
      val __obj = js.Dynamic.literal(fqdn = fqdn.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], subtypes = subtypes.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseService]
    }
    
    extension [Self <: BaseService](x: Self) {
      
      inline def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      inline def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value :_*))
      
      inline def setTxt(value: StringDictionary[String]): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bonjour extends StObject {
    
    def apply(): Bonjour = js.native
    def apply(opts: BonjourOptions): Bonjour = js.native
    
    def destroy(): Unit = js.native
    
    def find(options: BrowserOptions): Browser = js.native
    def find(options: BrowserOptions, onUp: js.Function1[/* service */ RemoteService, Unit]): Browser = js.native
    
    def findOne(options: BrowserOptions): Browser = js.native
    def findOne(options: BrowserOptions, cb: js.Function1[/* service */ RemoteService, Unit]): Browser = js.native
    
    def publish(options: ServiceOptions): Service = js.native
    
    def unpublishAll(): Unit = js.native
    def unpublishAll(cb: js.Function0[Unit]): Unit = js.native
  }
  
  trait BonjourOptions extends StObject {
    
    var interface: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var loopback: js.UndefOr[Boolean] = js.undefined
    
    var multicast: js.UndefOr[Boolean] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var reuseAddr: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[udp4 | udp6] = js.undefined
  }
  object BonjourOptions {
    
    inline def apply(): BonjourOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BonjourOptions]
    }
    
    extension [Self <: BonjourOptions](x: Self) {
      
      inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      
      inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setLoopback(value: Boolean): Self = StObject.set(x, "loopback", value.asInstanceOf[js.Any])
      
      inline def setLoopbackUndefined: Self = StObject.set(x, "loopback", js.undefined)
      
      inline def setMulticast(value: Boolean): Self = StObject.set(x, "multicast", value.asInstanceOf[js.Any])
      
      inline def setMulticastUndefined: Self = StObject.set(x, "multicast", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReuseAddr(value: Boolean): Self = StObject.set(x, "reuseAddr", value.asInstanceOf[js.Any])
      
      inline def setReuseAddrUndefined: Self = StObject.set(x, "reuseAddr", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setType(value: udp4 | udp6): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * Start a browser
    *
    * The browser listens for services by querying for PTR records of a given
    * type, protocol and domain, e.g. _http._tcp.local.
    *
    * If no type is given, a wild card search is performed.
    *
    * An internal list of online services is kept which starts out empty. When
    * ever a new service is discovered, it's added to the list and an "up" event
    * is emitted with that service. When it's discovered that the service is no
    * longer available, it is removed from the list and a "down" event is emitted
    * with that service.
    */
  @js.native
  trait Browser
    extends StObject
       with EventEmitter {
    
    @JSName("on")
    def on_down(event: down, listener: js.Function1[/* service */ RemoteService, Unit]): this.type = js.native
    @JSName("on")
    def on_up(event: up, listener: js.Function1[/* service */ RemoteService, Unit]): this.type = js.native
    
    @JSName("once")
    def once_down(event: down, listener: js.Function1[/* service */ RemoteService, Unit]): this.type = js.native
    @JSName("once")
    def once_up(event: up, listener: js.Function1[/* service */ RemoteService, Unit]): this.type = js.native
    
    @JSName("removeAllListeners")
    def removeAllListeners_down(event: down): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_up(event: up): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_down(event: down, listener: js.Function1[/* service */ RemoteService, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_up(event: up, listener: js.Function1[/* service */ RemoteService, Unit]): this.type = js.native
    
    var services: js.Array[RemoteService] = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def update(): Unit = js.native
  }
  
  trait BrowserOptions extends StObject {
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var subtypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var txt: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BrowserOptions {
    
    inline def apply(): BrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserOptions]
    }
    
    extension [Self <: BrowserOptions](x: Self) {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      inline def setSubtypesUndefined: Self = StObject.set(x, "subtypes", js.undefined)
      
      inline def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value :_*))
      
      inline def setTxt(value: StringDictionary[String]): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
      
      inline def setTxtUndefined: Self = StObject.set(x, "txt", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RemoteService
    extends StObject
       with BaseService {
    
    var addresses: js.Array[String]
    
    var rawTxt: Buffer
    
    var referer: RemoteInfo
  }
  object RemoteService {
    
    inline def apply(
      addresses: js.Array[String],
      fqdn: String,
      host: String,
      name: String,
      port: Double,
      protocol: String,
      rawTxt: Buffer,
      referer: RemoteInfo,
      subtypes: js.Array[String],
      txt: StringDictionary[String],
      `type`: String
    ): RemoteService = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], fqdn = fqdn.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], rawTxt = rawTxt.asInstanceOf[js.Any], referer = referer.asInstanceOf[js.Any], subtypes = subtypes.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteService]
    }
    
    extension [Self <: RemoteService](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      inline def setRawTxt(value: Buffer): Self = StObject.set(x, "rawTxt", value.asInstanceOf[js.Any])
      
      inline def setReferer(value: RemoteInfo): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Service
    extends StObject
       with BaseService
       with EventEmitter {
    
    var addresses: js.Array[String] = js.native
    
    var published: Boolean = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(cb: js.Function0[Unit]): Unit = js.native
  }
  
  trait ServiceOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var port: Double
    
    var probe: js.UndefOr[Boolean] = js.undefined
    
    var protocol: js.UndefOr[udp | tcp] = js.undefined
    
    var subtypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var txt: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `type`: String
  }
  object ServiceOptions {
    
    inline def apply(name: String, port: Double, `type`: String): ServiceOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceOptions]
    }
    
    extension [Self <: ServiceOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProbe(value: Boolean): Self = StObject.set(x, "probe", value.asInstanceOf[js.Any])
      
      inline def setProbeUndefined: Self = StObject.set(x, "probe", js.undefined)
      
      inline def setProtocol(value: udp | tcp): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      inline def setSubtypesUndefined: Self = StObject.set(x, "subtypes", js.undefined)
      
      inline def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value :_*))
      
      inline def setTxt(value: StringDictionary[String]): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
      
      inline def setTxtUndefined: Self = StObject.set(x, "txt", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
