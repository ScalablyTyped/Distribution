package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionDestinationSettings extends js.Object {
  var AribDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.AribDestinationSettings] = js.native
  var BurnInDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.BurnInDestinationSettings] = js.native
  var DvbSubDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbSubDestinationSettings] = js.native
  var EmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedDestinationSettings] = js.native
  var EmbeddedPlusScte20DestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedPlusScte20DestinationSettings] = js.native
  var RtmpCaptionInfoDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.RtmpCaptionInfoDestinationSettings] = js.native
  var Scte20PlusEmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte20PlusEmbeddedDestinationSettings] = js.native
  var Scte27DestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte27DestinationSettings] = js.native
  var SmpteTtDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.SmpteTtDestinationSettings] = js.native
  var TeletextDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.TeletextDestinationSettings] = js.native
  var TtmlDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.TtmlDestinationSettings] = js.native
  var WebvttDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.WebvttDestinationSettings] = js.native
}

object CaptionDestinationSettings {
  @scala.inline
  def apply(
    AribDestinationSettings: AribDestinationSettings = null,
    BurnInDestinationSettings: BurnInDestinationSettings = null,
    DvbSubDestinationSettings: DvbSubDestinationSettings = null,
    EmbeddedDestinationSettings: EmbeddedDestinationSettings = null,
    EmbeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettings = null,
    RtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettings = null,
    Scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettings = null,
    Scte27DestinationSettings: Scte27DestinationSettings = null,
    SmpteTtDestinationSettings: SmpteTtDestinationSettings = null,
    TeletextDestinationSettings: TeletextDestinationSettings = null,
    TtmlDestinationSettings: TtmlDestinationSettings = null,
    WebvttDestinationSettings: WebvttDestinationSettings = null
  ): CaptionDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (AribDestinationSettings != null) __obj.updateDynamic("AribDestinationSettings")(AribDestinationSettings.asInstanceOf[js.Any])
    if (BurnInDestinationSettings != null) __obj.updateDynamic("BurnInDestinationSettings")(BurnInDestinationSettings.asInstanceOf[js.Any])
    if (DvbSubDestinationSettings != null) __obj.updateDynamic("DvbSubDestinationSettings")(DvbSubDestinationSettings.asInstanceOf[js.Any])
    if (EmbeddedDestinationSettings != null) __obj.updateDynamic("EmbeddedDestinationSettings")(EmbeddedDestinationSettings.asInstanceOf[js.Any])
    if (EmbeddedPlusScte20DestinationSettings != null) __obj.updateDynamic("EmbeddedPlusScte20DestinationSettings")(EmbeddedPlusScte20DestinationSettings.asInstanceOf[js.Any])
    if (RtmpCaptionInfoDestinationSettings != null) __obj.updateDynamic("RtmpCaptionInfoDestinationSettings")(RtmpCaptionInfoDestinationSettings.asInstanceOf[js.Any])
    if (Scte20PlusEmbeddedDestinationSettings != null) __obj.updateDynamic("Scte20PlusEmbeddedDestinationSettings")(Scte20PlusEmbeddedDestinationSettings.asInstanceOf[js.Any])
    if (Scte27DestinationSettings != null) __obj.updateDynamic("Scte27DestinationSettings")(Scte27DestinationSettings.asInstanceOf[js.Any])
    if (SmpteTtDestinationSettings != null) __obj.updateDynamic("SmpteTtDestinationSettings")(SmpteTtDestinationSettings.asInstanceOf[js.Any])
    if (TeletextDestinationSettings != null) __obj.updateDynamic("TeletextDestinationSettings")(TeletextDestinationSettings.asInstanceOf[js.Any])
    if (TtmlDestinationSettings != null) __obj.updateDynamic("TtmlDestinationSettings")(TtmlDestinationSettings.asInstanceOf[js.Any])
    if (WebvttDestinationSettings != null) __obj.updateDynamic("WebvttDestinationSettings")(WebvttDestinationSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionDestinationSettings]
  }
}

