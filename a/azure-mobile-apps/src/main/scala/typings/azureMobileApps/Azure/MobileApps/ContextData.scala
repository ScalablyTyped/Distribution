package typings.azureMobileApps.Azure.MobileApps

import typings.azureMobileApps.Azure.MobileApps.Data.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextData extends StObject {
  
  def apply(table: TableDefinition): Table = js.native
  
  def execute(q: SqlQueryDefinition): Thenable[js.Any] = js.native
}
