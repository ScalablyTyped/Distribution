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
  def apply(): CaptionSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSourceSettings]
  }
  @scala.inline
  implicit class CaptionSourceSettingsOps[Self <: CaptionSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAncillarySourceSettings(value: AncillarySourceSettings): Self = this.set("AncillarySourceSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAncillarySourceSettings: Self = this.set("AncillarySourceSettings", js.undefined)
    @scala.inline
    def setDvbSubSourceSettings(value: DvbSubSourceSettings): Self = this.set("DvbSubSourceSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDvbSubSourceSettings: Self = this.set("DvbSubSourceSettings", js.undefined)
    @scala.inline
    def setEmbeddedSourceSettings(value: EmbeddedSourceSettings): Self = this.set("EmbeddedSourceSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddedSourceSettings: Self = this.set("EmbeddedSourceSettings", js.undefined)
    @scala.inline
    def setFileSourceSettings(value: FileSourceSettings): Self = this.set("FileSourceSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSourceSettings: Self = this.set("FileSourceSettings", js.undefined)
    @scala.inline
    def setSourceType(value: CaptionSourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    @scala.inline
    def setTeletextSourceSettings(value: TeletextSourceSettings): Self = this.set("TeletextSourceSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeletextSourceSettings: Self = this.set("TeletextSourceSettings", js.undefined)
    @scala.inline
    def setTrackSourceSettings(value: TrackSourceSettings): Self = this.set("TrackSourceSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackSourceSettings: Self = this.set("TrackSourceSettings", js.undefined)
  }
  
}

