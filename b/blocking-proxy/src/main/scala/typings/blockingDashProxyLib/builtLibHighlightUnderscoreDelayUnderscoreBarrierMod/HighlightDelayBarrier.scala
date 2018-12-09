package typings
package blockingDashProxyLib.builtLibHighlightUnderscoreDelayUnderscoreBarrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/highlight_delay_barrier", "HighlightDelayBarrier")
@js.native
class HighlightDelayBarrier protected ()
  extends blockingDashProxyLib.builtLibWebdriverUnderscoreProxyMod.WebDriverBarrier {
  def this(client: blockingDashProxyLib.builtLibSimpleUnderscoreWebdriverUnderscoreClientMod.SimpleWebDriverClient, delay: scala.Double) = this()
  var client: js.Any = js.native
  var delay: scala.Double = js.native
  /* private */ def highlightData(top: js.Any, left: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def isHighlightCommand(command: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onCommand(command: blockingDashProxyLib.builtLibWebdriverUnderscoreCommandsMod.WebDriverCommand): js.Promise[scala.Unit] = js.native
  /* private */ def removeHighlightData(): js.Any = js.native
  /* private */ def sleep(delay: js.Any): js.Any = js.native
}

