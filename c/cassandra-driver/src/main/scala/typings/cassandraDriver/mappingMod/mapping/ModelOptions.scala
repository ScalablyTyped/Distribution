package typings.cassandraDriver.mappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelOptions extends js.Object {
  var columns: js.UndefOr[StringDictionary[String]] = js.undefined
  var keyspace: js.UndefOr[String] = js.undefined
  var mappings: js.UndefOr[TableMappings] = js.undefined
  var tables: js.UndefOr[js.Array[ModelTables | String]] = js.undefined
}

object ModelOptions {
  @scala.inline
  def apply(
    columns: StringDictionary[String] = null,
    keyspace: String = null,
    mappings: TableMappings = null,
    tables: js.Array[ModelTables | String] = null
  ): ModelOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (keyspace != null) __obj.updateDynamic("keyspace")(keyspace.asInstanceOf[js.Any])
    if (mappings != null) __obj.updateDynamic("mappings")(mappings.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelOptions]
  }
}

