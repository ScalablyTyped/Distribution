package typings.ddDashTrace

import typings.ddDashTrace.ddDashTraceNumbers.`-1`
import typings.ddDashTrace.ddDashTraceNumbers.`0`
import typings.ddDashTrace.ddDashTraceNumbers.`1`
import typings.ddDashTrace.ddDashTraceNumbers.`2`
import typings.ddDashTrace.ddDashTraceStrings._dd1DOTsrDOTeausr
import typings.ddDashTrace.ddDashTraceStrings.`agent-exporter`
import typings.ddDashTrace.ddDashTraceStrings.`log-exporter`
import typings.ddDashTrace.ddDashTraceStrings.binary
import typings.ddDashTrace.ddDashTraceStrings.client
import typings.ddDashTrace.ddDashTraceStrings.consumer
import typings.ddDashTrace.ddDashTraceStrings.error
import typings.ddDashTrace.ddDashTraceStrings.http
import typings.ddDashTrace.ddDashTraceStrings.httpDOTmethod
import typings.ddDashTrace.ddDashTraceStrings.httpDOTrequestDOTheaders
import typings.ddDashTrace.ddDashTraceStrings.httpDOTresponseDOTheaders
import typings.ddDashTrace.ddDashTraceStrings.httpDOTroute
import typings.ddDashTrace.ddDashTraceStrings.httpDOTstatus_code
import typings.ddDashTrace.ddDashTraceStrings.httpDOTurl
import typings.ddDashTrace.ddDashTraceStrings.http_headers
import typings.ddDashTrace.ddDashTraceStrings.log
import typings.ddDashTrace.ddDashTraceStrings.manualDOTdrop
import typings.ddDashTrace.ddDashTraceStrings.manualDOTkeep
import typings.ddDashTrace.ddDashTraceStrings.producer
import typings.ddDashTrace.ddDashTraceStrings.resourceDOTname
import typings.ddDashTrace.ddDashTraceStrings.samplingDOTpriority
import typings.ddDashTrace.ddDashTraceStrings.server
import typings.ddDashTrace.ddDashTraceStrings.serviceDOTname
import typings.ddDashTrace.ddDashTraceStrings.spanDOTkind
import typings.ddDashTrace.ddDashTraceStrings.spanDOTtype
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
    var ANALYTICS: _dd1DOTsrDOTeausr = js.native
    var ERROR: error = js.native
    var HTTP_METHOD: httpDOTmethod = js.native
    var HTTP_REQUEST_HEADERS: httpDOTrequestDOTheaders = js.native
    var HTTP_RESPONSE_HEADERS: httpDOTresponseDOTheaders = js.native
    var HTTP_ROUTE: httpDOTroute = js.native
    var HTTP_STATUS_CODE: httpDOTstatus_code = js.native
    var HTTP_URL: httpDOTurl = js.native
    var MANUAL_DROP: manualDOTdrop = js.native
    var MANUAL_KEEP: manualDOTkeep = js.native
    var RESOURCE_NAME: resourceDOTname = js.native
    var SAMPLING_PRIORITY: samplingDOTpriority = js.native
    var SERVICE_NAME: serviceDOTname = js.native
    var SPAN_KIND: spanDOTkind = js.native
    var SPAN_TYPE: spanDOTtype = js.native
  }
  
  @js.native
  object types extends js.Object {
    var HTTP: http = js.native
    var WEB: web = js.native
  }
  
}

