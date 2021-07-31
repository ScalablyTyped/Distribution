package typings.azureMobileApps.Azure.MobileApps

import typings.azureMobileApps.Azure.MobileApps.Data.Table
import typings.azureMobileApps.Express.Request
import typings.azureMobileApps.Express.Response
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  def data(table: TableDefinition): Table = js.native
  @JSName("data")
  var data_Original: ContextData = js.native
  
  def execute(): Thenable[js.Any] = js.native
  
  var id: String | Double = js.native
  
  var item: js.Any = js.native
  
  var logger: Logger = js.native
  
  def next(error: String): js.Any = js.native
  def next(error: Error): js.Any = js.native
  
  var push: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Azure.ServiceBus.NotificationHubService */ js.Any = js.native
  
  var query: QueryJs = js.native
  
  var req: Request = js.native
  
  var res: Response = js.native
  
  def tables(tableName: String): Table = js.native
  
  var user: User = js.native
}
