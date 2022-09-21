package typings.ckeditorCkeditor5Language

import typings.ckeditorCkeditor5Language.textpartlanguageMod.TextPartLanguage
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textpartlanguageeditingMod {
  
  @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguageediting", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TextPartLanguageEditing
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguageediting", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.TextPartLanguageEditing = js.native
  }
  
  @js.native
  trait TextPartLanguageEditing
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var TextPartLanguage: typings.ckeditorCkeditor5Language.textpartlanguageMod.TextPartLanguage
    }
    object Plugins {
      
      inline def apply(TextPartLanguage: TextPartLanguage): Plugins = {
        val __obj = js.Dynamic.literal(TextPartLanguage = TextPartLanguage.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setTextPartLanguage(value: TextPartLanguage): Self = StObject.set(x, "TextPartLanguage", value.asInstanceOf[js.Any])
      }
    }
  }
}
