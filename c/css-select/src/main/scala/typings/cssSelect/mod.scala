package typings.cssSelect

import typings.cssSelect.filtersMod.Filter
import typings.cssSelect.pseudosMod.Pseudo
import typings.cssSelect.typesMod.Adapter
import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalSelector
import typings.cssSelect.typesMod.Options
import typings.cssSelect.typesMod.Query
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  @scala.inline
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  @scala.inline
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  @scala.inline
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  
  @scala.inline
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String): CompiledQuery[ElementNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any]).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Unit, context: js.Array[ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  
  @scala.inline
  def compileToken[Node_1, ElementNode /* <: Node_1 */](selector: js.Array[js.Array[InternalSelector]]): CompiledQuery[ElementNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any]).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compileToken[Node_1, ElementNode /* <: Node_1 */](selector: js.Array[js.Array[InternalSelector]], options: Unit, context: js.Array[ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compileToken[Node_1, ElementNode /* <: Node_1 */](selector: js.Array[js.Array[InternalSelector]], options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compileToken[Node_1, ElementNode /* <: Node_1 */](
    selector: js.Array[js.Array[InternalSelector]],
    options: Options[ElementNode, ElementNode],
    context: js.Array[ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileToken")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  
  @scala.inline
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String): CompiledQuery[ElementNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any]).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Unit, context: js.Array[ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  
  @JSImport("css-select", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  @scala.inline
  def is[Node, ElementNode /* <: Node */](elem: ElementNode, query: Query[ElementNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(elem.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def is[Node, ElementNode /* <: Node */](elem: ElementNode, query: Query[ElementNode], options: Options[Node, ElementNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(elem.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def prepareContext[Node, ElementNode /* <: Node */](elems: ElementNode, adapter: Adapter[Node, ElementNode]): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareContext")(elems.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  @scala.inline
  def prepareContext[Node, ElementNode /* <: Node */](elems: ElementNode, adapter: Adapter[Node, ElementNode], shouldTestNextSiblings: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareContext")(elems.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any], shouldTestNextSiblings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  @scala.inline
  def prepareContext[Node, ElementNode /* <: Node */](elems: js.Array[ElementNode], adapter: Adapter[Node, ElementNode]): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareContext")(elems.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  @scala.inline
  def prepareContext[Node, ElementNode /* <: Node */](elems: js.Array[ElementNode], adapter: Adapter[Node, ElementNode], shouldTestNextSiblings: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareContext")(elems.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any], shouldTestNextSiblings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  @JSImport("css-select", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
  
  @scala.inline
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  @scala.inline
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  @scala.inline
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  @scala.inline
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  
  @scala.inline
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): ElementNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOne")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[ElementNode | Null]
  @scala.inline
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): ElementNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOne")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ElementNode | Null]
  @scala.inline
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): ElementNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOne")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[ElementNode | Null]
  @scala.inline
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): ElementNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOne")(query.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ElementNode | Null]
}
