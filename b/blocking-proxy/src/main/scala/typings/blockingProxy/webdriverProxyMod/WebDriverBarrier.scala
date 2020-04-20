package typings.blockingProxy.webdriverProxyMod

import typings.blockingProxy.webdriverCommandsMod.WebDriverCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebDriverBarrier extends js.Object {
  def onCommand(command: WebDriverCommand): js.Promise[Unit]
}

object WebDriverBarrier {
  @scala.inline
  def apply(onCommand: WebDriverCommand => js.Promise[Unit]): WebDriverBarrier = {
    val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand))
    __obj.asInstanceOf[WebDriverBarrier]
  }
}

