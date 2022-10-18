package typings.cssSelect

import typings.cssSelect.libEsmTypesMod.CompiledQuery
import typings.cssSelect.libEsmTypesMod.InternalOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPseudoSelectorsFiltersMod {
  
  @JSImport("css-select/lib/esm/pseudo-selectors/filters", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  type Filter = js.Function4[
    /* next */ CompiledQuery[Any], 
    /* text */ String, 
    /* options */ InternalOptions[Any, Any], 
    /* context */ js.UndefOr[js.Array[Any]], 
    CompiledQuery[Any]
  ]
}
