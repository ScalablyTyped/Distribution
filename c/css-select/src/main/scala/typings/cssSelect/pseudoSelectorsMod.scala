package typings.cssSelect

import typings.cssSelect.filtersMod.Filter
import typings.cssSelect.pseudosMod.Pseudo
import typings.cssSelect.typesMod.CompileToken
import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssWhat.parseMod.PseudoSelector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pseudoSelectorsMod {
  
  @JSImport("css-select/lib/pseudo-selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compilePseudoSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: PseudoSelector,
    options: InternalOptions[Node, ElementNode],
    context: js.Array[ElementNode],
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compilePseudoSelector")(next.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compileToken.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compilePseudoSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: PseudoSelector,
    options: InternalOptions[Node, ElementNode],
    context: Unit,
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compilePseudoSelector")(next.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compileToken.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  
  @JSImport("css-select/lib/pseudo-selectors", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  @JSImport("css-select/lib/pseudo-selectors", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
}
