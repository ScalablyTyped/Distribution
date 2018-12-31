package typings
package chromeDashAppsLib.chromeNs.ttsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A description of a voice available for speech synthesis. */
trait TtsVoice extends js.Object {
  /** All of the callback event types that this voice is capable of sending. */
  var eventTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The ID of the extension providing this voice. */
  var extensionsId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated Deprecated since Chrome 70. Gender is deprecated and will be ignored.
    * @description This voice's gender.
    */
  var gender: js.UndefOr[
    chromeDashAppsLib.chromeDashAppsLibStrings.male | chromeDashAppsLib.chromeDashAppsLibStrings.female
  ] = js.undefined
  /** The language that this voice supports, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the synthesis engine is a remote network resource. It may be higher latency and may incur bandwidth costs.
    * @since Chrome 33.
    */
  var remote: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the voice. */
  var voiceName: js.UndefOr[java.lang.String] = js.undefined
}

