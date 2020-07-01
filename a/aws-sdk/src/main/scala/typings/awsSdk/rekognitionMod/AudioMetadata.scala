package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioMetadata extends js.Object {
  /**
    * The audio codec used to encode or decode the audio stream. 
    */
  var Codec: js.UndefOr[String] = js.native
  /**
    * The duration of the audio stream in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.native
  /**
    * The number of audio channels in the segement.
    */
  var NumberOfChannels: js.UndefOr[ULong] = js.native
  /**
    * The sample rate for the audio stream.
    */
  var SampleRate: js.UndefOr[ULong] = js.native
}

object AudioMetadata {
  @scala.inline
  def apply(
    Codec: String = null,
    DurationMillis: js.UndefOr[ULong] = js.undefined,
    NumberOfChannels: js.UndefOr[ULong] = js.undefined,
    SampleRate: js.UndefOr[ULong] = js.undefined
  ): AudioMetadata = {
    val __obj = js.Dynamic.literal()
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (!js.isUndefined(DurationMillis)) __obj.updateDynamic("DurationMillis")(DurationMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfChannels)) __obj.updateDynamic("NumberOfChannels")(NumberOfChannels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMetadata]
  }
}

