package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_C
import typings.cassandraDashDriver.Anon_CIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCollection extends js.Object {
  var bloomFilterFalsePositiveChance: Double
  var caching: typings.cassandraDashDriver.cassandraDashDriverMod.metadata.caching
  var clusterKeys: js.Array[Anon_C]
  var clusteringOrder: js.Array[String]
  var columns: js.Array[ColumnInfo]
  var columnsByName: StringDictionary[ColumnInfo]
  var comment: String
  var compactionClass: String
  var compactionOptions: js.Any
  var compression: js.Any
  var crcCheckChange: js.UndefOr[Double] = js.undefined
  var defaultTtl: Double
  var extensions: js.Any
  var gcGraceSeconds: Double
  var localReadRepairChance: Double
  var maxIndexInterval: js.UndefOr[Double] = js.undefined
  var minIndexInterval: js.UndefOr[Double] = js.undefined
  var name: String
  var partitionKeys: js.Array[Anon_CIndex]
  var populateCacheOnFlush: Boolean
  var readRepairChance: Double
  var speculateRetry: String
}

object DataCollection {
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
    localReadRepairChance: Double,
    name: String,
    partitionKeys: js.Array[Anon_CIndex],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    speculateRetry: String,
    crcCheckChange: Int | Double = null,
    maxIndexInterval: Int | Double = null,
    minIndexInterval: Int | Double = null
  ): DataCollection = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance, caching = caching, clusterKeys = clusterKeys, clusteringOrder = clusteringOrder, columns = columns, columnsByName = columnsByName, comment = comment, compactionClass = compactionClass, compactionOptions = compactionOptions, compression = compression, defaultTtl = defaultTtl, extensions = extensions, gcGraceSeconds = gcGraceSeconds, localReadRepairChance = localReadRepairChance, name = name, partitionKeys = partitionKeys, populateCacheOnFlush = populateCacheOnFlush, readRepairChance = readRepairChance, speculateRetry = speculateRetry)
    if (crcCheckChange != null) __obj.updateDynamic("crcCheckChange")(crcCheckChange.asInstanceOf[js.Any])
    if (maxIndexInterval != null) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.asInstanceOf[js.Any])
    if (minIndexInterval != null) __obj.updateDynamic("minIndexInterval")(minIndexInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollection]
  }
}

