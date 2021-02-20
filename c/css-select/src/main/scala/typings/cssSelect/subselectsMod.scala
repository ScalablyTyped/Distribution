package typings.cssSelect

import typings.cssSelect.typesMod.Adapter
import typings.cssSelect.typesMod.CompileToken
import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssWhat.parseMod.Selector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subselectsMod {
  
  @JSImport("css-select/lib/pseudo-selectors/subselects", "ensureIsTag")
  @js.native
  def ensureIsTag[Node, ElementNode /* <: Node */](next: CompiledQuery[ElementNode], adapter: Adapter[Node, ElementNode]): CompiledQuery[ElementNode] = js.native
  
  @JSImport("css-select/lib/pseudo-selectors/subselects", "getNextSiblings")
  @js.native
  def getNextSiblings[Node, ElementNode /* <: Node */](elem: Node, adapter: Adapter[Node, ElementNode]): js.Array[ElementNode] = js.native
  
  @JSImport("css-select/lib/pseudo-selectors/subselects", "subselects")
  @js.native
  val subselects: Record[String, Subselect] = js.native
  
  type Subselect = js.Function5[
    /* next */ CompiledQuery[js.Any], 
    /* subselect */ js.Array[js.Array[Selector]], 
    /* options */ InternalOptions[js.Any, js.Any], 
    /* context */ js.UndefOr[js.Array[js.Any]], 
    /* compileToken */ CompileToken[js.Any, js.Any], 
    CompiledQuery[js.Any]
  ]
}
