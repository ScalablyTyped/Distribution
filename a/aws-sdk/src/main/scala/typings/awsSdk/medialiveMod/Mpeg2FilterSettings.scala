package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mpeg2FilterSettings extends StObject {
  
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.medialiveMod.TemporalFilterSettings] = js.native
}
object Mpeg2FilterSettings {
  
  @scala.inline
  def apply(): Mpeg2FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mpeg2FilterSettings]
  }
  
  @scala.inline
  implicit class Mpeg2FilterSettingsMutableBuilder[Self <: Mpeg2FilterSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemporalFilterSettings(value: TemporalFilterSettings): Self = StObject.set(x, "TemporalFilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporalFilterSettingsUndefined: Self = StObject.set(x, "TemporalFilterSettings", js.undefined)
  }
}
