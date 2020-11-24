package typings.blockingProxy.webdriverProxyMod

import typings.blockingProxy.webdriverCommandsMod.WebDriverCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverBarrier extends js.Object {
  
  def onCommand(command: WebDriverCommand): js.Promise[Unit] = js.native
}
object WebDriverBarrier {
  
  @scala.inline
  def apply(onCommand: WebDriverCommand => js.Promise[Unit]): WebDriverBarrier = {
    val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand))
    __obj.asInstanceOf[WebDriverBarrier]
  }
  
  @scala.inline
  implicit class WebDriverBarrierOps[Self <: WebDriverBarrier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnCommand(value: WebDriverCommand => js.Promise[Unit]): Self = this.set("onCommand", js.Any.fromFunction1(value))
  }
}
