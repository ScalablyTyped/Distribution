package typings.blockingProxy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * This command is for the proxy server, not to be forwarded to Selenium.
      */
    @JSImport("blocking-proxy", "BlockingProxy.isProxyCommand")
    @js.native
    def isProxyCommand(commandPath: String): Boolean = js.native
  }
}
