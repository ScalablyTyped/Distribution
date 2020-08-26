package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Dictoption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterializedView extends DataCollection {
  var includeAllColumns: Boolean = js.native
  var tableName: String = js.native
  var whereClause: String = js.native
}

object MaterializedView {
  @scala.inline
  def apply(
    bloomFilterFalsePositiveChance: Double,
    caching: String,
    clusteringKeys: js.Array[ColumnInfo],
    clusteringOrder: js.Array[String],
    columns: js.Array[ColumnInfo],
    columnsByName: StringDictionary[ColumnInfo],
    comment: String,
    compactionClass: String,
    compactionOptions: StringDictionary[js.Any],
    compression: Dictoption,
    defaultTtl: Double,
    extensions: StringDictionary[js.Any],
    gcGraceSeconds: Double,
    includeAllColumns: Boolean,
    localReadRepairChance: Double,
    name: String,
    partitionKeys: js.Array[ColumnInfo],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    speculativeRetry: String,
    tableName: String,
    whereClause: String
  ): MaterializedView = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], includeAllColumns = includeAllColumns.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], whereClause = whereClause.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterializedView]
  }
  @scala.inline
  implicit class MaterializedViewOps[Self <: MaterializedView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIncludeAllColumns(value: Boolean): Self = this.set("includeAllColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhereClause(value: String): Self = this.set("whereClause", value.asInstanceOf[js.Any])
  }
  
}

