package typings.backboneDotRadio.backboneDotRadioMod.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radio extends js.Object {
  def channel(channelName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Channel
  def log(channelName: String, eventName: String, args: js.Any*): Unit
  def tuneIn(channelName: String): Radio
  def tuneOut(channelName: String): Radio
}

object Radio {
  @scala.inline
  def apply(
    channel: String => typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Channel,
    log: (String, String, /* repeated */ js.Any) => Unit,
    tuneIn: String => Radio,
    tuneOut: String => Radio
  ): Radio = {
    val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), log = js.Any.fromFunction3(log), tuneIn = js.Any.fromFunction1(tuneIn), tuneOut = js.Any.fromFunction1(tuneOut))
  
    __obj.asInstanceOf[Radio]
  }
}

