package typings.ddTrace

import typings.ddTrace.ddTraceNumbers.`-1`
import typings.ddTrace.ddTraceNumbers.`0`
import typings.ddTrace.ddTraceNumbers.`1`
import typings.ddTrace.ddTraceNumbers.`2`
import typings.ddTrace.ddTraceStrings._dd1DotsrDoteausr
import typings.ddTrace.ddTraceStrings._ddDotmeasured
import typings.ddTrace.ddTraceStrings.agent
import typings.ddTrace.ddTraceStrings.client
import typings.ddTrace.ddTraceStrings.consumer
import typings.ddTrace.ddTraceStrings.datadog
import typings.ddTrace.ddTraceStrings.error
import typings.ddTrace.ddTraceStrings.http
import typings.ddTrace.ddTraceStrings.httpDotclient_ip
import typings.ddTrace.ddTraceStrings.httpDotmethod
import typings.ddTrace.ddTraceStrings.httpDotrequestDotheaders
import typings.ddTrace.ddTraceStrings.httpDotresponseDotheaders
import typings.ddTrace.ddTraceStrings.httpDotroute
import typings.ddTrace.ddTraceStrings.httpDotstatus_code
import typings.ddTrace.ddTraceStrings.httpDoturl
import typings.ddTrace.ddTraceStrings.httpDotuseragent
import typings.ddTrace.ddTraceStrings.log
import typings.ddTrace.ddTraceStrings.manualDotdrop
import typings.ddTrace.ddTraceStrings.manualDotkeep
import typings.ddTrace.ddTraceStrings.producer
import typings.ddTrace.ddTraceStrings.resourceDotname
import typings.ddTrace.ddTraceStrings.samplingDotpriority
import typings.ddTrace.ddTraceStrings.server
import typings.ddTrace.ddTraceStrings.serviceDotname
import typings.ddTrace.ddTraceStrings.spanDotkind
import typings.ddTrace.ddTraceStrings.spanDottype
import typings.ddTrace.ddTraceStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extMod {
  
  object exporters {
    
    @JSImport("dd-trace/ext", "exporters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dd-trace/ext", "exporters.AGENT")
    @js.native
    def AGENT: agent = js.native
    inline def AGENT_=(x: agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AGENT")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "exporters.DATADOG")
    @js.native
    def DATADOG: datadog = js.native
    inline def DATADOG_=(x: datadog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATADOG")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "exporters.LOG")
    @js.native
    def LOG: log = js.native
    inline def LOG_=(x: log): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG")(x.asInstanceOf[js.Any])
  }
  
  object formats {
    
    @JSImport("dd-trace/ext", "formats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dd-trace/ext", "formats.BINARY")
    @js.native
    def BINARY: /* "binary" */ String = js.native
    inline def BINARY_=(x: /* "binary" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BINARY")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "formats.HTTP_HEADERS")
    @js.native
    def HTTP_HEADERS: /* "http_headers" */ String = js.native
    inline def HTTP_HEADERS_=(x: /* "http_headers" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_HEADERS")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "formats.LOG")
    @js.native
    def LOG: log = js.native
    inline def LOG_=(x: log): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "formats.TEXT_MAP")
    @js.native
    def TEXT_MAP: /* "text_map" */ String = js.native
    inline def TEXT_MAP_=(x: /* "text_map" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_MAP")(x.asInstanceOf[js.Any])
  }
  
  object kinds {
    
    @JSImport("dd-trace/ext", "kinds")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dd-trace/ext", "kinds.CLIENT")
    @js.native
    def CLIENT: client = js.native
    inline def CLIENT_=(x: client): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "kinds.CONSUMER")
    @js.native
    def CONSUMER: consumer = js.native
    inline def CONSUMER_=(x: consumer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSUMER")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "kinds.PRODUCER")
    @js.native
    def PRODUCER: producer = js.native
    inline def PRODUCER_=(x: producer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRODUCER")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "kinds.SERVER")
    @js.native
    def SERVER: server = js.native
    inline def SERVER_=(x: server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER")(x.asInstanceOf[js.Any])
  }
  
  object priority {
    
    @JSImport("dd-trace/ext", "priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dd-trace/ext", "priority.AUTO_KEEP")
    @js.native
    def AUTO_KEEP: `1` = js.native
    inline def AUTO_KEEP_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_KEEP")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "priority.AUTO_REJECT")
    @js.native
    def AUTO_REJECT: `0` = js.native
    inline def AUTO_REJECT_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_REJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "priority.USER_KEEP")
    @js.native
    def USER_KEEP: `2` = js.native
    inline def USER_KEEP_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_KEEP")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "priority.USER_REJECT")
    @js.native
    def USER_REJECT: `-1` = js.native
    inline def USER_REJECT_=(x: `-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_REJECT")(x.asInstanceOf[js.Any])
  }
  
  object tags {
    
    @JSImport("dd-trace/ext", "tags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dd-trace/ext", "tags.ANALYTICS")
    @js.native
    def ANALYTICS: _dd1DotsrDoteausr = js.native
    inline def ANALYTICS_=(x: _dd1DotsrDoteausr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANALYTICS")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.ERROR")
    @js.native
    def ERROR: error = js.native
    inline def ERROR_=(x: error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.HTTP_CLIENT_IP")
    @js.native
    def HTTP_CLIENT_IP: httpDotclient_ip = js.native
    inline def HTTP_CLIENT_IP_=(x: httpDotclient_ip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_CLIENT_IP")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.HTTP_METHOD")
    @js.native
    def HTTP_METHOD: httpDotmethod = js.native
    inline def HTTP_METHOD_=(x: httpDotmethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_METHOD")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.HTTP_REQUEST_HEADERS")
    @js.native
    def HTTP_REQUEST_HEADERS: httpDotrequestDotheaders = js.native
    inline def HTTP_REQUEST_HEADERS_=(x: httpDotrequestDotheaders): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_REQUEST_HEADERS")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.HTTP_RESPONSE_HEADERS")
    @js.native
    def HTTP_RESPONSE_HEADERS: httpDotresponseDotheaders = js.native
    inline def HTTP_RESPONSE_HEADERS_=(x: httpDotresponseDotheaders): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_RESPONSE_HEADERS")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.HTTP_ROUTE")
    @js.native
    def HTTP_ROUTE: httpDotroute = js.native
    inline def HTTP_ROUTE_=(x: httpDotroute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_ROUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.HTTP_STATUS_CODE")
    @js.native
    def HTTP_STATUS_CODE: httpDotstatus_code = js.native
    inline def HTTP_STATUS_CODE_=(x: httpDotstatus_code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_STATUS_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.HTTP_URL")
    @js.native
    def HTTP_URL: httpDoturl = js.native
    inline def HTTP_URL_=(x: httpDoturl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_URL")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.HTTP_USERAGENT")
    @js.native
    def HTTP_USERAGENT: httpDotuseragent = js.native
    inline def HTTP_USERAGENT_=(x: httpDotuseragent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_USERAGENT")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.MANUAL_DROP")
    @js.native
    def MANUAL_DROP: manualDotdrop = js.native
    inline def MANUAL_DROP_=(x: manualDotdrop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANUAL_DROP")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.MANUAL_KEEP")
    @js.native
    def MANUAL_KEEP: manualDotkeep = js.native
    inline def MANUAL_KEEP_=(x: manualDotkeep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANUAL_KEEP")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.MEASURED")
    @js.native
    def MEASURED: _ddDotmeasured = js.native
    inline def MEASURED_=(x: _ddDotmeasured): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEASURED")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.RESOURCE_NAME")
    @js.native
    def RESOURCE_NAME: resourceDotname = js.native
    inline def RESOURCE_NAME_=(x: resourceDotname): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESOURCE_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.SAMPLING_PRIORITY")
    @js.native
    def SAMPLING_PRIORITY: samplingDotpriority = js.native
    inline def SAMPLING_PRIORITY_=(x: samplingDotpriority): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAMPLING_PRIORITY")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.SERVICE_NAME")
    @js.native
    def SERVICE_NAME: serviceDotname = js.native
    inline def SERVICE_NAME_=(x: serviceDotname): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVICE_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.SPAN_KIND")
    @js.native
    def SPAN_KIND: spanDotkind = js.native
    inline def SPAN_KIND_=(x: spanDotkind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPAN_KIND")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "tags.SPAN_TYPE")
    @js.native
    def SPAN_TYPE: spanDottype = js.native
    inline def SPAN_TYPE_=(x: spanDottype): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPAN_TYPE")(x.asInstanceOf[js.Any])
  }
  
  object types {
    
    @JSImport("dd-trace/ext", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dd-trace/ext", "types.HTTP")
    @js.native
    def HTTP: http = js.native
    inline def HTTP_=(x: http): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP")(x.asInstanceOf[js.Any])
    
    @JSImport("dd-trace/ext", "types.WEB")
    @js.native
    def WEB: web = js.native
    inline def WEB_=(x: web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEB")(x.asInstanceOf[js.Any])
  }
}
