package typings.cssSelect

import typings.cssSelect.typesMod.CompileToken
import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssSelect.typesMod.InternalSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalMod {
  
  @JSImport("css-select/lib/general", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compileGeneralSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: InternalSelector,
    options: InternalOptions[Node, ElementNode],
    context: js.Array[ElementNode],
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileGeneralSelector")(next.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compileToken.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  @scala.inline
  def compileGeneralSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: InternalSelector,
    options: InternalOptions[Node, ElementNode],
    context: Unit,
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileGeneralSelector")(next.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compileToken.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
}
