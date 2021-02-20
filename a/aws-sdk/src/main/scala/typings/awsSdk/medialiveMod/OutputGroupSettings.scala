package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputGroupSettings extends StObject {
  
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
  implicit class OutputGroupSettingsMutableBuilder[Self <: OutputGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveGroupSettings(value: ArchiveGroupSettings): Self = StObject.set(x, "ArchiveGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveGroupSettingsUndefined: Self = StObject.set(x, "ArchiveGroupSettings", js.undefined)
    
    @scala.inline
    def setFrameCaptureGroupSettings(value: FrameCaptureGroupSettings): Self = StObject.set(x, "FrameCaptureGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCaptureGroupSettingsUndefined: Self = StObject.set(x, "FrameCaptureGroupSettings", js.undefined)
    
    @scala.inline
    def setHlsGroupSettings(value: HlsGroupSettings): Self = StObject.set(x, "HlsGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsGroupSettingsUndefined: Self = StObject.set(x, "HlsGroupSettings", js.undefined)
    
    @scala.inline
    def setMediaPackageGroupSettings(value: MediaPackageGroupSettings): Self = StObject.set(x, "MediaPackageGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaPackageGroupSettingsUndefined: Self = StObject.set(x, "MediaPackageGroupSettings", js.undefined)
    
    @scala.inline
    def setMsSmoothGroupSettings(value: MsSmoothGroupSettings): Self = StObject.set(x, "MsSmoothGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsSmoothGroupSettingsUndefined: Self = StObject.set(x, "MsSmoothGroupSettings", js.undefined)
    
    @scala.inline
    def setMultiplexGroupSettings(value: MultiplexGroupSettings): Self = StObject.set(x, "MultiplexGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexGroupSettingsUndefined: Self = StObject.set(x, "MultiplexGroupSettings", js.undefined)
    
    @scala.inline
    def setRtmpGroupSettings(value: RtmpGroupSettings): Self = StObject.set(x, "RtmpGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmpGroupSettingsUndefined: Self = StObject.set(x, "RtmpGroupSettings", js.undefined)
    
    @scala.inline
    def setUdpGroupSettings(value: UdpGroupSettings): Self = StObject.set(x, "UdpGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdpGroupSettingsUndefined: Self = StObject.set(x, "UdpGroupSettings", js.undefined)
  }
}
