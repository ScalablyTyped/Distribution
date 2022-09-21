package typings.datatablesNet.DataTables

import typings.datatablesNet.datatablesNetStrings.`type`
import typings.datatablesNet.datatablesNetStrings.display
import typings.datatablesNet.datatablesNetStrings.filter
import typings.datatablesNet.datatablesNetStrings.set
import typings.datatablesNet.datatablesNetStrings.sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionColumnData extends StObject {
  
  def apply(row: Any, t: display | sort | filter | `type`, s: Unit, meta: CellMetaSettings): Any = js.native
  def apply(row: Any, t: set, s: Any, meta: CellMetaSettings): Unit = js.native
}
