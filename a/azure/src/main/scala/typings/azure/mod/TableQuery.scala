package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "TableQuery")
@js.native
class TableQuery () extends StObject {
  
  def and(condition: String, args: String*): TableQuery = js.native
  
  def from(table: String): TableQuery = js.native
  
  def or(condition: String, args: String*): TableQuery = js.native
  
  def toPath(): String = js.native
  
  def toQueryObject(): js.Any = js.native
  
  def top(integer: Double): TableQuery = js.native
  
  def where(condition: String, values: String*): TableQuery = js.native
  
  def whereKeys(partitionKey: String, rowKey: String): TableQuery = js.native
  
  def whereNextKeys(partitionKey: String, rowKey: String): TableQuery = js.native
}
/* static members */
object TableQuery {
  
  @JSImport("azure", "TableQuery.select")
  @js.native
  def select(fields: String*): TableQuery = js.native
}
