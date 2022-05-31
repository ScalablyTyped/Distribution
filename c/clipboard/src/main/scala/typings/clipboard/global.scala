package typings.clipboard

import typings.clipboard.mod.Options
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ClipboardJS {
    
    @JSGlobal("ClipboardJS")
    @js.native
    class ^ protected ()
      extends typings.clipboard.mod.^ {
      def this(selector: String) = this()
      def this(selector: Element) = this()
      def this(selector: NodeListOf[Element]) = this()
      def this(selector: String, options: Options) = this()
      def this(selector: Element, options: Options) = this()
      def this(selector: NodeListOf[Element], options: Options) = this()
    }
    
    @JSGlobal("ClipboardJS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if clipboard.js is supported
      */
    /* static member */
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
}
