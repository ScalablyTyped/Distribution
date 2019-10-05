package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelMappingInfo extends js.Object {
  var keyspace: String
  var tables: js.Array[ModelTables]
  def getColumnName(propName: String): String
  def getPropertyName(columnName: String): String
  def newInstance(): TableMappings
}

@JSImport("cassandra-driver", "mapping.ModelMappingInfo")
@js.native
object ModelMappingInfo extends TopLevel[ModelMappingInfoStatic]

