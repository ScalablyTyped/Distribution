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

