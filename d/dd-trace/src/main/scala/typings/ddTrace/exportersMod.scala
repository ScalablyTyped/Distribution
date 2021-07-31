package typings.ddTrace

import typings.ddTrace.ddTraceStrings.agent
import typings.ddTrace.ddTraceStrings.browser
import typings.ddTrace.ddTraceStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportersMod {
  
  @JSImport("dd-trace/ext/exporters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/exporters", "AGENT")
  @js.native
  def AGENT: agent = js.native
  @scala.inline
  def AGENT_=(x: agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AGENT")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/exporters", "BROWSER")
  @js.native
  def BROWSER: browser = js.native
  @scala.inline
  def BROWSER_=(x: browser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BROWSER")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/exporters", "LOG")
  @js.native
  def LOG: log = js.native
  @scala.inline
  def LOG_=(x: log): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG")(x.asInstanceOf[js.Any])
}
