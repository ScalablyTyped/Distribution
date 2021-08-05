package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mpeg2FilterSettings extends StObject {
  
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.medialiveMod.TemporalFilterSettings] = js.undefined
}
object Mpeg2FilterSettings {
  
  inline def apply(): Mpeg2FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mpeg2FilterSettings]
  }
  
  extension [Self <: Mpeg2FilterSettings](x: Self) {
    
    inline def setTemporalFilterSettings(value: TemporalFilterSettings): Self = StObject.set(x, "TemporalFilterSettings", value.asInstanceOf[js.Any])
    
    inline def setTemporalFilterSettingsUndefined: Self = StObject.set(x, "TemporalFilterSettings", js.undefined)
  }
}
