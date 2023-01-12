package typings.ckeditorCkeditor5Language

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextpartlanguageuiMod {
  
  @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguageui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TextPartLanguageUI
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguageui", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.TextPartLanguageUI = js.native
  }
  
  @js.native
  trait TextPartLanguageUI
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var TextPartLanguageUI: typings.ckeditorCkeditor5Language.srcTextpartlanguageuiMod.TextPartLanguageUI
    }
    object Plugins {
      
      inline def apply(TextPartLanguageUI: TextPartLanguageUI): Plugins = {
        val __obj = js.Dynamic.literal(TextPartLanguageUI = TextPartLanguageUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
        
        inline def setTextPartLanguageUI(value: TextPartLanguageUI): Self = StObject.set(x, "TextPartLanguageUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
