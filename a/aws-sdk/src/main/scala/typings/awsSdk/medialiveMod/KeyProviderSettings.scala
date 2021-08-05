package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyProviderSettings extends StObject {
  
  var StaticKeySettings: js.UndefOr[typings.awsSdk.medialiveMod.StaticKeySettings] = js.undefined
}
object KeyProviderSettings {
  
  inline def apply(): KeyProviderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyProviderSettings]
  }
  
  extension [Self <: KeyProviderSettings](x: Self) {
    
    inline def setStaticKeySettings(value: StaticKeySettings): Self = StObject.set(x, "StaticKeySettings", value.asInstanceOf[js.Any])
    
    inline def setStaticKeySettingsUndefined: Self = StObject.set(x, "StaticKeySettings", js.undefined)
  }
}
