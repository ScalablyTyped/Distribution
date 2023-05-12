package typings.centra

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.centra.centraStrings._defaultAgent
import typings.centra.centraStrings.agent
import typings.centra.centraStrings.auth
import typings.centra.centraStrings.buffer
import typings.centra.centraStrings.createConnection
import typings.centra.centraStrings.defaultPort
import typings.centra.centraStrings.family
import typings.centra.centraStrings.form
import typings.centra.centraStrings.headers
import typings.centra.centraStrings.hints
import typings.centra.centraStrings.host
import typings.centra.centraStrings.hostname
import typings.centra.centraStrings.insecureHTTPParser
import typings.centra.centraStrings.joinDuplicateHeaders
import typings.centra.centraStrings.json
import typings.centra.centraStrings.localAddress
import typings.centra.centraStrings.localPort
import typings.centra.centraStrings.lookup
import typings.centra.centraStrings.maxHeaderSize
import typings.centra.centraStrings.method
import typings.centra.centraStrings.path
import typings.centra.centraStrings.port
import typings.centra.centraStrings.protocol
import typings.centra.centraStrings.setHost
import typings.centra.centraStrings.signal
import typings.centra.centraStrings.socketPath
import typings.centra.centraStrings.timeout
import typings.centra.centraStrings.uniqueHeaders
import typings.node.AbortSignal
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.netMod.LookupFunction
import typings.node.nodeColonnetMod.Socket
import typings.node.urlMod.URL_
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("centra", JSImport.Namespace)
  @js.native
  val ^ : CentraFactory = js.native
  
  type CentraFactory = js.Function2[/* url */ URL | String, /* method */ js.UndefOr[String], Request]
  
  @js.native
  trait Request extends StObject {
    
    def body(data: Any): this.type = js.native
    def body(data: Any, sendAs: json | buffer | form): this.type = js.native
    
    def compress(): this.type = js.native
    
    var compressionEnabled: Boolean = js.native
    
    var coreOptions: RequestOptions = js.native
    
    var data: String | Buffer | Null = js.native
    
    def header(headers: StringDictionary[String]): this.type = js.native
    def header(key: String, value: String): this.type = js.native
    
    var method: String = js.native
    
    @JSName("option")
    def option_agent(key: agent): this.type = js.native
    @JSName("option")
    def option_agent(key: agent, value: Boolean): this.type = js.native
    @JSName("option")
    def option_agent(key: agent, value: Agent): this.type = js.native
    @JSName("option")
    def option_auth(key: auth): this.type = js.native
    @JSName("option")
    def option_auth(key: auth, value: String): this.type = js.native
    @JSName("option")
    def option_createConnection(key: createConnection): this.type = js.native
    @JSName("option")
    def option_createConnection(
      key: createConnection,
      value: js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
          Socket
        ]
    ): this.type = js.native
    @JSName("option")
    def option_defaultAgent(key: _defaultAgent): this.type = js.native
    @JSName("option")
    def option_defaultAgent(key: _defaultAgent, value: Agent): this.type = js.native
    @JSName("option")
    def option_defaultPort(key: defaultPort): this.type = js.native
    @JSName("option")
    def option_defaultPort(key: defaultPort, value: String): this.type = js.native
    @JSName("option")
    def option_defaultPort(key: defaultPort, value: Double): this.type = js.native
    @JSName("option")
    def option_family(key: family): this.type = js.native
    @JSName("option")
    def option_family(key: family, value: Double): this.type = js.native
    @JSName("option")
    def option_headers(key: headers): this.type = js.native
    @JSName("option")
    def option_headers(key: headers, value: OutgoingHttpHeaders): this.type = js.native
    @JSName("option")
    def option_hints(key: hints): this.type = js.native
    @JSName("option")
    def option_hints(key: hints, value: js.UndefOr[Double]): this.type = js.native
    @JSName("option")
    def option_host(key: host): this.type = js.native
    @JSName("option")
    def option_host(key: host, value: String): this.type = js.native
    @JSName("option")
    def option_hostname(key: hostname): this.type = js.native
    @JSName("option")
    def option_hostname(key: hostname, value: String): this.type = js.native
    @JSName("option")
    def option_insecureHTTPParser(key: insecureHTTPParser): this.type = js.native
    @JSName("option")
    def option_insecureHTTPParser(key: insecureHTTPParser, value: Boolean): this.type = js.native
    @JSName("option")
    def option_joinDuplicateHeaders(key: joinDuplicateHeaders): this.type = js.native
    @JSName("option")
    def option_joinDuplicateHeaders(key: joinDuplicateHeaders, value: Boolean): this.type = js.native
    @JSName("option")
    def option_localAddress(key: localAddress): this.type = js.native
    @JSName("option")
    def option_localAddress(key: localAddress, value: String): this.type = js.native
    @JSName("option")
    def option_localPort(key: localPort): this.type = js.native
    @JSName("option")
    def option_localPort(key: localPort, value: Double): this.type = js.native
    @JSName("option")
    def option_lookup(key: lookup): this.type = js.native
    @JSName("option")
    def option_lookup(key: lookup, value: LookupFunction): this.type = js.native
    @JSName("option")
    def option_maxHeaderSize(key: maxHeaderSize): this.type = js.native
    @JSName("option")
    def option_maxHeaderSize(key: maxHeaderSize, value: Double): this.type = js.native
    @JSName("option")
    def option_method(key: method): this.type = js.native
    @JSName("option")
    def option_method(key: method, value: String): this.type = js.native
    @JSName("option")
    def option_path(key: path): this.type = js.native
    @JSName("option")
    def option_path(key: path, value: String): this.type = js.native
    @JSName("option")
    def option_port(key: port): this.type = js.native
    @JSName("option")
    def option_port(key: port, value: String): this.type = js.native
    @JSName("option")
    def option_port(key: port, value: Double): this.type = js.native
    @JSName("option")
    def option_protocol(key: protocol): this.type = js.native
    @JSName("option")
    def option_protocol(key: protocol, value: String): this.type = js.native
    @JSName("option")
    def option_setHost(key: setHost): this.type = js.native
    @JSName("option")
    def option_setHost(key: setHost, value: Boolean): this.type = js.native
    @JSName("option")
    def option_signal(key: signal): this.type = js.native
    @JSName("option")
    def option_signal(key: signal, value: AbortSignal): this.type = js.native
    @JSName("option")
    def option_socketPath(key: socketPath): this.type = js.native
    @JSName("option")
    def option_socketPath(key: socketPath, value: String): this.type = js.native
    @JSName("option")
    def option_timeout(key: timeout): this.type = js.native
    @JSName("option")
    def option_timeout(key: timeout, value: Double): this.type = js.native
    @JSName("option")
    def option_uniqueHeaders(key: uniqueHeaders): this.type = js.native
    @JSName("option")
    def option_uniqueHeaders(key: uniqueHeaders, value: js.Array[String | js.Array[String]]): this.type = js.native
    
    def path(relativePath: String): this.type = js.native
    
    def query(key: String, value: Any): this.type = js.native
    def query(params: StringDictionary[Any]): this.type = js.native
    
    var reqHeaders: StringDictionary[String] = js.native
    
    def send(): js.Promise[Response] = js.native
    
    var sendDataAs: form | json | buffer | Null = js.native
    
    def stream(): this.type = js.native
    
    var streamEnabled: Boolean = js.native
    
    def timeout(timeMs: Double): this.type = js.native
    
    var timeoutTime: Double | Null = js.native
    
    var url: URL_ = js.native
  }
  
  trait Response extends StObject {
    
    var body: Buffer
    
    var coreRes: IncomingMessage
    
    var headers: IncomingHttpHeaders
    
    def json(): js.Promise[Any]
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    def text(): js.Promise[String]
  }
  object Response {
    
    inline def apply(
      body: Buffer,
      coreRes: IncomingMessage,
      headers: IncomingHttpHeaders,
      json: () => js.Promise[Any],
      text: () => js.Promise[String]
    ): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], coreRes = coreRes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCoreRes(value: IncomingMessage): Self = StObject.set(x, "coreRes", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  type _To = CentraFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CentraFactory = ^
}
