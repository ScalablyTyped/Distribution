package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "TableQuery")
@js.native
class TableQuery () extends js.Object {
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
@JSImport("azure", "TableQuery")
@js.native
object TableQuery extends js.Object {
  def select(fields: String*): TableQuery = js.native
}

