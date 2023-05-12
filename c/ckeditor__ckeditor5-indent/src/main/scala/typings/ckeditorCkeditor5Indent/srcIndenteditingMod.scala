package typings.ckeditorCkeditor5Indent

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndenteditingMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentediting", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IndentEditing
  
  @js.native
  trait IndentEditing
    extends StObject
       with Plugin {
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
  }
}
