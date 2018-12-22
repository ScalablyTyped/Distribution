package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicrophoneContentSetting extends ContentSetting {
  def set(details: MicrophoneSetDetails): scala.Unit = js.native
  def set(details: MicrophoneSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

