package typings
package blockingDashProxyLib.builtLibWebdriverUnderscoreProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebDriverBarrier extends js.Object {
  def onCommand(command: blockingDashProxyLib.builtLibWebdriverUnderscoreCommandsMod.WebDriverCommand): js.Promise[scala.Unit]
}

object WebDriverBarrier {
  @scala.inline
  def apply(
    onCommand: js.Function1[
      blockingDashProxyLib.builtLibWebdriverUnderscoreCommandsMod.WebDriverCommand, 
      js.Promise[scala.Unit]
    ]
  ): WebDriverBarrier = {
    val __obj = js.Dynamic.literal(onCommand = onCommand)
  
    __obj.asInstanceOf[WebDriverBarrier]
  }
}

