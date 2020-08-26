package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputChannelLevel extends js.Object {
  /**
    * Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
    */
  var Gain: integerMinNegative60Max6 = js.native
  /**
    * The index of the input channel used as a source.
    */
  var InputChannel: integerMin0Max15 = js.native
}

object InputChannelLevel {
  @scala.inline
  def apply(Gain: integerMinNegative60Max6, InputChannel: integerMin0Max15): InputChannelLevel = {
    val __obj = js.Dynamic.literal(Gain = Gain.asInstanceOf[js.Any], InputChannel = InputChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputChannelLevel]
  }
  @scala.inline
  implicit class InputChannelLevelOps[Self <: InputChannelLevel] (val x: Self) extends AnyVal {
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
    def setGain(value: integerMinNegative60Max6): Self = this.set("Gain", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputChannel(value: integerMin0Max15): Self = this.set("InputChannel", value.asInstanceOf[js.Any])
  }
  
}

