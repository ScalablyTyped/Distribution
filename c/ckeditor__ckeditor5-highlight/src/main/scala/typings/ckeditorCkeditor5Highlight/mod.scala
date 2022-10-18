package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.anon.TypeofHighlightEditing
import typings.ckeditorCkeditor5Highlight.anon.TypeofHighlightUI
import typings.ckeditorCkeditor5Highlight.srcHighlightMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-highlight", "Highlight")
  @js.native
  open class Highlight () extends default
  /* static members */
  object Highlight {
    
    @JSImport("@ckeditor/ckeditor5-highlight", "Highlight.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.Highlight = js.native
    
    @JSImport("@ckeditor/ckeditor5-highlight", "Highlight.requires")
    @js.native
    val requires: js.Tuple2[TypeofHighlightEditing, TypeofHighlightUI] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-highlight", "HighlightEditing")
  @js.native
  open class HighlightEditing ()
    extends typings.ckeditorCkeditor5Highlight.srcHighlighteditingMod.default
  /* static members */
  object HighlightEditing {
    
    @JSImport("@ckeditor/ckeditor5-highlight", "HighlightEditing.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightEditing = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-highlight", "HighlightUI")
  @js.native
  open class HighlightUI ()
    extends typings.ckeditorCkeditor5Highlight.srcHighlightuiMod.default
  /* static members */
  object HighlightUI {
    
    @JSImport("@ckeditor/ckeditor5-highlight", "HighlightUI.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightUI = js.native
  }
}
