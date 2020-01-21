package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionDestinationSettings extends js.Object {
  /**
    * Burn-In Destination Settings.
    */
  var BurninDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.BurninDestinationSettings] = js.native
  /**
    * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
    */
  var DestinationType: js.UndefOr[CaptionDestinationType] = js.native
  /**
    * DVB-Sub Destination Settings
    */
  var DvbSubDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DvbSubDestinationSettings] = js.native
  /**
    * Settings specific to embedded/ancillary caption outputs, including 608/708 Channel destination number.
    */
  var EmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.EmbeddedDestinationSettings] = js.native
  /**
    * Settings specific to IMSC caption outputs.
    */
  var ImscDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ImscDestinationSettings] = js.native
  /**
    * Settings for SCC caption output.
    */
  var SccDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.SccDestinationSettings] = js.native
  /**
    * Settings for Teletext caption output
    */
  var TeletextDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.TeletextDestinationSettings] = js.native
  /**
    * Settings specific to TTML caption outputs, including Pass style information (TtmlStylePassthrough).
    */
  var TtmlDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.TtmlDestinationSettings] = js.native
}

object CaptionDestinationSettings {
  @scala.inline
  def apply(
    BurninDestinationSettings: BurninDestinationSettings = null,
    DestinationType: CaptionDestinationType = null,
    DvbSubDestinationSettings: DvbSubDestinationSettings = null,
    EmbeddedDestinationSettings: EmbeddedDestinationSettings = null,
    ImscDestinationSettings: ImscDestinationSettings = null,
    SccDestinationSettings: SccDestinationSettings = null,
    TeletextDestinationSettings: TeletextDestinationSettings = null,
    TtmlDestinationSettings: TtmlDestinationSettings = null
  ): CaptionDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (BurninDestinationSettings != null) __obj.updateDynamic("BurninDestinationSettings")(BurninDestinationSettings.asInstanceOf[js.Any])
    if (DestinationType != null) __obj.updateDynamic("DestinationType")(DestinationType.asInstanceOf[js.Any])
    if (DvbSubDestinationSettings != null) __obj.updateDynamic("DvbSubDestinationSettings")(DvbSubDestinationSettings.asInstanceOf[js.Any])
    if (EmbeddedDestinationSettings != null) __obj.updateDynamic("EmbeddedDestinationSettings")(EmbeddedDestinationSettings.asInstanceOf[js.Any])
    if (ImscDestinationSettings != null) __obj.updateDynamic("ImscDestinationSettings")(ImscDestinationSettings.asInstanceOf[js.Any])
    if (SccDestinationSettings != null) __obj.updateDynamic("SccDestinationSettings")(SccDestinationSettings.asInstanceOf[js.Any])
    if (TeletextDestinationSettings != null) __obj.updateDynamic("TeletextDestinationSettings")(TeletextDestinationSettings.asInstanceOf[js.Any])
    if (TtmlDestinationSettings != null) __obj.updateDynamic("TtmlDestinationSettings")(TtmlDestinationSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionDestinationSettings]
  }
}

