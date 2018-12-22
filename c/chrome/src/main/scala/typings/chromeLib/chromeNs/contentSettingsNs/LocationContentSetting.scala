package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationContentSetting extends ContentSetting {
  def set(details: LocationSetDetails): scala.Unit = js.native
  def set(details: LocationSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

