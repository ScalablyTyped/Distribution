package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eventtypes extends StObject {
  
  var event_types: js.UndefOr[js.Array[String]] = js.undefined
  
  var gender: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var voice_name: String
}
object Eventtypes {
  
  inline def apply(voice_name: String): Eventtypes = {
    val __obj = js.Dynamic.literal(voice_name = voice_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventtypes]
  }
  
  extension [Self <: Eventtypes](x: Self) {
    
    inline def setEvent_types(value: js.Array[String]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
    
    inline def setEvent_typesUndefined: Self = StObject.set(x, "event_types", js.undefined)
    
    inline def setEvent_typesVarargs(value: String*): Self = StObject.set(x, "event_types", js.Array(value*))
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setVoice_name(value: String): Self = StObject.set(x, "voice_name", value.asInstanceOf[js.Any])
  }
}
