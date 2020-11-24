package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputGroupSettings extends js.Object {
  
  var ArchiveGroupSettings: js.UndefOr[typings.awsSdk.medialiveMod.ArchiveGroupSettings] = js.native
  
  var FrameCaptureGroupSettings: js.UndefOr[typings.awsSdk.medialiveMod.FrameCaptureGroupSettings] = js.native
  
  var HlsGroupSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsGroupSettings] = js.native
  
  var MediaPackageGroupSettings: js.UndefOr[typings.awsSdk.medialiveMod.MediaPackageGroupSettings] = js.native
  
  var MsSmoothGroupSettings: js.UndefOr[typings.awsSdk.medialiveMod.MsSmoothGroupSettings] = js.native
  
  var MultiplexGroupSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexGroupSettings] = js.native
  
  var RtmpGroupSettings: js.UndefOr[typings.awsSdk.medialiveMod.RtmpGroupSettings] = js.native
  
  var UdpGroupSettings: js.UndefOr[typings.awsSdk.medialiveMod.UdpGroupSettings] = js.native
}
object OutputGroupSettings {
  
  @scala.inline
  def apply(): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupSettings]
  }
  
  @scala.inline
  implicit class OutputGroupSettingsOps[Self <: OutputGroupSettings] (val x: Self) extends AnyVal {
    
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
    def setArchiveGroupSettings(value: ArchiveGroupSettings): Self = this.set("ArchiveGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveGroupSettings: Self = this.set("ArchiveGroupSettings", js.undefined)
    
    @scala.inline
    def setFrameCaptureGroupSettings(value: FrameCaptureGroupSettings): Self = this.set("FrameCaptureGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameCaptureGroupSettings: Self = this.set("FrameCaptureGroupSettings", js.undefined)
    
    @scala.inline
    def setHlsGroupSettings(value: HlsGroupSettings): Self = this.set("HlsGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsGroupSettings: Self = this.set("HlsGroupSettings", js.undefined)
    
    @scala.inline
    def setMediaPackageGroupSettings(value: MediaPackageGroupSettings): Self = this.set("MediaPackageGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaPackageGroupSettings: Self = this.set("MediaPackageGroupSettings", js.undefined)
    
    @scala.inline
    def setMsSmoothGroupSettings(value: MsSmoothGroupSettings): Self = this.set("MsSmoothGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsSmoothGroupSettings: Self = this.set("MsSmoothGroupSettings", js.undefined)
    
    @scala.inline
    def setMultiplexGroupSettings(value: MultiplexGroupSettings): Self = this.set("MultiplexGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplexGroupSettings: Self = this.set("MultiplexGroupSettings", js.undefined)
    
    @scala.inline
    def setRtmpGroupSettings(value: RtmpGroupSettings): Self = this.set("RtmpGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtmpGroupSettings: Self = this.set("RtmpGroupSettings", js.undefined)
    
    @scala.inline
    def setUdpGroupSettings(value: UdpGroupSettings): Self = this.set("UdpGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUdpGroupSettings: Self = this.set("UdpGroupSettings", js.undefined)
  }
}
