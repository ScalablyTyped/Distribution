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
}

