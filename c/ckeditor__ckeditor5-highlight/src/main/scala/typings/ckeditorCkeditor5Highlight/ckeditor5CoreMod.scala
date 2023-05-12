package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.mod.HighlightCommand
import typings.ckeditorCkeditor5Highlight.srcHighlightconfigMod.HighlightConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditor5CoreMod {
  
  trait CommandsMap extends StObject {
    
    var highlight: HighlightCommand
  }
  object CommandsMap {
    
    inline def apply(highlight: HighlightCommand): CommandsMap = {
      val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandsMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandsMap] (val x: Self) extends AnyVal {
      
      inline def setHighlight(value: HighlightCommand): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditorConfig extends StObject {
    
    /**
      * The configuration of the {@link module:highlight/highlight~Highlight} feature.
      *
      * Read more in {@link module:highlight/highlightconfig~HighlightConfig}.
      */
    var highlight: js.UndefOr[HighlightConfig] = js.undefined
  }
  object EditorConfig {
    
    inline def apply(): EditorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorConfig] (val x: Self) extends AnyVal {
      
      inline def setHighlight(value: HighlightConfig): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    }
  }
  
  @js.native
  trait PluginsMap extends StObject
}
