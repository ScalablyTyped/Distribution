package typings.cssSelect

import typings.cssSelect.typesMod.CompileToken
import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssSelect.typesMod.InternalSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-select/lib/general", JSImport.Namespace)
@js.native
object generalMod extends js.Object {
  
  def compileGeneralSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: InternalSelector,
    options: InternalOptions[Node, ElementNode],
    context: js.UndefOr[scala.Nothing],
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  def compileGeneralSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: InternalSelector,
    options: InternalOptions[Node, ElementNode],
    context: js.Array[ElementNode],
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = js.native
}
