package typings.cssSelect

import typings.cssSelect.libTypesMod.CompiledQuery
import typings.cssSelect.libTypesMod.InternalOptions
import typings.cssSelect.libTypesMod.InternalSelector
import typings.cssWhat.typesMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileMod {
  
  @JSImport("css-select/lib/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: Node): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: js.Array[Node]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: InternalOptions[Node, ElementNode]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: InternalOptions[Node, ElementNode], context: Node): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  inline def compile[Node, ElementNode /* <: Node */](
    selector: js.Array[js.Array[Selector]],
    options: InternalOptions[Node, ElementNode],
    context: js.Array[Node]
  ): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  
  inline def compileToken[Node, ElementNode /* <: Node */](token: js.Array[js.Array[InternalSelector]], options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileToken")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileToken[Node, ElementNode /* <: Node */](
    token: js.Array[js.Array[InternalSelector]],
    options: InternalOptions[Node, ElementNode],
    context: Node
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileToken")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileToken[Node, ElementNode /* <: Node */](
    token: js.Array[js.Array[InternalSelector]],
    options: InternalOptions[Node, ElementNode],
    context: js.Array[Node]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileToken")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: Node): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: String, options: InternalOptions[Node, ElementNode], context: js.Array[Node]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: InternalOptions[Node, ElementNode]): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](selector: js.Array[js.Array[Selector]], options: InternalOptions[Node, ElementNode], context: Node): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileUnsafe[Node, ElementNode /* <: Node */](
    selector: js.Array[js.Array[Selector]],
    options: InternalOptions[Node, ElementNode],
    context: js.Array[Node]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileUnsafe")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
}
