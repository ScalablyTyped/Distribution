package typings.blockingProxy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blocking-proxy", "BPClient")
  @js.native
  class BPClient protected ()
    extends typings.blockingProxy.clientMod.BPClient {
    def this(bpUrlValue: String) = this()
  }
  
  @JSImport("blocking-proxy", "BlockingProxy")
  @js.native
  class BlockingProxy protected ()
    extends typings.blockingProxy.blockingproxyMod.BlockingProxy {
    def this(seleniumAddress: String) = this()
    def this(seleniumAddress: String, highlightDelay: Double) = this()
  }
  /* static members */
  object BlockingProxy {
    
    @JSImport("blocking-proxy", "BlockingProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This command is for the proxy server, not to be forwarded to Selenium.
      */
    inline def isProxyCommand(commandPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProxyCommand")(commandPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
