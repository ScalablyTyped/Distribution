package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H264FilterSettings extends StObject {
  
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.medialiveMod.TemporalFilterSettings] = js.undefined
}
object H264FilterSettings {
  
  @scala.inline
  def apply(): H264FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264FilterSettings]
  }
  
  @scala.inline
  implicit class H264FilterSettingsMutableBuilder[Self <: H264FilterSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemporalFilterSettings(value: TemporalFilterSettings): Self = StObject.set(x, "TemporalFilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporalFilterSettingsUndefined: Self = StObject.set(x, "TemporalFilterSettings", js.undefined)
  }
}
