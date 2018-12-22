package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContentSetting extends ContentSetting {
  def set(details: CameraSetDetails): scala.Unit = js.native
  def set(details: CameraSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

