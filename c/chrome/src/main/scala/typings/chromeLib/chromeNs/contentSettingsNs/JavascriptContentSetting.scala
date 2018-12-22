package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JavascriptContentSetting extends ContentSetting {
  def set(details: JavascriptSetDetails): scala.Unit = js.native
  def set(details: JavascriptSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

