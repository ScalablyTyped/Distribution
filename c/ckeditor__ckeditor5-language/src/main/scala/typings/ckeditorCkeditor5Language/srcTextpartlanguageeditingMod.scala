package typings.ckeditorCkeditor5Language

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextpartlanguageeditingMod {
  
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
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var TextPartLanguageEditing: typings.ckeditorCkeditor5Language.srcTextpartlanguageeditingMod.TextPartLanguageEditing
    }
    object Plugins {
      
      inline def apply(TextPartLanguageEditing: TextPartLanguageEditing): Plugins = {
        val __obj = js.Dynamic.literal(TextPartLanguageEditing = TextPartLanguageEditing.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setTextPartLanguageEditing(value: TextPartLanguageEditing): Self = StObject.set(x, "TextPartLanguageEditing", value.asInstanceOf[js.Any])
      }
    }
  }
}
