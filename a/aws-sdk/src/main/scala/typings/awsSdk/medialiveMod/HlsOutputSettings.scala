package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsOutputSettings extends js.Object {
  /**
    * Only applicable when this output is referencing an H.265 video description.
  Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
    */
  var H265PackagingType: js.UndefOr[HlsH265PackagingType] = js.native
  /**
    * Settings regarding the underlying stream. These settings are different for audio-only outputs.
    */
  var HlsSettings: typings.awsSdk.medialiveMod.HlsSettings = js.native
  /**
    * String concatenated to the end of the destination filename. Accepts \"Format Identifiers\":#formatIdentifierParameters.
    */
  var NameModifier: js.UndefOr[stringMin1] = js.native
  /**
    * String concatenated to end of segment filenames.
    */
  var SegmentModifier: js.UndefOr[string] = js.native
}

object HlsOutputSettings {
  @scala.inline
  def apply(HlsSettings: HlsSettings): HlsOutputSettings = {
    val __obj = js.Dynamic.literal(HlsSettings = HlsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsOutputSettings]
  }
  @scala.inline
  implicit class HlsOutputSettingsOps[Self <: HlsOutputSettings] (val x: Self) extends AnyVal {
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
    def setHlsSettings(value: HlsSettings): Self = this.set("HlsSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setH265PackagingType(value: HlsH265PackagingType): Self = this.set("H265PackagingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH265PackagingType: Self = this.set("H265PackagingType", js.undefined)
    @scala.inline
    def setNameModifier(value: stringMin1): Self = this.set("NameModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameModifier: Self = this.set("NameModifier", js.undefined)
    @scala.inline
    def setSegmentModifier(value: string): Self = this.set("SegmentModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentModifier: Self = this.set("SegmentModifier", js.undefined)
  }
  
}

