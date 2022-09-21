package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioWatermarkSettings extends StObject {
  
  /**
    * Settings to configure Nielsen Watermarks in the audio encode
    */
  var NielsenWatermarksSettings: js.UndefOr[typings.awsSdk.medialiveMod.NielsenWatermarksSettings] = js.undefined
}
object AudioWatermarkSettings {
  
  inline def apply(): AudioWatermarkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioWatermarkSettings]
  }
  
  extension [Self <: AudioWatermarkSettings](x: Self) {
    
    inline def setNielsenWatermarksSettings(value: NielsenWatermarksSettings): Self = StObject.set(x, "NielsenWatermarksSettings", value.asInstanceOf[js.Any])
    
    inline def setNielsenWatermarksSettingsUndefined: Self = StObject.set(x, "NielsenWatermarksSettings", js.undefined)
  }
}
