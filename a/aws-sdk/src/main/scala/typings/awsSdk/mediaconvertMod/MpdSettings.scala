package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MpdSettings extends js.Object {
  /**
    * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions.  You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
    */
  var CaptionContainerType: js.UndefOr[MpdCaptionContainerType] = js.native
  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[MpdScte35Esam] = js.native
  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  var Scte35Source: js.UndefOr[MpdScte35Source] = js.native
}

object MpdSettings {
  @scala.inline
  def apply(): MpdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MpdSettings]
  }
  @scala.inline
  implicit class MpdSettingsOps[Self <: MpdSettings] (val x: Self) extends AnyVal {
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
    def setCaptionContainerType(value: MpdCaptionContainerType): Self = this.set("CaptionContainerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionContainerType: Self = this.set("CaptionContainerType", js.undefined)
    @scala.inline
    def setScte35Esam(value: MpdScte35Esam): Self = this.set("Scte35Esam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35Esam: Self = this.set("Scte35Esam", js.undefined)
    @scala.inline
    def setScte35Source(value: MpdScte35Source): Self = this.set("Scte35Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35Source: Self = this.set("Scte35Source", js.undefined)
  }
  
}

