package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSettings extends js.Object {
  var ArchiveOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.ArchiveOutputSettings] = js.native
  var FrameCaptureOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.FrameCaptureOutputSettings] = js.native
  var HlsOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsOutputSettings] = js.native
  var MediaPackageOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MediaPackageOutputSettings] = js.native
  var MsSmoothOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MsSmoothOutputSettings] = js.native
  var MultiplexOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexOutputSettings] = js.native
  var RtmpOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.RtmpOutputSettings] = js.native
  var UdpOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.UdpOutputSettings] = js.native
}

object OutputSettings {
  @scala.inline
  def apply(): OutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSettings]
  }
  @scala.inline
  implicit class OutputSettingsOps[Self <: OutputSettings] (val x: Self) extends AnyVal {
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
    def setArchiveOutputSettings(value: ArchiveOutputSettings): Self = this.set("ArchiveOutputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveOutputSettings: Self = this.set("ArchiveOutputSettings", js.undefined)
    @scala.inline
    def setFrameCaptureOutputSettings(value: FrameCaptureOutputSettings): Self = this.set("FrameCaptureOutputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameCaptureOutputSettings: Self = this.set("FrameCaptureOutputSettings", js.undefined)
    @scala.inline
    def setHlsOutputSettings(value: HlsOutputSettings): Self = this.set("HlsOutputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsOutputSettings: Self = this.set("HlsOutputSettings", js.undefined)
    @scala.inline
    def setMediaPackageOutputSettings(value: MediaPackageOutputSettings): Self = this.set("MediaPackageOutputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaPackageOutputSettings: Self = this.set("MediaPackageOutputSettings", js.undefined)
    @scala.inline
    def setMsSmoothOutputSettings(value: MsSmoothOutputSettings): Self = this.set("MsSmoothOutputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsSmoothOutputSettings: Self = this.set("MsSmoothOutputSettings", js.undefined)
    @scala.inline
    def setMultiplexOutputSettings(value: MultiplexOutputSettings): Self = this.set("MultiplexOutputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplexOutputSettings: Self = this.set("MultiplexOutputSettings", js.undefined)
    @scala.inline
    def setRtmpOutputSettings(value: RtmpOutputSettings): Self = this.set("RtmpOutputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtmpOutputSettings: Self = this.set("RtmpOutputSettings", js.undefined)
    @scala.inline
    def setUdpOutputSettings(value: UdpOutputSettings): Self = this.set("UdpOutputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdpOutputSettings: Self = this.set("UdpOutputSettings", js.undefined)
  }
  
}

