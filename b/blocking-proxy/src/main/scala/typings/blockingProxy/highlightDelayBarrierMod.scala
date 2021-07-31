package typings.blockingProxy

import typings.blockingProxy.simpleWebdriverClientMod.SimpleWebDriverClient
import typings.blockingProxy.webdriverCommandsMod.WebDriverCommand
import typings.blockingProxy.webdriverProxyMod.WebDriverBarrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightDelayBarrierMod {
  
  @JSImport("blocking-proxy/built/lib/highlight_delay_barrier", "HighlightDelayBarrier")
  @js.native
  class HighlightDelayBarrier protected ()
    extends StObject
       with WebDriverBarrier {
    def this(client: SimpleWebDriverClient, delay: Double) = this()
    
    var client: js.Any = js.native
    
    var delay: Double = js.native
    
    /* private */ def highlightData(top: js.Any, left: js.Any, width: js.Any, height: js.Any): js.Any = js.native
    
    /* private */ def isHighlightCommand(command: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def onCommand(command: WebDriverCommand): js.Promise[Unit] = js.native
    
    /* private */ def removeHighlightData(): js.Any = js.native
    
    /* private */ def sleep(delay: js.Any): js.Any = js.native
  }
}
