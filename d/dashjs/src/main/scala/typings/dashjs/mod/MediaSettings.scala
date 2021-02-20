package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSettings extends StObject {
  
  var accessibility: js.UndefOr[js.Any] = js.native
  
  var audioChannelConfiguration: js.UndefOr[js.Array[_]] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var viewpoint: js.UndefOr[js.Any] = js.native
}
object MediaSettings {
  
  @scala.inline
  def apply(): MediaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSettings]
  }
  
  @scala.inline
  implicit class MediaSettingsMutableBuilder[Self <: MediaSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: js.Any): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAudioChannelConfiguration(value: js.Array[_]): Self = StObject.set(x, "audioChannelConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioChannelConfigurationUndefined: Self = StObject.set(x, "audioChannelConfiguration", js.undefined)
    
    @scala.inline
    def setAudioChannelConfigurationVarargs(value: js.Any*): Self = StObject.set(x, "audioChannelConfiguration", js.Array(value :_*))
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setViewpoint(value: js.Any): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
  }
}
