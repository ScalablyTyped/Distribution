package typings.broadcastChannel.broadcastChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastMethod[State] extends js.Object {
  
  def averageResponseTime(): Double = js.native
  
  def canBeUsed(): Boolean = js.native
  
  def close(channelState: State): Unit = js.native
  
  def create(channelName: String, options: BroadcastChannelOptions): js.Promise[State] | State = js.native
  
  def microSeconds(): Double = js.native
  
  def onMessage(channelState: State, callback: js.Function1[/* args */ js.Any, Unit]): Unit = js.native
  
  def postMessage(channelState: State, message: js.Any): js.Promise[_] = js.native
  
  var `type`: String = js.native
}
object BroadcastMethod {
  
  @scala.inline
  def apply[State](
    averageResponseTime: () => Double,
    canBeUsed: () => Boolean,
    close: State => Unit,
    create: (String, BroadcastChannelOptions) => js.Promise[State] | State,
    microSeconds: () => Double,
    onMessage: (State, js.Function1[/* args */ js.Any, Unit]) => Unit,
    postMessage: (State, js.Any) => js.Promise[_],
    `type`: String
  ): BroadcastMethod[State] = {
    val __obj = js.Dynamic.literal(averageResponseTime = js.Any.fromFunction0(averageResponseTime), canBeUsed = js.Any.fromFunction0(canBeUsed), close = js.Any.fromFunction1(close), create = js.Any.fromFunction2(create), microSeconds = js.Any.fromFunction0(microSeconds), onMessage = js.Any.fromFunction2(onMessage), postMessage = js.Any.fromFunction2(postMessage))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastMethod[State]]
  }
  
  @scala.inline
  implicit class BroadcastMethodOps[Self <: BroadcastMethod[_], State] (val x: Self with BroadcastMethod[State]) extends AnyVal {
    
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
    def setAverageResponseTime(value: () => Double): Self = this.set("averageResponseTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanBeUsed(value: () => Boolean): Self = this.set("canBeUsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: State => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreate(value: (String, BroadcastChannelOptions) => js.Promise[State] | State): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMicroSeconds(value: () => Double): Self = this.set("microSeconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMessage(value: (State, js.Function1[/* args */ js.Any, Unit]) => Unit): Self = this.set("onMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostMessage(value: (State, js.Any) => js.Promise[_]): Self = this.set("postMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
