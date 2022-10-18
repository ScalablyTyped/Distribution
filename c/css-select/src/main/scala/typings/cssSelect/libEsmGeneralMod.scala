package typings.cssSelect

import typings.cssSelect.libEsmTypesMod.CompileToken
import typings.cssSelect.libEsmTypesMod.CompiledQuery
import typings.cssSelect.libEsmTypesMod.InternalOptions
import typings.cssSelect.libEsmTypesMod.InternalSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmGeneralMod {
  
  @JSImport("css-select/lib/esm/general", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileGeneralSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: InternalSelector,
    options: InternalOptions[Node, ElementNode],
    context: js.Array[Node],
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileGeneralSelector")(next.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compileToken.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compileGeneralSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: InternalSelector,
    options: InternalOptions[Node, ElementNode],
    context: Unit,
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileGeneralSelector")(next.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compileToken.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
}
