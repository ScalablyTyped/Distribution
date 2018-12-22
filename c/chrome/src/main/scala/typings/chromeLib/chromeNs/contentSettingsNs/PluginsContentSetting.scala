package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsContentSetting extends ContentSetting {
  def set(details: PluginsSetDetails): scala.Unit = js.native
  def set(details: PluginsSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

