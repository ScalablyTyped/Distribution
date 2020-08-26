package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Dictoption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableMetadata extends DataCollection {
  var cdc: js.UndefOr[Boolean] = js.native
  var indexInterval: js.UndefOr[Double] = js.native
  var indexes: js.Array[Index] = js.native
  var isCompact: Boolean = js.native
  var memtableFlushPeriod: Double = js.native
  var replicateOnWrite: Boolean = js.native
  var virtual: Boolean = js.native
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
    compression: Dictoption,
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
    virtual: Boolean
  ): TableMetadata = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], isCompact = isCompact.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], memtableFlushPeriod = memtableFlushPeriod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], replicateOnWrite = replicateOnWrite.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
  @scala.inline
  implicit class TableMetadataOps[Self <: TableMetadata] (val x: Self) extends AnyVal {
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
    def setIndexesVarargs(value: Index*): Self = this.set("indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[Index]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCompact(value: Boolean): Self = this.set("isCompact", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemtableFlushPeriod(value: Double): Self = this.set("memtableFlushPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicateOnWrite(value: Boolean): Self = this.set("replicateOnWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def setCdc(value: Boolean): Self = this.set("cdc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdc: Self = this.set("cdc", js.undefined)
    @scala.inline
    def setIndexInterval(value: Double): Self = this.set("indexInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexInterval: Self = this.set("indexInterval", js.undefined)
  }
  
}

