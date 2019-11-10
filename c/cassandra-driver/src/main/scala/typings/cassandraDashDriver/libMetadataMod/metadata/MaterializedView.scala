package typings.cassandraDashDriver.libMetadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterializedView extends DataCollection {
  var includeAllColumns: Boolean
  var tableName: String
  var whereClause: String
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
    compression: Anon_Class,
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
    whereClause: String,
    crcCheckChange: Int | Double = null,
    maxIndexInterval: Int | Double = null,
    minIndexInterval: Int | Double = null
  ): MaterializedView = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance, caching = caching, clusteringKeys = clusteringKeys, clusteringOrder = clusteringOrder, columns = columns, columnsByName = columnsByName, comment = comment, compactionClass = compactionClass, compactionOptions = compactionOptions, compression = compression, defaultTtl = defaultTtl, extensions = extensions, gcGraceSeconds = gcGraceSeconds, includeAllColumns = includeAllColumns, localReadRepairChance = localReadRepairChance, name = name, partitionKeys = partitionKeys, populateCacheOnFlush = populateCacheOnFlush, readRepairChance = readRepairChance, speculativeRetry = speculativeRetry, tableName = tableName, whereClause = whereClause)
    if (crcCheckChange != null) __obj.updateDynamic("crcCheckChange")(crcCheckChange.asInstanceOf[js.Any])
    if (maxIndexInterval != null) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.asInstanceOf[js.Any])
    if (minIndexInterval != null) __obj.updateDynamic("minIndexInterval")(minIndexInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterializedView]
  }
}

