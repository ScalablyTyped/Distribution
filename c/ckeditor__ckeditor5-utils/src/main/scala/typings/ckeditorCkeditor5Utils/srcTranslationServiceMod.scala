package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTranslationServiceMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/translation-service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(language: String, translations: StringDictionary[String | js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(language.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def add(
    language: String,
    translations: StringDictionary[String | js.Array[String]],
    getPluralForm: js.Function1[/* n */ Double, Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(language.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], getPluralForm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_clear")().asInstanceOf[Unit]
  
  inline def translate(language: String, message: Message): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_translate")(language.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translate(language: String, message: Message, quantity: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_translate")(language.asInstanceOf[js.Any], message.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Message extends StObject {
    
    /**
      * The message ID. If passed, the message ID is taken from this property instead of the `message.string`.
      * This property is useful when various messages share the same message string, for example, the `editor` string in `in the editor`
      * and `my editor` sentences.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The plural form of the message. This property should be skipped when a message is not supposed
      * to support plural forms. Otherwise it should always be set to a string with the English plural form of the message.
      */
    val plural: js.UndefOr[String] = js.undefined
    
    /**
      * The message string to translate. Acts as a default translation if the translation for a given language
      * is not defined. When the message is supposed to support plural forms, the string should be the English singular form of the message.
      */
    val string: String
  }
  object Message {
    
    inline def apply(string: String): Message = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
