package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputSettings extends StObject {
  
  /**
    * Settings for HLS output groups
    */
  var HlsSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.HlsSettings] = js.native
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
    def setHlsSettings(value: HlsSettings): Self = StObject.set(x, "HlsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsSettingsUndefined: Self = StObject.set(x, "HlsSettings", js.undefined)
  }
}
