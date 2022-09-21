package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSettings extends StObject {
  
  var accessibility: js.UndefOr[Any] = js.undefined
  
  var audioChannelConfiguration: js.UndefOr[js.Array[Any]] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var viewpoint: js.UndefOr[Any] = js.undefined
}
object MediaSettings {
  
  inline def apply(): MediaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSettings]
  }
  
  extension [Self <: MediaSettings](x: Self) {
    
    inline def setAccessibility(value: Any): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAudioChannelConfiguration(value: js.Array[Any]): Self = StObject.set(x, "audioChannelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAudioChannelConfigurationUndefined: Self = StObject.set(x, "audioChannelConfiguration", js.undefined)
    
    inline def setAudioChannelConfigurationVarargs(value: Any*): Self = StObject.set(x, "audioChannelConfiguration", js.Array(value*))
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setViewpoint(value: Any): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
  }
}
