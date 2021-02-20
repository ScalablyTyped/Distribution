package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Eventtypes extends StObject {
  
  var event_types: js.UndefOr[js.Array[String]] = js.native
  
  var gender: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var voice_name: String = js.native
}
object Eventtypes {
  
  @scala.inline
  def apply(voice_name: String): Eventtypes = {
    val __obj = js.Dynamic.literal(voice_name = voice_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventtypes]
  }
  
  @scala.inline
  implicit class EventtypesMutableBuilder[Self <: Eventtypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent_types(value: js.Array[String]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_typesUndefined: Self = StObject.set(x, "event_types", js.undefined)
    
    @scala.inline
    def setEvent_typesVarargs(value: String*): Self = StObject.set(x, "event_types", js.Array(value :_*))
    
    @scala.inline
    def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setVoice_name(value: String): Self = StObject.set(x, "voice_name", value.asInstanceOf[js.Any])
  }
}
