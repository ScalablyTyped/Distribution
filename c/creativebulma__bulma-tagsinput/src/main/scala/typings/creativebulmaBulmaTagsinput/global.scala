package typings.creativebulmaBulmaTagsinput

import typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInputOptions
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object BulmaTagsInput {
    
    @JSGlobal("BulmaTagsInput")
    @js.native
    open class ^ protected ()
      extends typings.creativebulmaBulmaTagsinput.mod.^ {
      /**
        * @param selector query string returning a single Node or directly a Node
        */
      def this(selector: String) = this()
      def this(selector: HTMLInputElement) = this()
      def this(selector: String, options: BulmaTagsInputOptions) = this()
      def this(selector: HTMLInputElement, options: BulmaTagsInputOptions) = this()
    }
    
    @JSGlobal("BulmaTagsInput")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * DOM modifications will be observed to detect any new element responding to the given selector
      * to automatically instantiate BulmaTagsInput on them with the given option.
      *
      * @param selector selector can be a query string returning a single Node or a NodeList, directly
      * a Node or a NodeList
      */
    /* static member */
    inline def attach(selector: String): typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInput = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInput]
    inline def attach(selector: String, options: BulmaTagsInputOptions): typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInput = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInput]
    inline def attach(selector: HTMLInputElement): typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInput = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInput]
    inline def attach(selector: HTMLInputElement, options: BulmaTagsInputOptions): typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInput = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInput]
  }
}
