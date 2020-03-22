package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.AnonDictoption
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
  var compression: AnonDictoption
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
    compression: AnonDictoption,
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
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any])
    if (crcCheckChange != null) __obj.updateDynamic("crcCheckChange")(crcCheckChange.asInstanceOf[js.Any])
    if (maxIndexInterval != null) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.asInstanceOf[js.Any])
    if (minIndexInterval != null) __obj.updateDynamic("minIndexInterval")(minIndexInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollection]
  }
}

