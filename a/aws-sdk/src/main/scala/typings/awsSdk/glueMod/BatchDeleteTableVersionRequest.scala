package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteTableVersionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the tables reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the table. For Hive compatibility, this name is entirely lowercase.
    */
  var TableName: NameString = js.native
  /**
    * A list of the IDs of versions to be deleted. A VersionId is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionIds: BatchDeleteTableVersionList = js.native
}

object BatchDeleteTableVersionRequest {
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString, VersionIds: BatchDeleteTableVersionList): BatchDeleteTableVersionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], VersionIds = VersionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableVersionRequest]
  }
  @scala.inline
  implicit class BatchDeleteTableVersionRequestOps[Self <: BatchDeleteTableVersionRequest] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionIdsVarargs(value: VersionString*): Self = this.set("VersionIds", js.Array(value :_*))
    @scala.inline
    def setVersionIds(value: BatchDeleteTableVersionList): Self = this.set("VersionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

