package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.anon.Bluemarker
import typings.ckeditorCkeditor5Highlight.highlightMod.Highlight
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightuiMod {
  
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
  
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Highlight: typings.ckeditorCkeditor5Highlight.highlightMod.Highlight
    }
    object Plugins {
      
      inline def apply(Highlight: Highlight): Plugins = {
        val __obj = js.Dynamic.literal(Highlight = Highlight.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setHighlight(value: Highlight): Self = StObject.set(x, "Highlight", value.asInstanceOf[js.Any])
      }
    }
  }
}
