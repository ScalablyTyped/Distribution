package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSelectorSettings extends js.Object {
  var AribSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.AribSourceSettings] = js.native
  var DvbSubSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbSubSourceSettings] = js.native
  var EmbeddedSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedSourceSettings] = js.native
  var Scte20SourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte20SourceSettings] = js.native
  var Scte27SourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte27SourceSettings] = js.native
  var TeletextSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.TeletextSourceSettings] = js.native
}

object CaptionSelectorSettings {
  @scala.inline
  def apply(
    AribSourceSettings: AribSourceSettings = null,
    DvbSubSourceSettings: DvbSubSourceSettings = null,
    EmbeddedSourceSettings: EmbeddedSourceSettings = null,
    Scte20SourceSettings: Scte20SourceSettings = null,
    Scte27SourceSettings: Scte27SourceSettings = null,
    TeletextSourceSettings: TeletextSourceSettings = null
  ): CaptionSelectorSettings = {
    val __obj = js.Dynamic.literal()
    if (AribSourceSettings != null) __obj.updateDynamic("AribSourceSettings")(AribSourceSettings.asInstanceOf[js.Any])
    if (DvbSubSourceSettings != null) __obj.updateDynamic("DvbSubSourceSettings")(DvbSubSourceSettings.asInstanceOf[js.Any])
    if (EmbeddedSourceSettings != null) __obj.updateDynamic("EmbeddedSourceSettings")(EmbeddedSourceSettings.asInstanceOf[js.Any])
    if (Scte20SourceSettings != null) __obj.updateDynamic("Scte20SourceSettings")(Scte20SourceSettings.asInstanceOf[js.Any])
    if (Scte27SourceSettings != null) __obj.updateDynamic("Scte27SourceSettings")(Scte27SourceSettings.asInstanceOf[js.Any])
    if (TeletextSourceSettings != null) __obj.updateDynamic("TeletextSourceSettings")(TeletextSourceSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSelectorSettings]
  }
}

