package typings.chromeRemoteInterface.mod

import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.BrowserApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DOMApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DOMDebuggerApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DebuggerApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.EmulationApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.IOApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.InputApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.LogApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.NetworkApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.PageApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.PerformanceApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.ProfilerApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.RuntimeApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.SecurityApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.TargetApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StableDomains extends StObject {
  
  var Browser: BrowserApi
  
  var DOM: DOMApi
  
  var DOMDebugger: DOMDebuggerApi
  
  var Debugger: DebuggerApi
  
  var Emulation: EmulationApi
  
  var IO: IOApi
  
  var Input: InputApi
  
  var Log: LogApi
  
  var Network: NetworkApi
  
  var Page: PageApi
  
  var Performance: PerformanceApi
  
  var Profiler: ProfilerApi
  
  var Runtime: RuntimeApi
  
  var Security: SecurityApi
  
  var Target: TargetApi
}
object StableDomains {
  
  inline def apply(
    Browser: BrowserApi,
    DOM: DOMApi,
    DOMDebugger: DOMDebuggerApi,
    Debugger: DebuggerApi,
    Emulation: EmulationApi,
    IO: IOApi,
    Input: InputApi,
    Log: LogApi,
    Network: NetworkApi,
    Page: PageApi,
    Performance: PerformanceApi,
    Profiler: ProfilerApi,
    Runtime: RuntimeApi,
    Security: SecurityApi,
    Target: TargetApi
  ): StableDomains = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], DOM = DOM.asInstanceOf[js.Any], DOMDebugger = DOMDebugger.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Emulation = Emulation.asInstanceOf[js.Any], IO = IO.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Log = Log.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any], Performance = Performance.asInstanceOf[js.Any], Profiler = Profiler.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StableDomains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StableDomains] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: BrowserApi): Self = StObject.set(x, "Browser", value.asInstanceOf[js.Any])
    
    inline def setDOM(value: DOMApi): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    inline def setDOMDebugger(value: DOMDebuggerApi): Self = StObject.set(x, "DOMDebugger", value.asInstanceOf[js.Any])
    
    inline def setDebugger(value: DebuggerApi): Self = StObject.set(x, "Debugger", value.asInstanceOf[js.Any])
    
    inline def setEmulation(value: EmulationApi): Self = StObject.set(x, "Emulation", value.asInstanceOf[js.Any])
    
    inline def setIO(value: IOApi): Self = StObject.set(x, "IO", value.asInstanceOf[js.Any])
    
    inline def setInput(value: InputApi): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setLog(value: LogApi): Self = StObject.set(x, "Log", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: NetworkApi): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
    
    inline def setPage(value: PageApi): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPerformance(value: PerformanceApi): Self = StObject.set(x, "Performance", value.asInstanceOf[js.Any])
    
    inline def setProfiler(value: ProfilerApi): Self = StObject.set(x, "Profiler", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeApi): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: SecurityApi): Self = StObject.set(x, "Security", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: TargetApi): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
