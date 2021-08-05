package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSettings extends StObject {
  
  var ArchiveOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.ArchiveOutputSettings] = js.undefined
  
  var FrameCaptureOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.FrameCaptureOutputSettings] = js.undefined
  
  var HlsOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsOutputSettings] = js.undefined
  
  var MediaPackageOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MediaPackageOutputSettings] = js.undefined
  
  var MsSmoothOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MsSmoothOutputSettings] = js.undefined
  
  var MultiplexOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexOutputSettings] = js.undefined
  
  var RtmpOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.RtmpOutputSettings] = js.undefined
  
  var UdpOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.UdpOutputSettings] = js.undefined
}
object OutputSettings {
  
  inline def apply(): OutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSettings]
  }
  
  extension [Self <: OutputSettings](x: Self) {
    
    inline def setArchiveOutputSettings(value: ArchiveOutputSettings): Self = StObject.set(x, "ArchiveOutputSettings", value.asInstanceOf[js.Any])
    
    inline def setArchiveOutputSettingsUndefined: Self = StObject.set(x, "ArchiveOutputSettings", js.undefined)
    
    inline def setFrameCaptureOutputSettings(value: FrameCaptureOutputSettings): Self = StObject.set(x, "FrameCaptureOutputSettings", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureOutputSettingsUndefined: Self = StObject.set(x, "FrameCaptureOutputSettings", js.undefined)
    
    inline def setHlsOutputSettings(value: HlsOutputSettings): Self = StObject.set(x, "HlsOutputSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsOutputSettingsUndefined: Self = StObject.set(x, "HlsOutputSettings", js.undefined)
    
    inline def setMediaPackageOutputSettings(value: MediaPackageOutputSettings): Self = StObject.set(x, "MediaPackageOutputSettings", value.asInstanceOf[js.Any])
    
    inline def setMediaPackageOutputSettingsUndefined: Self = StObject.set(x, "MediaPackageOutputSettings", js.undefined)
    
    inline def setMsSmoothOutputSettings(value: MsSmoothOutputSettings): Self = StObject.set(x, "MsSmoothOutputSettings", value.asInstanceOf[js.Any])
    
    inline def setMsSmoothOutputSettingsUndefined: Self = StObject.set(x, "MsSmoothOutputSettings", js.undefined)
    
    inline def setMultiplexOutputSettings(value: MultiplexOutputSettings): Self = StObject.set(x, "MultiplexOutputSettings", value.asInstanceOf[js.Any])
    
    inline def setMultiplexOutputSettingsUndefined: Self = StObject.set(x, "MultiplexOutputSettings", js.undefined)
    
    inline def setRtmpOutputSettings(value: RtmpOutputSettings): Self = StObject.set(x, "RtmpOutputSettings", value.asInstanceOf[js.Any])
    
    inline def setRtmpOutputSettingsUndefined: Self = StObject.set(x, "RtmpOutputSettings", js.undefined)
    
    inline def setUdpOutputSettings(value: UdpOutputSettings): Self = StObject.set(x, "UdpOutputSettings", value.asInstanceOf[js.Any])
    
    inline def setUdpOutputSettingsUndefined: Self = StObject.set(x, "UdpOutputSettings", js.undefined)
  }
}
