package typings.chrome.chrome.ttsEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeakOptions extends js.Object {
  /**
    * Optional. Gender of voice for synthesized speech.
    * One of: "male", or "female"
    */
  var gender: js.UndefOr[String] = js.undefined
  /** Optional. The language to be used for synthesis, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[String] = js.undefined
  /** Optional. Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0 corresponds to this voice's default pitch. */
  var pitch: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * Speaking rate relative to the default rate for this voice. 1.0 is the default rate, normally around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. This value is guaranteed to be between 0.1 and 10.0, inclusive. When a voice does not support this full range of rates, don't return an error. Instead, clip the rate to the range the voice supports.
    */
  var rate: js.UndefOr[Double] = js.undefined
  /** Optional. The name of the voice to use for synthesis. */
  var voiceName: js.UndefOr[String] = js.undefined
  /** Optional. Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a default of 1.0. */
  var volume: js.UndefOr[Double] = js.undefined
}

object SpeakOptions {
  @scala.inline
  def apply(
    gender: String = null,
    lang: String = null,
    pitch: js.UndefOr[Double] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined,
    voiceName: String = null,
    volume: js.UndefOr[Double] = js.undefined
  ): SpeakOptions = {
    val __obj = js.Dynamic.literal()
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (voiceName != null) __obj.updateDynamic("voiceName")(voiceName.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeakOptions]
  }
}

