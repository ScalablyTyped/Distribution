package typings.ckeditorCkeditor5SelectAll

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSelectalluiMod {
  
  @JSImport("@ckeditor/ckeditor5-select-all/src/selectallui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SelectAllUI
  
  @js.native
  trait SelectAllUI
    extends StObject
       with Plugin {
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
  }
}
