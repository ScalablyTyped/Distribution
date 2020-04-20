package typings.backboneRadio.mod.backboneAugmentingMod

import typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radio_ extends js.Object {
  def channel(channelName: String): Channel_
  def log(channelName: String, eventName: String, args: js.Any*): Unit
  def tuneIn(channelName: String): Radio
  def tuneOut(channelName: String): Radio
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
}

