package typings.blockingProxy

import typings.blockingProxy.builtLibSimpleWebdriverClientMod.SimpleWebDriverClient
import typings.blockingProxy.builtLibWebdriverCommandsMod.WebDriverCommand
import typings.blockingProxy.builtLibWebdriverProxyMod.WebDriverBarrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibHighlightDelayBarrierMod {
  
  @JSImport("blocking-proxy/built/lib/highlight_delay_barrier", "HighlightDelayBarrier")
  @js.native
  open class HighlightDelayBarrier protected ()
    extends StObject
       with WebDriverBarrier {
    def this(client: SimpleWebDriverClient, delay: Double) = this()
    
    /* private */ var client: Any = js.native
    
    var delay: Double = js.native
    
    /* private */ def highlightData(top: Any, left: Any, width: Any, height: Any): Any = js.native
    
    /* private */ def isHighlightCommand(command: Any): Any = js.native
    
    /* CompleteClass */
    override def onCommand(command: WebDriverCommand): js.Promise[Unit] = js.native
    
    /* private */ def removeHighlightData(): Any = js.native
    
    /* private */ def sleep(delay: Any): Any = js.native
  }
}
