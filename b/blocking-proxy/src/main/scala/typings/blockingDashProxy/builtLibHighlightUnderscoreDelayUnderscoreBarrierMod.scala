package typings.blockingDashProxy

import typings.blockingDashProxy.builtLibSimpleUnderscoreWebdriverUnderscoreClientMod.SimpleWebDriverClient
import typings.blockingDashProxy.builtLibWebdriverUnderscoreCommandsMod.WebDriverCommand
import typings.blockingDashProxy.builtLibWebdriverUnderscoreProxyMod.WebDriverBarrier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/highlight_delay_barrier", JSImport.Namespace)
@js.native
object builtLibHighlightUnderscoreDelayUnderscoreBarrierMod extends js.Object {
  @js.native
  class HighlightDelayBarrier protected () extends WebDriverBarrier {
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

