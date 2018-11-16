package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "TableQuery")
@js.native
class TableQuery () extends js.Object {
  def and(condition: java.lang.String, args: java.lang.String*): TableQuery = js.native
  def from(table: java.lang.String): TableQuery = js.native
  def or(condition: java.lang.String, args: java.lang.String*): TableQuery = js.native
  def toPath(): java.lang.String = js.native
  def toQueryObject(): js.Any = js.native
  def top(integer: scala.Double): TableQuery = js.native
  def where(condition: java.lang.String, values: java.lang.String*): TableQuery = js.native
  def whereKeys(partitionKey: java.lang.String, rowKey: java.lang.String): TableQuery = js.native
  def whereNextKeys(partitionKey: java.lang.String, rowKey: java.lang.String): TableQuery = js.native
}

@JSImport("azure", "TableQuery")
@js.native
object TableQuery extends js.Object {
  def select(fields: java.lang.String*): azureLib.azureMod.TableQuery = js.native
}

