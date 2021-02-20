package typings.cssSelect

import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssSelect.typesMod.InternalSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileMod {
  
  @JSImport("css-select/lib/compile", "compile")
  @js.native
  def compile[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select/lib/compile", "compile")
  @js.native
  def compile[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  
  @JSImport("css-select/lib/compile", "compileToken")
  @js.native
  def compileToken[Node, ElementNode /* <: Node */](token: js.Array[js.Array[InternalSelector]], options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select/lib/compile", "compileToken")
  @js.native
  def compileToken[Node, ElementNode /* <: Node */](
    token: js.Array[js.Array[InternalSelector]],
    options: InternalOptions[Node, ElementNode],
    context: ElementNode
  ): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select/lib/compile", "compileToken")
  @js.native
  def compileToken[Node, ElementNode /* <: Node */](
    token: js.Array[js.Array[InternalSelector]],
    options: InternalOptions[Node, ElementNode],
    context: js.Array[ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  
  @JSImport("css-select/lib/compile", "compileUnsafe")
  @js.native
  def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select/lib/compile", "compileUnsafe")
  @js.native
  def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: ElementNode): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select/lib/compile", "compileUnsafe")
  @js.native
  def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
}
