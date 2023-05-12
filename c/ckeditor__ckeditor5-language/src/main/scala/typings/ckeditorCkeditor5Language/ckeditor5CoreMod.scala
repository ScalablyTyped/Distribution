package typings.ckeditorCkeditor5Language

import typings.ckeditorCkeditor5Language.mod.TextPartLanguageCommand
import typings.ckeditorCkeditor5Language.srcTextpartlanguageconfigMod.TextPartLanguageOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditor5CoreMod {
  
  trait CommandsMap extends StObject {
    
    var textPartLanguage: TextPartLanguageCommand
  }
  object CommandsMap {
    
    inline def apply(textPartLanguage: TextPartLanguageCommand): CommandsMap = {
      val __obj = js.Dynamic.literal(textPartLanguage = textPartLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandsMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandsMap] (val x: Self) extends AnyVal {
      
      inline def setTextPartLanguage(value: TextPartLanguageCommand): Self = StObject.set(x, "textPartLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  trait LanguageConfig extends StObject {
    
    /**
      * The available {@link module:language/textpartlanguage~TextPartLanguage}
      * options that allow setting the language of parts of the content.
      *
      * This configuration option is available only with the {@glink api/language text part language feature} enabled.
      *
      * Refer to the [WCAG 3.1.2 Language of Parts](https://www.w3.org/TR/UNDERSTANDING-WCAG20/meaning-other-lang-id.html) specification
      * to learn more.
      *
      * To change the editor's UI language, refer to the {@glink features/ui-language Setting the UI language} guide.
      *
      * The default value is:
      *
      * ```ts
      * const config = [
      * 	{ title: 'Arabic', languageCode: 'ar' },
      * 	{ title: 'French', languageCode: 'fr' },
      * 	{ title: 'Spanish', languageCode: 'es' }
      * ];
      * ```
      *
      * The `title` property will be used by the text part language dropdown to render available options.
      *
      * The `languageCode` property is used for the `lang` attribute in the [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639-1) format.
      *
      * You can also specify the optional `textDirection` property indicating the reading direction of the language.
      * Correct values are `ltr` and `rtl`. When the `textDirection` property is missing, the text part language feature will
      * specify the text direction by itself.
      */
    var textPartLanguage: js.UndefOr[js.Array[TextPartLanguageOption]] = js.undefined
  }
  object LanguageConfig {
    
    inline def apply(): LanguageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguageConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageConfig] (val x: Self) extends AnyVal {
      
      inline def setTextPartLanguage(value: js.Array[TextPartLanguageOption]): Self = StObject.set(x, "textPartLanguage", value.asInstanceOf[js.Any])
      
      inline def setTextPartLanguageUndefined: Self = StObject.set(x, "textPartLanguage", js.undefined)
      
      inline def setTextPartLanguageVarargs(value: TextPartLanguageOption*): Self = StObject.set(x, "textPartLanguage", js.Array(value*))
    }
  }
  
  @js.native
  trait PluginsMap extends StObject
}
