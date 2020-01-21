package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H265ColorSpaceSettings extends js.Object {
  var ColorSpacePassthroughSettings: js.UndefOr[typings.awsSdk.medialiveMod.ColorSpacePassthroughSettings] = js.native
  var Hdr10Settings: js.UndefOr[typings.awsSdk.medialiveMod.Hdr10Settings] = js.native
  var Rec601Settings: js.UndefOr[typings.awsSdk.medialiveMod.Rec601Settings] = js.native
  var Rec709Settings: js.UndefOr[typings.awsSdk.medialiveMod.Rec709Settings] = js.native
}

object H265ColorSpaceSettings {
  @scala.inline
  def apply(
    ColorSpacePassthroughSettings: ColorSpacePassthroughSettings = null,
    Hdr10Settings: Hdr10Settings = null,
    Rec601Settings: Rec601Settings = null,
    Rec709Settings: Rec709Settings = null
  ): H265ColorSpaceSettings = {
    val __obj = js.Dynamic.literal()
    if (ColorSpacePassthroughSettings != null) __obj.updateDynamic("ColorSpacePassthroughSettings")(ColorSpacePassthroughSettings.asInstanceOf[js.Any])
    if (Hdr10Settings != null) __obj.updateDynamic("Hdr10Settings")(Hdr10Settings.asInstanceOf[js.Any])
    if (Rec601Settings != null) __obj.updateDynamic("Rec601Settings")(Rec601Settings.asInstanceOf[js.Any])
    if (Rec709Settings != null) __obj.updateDynamic("Rec709Settings")(Rec709Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[H265ColorSpaceSettings]
  }
}

