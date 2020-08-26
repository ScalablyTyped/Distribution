package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partition extends js.Object {
  /**
    * The ID of the Data Catalog in which the partition resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The time at which the partition was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the catalog database in which to create the partition.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  /**
    * The last time at which the partition was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time at which column statistics were computed for this partition.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.native
  /**
    * These key-value pairs define partition parameters.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * Provides information about the physical location where the partition is stored.
    */
  var StorageDescriptor: js.UndefOr[typings.awsSdk.glueMod.StorageDescriptor] = js.native
  /**
    * The name of the database table in which to create the partition.
    */
  var TableName: js.UndefOr[NameString] = js.native
  /**
    * The values of the partition.
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}

object Partition {
  @scala.inline
  def apply(): Partition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partition]
  }
  @scala.inline
  implicit class PartitionOps[Self <: Partition] (val x: Self) extends AnyVal {
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
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    @scala.inline
    def setLastAccessTime(value: Timestamp): Self = this.set("LastAccessTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAccessTime: Self = this.set("LastAccessTime", js.undefined)
    @scala.inline
    def setLastAnalyzedTime(value: Timestamp): Self = this.set("LastAnalyzedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAnalyzedTime: Self = this.set("LastAnalyzedTime", js.undefined)
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setStorageDescriptor(value: StorageDescriptor): Self = this.set("StorageDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageDescriptor: Self = this.set("StorageDescriptor", js.undefined)
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    @scala.inline
    def setValuesVarargs(value: ValueString*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: ValueStringList): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

