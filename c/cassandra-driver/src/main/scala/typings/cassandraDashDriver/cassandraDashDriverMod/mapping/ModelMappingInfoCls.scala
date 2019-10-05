package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "mapping.ModelMappingInfo")
@js.native
class ModelMappingInfoCls protected () extends ModelMappingInfo {
  def this(
    keyspace: String,
    tables: js.Array[ModelTables],
    mappings: TableMappings,
    columns: StringDictionary[String]
  ) = this()
  /* CompleteClass */
  override var keyspace: String = js.native
  /* CompleteClass */
  override var tables: js.Array[ModelTables] = js.native
  /* CompleteClass */
  override def getColumnName(propName: String): String = js.native
  /* CompleteClass */
  override def getPropertyName(columnName: String): String = js.native
  /* CompleteClass */
  override def newInstance(): TableMappings = js.native
}

