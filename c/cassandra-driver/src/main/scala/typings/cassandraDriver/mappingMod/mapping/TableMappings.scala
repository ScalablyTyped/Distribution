package typings.cassandraDriver.mappingMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableMappings extends js.Object {
  def getColumnName(propName: String): String
  def getPropertyName(columnName: String): String
  def newObjectInstance(): js.Any
}

object TableMappings {
  @scala.inline
  def apply(
    getColumnName: String => String,
    getPropertyName: String => String,
    newObjectInstance: () => js.Any
  ): TableMappings = {
    val __obj = js.Dynamic.literal(getColumnName = js.Any.fromFunction1(getColumnName), getPropertyName = js.Any.fromFunction1(getPropertyName), newObjectInstance = js.Any.fromFunction0(newObjectInstance))
  
    __obj.asInstanceOf[TableMappings]
  }
}

