package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_C
import typings.cassandraDashDriver.Anon_CIndex
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
    caching: caching,
    clusterKeys: js.Array[Anon_C],
    clusteringOrder: js.Array[String],
    columns: js.Array[ColumnInfo],
    columnsByName: StringDictionary[ColumnInfo],
    comment: String,
    compactionClass: String,
    compactionOptions: js.Any,
    compression: js.Any,
    defaultTtl: Double,
    extensions: js.Any,
    gcGraceSeconds: Double,
    indexes: js.Array[Index],
    isCompact: Boolean,
    localReadRepairChance: Double,
    memtableFlushPeriod: Double,
    name: String,
    partitionKeys: js.Array[Anon_CIndex],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    replicateOnWrite: Boolean,
    speculateRetry: String,
    virtual: Boolean,
    cdc: js.UndefOr[Boolean] = js.undefined,
    crcCheckChange: Int | Double = null,
    indexInterval: Int | Double = null,
    maxIndexInterval: Int | Double = null,
    minIndexInterval: Int | Double = null
  ): TableMetadata = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance, caching = caching, clusterKeys = clusterKeys, clusteringOrder = clusteringOrder, columns = columns, columnsByName = columnsByName, comment = comment, compactionClass = compactionClass, compactionOptions = compactionOptions, compression = compression, defaultTtl = defaultTtl, extensions = extensions, gcGraceSeconds = gcGraceSeconds, indexes = indexes, isCompact = isCompact, localReadRepairChance = localReadRepairChance, memtableFlushPeriod = memtableFlushPeriod, name = name, partitionKeys = partitionKeys, populateCacheOnFlush = populateCacheOnFlush, readRepairChance = readRepairChance, replicateOnWrite = replicateOnWrite, speculateRetry = speculateRetry, virtual = virtual)
    if (!js.isUndefined(cdc)) __obj.updateDynamic("cdc")(cdc)
    if (crcCheckChange != null) __obj.updateDynamic("crcCheckChange")(crcCheckChange.asInstanceOf[js.Any])
    if (indexInterval != null) __obj.updateDynamic("indexInterval")(indexInterval.asInstanceOf[js.Any])
    if (maxIndexInterval != null) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.asInstanceOf[js.Any])
    if (minIndexInterval != null) __obj.updateDynamic("minIndexInterval")(minIndexInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
}

