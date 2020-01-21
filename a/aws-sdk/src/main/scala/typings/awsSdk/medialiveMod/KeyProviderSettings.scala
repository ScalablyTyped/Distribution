package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyProviderSettings extends js.Object {
  var StaticKeySettings: js.UndefOr[typings.awsSdk.medialiveMod.StaticKeySettings] = js.native
}

object KeyProviderSettings {
  @scala.inline
  def apply(StaticKeySettings: StaticKeySettings = null): KeyProviderSettings = {
    val __obj = js.Dynamic.literal()
    if (StaticKeySettings != null) __obj.updateDynamic("StaticKeySettings")(StaticKeySettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyProviderSettings]
  }
}

