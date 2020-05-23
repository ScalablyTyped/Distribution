package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Dictoption
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
    whereClause: String,
    crcCheckChange: js.UndefOr[Double] = js.undefined,
    maxIndexInterval: js.UndefOr[Double] = js.undefined,
    minIndexInterval: js.UndefOr[Double] = js.undefined
  ): MaterializedView = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], includeAllColumns = includeAllColumns.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], whereClause = whereClause.asInstanceOf[js.Any])
    if (!js.isUndefined(crcCheckChange)) __obj.updateDynamic("crcCheckChange")(crcCheckChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIndexInterval)) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minIndexInterval)) __obj.updateDynamic("minIndexInterval")(minIndexInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterializedView]
  }
}

