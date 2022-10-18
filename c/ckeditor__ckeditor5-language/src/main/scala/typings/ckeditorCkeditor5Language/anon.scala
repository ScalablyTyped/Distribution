package typings.ckeditorCkeditor5Language

import org.scalablytyped.runtime.Instantiable0
import typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.TextPartLanguageEditing
import typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.TextPartLanguageUI
import typings.ckeditorCkeditor5Language.srcTextpartlanguageeditingMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LanguageCode extends StObject {
    
    var languageCode: js.UndefOr[String | Boolean] = js.undefined
    
    var textDirection: js.UndefOr[String] = js.undefined
  }
  object LanguageCode {
    
    inline def apply(): LanguageCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguageCode]
    }
    
    extension [Self <: LanguageCode](x: Self) {
      
      inline def setLanguageCode(value: String | Boolean): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
      
      inline def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    }
  }
  
  trait TextDirection extends StObject {
    
    var languageCode: String
    
    var textDirection: String
  }
  object TextDirection {
    
    inline def apply(languageCode: String, textDirection: String): TextDirection = {
      val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDirection]
    }
    
    extension [Self <: TextDirection](x: Self) {
      
      inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofTextPartLanguageEdi
    extends StObject
       with Instantiable0[default] {
    
    val pluginName: TextPartLanguageEditing = js.native
  }
  
  @js.native
  trait TypeofTextPartLanguageUI
    extends StObject
       with Instantiable0[typings.ckeditorCkeditor5Language.srcTextpartlanguageuiMod.default] {
    
    val pluginName: TextPartLanguageUI = js.native
  }
}
