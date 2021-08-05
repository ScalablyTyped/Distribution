package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsSettings extends StObject {
  
  var AudioOnlyHlsSettings: js.UndefOr[typings.awsSdk.medialiveMod.AudioOnlyHlsSettings] = js.undefined
  
  var Fmp4HlsSettings: js.UndefOr[typings.awsSdk.medialiveMod.Fmp4HlsSettings] = js.undefined
  
  var StandardHlsSettings: js.UndefOr[typings.awsSdk.medialiveMod.StandardHlsSettings] = js.undefined
}
object HlsSettings {
  
  inline def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  
  extension [Self <: HlsSettings](x: Self) {
    
    inline def setAudioOnlyHlsSettings(value: AudioOnlyHlsSettings): Self = StObject.set(x, "AudioOnlyHlsSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyHlsSettingsUndefined: Self = StObject.set(x, "AudioOnlyHlsSettings", js.undefined)
    
    inline def setFmp4HlsSettings(value: Fmp4HlsSettings): Self = StObject.set(x, "Fmp4HlsSettings", value.asInstanceOf[js.Any])
    
    inline def setFmp4HlsSettingsUndefined: Self = StObject.set(x, "Fmp4HlsSettings", js.undefined)
    
    inline def setStandardHlsSettings(value: StandardHlsSettings): Self = StObject.set(x, "StandardHlsSettings", value.asInstanceOf[js.Any])
    
    inline def setStandardHlsSettingsUndefined: Self = StObject.set(x, "StandardHlsSettings", js.undefined)
  }
}
