package typings.cheerioSelect

import typings.cssSelect.libPseudoSelectorsFiltersMod.Filter
import typings.cssSelect.libPseudoSelectorsPseudosMod.Pseudo
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.mod.Document
import typings.domhandler.mod.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmMod {
  
  @JSImport("cheerio-select/lib/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cheerio-select/lib/esm", "aliases")
  @js.native
  val aliases: Record[String, String] = js.native
  
  inline def filter(selector: String, elements: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def filter(selector: String, elements: js.Array[AnyNode], options: Options): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  @JSImport("cheerio-select/lib/esm", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  inline def is(element: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def is(element: Element, selector: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def is(element: Element, selector: js.Function1[/* el */ Element, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def is(element: Element, selector: js.Function1[/* el */ Element, Boolean], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("cheerio-select/lib/esm", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
  
  inline def select(selector: String, root: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: String, root: js.Array[AnyNode], options: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: String, root: js.Array[AnyNode], options: Options): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: String, root: js.Array[AnyNode], options: Options, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: String, root: AnyNode): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: String, root: AnyNode, options: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: String, root: AnyNode, options: Options): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: String, root: AnyNode, options: Options, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: js.Function1[/* el */ Element, Boolean], root: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(
    selector: js.Function1[/* el */ Element, Boolean],
    root: js.Array[AnyNode],
    options: Unit,
    limit: Double
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: js.Function1[/* el */ Element, Boolean], root: js.Array[AnyNode], options: Options): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(
    selector: js.Function1[/* el */ Element, Boolean],
    root: js.Array[AnyNode],
    options: Options,
    limit: Double
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: js.Function1[/* el */ Element, Boolean], root: AnyNode): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: js.Function1[/* el */ Element, Boolean], root: AnyNode, options: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: js.Function1[/* el */ Element, Boolean], root: AnyNode, options: Options): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def select(selector: js.Function1[/* el */ Element, Boolean], root: AnyNode, options: Options, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def some(elements: js.Array[Element], selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(elements.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(elements: js.Array[Element], selector: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(elements.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(elements: js.Array[Element], selector: js.Function1[/* el */ Element, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(elements.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(elements: js.Array[Element], selector: js.Function1[/* el */ Element, Boolean], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(elements.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options
    extends StObject
       with typings.cssSelect.libTypesMod.Options[AnyNode, Element] {
    
    /** Optional reference to the root of the document. If not set, this will be computed when needed. */
    var root: js.UndefOr[Document] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
