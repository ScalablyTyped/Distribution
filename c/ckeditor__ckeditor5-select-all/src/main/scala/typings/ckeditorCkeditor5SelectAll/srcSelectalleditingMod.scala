package typings.ckeditorCkeditor5SelectAll

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSelectalleditingMod {
  
  @JSImport("@ckeditor/ckeditor5-select-all/src/selectallediting", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SelectAllEditing
  
  @js.native
  trait SelectAllEditing
    extends StObject
       with Plugin {
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
  }
}
