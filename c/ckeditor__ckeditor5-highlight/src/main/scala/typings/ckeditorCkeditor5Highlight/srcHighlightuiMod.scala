package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.anon.Bluemarker
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHighlightuiMod {
  
  @JSImport("@ckeditor/ckeditor5-highlight/src/highlightui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HighlightUI
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-highlight/src/highlightui", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightUI = js.native
  }
  
  @js.native
  trait HighlightUI
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
    
    val localizedOptionTitles: Bluemarker = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var HighlightUI: typings.ckeditorCkeditor5Highlight.srcHighlightuiMod.HighlightUI
    }
    object Plugins {
      
      inline def apply(HighlightUI: HighlightUI): Plugins = {
        val __obj = js.Dynamic.literal(HighlightUI = HighlightUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
        
        inline def setHighlightUI(value: HighlightUI): Self = StObject.set(x, "HighlightUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
