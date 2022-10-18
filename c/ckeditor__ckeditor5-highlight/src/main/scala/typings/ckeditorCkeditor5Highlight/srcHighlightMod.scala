package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.anon.TypeofHighlightEditing
import typings.ckeditorCkeditor5Highlight.anon.TypeofHighlightUI
import typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.marker
import typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.pen
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHighlightMod {
  
  @JSImport("@ckeditor/ckeditor5-highlight/src/highlight", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Plugin
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-highlight/src/highlight", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.Highlight = js.native
    
    @JSImport("@ckeditor/ckeditor5-highlight/src/highlight", "default.requires")
    @js.native
    val requires: js.Tuple2[TypeofHighlightEditing, TypeofHighlightUI] = js.native
  }
  
  type Highlight = Plugin
  
  trait HighlightConfig extends StObject {
    
    var options: js.Array[HighlightOption]
  }
  object HighlightConfig {
    
    inline def apply(options: js.Array[HighlightOption]): HighlightConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightConfig]
    }
    
    extension [Self <: HighlightConfig](x: Self) {
      
      inline def setOptions(value: js.Array[HighlightOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: HighlightOption*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait HighlightOption extends StObject {
    
    var `class`: String
    
    var color: String
    
    var model: String
    
    var title: String
    
    var `type`: marker | pen
  }
  object HighlightOption {
    
    inline def apply(`class`: String, color: String, model: String, title: String, `type`: marker | pen): HighlightOption = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightOption]
    }
    
    extension [Self <: HighlightOption](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: marker | pen): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Highlight: typings.ckeditorCkeditor5Highlight.srcHighlightMod.Highlight
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
