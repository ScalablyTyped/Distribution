package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupsContentSetting extends ContentSetting {
  def set(details: PopupsSetDetails): scala.Unit = js.native
  def set(details: PopupsSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

