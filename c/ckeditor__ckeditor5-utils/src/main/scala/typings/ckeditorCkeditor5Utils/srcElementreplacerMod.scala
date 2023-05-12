package typings.ckeditorCkeditor5Utils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcElementreplacerMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/elementreplacer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ElementReplacer
  
  @js.native
  trait ElementReplacer extends StObject {
    
    /**
      * The elements replaced by {@link #replace} and their replacements.
      */
    /* private */ var _replacedElements: Any = js.native
    
    /**
      * Hides the `element` and, if specified, inserts the the given element next to it.
      *
      * The effect of this method can be reverted by {@link #restore}.
      *
      * @param element The element to replace.
      * @param newElement The replacement element. If not passed, then the `element` will just be hidden.
      */
    def replace(element: HTMLElement): Unit = js.native
    def replace(element: HTMLElement, newElement: HTMLElement): Unit = js.native
    
    /**
      * Restores what {@link #replace} did.
      */
    def restore(): Unit = js.native
  }
}
