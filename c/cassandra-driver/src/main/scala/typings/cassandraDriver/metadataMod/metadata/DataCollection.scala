package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Dictoption
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
  var compression: Dictoption
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
    compression: Dictoption,
    defaultTtl: Double,
    extensions: StringDictionary[js.Any],
    gcGraceSeconds: Double,
    localReadRepairChance: Double,
    name: String,
    partitionKeys: js.Array[ColumnInfo],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    speculativeRetry: String,
    crcCheckChange: js.UndefOr[Double] = js.undefined,
    maxIndexInterval: js.UndefOr[Double] = js.undefined,
    minIndexInterval: js.UndefOr[Double] = js.undefined
  ): DataCollection = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any])
    if (!js.isUndefined(crcCheckChange)) __obj.updateDynamic("crcCheckChange")(crcCheckChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIndexInterval)) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minIndexInterval)) __obj.updateDynamic("minIndexInterval")(minIndexInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollection]
  }
}

