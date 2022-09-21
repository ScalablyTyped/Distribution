package typings.clipboard

import typings.clipboard.mod.CopyActionOptions
import typings.clipboard.mod.Options
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ClipboardJS {
    
    /**
      * Base class which takes one or more elements, adds event listeners to them,
      * and instantiates a new `ClipboardAction` on each click.
      */
    @JSGlobal("ClipboardJS")
    @js.native
    open class ^ protected ()
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
      * Fires a copy action
      */
    /* static member */
    inline def copy(target: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def copy(target: String, options: CopyActionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def copy(target: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def copy(target: Element, options: CopyActionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Fires a cut action
      */
    /* static member */
    inline def cut(target: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")(target.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def cut(target: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")(target.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Checks if clipboard.js is supported
      */
    /* static member */
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
}
