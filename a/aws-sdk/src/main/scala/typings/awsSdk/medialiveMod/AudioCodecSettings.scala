package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioCodecSettings extends js.Object {
  var AacSettings: js.UndefOr[typings.awsSdk.medialiveMod.AacSettings] = js.native
  var Ac3Settings: js.UndefOr[typings.awsSdk.medialiveMod.Ac3Settings] = js.native
  var Eac3Settings: js.UndefOr[typings.awsSdk.medialiveMod.Eac3Settings] = js.native
  var Mp2Settings: js.UndefOr[typings.awsSdk.medialiveMod.Mp2Settings] = js.native
  var PassThroughSettings: js.UndefOr[typings.awsSdk.medialiveMod.PassThroughSettings] = js.native
}

object AudioCodecSettings {
  @scala.inline
  def apply(
    AacSettings: AacSettings = null,
    Ac3Settings: Ac3Settings = null,
    Eac3Settings: Eac3Settings = null,
    Mp2Settings: Mp2Settings = null,
    PassThroughSettings: PassThroughSettings = null
  ): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    if (AacSettings != null) __obj.updateDynamic("AacSettings")(AacSettings.asInstanceOf[js.Any])
    if (Ac3Settings != null) __obj.updateDynamic("Ac3Settings")(Ac3Settings.asInstanceOf[js.Any])
    if (Eac3Settings != null) __obj.updateDynamic("Eac3Settings")(Eac3Settings.asInstanceOf[js.Any])
    if (Mp2Settings != null) __obj.updateDynamic("Mp2Settings")(Mp2Settings.asInstanceOf[js.Any])
    if (PassThroughSettings != null) __obj.updateDynamic("PassThroughSettings")(PassThroughSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioCodecSettings]
  }
}

