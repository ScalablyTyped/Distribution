package typings.ckeditorCkeditor5Indent

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentuiMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IndentUI
  
  @js.native
  trait IndentUI
    extends StObject
       with Plugin {
    
    /**
      * Defines a UI button.
      */
    /* private */ var _defineButton: Any = js.native
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
  }
}
