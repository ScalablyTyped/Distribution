package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.AnonClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableMetadata extends DataCollection {
  var cdc: js.UndefOr[Boolean] = js.undefined
  var indexInterval: js.UndefOr[Double] = js.undefined
  var indexes: js.Array[Index]
  var isCompact: Boolean
  var memtableFlushPeriod: Double
  var replicateOnWrite: Boolean
  var virtual: Boolean
}

object TableMetadata {
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
    compression: AnonClass,
    defaultTtl: Double,
    extensions: StringDictionary[js.Any],
    gcGraceSeconds: Double,
    indexes: js.Array[Index],
    isCompact: Boolean,
    localReadRepairChance: Double,
    memtableFlushPeriod: Double,
    name: String,
    partitionKeys: js.Array[ColumnInfo],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    replicateOnWrite: Boolean,
    speculativeRetry: String,
    virtual: Boolean,
    cdc: js.UndefOr[Boolean] = js.undefined,
    crcCheckChange: Int | Double = null,
    indexInterval: Int | Double = null,
    maxIndexInterval: Int | Double = null,
    minIndexInterval: Int | Double = null
  ): TableMetadata = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], isCompact = isCompact.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], memtableFlushPeriod = memtableFlushPeriod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], replicateOnWrite = replicateOnWrite.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    if (!js.isUndefined(cdc)) __obj.updateDynamic("cdc")(cdc.asInstanceOf[js.Any])
    if (crcCheckChange != null) __obj.updateDynamic("crcCheckChange")(crcCheckChange.asInstanceOf[js.Any])
    if (indexInterval != null) __obj.updateDynamic("indexInterval")(indexInterval.asInstanceOf[js.Any])
    if (maxIndexInterval != null) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.asInstanceOf[js.Any])
    if (minIndexInterval != null) __obj.updateDynamic("minIndexInterval")(minIndexInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
}

