package typings.ddTrace

import typings.ddTrace.ddTraceNumbers.`-1`
import typings.ddTrace.ddTraceNumbers.`0`
import typings.ddTrace.ddTraceNumbers.`1`
import typings.ddTrace.ddTraceNumbers.`2`
import typings.ddTrace.ddTraceStrings._dd1DotsrDoteausr
import typings.ddTrace.ddTraceStrings._ddDotmeasured
import typings.ddTrace.ddTraceStrings.agent
import typings.ddTrace.ddTraceStrings.browser
import typings.ddTrace.ddTraceStrings.client
import typings.ddTrace.ddTraceStrings.consumer
import typings.ddTrace.ddTraceStrings.error
import typings.ddTrace.ddTraceStrings.http
import typings.ddTrace.ddTraceStrings.httpDotmethod
import typings.ddTrace.ddTraceStrings.httpDotrequestDotheaders
import typings.ddTrace.ddTraceStrings.httpDotresponseDotheaders
import typings.ddTrace.ddTraceStrings.httpDotroute
import typings.ddTrace.ddTraceStrings.httpDotstatus_code
import typings.ddTrace.ddTraceStrings.httpDoturl
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dd-trace/ext", JSImport.Namespace)
@js.native
object extMod extends js.Object {
  
  @js.native
  object exporters extends js.Object {
    
    var AGENT: agent = js.native
    
    var BROWSER: browser = js.native
    
    var LOG: log = js.native
  }
  
  @js.native
  object formats extends js.Object {
    
    var BINARY: /* "binary" */ String = js.native
    
    var HTTP_HEADERS: /* "http_headers" */ String = js.native
    
    var LOG: log = js.native
    
    var TEXT_MAP: /* "text_map" */ String = js.native
  }
  
  @js.native
  object kinds extends js.Object {
    
    var CLIENT: client = js.native
    
    var CONSUMER: consumer = js.native
    
    var PRODUCER: producer = js.native
    
    var SERVER: server = js.native
  }
  
  @js.native
  object priority extends js.Object {
    
    var AUTO_KEEP: `1` = js.native
    
    var AUTO_REJECT: `0` = js.native
    
    var USER_KEEP: `2` = js.native
    
    var USER_REJECT: `-1` = js.native
  }
  
  @js.native
  object tags extends js.Object {
    
    var ANALYTICS: _dd1DotsrDoteausr = js.native
    
    var ERROR: error = js.native
    
    var HTTP_METHOD: httpDotmethod = js.native
    
    var HTTP_REQUEST_HEADERS: httpDotrequestDotheaders = js.native
    
    var HTTP_RESPONSE_HEADERS: httpDotresponseDotheaders = js.native
    
    var HTTP_ROUTE: httpDotroute = js.native
    
    var HTTP_STATUS_CODE: httpDotstatus_code = js.native
    
    var HTTP_URL: httpDoturl = js.native
    
    var MANUAL_DROP: manualDotdrop = js.native
    
    var MANUAL_KEEP: manualDotkeep = js.native
    
    var MEASURED: _ddDotmeasured = js.native
    
    var RESOURCE_NAME: resourceDotname = js.native
    
    var SAMPLING_PRIORITY: samplingDotpriority = js.native
    
    var SERVICE_NAME: serviceDotname = js.native
    
    var SPAN_KIND: spanDotkind = js.native
    
    var SPAN_TYPE: spanDottype = js.native
  }
  
  @js.native
  object types extends js.Object {
    
    var HTTP: http = js.native
    
    var WEB: web = js.native
  }
}
