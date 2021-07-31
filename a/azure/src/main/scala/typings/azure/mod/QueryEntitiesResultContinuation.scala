package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryEntitiesResultContinuation
  extends StObject
     with QueryResultContinuation {
  
  def getNextPage(): Unit = js.native
  def getNextPage(callback: QueryEntitiesCallback): Unit = js.native
  
  def hasNextPage(): Boolean = js.native
  
  var nextPartitionKey: String = js.native
  
  var nextRowKey: String = js.native
  
  var tableQuery: TableQuery = js.native
}
