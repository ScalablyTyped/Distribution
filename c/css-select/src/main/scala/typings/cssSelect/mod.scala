package typings.cssSelect

import typings.cssSelect.libTypesMod.Adapter
import typings.cssSelect.libTypesMod.CompiledQuery
import typings.cssSelect.libTypesMod.InternalSelector
import typings.cssSelect.libTypesMod.Options
import typings.cssSelect.libTypesMod.Query
import typings.cssSelect.pseudoSelectorsFiltersMod.Filter
import typings.cssSelect.pseudoSelectorsPseudosMod.Pseudo
import typings.cssWhat.typesMod.Selector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: Node): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  inline def default[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: Node, options: Options[Node, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  inline def default[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: js.Array[Node]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  inline def default[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: js.Array[Node], options: Options[Node, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  
  @JSImport("css-select", "aliases")
  @js.native
  val aliases: Record[String, String] = js.native
  
  inline def compile[Node, ElementNode /* <: Node */](selector: String): CompiledQuery[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any]).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: String, options: Unit, context: Node): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: String, options: Unit, context: js.Array[Node]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: String, options: Options[Node, ElementNode]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: String, options: Options[Node, ElementNode], context: Node): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: String, options: Options[Node, ElementNode], context: js.Array[Node]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]]): CompiledQuery[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any]).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: Unit, context: Node): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: Unit, context: js.Array[Node]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: Options[Node, ElementNode]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: Options[Node, ElementNode], context: Node): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](
    selector: js.Array[js.Array[Selector]],
    options: Options[Node, ElementNode],
    context: js.Array[Node]
  ): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  
  inline def compileToken[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[InternalSelector]]): CompiledQuery[ElementNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any]).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileToken[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[InternalSelector]], options: Unit, context: Node): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileToken[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[InternalSelector]], options: Unit, context: js.Array[Node]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileToken[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[InternalSelector]], options: Options[Node, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileToken[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[InternalSelector]], options: Options[Node, ElementNode], context: Node): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileToken[Node, ElementNode /* <: Node */](
    selector: js.Array[js.Array[InternalSelector]],
    options: Options[Node, ElementNode],
    context: js.Array[Node]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String): CompiledQuery[ElementNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any]).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: Unit, context: Node): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: Unit, context: js.Array[Node]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: Options[Node, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: Options[Node, ElementNode], context: Node): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: Options[Node, ElementNode], context: js.Array[Node]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]]): CompiledQuery[ElementNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any]).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: Unit, context: Node): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: Unit, context: js.Array[Node]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: Options[Node, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: Options[Node, ElementNode], context: Node): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](
    selector: js.Array[js.Array[Selector]],
    options: Options[Node, ElementNode],
    context: js.Array[Node]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  
  @JSImport("css-select", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  inline def is[Node, ElementNode /* <: Node */](elem: ElementNode, query: Query[ElementNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(elem.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def is[Node, ElementNode /* <: Node */](elem: ElementNode, query: Query[ElementNode], options: Options[Node, ElementNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(elem.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def prepareContext[Node, ElementNode /* <: Node */](elems: Node, adapter: Adapter[Node, ElementNode]): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareContext")(elems.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def prepareContext[Node, ElementNode /* <: Node */](elems: Node, adapter: Adapter[Node, ElementNode], shouldTestNextSiblings: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareContext")(elems.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any], shouldTestNextSiblings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def prepareContext[Node, ElementNode /* <: Node */](elems: js.Array[Node], adapter: Adapter[Node, ElementNode]): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareContext")(elems.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def prepareContext[Node, ElementNode /* <: Node */](elems: js.Array[Node], adapter: Adapter[Node, ElementNode], shouldTestNextSiblings: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareContext")(elems.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any], shouldTestNextSiblings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  @JSImport("css-select", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
  
  inline def selectAll[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: Node): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  inline def selectAll[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: Node, options: Options[Node, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  inline def selectAll[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: js.Array[Node]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  inline def selectAll[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: js.Array[Node], options: Options[Node, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  
  inline def selectOne[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: Node): ElementNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOne")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[ElementNode | Null]
  inline def selectOne[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: Node, options: Options[Node, ElementNode]): ElementNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOne")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ElementNode | Null]
  inline def selectOne[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: js.Array[Node]): ElementNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOne")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[ElementNode | Null]
  inline def selectOne[Node, ElementNode /* <: Node */](query: Query[ElementNode], elements: js.Array[Node], options: Options[Node, ElementNode]): ElementNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOne")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ElementNode | Null]
}
