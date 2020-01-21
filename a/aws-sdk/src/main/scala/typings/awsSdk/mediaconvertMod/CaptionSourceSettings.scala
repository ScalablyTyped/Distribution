package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSourceSettings extends js.Object {
  /**
    * Settings for ancillary captions source.
    */
  var AncillarySourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AncillarySourceSettings] = js.native
  /**
    * DVB Sub Source Settings
    */
  var DvbSubSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DvbSubSourceSettings] = js.native
  /**
    * Settings for embedded captions Source
    */
  var EmbeddedSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.EmbeddedSourceSettings] = js.native
  /**
    * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an xml file, specify the URI of the input caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  var FileSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.FileSourceSettings] = js.native
  /**
    * Use Source (SourceType) to identify the format of your input captions.  The service cannot auto-detect caption format.
    */
  var SourceType: js.UndefOr[CaptionSourceType] = js.native
  /**
    * Settings specific to Teletext caption sources, including Page number.
    */
  var TeletextSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.TeletextSourceSettings] = js.native
  /**
    * Settings specific to caption sources that are specified by track number. Currently, this is only IMSC captions in an IMF package. If your caption source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of TrackSourceSettings.
    */
  var TrackSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.TrackSourceSettings] = js.native
}

object CaptionSourceSettings {
  @scala.inline
  def apply(
    AncillarySourceSettings: AncillarySourceSettings = null,
    DvbSubSourceSettings: DvbSubSourceSettings = null,
    EmbeddedSourceSettings: EmbeddedSourceSettings = null,
    FileSourceSettings: FileSourceSettings = null,
    SourceType: CaptionSourceType = null,
    TeletextSourceSettings: TeletextSourceSettings = null,
    TrackSourceSettings: TrackSourceSettings = null
  ): CaptionSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (AncillarySourceSettings != null) __obj.updateDynamic("AncillarySourceSettings")(AncillarySourceSettings.asInstanceOf[js.Any])
    if (DvbSubSourceSettings != null) __obj.updateDynamic("DvbSubSourceSettings")(DvbSubSourceSettings.asInstanceOf[js.Any])
    if (EmbeddedSourceSettings != null) __obj.updateDynamic("EmbeddedSourceSettings")(EmbeddedSourceSettings.asInstanceOf[js.Any])
    if (FileSourceSettings != null) __obj.updateDynamic("FileSourceSettings")(FileSourceSettings.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (TeletextSourceSettings != null) __obj.updateDynamic("TeletextSourceSettings")(TeletextSourceSettings.asInstanceOf[js.Any])
    if (TrackSourceSettings != null) __obj.updateDynamic("TrackSourceSettings")(TrackSourceSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSourceSettings]
  }
}

