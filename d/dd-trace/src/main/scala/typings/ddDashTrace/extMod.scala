package typings.ddDashTrace

import typings.ddDashTrace.ddDashTraceNumbers.`-1`
import typings.ddDashTrace.ddDashTraceNumbers.`0`
import typings.ddDashTrace.ddDashTraceNumbers.`1`
import typings.ddDashTrace.ddDashTraceNumbers.`2`
import typings.ddDashTrace.ddDashTraceStrings._dd1DotsrDoteausr
import typings.ddDashTrace.ddDashTraceStrings.`agent-exporter`
import typings.ddDashTrace.ddDashTraceStrings.`log-exporter`
import typings.ddDashTrace.ddDashTraceStrings.binary
import typings.ddDashTrace.ddDashTraceStrings.client
import typings.ddDashTrace.ddDashTraceStrings.consumer
import typings.ddDashTrace.ddDashTraceStrings.error
import typings.ddDashTrace.ddDashTraceStrings.http
import typings.ddDashTrace.ddDashTraceStrings.httpDotmethod
import typings.ddDashTrace.ddDashTraceStrings.httpDotrequestDotheaders
import typings.ddDashTrace.ddDashTraceStrings.httpDotresponseDotheaders
import typings.ddDashTrace.ddDashTraceStrings.httpDotroute
import typings.ddDashTrace.ddDashTraceStrings.httpDotstatus_code
import typings.ddDashTrace.ddDashTraceStrings.httpDoturl
import typings.ddDashTrace.ddDashTraceStrings.http_headers
import typings.ddDashTrace.ddDashTraceStrings.log
import typings.ddDashTrace.ddDashTraceStrings.manualDotdrop
import typings.ddDashTrace.ddDashTraceStrings.manualDotkeep
import typings.ddDashTrace.ddDashTraceStrings.producer
import typings.ddDashTrace.ddDashTraceStrings.resourceDotname
import typings.ddDashTrace.ddDashTraceStrings.samplingDotpriority
import typings.ddDashTrace.ddDashTraceStrings.server
import typings.ddDashTrace.ddDashTraceStrings.serviceDotname
import typings.ddDashTrace.ddDashTraceStrings.spanDotkind
import typings.ddDashTrace.ddDashTraceStrings.spanDottype
import typings.ddDashTrace.ddDashTraceStrings.text_map
import typings.ddDashTrace.ddDashTraceStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dd-trace/ext", JSImport.Namespace)
@js.native
object extMod extends js.Object {
  @js.native
  object exporters extends js.Object {
    var AGENT: `agent-exporter` = js.native
    var LOG: `log-exporter` = js.native
  }
  
  @js.native
  object formats extends js.Object {
    var BINARY: binary = js.native
    var HTTP_HEADERS: http_headers = js.native
    var LOG: log = js.native
    var TEXT_MAP: text_map = js.native
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

