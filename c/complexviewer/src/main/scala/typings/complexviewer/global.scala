package typings.complexviewer

import typings.complexviewer.mod.AppConstructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object complexviewer {
    
    @JSGlobal("complexviewer.App")
    @js.native
    val App: AppConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("complexviewer.App")
    @js.native
    open class AppCls protected ()
      extends StObject
         with typings.complexviewer.mod.App {
      def this(networkDiv: HTMLElement) = this()
      def this(networkDiv: HTMLElement, maxCountInitiallyExpanded: Double) = this()
    }
  }
}
