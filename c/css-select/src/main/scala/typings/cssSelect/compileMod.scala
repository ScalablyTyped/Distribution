package typings.cssSelect

import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssSelect.typesMod.InternalSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-select/lib/compile", JSImport.Namespace)
@js.native
object compileMod extends js.Object {
  
  def compile[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = js.native
  def compile[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  
  def compileToken[Node, ElementNode /* <: Node */](token: js.Array[js.Array[InternalSelector]], options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = js.native
  def compileToken[Node, ElementNode /* <: Node */](
    token: js.Array[js.Array[InternalSelector]],
    options: InternalOptions[Node, ElementNode],
    context: ElementNode
  ): CompiledQuery[ElementNode] = js.native
  def compileToken[Node, ElementNode /* <: Node */](
    token: js.Array[js.Array[InternalSelector]],
    options: InternalOptions[Node, ElementNode],
    context: js.Array[ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  
  def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = js.native
  def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: ElementNode): CompiledQuery[ElementNode] = js.native
  def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
}
