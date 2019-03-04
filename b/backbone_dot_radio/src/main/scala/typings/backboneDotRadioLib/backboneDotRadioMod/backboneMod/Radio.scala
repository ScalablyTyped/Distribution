package typings
package backboneDotRadioLib.backboneDotRadioMod.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radio extends js.Object {
  def channel(channelName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Channel
  def log(channelName: java.lang.String, eventName: java.lang.String, args: js.Any*): scala.Unit
  def tuneIn(channelName: java.lang.String): Radio
  def tuneOut(channelName: java.lang.String): Radio
}

object Radio {
  @scala.inline
  def apply(
    channel: js.Function1[
      java.lang.String, 
      backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Channel
    ],
    log: js.Function3[java.lang.String, java.lang.String, /* repeated */ js.Any, scala.Unit],
    tuneIn: js.Function1[java.lang.String, Radio],
    tuneOut: js.Function1[java.lang.String, Radio]
  ): Radio = {
    val __obj = js.Dynamic.literal(channel = channel, log = log, tuneIn = tuneIn, tuneOut = tuneOut)
  
    __obj.asInstanceOf[Radio]
  }
}

