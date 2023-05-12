package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.srcHighlightMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-highlight", "Highlight")
  @js.native
  open class Highlight () extends default
  
  @JSImport("@ckeditor/ckeditor5-highlight", "HighlightCommand")
  @js.native
  open class HighlightCommand ()
    extends typings.ckeditorCkeditor5Highlight.srcHighlightcommandMod.default
  
  @JSImport("@ckeditor/ckeditor5-highlight", "HighlightEditing")
  @js.native
  open class HighlightEditing protected ()
    extends typings.ckeditorCkeditor5Highlight.srcHighlighteditingMod.default {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-highlight", "HighlightUI")
  @js.native
  open class HighlightUI ()
    extends typings.ckeditorCkeditor5Highlight.srcHighlightuiMod.default
}
