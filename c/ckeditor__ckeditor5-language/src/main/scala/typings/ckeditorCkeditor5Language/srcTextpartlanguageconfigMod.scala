package typings.ckeditorCkeditor5Language

import typings.ckeditorCkeditor5Utils.srcLanguageMod.LanguageDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextpartlanguageconfigMod {
  
  trait TextPartLanguageOption extends StObject {
    
    /**
      * The language code in the ISO 639 format.
      */
    var languageCode: String
    
    /**
      * The language text direction. Automatically detected if omitted.
      */
    var textDirection: js.UndefOr[LanguageDirection] = js.undefined
    
    /**
      * The user-readable title of the option.
      */
    var title: String
  }
  object TextPartLanguageOption {
    
    inline def apply(languageCode: String, title: String): TextPartLanguageOption = {
      val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextPartLanguageOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextPartLanguageOption] (val x: Self) extends AnyVal {
      
      inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(value: LanguageDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
