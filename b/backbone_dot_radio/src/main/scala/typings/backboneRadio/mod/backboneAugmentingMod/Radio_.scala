package typings.backboneRadio.mod.backboneAugmentingMod

import typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Radio_ extends js.Object {
  
  def channel(channelName: String): Channel_ = js.native
  
  def log(channelName: String, eventName: String, args: js.Any*): Unit = js.native
  
  def tuneIn(channelName: String): Radio = js.native
  
  def tuneOut(channelName: String): Radio = js.native
}
object Radio_ {
  
  @scala.inline
  def apply(
    channel: String => Channel_,
    log: (String, String, /* repeated */ js.Any) => Unit,
    tuneIn: String => Radio,
    tuneOut: String => Radio
  ): Radio_ = {
    val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), log = js.Any.fromFunction3(log), tuneIn = js.Any.fromFunction1(tuneIn), tuneOut = js.Any.fromFunction1(tuneOut))
    __obj.asInstanceOf[Radio_]
  }
  
  @scala.inline
  implicit class Radio_Ops[Self <: Radio_] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String => Channel_): Self = this.set("channel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: (String, String, /* repeated */ js.Any) => Unit): Self = this.set("log", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTuneIn(value: String => Radio): Self = this.set("tuneIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTuneOut(value: String => Radio): Self = this.set("tuneOut", js.Any.fromFunction1(value))
  }
}
