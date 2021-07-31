package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyProviderSettings extends StObject {
  
  var StaticKeySettings: js.UndefOr[typings.awsSdk.medialiveMod.StaticKeySettings] = js.undefined
}
object KeyProviderSettings {
  
  @scala.inline
  def apply(): KeyProviderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyProviderSettings]
  }
  
  @scala.inline
  implicit class KeyProviderSettingsMutableBuilder[Self <: KeyProviderSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStaticKeySettings(value: StaticKeySettings): Self = StObject.set(x, "StaticKeySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticKeySettingsUndefined: Self = StObject.set(x, "StaticKeySettings", js.undefined)
  }
}
