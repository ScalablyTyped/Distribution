package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioCodecSettings extends StObject {
  
  var AacSettings: js.UndefOr[typings.awsSdk.medialiveMod.AacSettings] = js.undefined
  
  var Ac3Settings: js.UndefOr[typings.awsSdk.medialiveMod.Ac3Settings] = js.undefined
  
  var Eac3Settings: js.UndefOr[typings.awsSdk.medialiveMod.Eac3Settings] = js.undefined
  
  var Mp2Settings: js.UndefOr[typings.awsSdk.medialiveMod.Mp2Settings] = js.undefined
  
  var PassThroughSettings: js.UndefOr[typings.awsSdk.medialiveMod.PassThroughSettings] = js.undefined
  
  var WavSettings: js.UndefOr[typings.awsSdk.medialiveMod.WavSettings] = js.undefined
}
object AudioCodecSettings {
  
  inline def apply(): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioCodecSettings]
  }
  
  extension [Self <: AudioCodecSettings](x: Self) {
    
    inline def setAacSettings(value: AacSettings): Self = StObject.set(x, "AacSettings", value.asInstanceOf[js.Any])
    
    inline def setAacSettingsUndefined: Self = StObject.set(x, "AacSettings", js.undefined)
    
    inline def setAc3Settings(value: Ac3Settings): Self = StObject.set(x, "Ac3Settings", value.asInstanceOf[js.Any])
    
    inline def setAc3SettingsUndefined: Self = StObject.set(x, "Ac3Settings", js.undefined)
    
    inline def setEac3Settings(value: Eac3Settings): Self = StObject.set(x, "Eac3Settings", value.asInstanceOf[js.Any])
    
    inline def setEac3SettingsUndefined: Self = StObject.set(x, "Eac3Settings", js.undefined)
    
    inline def setMp2Settings(value: Mp2Settings): Self = StObject.set(x, "Mp2Settings", value.asInstanceOf[js.Any])
    
    inline def setMp2SettingsUndefined: Self = StObject.set(x, "Mp2Settings", js.undefined)
    
    inline def setPassThroughSettings(value: PassThroughSettings): Self = StObject.set(x, "PassThroughSettings", value.asInstanceOf[js.Any])
    
    inline def setPassThroughSettingsUndefined: Self = StObject.set(x, "PassThroughSettings", js.undefined)
    
    inline def setWavSettings(value: WavSettings): Self = StObject.set(x, "WavSettings", value.asInstanceOf[js.Any])
    
    inline def setWavSettingsUndefined: Self = StObject.set(x, "WavSettings", js.undefined)
  }
}
