package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerSettings extends js.Object {
  /**
    * Settings for MP4 segments in CMAF
    */
  var CmfcSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.CmfcSettings] = js.native
  /**
    * Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
    */
  var Container: js.UndefOr[ContainerType] = js.native
  /**
    * Settings for F4v container
    */
  var F4vSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.F4vSettings] = js.native
  /**
    * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
    */
  var M2tsSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.M2tsSettings] = js.native
  /**
    * Settings for TS segments in HLS
    */
  var M3u8Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.M3u8Settings] = js.native
  /**
    * Settings for MOV Container.
    */
  var MovSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.MovSettings] = js.native
  /**
    * Settings for MP4 container. You can create audio-only AAC outputs with this container.
    */
  var Mp4Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Mp4Settings] = js.native
  /**
    * Settings for MP4 segments in DASH
    */
  var MpdSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.MpdSettings] = js.native
  /**
    * MXF settings
    */
  var MxfSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.MxfSettings] = js.native
}

object ContainerSettings {
  @scala.inline
  def apply(): ContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSettings]
  }
  @scala.inline
  implicit class ContainerSettingsOps[Self <: ContainerSettings] (val x: Self) extends AnyVal {
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
    def setCmfcSettings(value: CmfcSettings): Self = this.set("CmfcSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmfcSettings: Self = this.set("CmfcSettings", js.undefined)
    @scala.inline
    def setContainer(value: ContainerType): Self = this.set("Container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("Container", js.undefined)
    @scala.inline
    def setF4vSettings(value: F4vSettings): Self = this.set("F4vSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF4vSettings: Self = this.set("F4vSettings", js.undefined)
    @scala.inline
    def setM2tsSettings(value: M2tsSettings): Self = this.set("M2tsSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM2tsSettings: Self = this.set("M2tsSettings", js.undefined)
    @scala.inline
    def setM3u8Settings(value: M3u8Settings): Self = this.set("M3u8Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM3u8Settings: Self = this.set("M3u8Settings", js.undefined)
    @scala.inline
    def setMovSettings(value: MovSettings): Self = this.set("MovSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovSettings: Self = this.set("MovSettings", js.undefined)
    @scala.inline
    def setMp4Settings(value: Mp4Settings): Self = this.set("Mp4Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMp4Settings: Self = this.set("Mp4Settings", js.undefined)
    @scala.inline
    def setMpdSettings(value: MpdSettings): Self = this.set("MpdSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpdSettings: Self = this.set("MpdSettings", js.undefined)
    @scala.inline
    def setMxfSettings(value: MxfSettings): Self = this.set("MxfSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMxfSettings: Self = this.set("MxfSettings", js.undefined)
  }
  
}

