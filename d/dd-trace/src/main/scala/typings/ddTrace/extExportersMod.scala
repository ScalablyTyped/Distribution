package typings.ddTrace

import typings.ddTrace.ddTraceStrings.agent
import typings.ddTrace.ddTraceStrings.agent_proxy
import typings.ddTrace.ddTraceStrings.datadog
import typings.ddTrace.ddTraceStrings.jest_worker
import typings.ddTrace.ddTraceStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extExportersMod {
  
  @JSImport("dd-trace/ext/exporters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/exporters", "AGENT")
  @js.native
  def AGENT: agent = js.native
  inline def AGENT_=(x: agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AGENT")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/exporters", "AGENT_PROXY")
  @js.native
  def AGENT_PROXY: agent_proxy = js.native
  inline def AGENT_PROXY_=(x: agent_proxy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AGENT_PROXY")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/exporters", "DATADOG")
  @js.native
  def DATADOG: datadog = js.native
  inline def DATADOG_=(x: datadog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATADOG")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/exporters", "JEST_WORKER")
  @js.native
  def JEST_WORKER: jest_worker = js.native
  inline def JEST_WORKER_=(x: jest_worker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JEST_WORKER")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/exporters", "LOG")
  @js.native
  def LOG: log = js.native
  inline def LOG_=(x: log): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG")(x.asInstanceOf[js.Any])
}
