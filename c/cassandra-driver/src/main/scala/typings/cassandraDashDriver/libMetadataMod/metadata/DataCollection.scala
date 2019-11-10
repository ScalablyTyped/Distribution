package typings.cassandraDashDriver.libMetadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCollection extends js.Object {
  var bloomFilterFalsePositiveChance: Double
  var caching: String
  var clusteringKeys: js.Array[ColumnInfo]
  var clusteringOrder: js.Array[String]
  var columns: js.Array[ColumnInfo]
  var columnsByName: StringDictionary[ColumnInfo]
  var comment: String
  var compactionClass: String
  var compactionOptions: StringDictionary[js.Any]
  var compression: Anon_Class
  var crcCheckChange: js.UndefOr[Double] = js.undefined
  var defaultTtl: Double
  var extensions: StringDictionary[js.Any]
  var gcGraceSeconds: Double
  var localReadRepairChance: Double
  var maxIndexInterval: js.UndefOr[Double] = js.undefined
  var minIndexInterval: js.UndefOr[Double] = js.undefined
  var name: String
  var partitionKeys: js.Array[ColumnInfo]
  var populateCacheOnFlush: Boolean
  var readRepairChance: Double
  var speculativeRetry: String
}

object DataCollection {
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
    localReadRepairChance: Double,
    name: String,
    partitionKeys: js.Array[ColumnInfo],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    speculativeRetry: String,
    crcCheckChange: Int | Double = null,
    maxIndexInterval: Int | Double = null,
    minIndexInterval: Int | Double = null
  ): DataCollection = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance, caching = caching, clusteringKeys = clusteringKeys, clusteringOrder = clusteringOrder, columns = columns, columnsByName = columnsByName, comment = comment, compactionClass = compactionClass, compactionOptions = compactionOptions, compression = compression, defaultTtl = defaultTtl, extensions = extensions, gcGraceSeconds = gcGraceSeconds, localReadRepairChance = localReadRepairChance, name = name, partitionKeys = partitionKeys, populateCacheOnFlush = populateCacheOnFlush, readRepairChance = readRepairChance, speculativeRetry = speculativeRetry)
    if (crcCheckChange != null) __obj.updateDynamic("crcCheckChange")(crcCheckChange.asInstanceOf[js.Any])
    if (maxIndexInterval != null) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.asInstanceOf[js.Any])
    if (minIndexInterval != null) __obj.updateDynamic("minIndexInterval")(minIndexInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollection]
  }
}

