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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bonjour", JSImport.Namespace)
  @js.native
  def apply(): Bonjour = js.native
  @JSImport("bonjour", JSImport.Namespace)
  @js.native
  def apply(opts: BonjourOptions): Bonjour = js.native
  
  @js.native
  trait BaseService extends StObject {
    
    var fqdn: String = js.native
    
    var host: String = js.native
    
    var name: String = js.native
    
    var port: Double = js.native
    
    var protocol: String = js.native
    
    var subtypes: js.Array[String] = js.native
    
    var txt: StringDictionary[String] = js.native
    
    var `type`: String = js.native
  }
  object BaseService {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BaseServiceMutableBuilder[Self <: BaseService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value :_*))
      
      @scala.inline
      def setTxt(value: StringDictionary[String]): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait BonjourOptions extends StObject {
    
    var interface: js.UndefOr[String] = js.native
    
    var ip: js.UndefOr[String] = js.native
    
    var loopback: js.UndefOr[Boolean] = js.native
    
    var multicast: js.UndefOr[Boolean] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var reuseAddr: js.UndefOr[Boolean] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[udp4 | udp6] = js.native
  }
  object BonjourOptions {
    
    @scala.inline
    def apply(): BonjourOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BonjourOptions]
    }
    
    @scala.inline
    implicit class BonjourOptionsMutableBuilder[Self <: BonjourOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setLoopback(value: Boolean): Self = StObject.set(x, "loopback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopbackUndefined: Self = StObject.set(x, "loopback", js.undefined)
      
      @scala.inline
      def setMulticast(value: Boolean): Self = StObject.set(x, "multicast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticastUndefined: Self = StObject.set(x, "multicast", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReuseAddr(value: Boolean): Self = StObject.set(x, "reuseAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReuseAddrUndefined: Self = StObject.set(x, "reuseAddr", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setType(value: udp4 | udp6): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
  trait Browser extends EventEmitter {
    
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
  
  @js.native
  trait BrowserOptions extends StObject {
    
    var protocol: js.UndefOr[String] = js.native
    
    var subtypes: js.UndefOr[js.Array[String]] = js.native
    
    var txt: js.UndefOr[StringDictionary[String]] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object BrowserOptions {
    
    @scala.inline
    def apply(): BrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserOptions]
    }
    
    @scala.inline
    implicit class BrowserOptionsMutableBuilder[Self <: BrowserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtypesUndefined: Self = StObject.set(x, "subtypes", js.undefined)
      
      @scala.inline
      def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value :_*))
      
      @scala.inline
      def setTxt(value: StringDictionary[String]): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxtUndefined: Self = StObject.set(x, "txt", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RemoteService extends BaseService {
    
    var addresses: js.Array[String] = js.native
    
    var rawTxt: Buffer = js.native
    
    var referer: RemoteInfo = js.native
  }
  object RemoteService {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RemoteServiceMutableBuilder[Self <: RemoteService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setRawTxt(value: Buffer): Self = StObject.set(x, "rawTxt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferer(value: RemoteInfo): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Service
    extends BaseService
       with EventEmitter {
    
    var addresses: js.Array[String] = js.native
    
    var published: Boolean = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(cb: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait ServiceOptions extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var port: Double = js.native
    
    var probe: js.UndefOr[Boolean] = js.native
    
    var protocol: js.UndefOr[udp | tcp] = js.native
    
    var subtypes: js.UndefOr[js.Array[String]] = js.native
    
    var txt: js.UndefOr[StringDictionary[String]] = js.native
    
    var `type`: String = js.native
  }
  object ServiceOptions {
    
    @scala.inline
    def apply(name: String, port: Double, `type`: String): ServiceOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceOptions]
    }
    
    @scala.inline
    implicit class ServiceOptionsMutableBuilder[Self <: ServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProbe(value: Boolean): Self = StObject.set(x, "probe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProbeUndefined: Self = StObject.set(x, "probe", js.undefined)
      
      @scala.inline
      def setProtocol(value: udp | tcp): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtypesUndefined: Self = StObject.set(x, "subtypes", js.undefined)
      
      @scala.inline
      def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value :_*))
      
      @scala.inline
      def setTxt(value: StringDictionary[String]): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxtUndefined: Self = StObject.set(x, "txt", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
