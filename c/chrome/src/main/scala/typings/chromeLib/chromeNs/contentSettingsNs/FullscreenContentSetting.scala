package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenContentSetting extends ContentSetting {
  def set(details: FullscreenSetDetails): scala.Unit = js.native
  def set(details: FullscreenSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

