package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Dictoption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCollection extends js.Object {
  
  var bloomFilterFalsePositiveChance: Double = js.native
  
  var caching: String = js.native
  
  var clusteringKeys: js.Array[ColumnInfo] = js.native
  
  var clusteringOrder: js.Array[String] = js.native
  
  var columns: js.Array[ColumnInfo] = js.native
  
  var columnsByName: StringDictionary[ColumnInfo] = js.native
  
  var comment: String = js.native
  
  var compactionClass: String = js.native
  
  var compactionOptions: StringDictionary[js.Any] = js.native
  
  var compression: Dictoption = js.native
  
  var crcCheckChange: js.UndefOr[Double] = js.native
  
  var defaultTtl: Double = js.native
  
  var extensions: StringDictionary[js.Any] = js.native
  
  var gcGraceSeconds: Double = js.native
  
  var localReadRepairChance: Double = js.native
  
  var maxIndexInterval: js.UndefOr[Double] = js.native
  
  var minIndexInterval: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var partitionKeys: js.Array[ColumnInfo] = js.native
  
  var populateCacheOnFlush: Boolean = js.native
  
  var readRepairChance: Double = js.native
  
  var speculativeRetry: String = js.native
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
    speculativeRetry: String
  ): DataCollection = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollection]
  }
  
  @scala.inline
  implicit class DataCollectionOps[Self <: DataCollection] (val x: Self) extends AnyVal {
    
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
    def setBloomFilterFalsePositiveChance(value: Double): Self = this.set("bloomFilterFalsePositiveChance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaching(value: String): Self = this.set("caching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringKeysVarargs(value: ColumnInfo*): Self = this.set("clusteringKeys", js.Array(value :_*))
    
    @scala.inline
    def setClusteringKeys(value: js.Array[ColumnInfo]): Self = this.set("clusteringKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringOrderVarargs(value: String*): Self = this.set("clusteringOrder", js.Array(value :_*))
    
    @scala.inline
    def setClusteringOrder(value: js.Array[String]): Self = this.set("clusteringOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: ColumnInfo*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnInfo]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsByName(value: StringDictionary[ColumnInfo]): Self = this.set("columnsByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactionClass(value: String): Self = this.set("compactionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactionOptions(value: StringDictionary[js.Any]): Self = this.set("compactionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: Dictoption): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTtl(value: Double): Self = this.set("defaultTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: StringDictionary[js.Any]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcGraceSeconds(value: Double): Self = this.set("gcGraceSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalReadRepairChance(value: Double): Self = this.set("localReadRepairChance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKeysVarargs(value: ColumnInfo*): Self = this.set("partitionKeys", js.Array(value :_*))
    
    @scala.inline
    def setPartitionKeys(value: js.Array[ColumnInfo]): Self = this.set("partitionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopulateCacheOnFlush(value: Boolean): Self = this.set("populateCacheOnFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRepairChance(value: Double): Self = this.set("readRepairChance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeculativeRetry(value: String): Self = this.set("speculativeRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrcCheckChange(value: Double): Self = this.set("crcCheckChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrcCheckChange: Self = this.set("crcCheckChange", js.undefined)
    
    @scala.inline
    def setMaxIndexInterval(value: Double): Self = this.set("maxIndexInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIndexInterval: Self = this.set("maxIndexInterval", js.undefined)
    
    @scala.inline
    def setMinIndexInterval(value: Double): Self = this.set("minIndexInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinIndexInterval: Self = this.set("minIndexInterval", js.undefined)
  }
}
