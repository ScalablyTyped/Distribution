package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputSettings extends StObject {
  
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
  implicit class OutputSettingsMutableBuilder[Self <: OutputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveOutputSettings(value: ArchiveOutputSettings): Self = StObject.set(x, "ArchiveOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveOutputSettingsUndefined: Self = StObject.set(x, "ArchiveOutputSettings", js.undefined)
    
    @scala.inline
    def setFrameCaptureOutputSettings(value: FrameCaptureOutputSettings): Self = StObject.set(x, "FrameCaptureOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCaptureOutputSettingsUndefined: Self = StObject.set(x, "FrameCaptureOutputSettings", js.undefined)
    
    @scala.inline
    def setHlsOutputSettings(value: HlsOutputSettings): Self = StObject.set(x, "HlsOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsOutputSettingsUndefined: Self = StObject.set(x, "HlsOutputSettings", js.undefined)
    
    @scala.inline
    def setMediaPackageOutputSettings(value: MediaPackageOutputSettings): Self = StObject.set(x, "MediaPackageOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaPackageOutputSettingsUndefined: Self = StObject.set(x, "MediaPackageOutputSettings", js.undefined)
    
    @scala.inline
    def setMsSmoothOutputSettings(value: MsSmoothOutputSettings): Self = StObject.set(x, "MsSmoothOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsSmoothOutputSettingsUndefined: Self = StObject.set(x, "MsSmoothOutputSettings", js.undefined)
    
    @scala.inline
    def setMultiplexOutputSettings(value: MultiplexOutputSettings): Self = StObject.set(x, "MultiplexOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexOutputSettingsUndefined: Self = StObject.set(x, "MultiplexOutputSettings", js.undefined)
    
    @scala.inline
    def setRtmpOutputSettings(value: RtmpOutputSettings): Self = StObject.set(x, "RtmpOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmpOutputSettingsUndefined: Self = StObject.set(x, "RtmpOutputSettings", js.undefined)
    
    @scala.inline
    def setUdpOutputSettings(value: UdpOutputSettings): Self = StObject.set(x, "UdpOutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdpOutputSettingsUndefined: Self = StObject.set(x, "UdpOutputSettings", js.undefined)
  }
}
