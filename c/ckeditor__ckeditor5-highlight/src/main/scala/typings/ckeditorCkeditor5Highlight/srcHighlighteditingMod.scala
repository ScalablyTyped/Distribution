package typings.ckeditorCkeditor5Highlight

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHighlighteditingMod {
  
  @JSImport("@ckeditor/ckeditor5-highlight/src/highlightediting", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HighlightEditing {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @js.native
  trait HighlightEditing
    extends StObject
       with Plugin {
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
  }
}
