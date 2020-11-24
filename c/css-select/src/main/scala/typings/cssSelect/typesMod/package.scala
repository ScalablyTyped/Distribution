package typings.cssSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CompileToken[Node, ElementNode /* <: Node */] = js.Function3[
    /* token */ js.Array[js.Array[typings.cssSelect.typesMod.InternalSelector]], 
    /* options */ typings.cssSelect.typesMod.InternalOptions[Node, ElementNode], 
    /* context */ js.UndefOr[js.Array[ElementNode]], 
    typings.cssSelect.typesMod.CompiledQuery[ElementNode]
  ]
  
  type InternalSelector = typings.cssWhat.parseMod.Selector | typings.cssSelect.anon.Type
  
  type Predicate[Value] = js.Function1[/* v */ Value, scala.Boolean]
  
  type Query[ElementNode] = java.lang.String | typings.cssSelect.typesMod.CompiledQuery[ElementNode]
}
