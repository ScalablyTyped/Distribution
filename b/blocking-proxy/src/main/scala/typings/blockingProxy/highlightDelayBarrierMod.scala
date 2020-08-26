package typings.blockingProxy

import typings.blockingProxy.simpleWebdriverClientMod.SimpleWebDriverClient
import typings.blockingProxy.webdriverProxyMod.WebDriverBarrier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/highlight_delay_barrier", JSImport.Namespace)
@js.native
object highlightDelayBarrierMod extends js.Object {
  @js.native
  class HighlightDelayBarrier protected () extends WebDriverBarrier {
    def this(client: SimpleWebDriverClient, delay: Double) = this()
    var client: js.Any = js.native
    var delay: Double = js.native
    /* private */ def highlightData(top: js.Any, left: js.Any, width: js.Any, height: js.Any): js.Any = js.native
    /* private */ def isHighlightCommand(command: js.Any): js.Any = js.native
    /* private */ def removeHighlightData(): js.Any = js.native
    /* private */ def sleep(delay: js.Any): js.Any = js.native
  }
  
}

