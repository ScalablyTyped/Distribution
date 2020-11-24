package typings.cssSelect

import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-select/lib/pseudo-selectors/filters", JSImport.Namespace)
@js.native
object filtersMod extends js.Object {
  
  val filters: Record[String, Filter] = js.native
  
  type Filter = js.Function4[
    /* next */ CompiledQuery[js.Any], 
    /* text */ String, 
    /* options */ InternalOptions[js.Any, js.Any], 
    /* context */ js.UndefOr[js.Array[js.Any]], 
    CompiledQuery[js.Any]
  ]
}
