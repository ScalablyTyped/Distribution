package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H265FilterSettings extends StObject {
  
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.medialiveMod.TemporalFilterSettings] = js.undefined
}
object H265FilterSettings {
  
  @scala.inline
  def apply(): H265FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H265FilterSettings]
  }
  
  @scala.inline
  implicit class H265FilterSettingsMutableBuilder[Self <: H265FilterSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemporalFilterSettings(value: TemporalFilterSettings): Self = StObject.set(x, "TemporalFilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporalFilterSettingsUndefined: Self = StObject.set(x, "TemporalFilterSettings", js.undefined)
  }
}
