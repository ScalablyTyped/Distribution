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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-select", JSImport.Default)
  @js.native
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): js.Array[ElementNode] = js.native
  @JSImport("css-select", JSImport.Default)
  @js.native
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): js.Array[ElementNode] = js.native
  @JSImport("css-select", JSImport.Default)
  @js.native
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): js.Array[ElementNode] = js.native
  @JSImport("css-select", JSImport.Default)
  @js.native
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): js.Array[ElementNode] = js.native
  
  @JSImport("css-select", "compile")
  @js.native
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "compile")
  @js.native
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: js.UndefOr[scala.Nothing], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "compile")
  @js.native
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "compile")
  @js.native
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  
  @JSImport("css-select", "_compileToken")
  @js.native
  def compileToken[Node_1, ElementNode /* <: Node_1 */](selector: js.Array[js.Array[InternalSelector]]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "_compileToken")
  @js.native
  def compileToken[Node_1, ElementNode /* <: Node_1 */](
    selector: js.Array[js.Array[InternalSelector]],
    options: js.UndefOr[scala.Nothing],
    context: js.Array[ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "_compileToken")
  @js.native
  def compileToken[Node_1, ElementNode /* <: Node_1 */](selector: js.Array[js.Array[InternalSelector]], options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "_compileToken")
  @js.native
  def compileToken[Node_1, ElementNode /* <: Node_1 */](
    selector: js.Array[js.Array[InternalSelector]],
    options: Options[ElementNode, ElementNode],
    context: js.Array[ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  
  @JSImport("css-select", "_compileUnsafe")
  @js.native
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "_compileUnsafe")
  @js.native
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: js.UndefOr[scala.Nothing], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "_compileUnsafe")
  @js.native
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select", "_compileUnsafe")
  @js.native
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  
  @JSImport("css-select", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  @JSImport("css-select", "is")
  @js.native
  def is[Node, ElementNode /* <: Node */](elem: ElementNode, query: Query[ElementNode]): Boolean = js.native
  @JSImport("css-select", "is")
  @js.native
  def is[Node, ElementNode /* <: Node */](elem: ElementNode, query: Query[ElementNode], options: Options[Node, ElementNode]): Boolean = js.native
  
  @JSImport("css-select", "prepareContext")
  @js.native
  def prepareContext[Node, ElementNode /* <: Node */](elems: ElementNode, adapter: Adapter[Node, ElementNode]): js.Array[Node] = js.native
  @JSImport("css-select", "prepareContext")
  @js.native
  def prepareContext[Node, ElementNode /* <: Node */](elems: ElementNode, adapter: Adapter[Node, ElementNode], shouldTestNextSiblings: Boolean): js.Array[Node] = js.native
  @JSImport("css-select", "prepareContext")
  @js.native
  def prepareContext[Node, ElementNode /* <: Node */](elems: js.Array[ElementNode], adapter: Adapter[Node, ElementNode]): js.Array[Node] = js.native
  @JSImport("css-select", "prepareContext")
  @js.native
  def prepareContext[Node, ElementNode /* <: Node */](elems: js.Array[ElementNode], adapter: Adapter[Node, ElementNode], shouldTestNextSiblings: Boolean): js.Array[Node] = js.native
  
  @JSImport("css-select", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
  
  @JSImport("css-select", "selectAll")
  @js.native
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): js.Array[ElementNode] = js.native
  @JSImport("css-select", "selectAll")
  @js.native
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): js.Array[ElementNode] = js.native
  @JSImport("css-select", "selectAll")
  @js.native
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): js.Array[ElementNode] = js.native
  @JSImport("css-select", "selectAll")
  @js.native
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): js.Array[ElementNode] = js.native
  
  @JSImport("css-select", "selectOne")
  @js.native
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): ElementNode | Null = js.native
  @JSImport("css-select", "selectOne")
  @js.native
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): ElementNode | Null = js.native
  @JSImport("css-select", "selectOne")
  @js.native
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): ElementNode | Null = js.native
  @JSImport("css-select", "selectOne")
  @js.native
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): ElementNode | Null = js.native
}
