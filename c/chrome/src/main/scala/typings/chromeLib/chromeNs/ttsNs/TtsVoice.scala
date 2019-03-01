package typings
package chromeLib.chromeNs.ttsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TtsVoice extends js.Object {
  /** All of the callback event types that this voice is capable of sending. */
  var eventTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The ID of the extension providing this voice. */
  var extensionsId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. This voice's gender.
    * One of: "male", or "female"
    */
  var gender: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The language that this voice supports, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the synthesis engine is a remote network resource. It may be higher latency and may incur bandwidth costs.
    * @since Chrome 33.
    */
  var remote: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The name of the voice. */
  var voiceName: js.UndefOr[java.lang.String] = js.undefined
}

object TtsVoice {
  @scala.inline
  def apply(
    eventTypes: js.Array[java.lang.String] = null,
    extensionsId: java.lang.String = null,
    gender: java.lang.String = null,
    lang: java.lang.String = null,
    remote: js.UndefOr[scala.Boolean] = js.undefined,
    voiceName: java.lang.String = null
  ): TtsVoice = {
    val __obj = js.Dynamic.literal()
    if (eventTypes != null) __obj.updateDynamic("eventTypes")(eventTypes)
    if (extensionsId != null) __obj.updateDynamic("extensionsId")(extensionsId)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (!js.isUndefined(remote)) __obj.updateDynamic("remote")(remote)
    if (voiceName != null) __obj.updateDynamic("voiceName")(voiceName)
    __obj.asInstanceOf[TtsVoice]
  }
}

