package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////////////
// Generated with https://app.quicktype.io/, Name: Protocol, Language: TypeScript, Interfaces only.
// Manually done: TypeEnum simplified, add " | undefined" for optional properties.
// Source: https://github.com/ChromeDevTools/devtools-protocol/blob/master/json/ (merge JSON objects)
/////////////////////////////////////////////////
trait Protocol extends StObject {
  
  var domains: js.Array[Domain]
  
  var version: Version
}
object Protocol {
  
  @JSImport("chrome-remote-interface", "Protocol")
  @js.native
  def apply(): js.Promise[Protocol] = js.native
  @JSImport("chrome-remote-interface", "Protocol")
  @js.native
  def apply(callback: js.Function2[/* err */ js.Error | Null, /* protocol */ Protocol, Unit]): Unit = js.native
  @JSImport("chrome-remote-interface", "Protocol")
  @js.native
  def apply(options: ProtocolOptions): js.Promise[Protocol] = js.native
  @JSImport("chrome-remote-interface", "Protocol")
  @js.native
  def apply(
    options: ProtocolOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* protocol */ Protocol, Unit]
  ): Unit = js.native
  
  extension [Self <: Protocol](x: Self) {
    
    inline def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
