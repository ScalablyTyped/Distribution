package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.highlightMod.Highlight
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlighteditingMod {
  
  @JSImport("@ckeditor/ckeditor5-highlight/src/highlightediting", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HighlightEditing
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-highlight/src/highlightediting", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightEditing = js.native
  }
  
  @js.native
  trait HighlightEditing
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
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
