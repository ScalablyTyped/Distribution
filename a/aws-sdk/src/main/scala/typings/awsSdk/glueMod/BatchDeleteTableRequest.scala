package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database in which the tables to delete reside. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  /**
    * A list of the table to delete.
    */
  var TablesToDelete: BatchDeleteTableNameList = js.native
}

object BatchDeleteTableRequest {
  @scala.inline
  def apply(DatabaseName: NameString, TablesToDelete: BatchDeleteTableNameList): BatchDeleteTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TablesToDelete = TablesToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableRequest]
  }
  @scala.inline
  implicit class BatchDeleteTableRequestOps[Self <: BatchDeleteTableRequest] (val x: Self) extends AnyVal {
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
    def setTablesToDeleteVarargs(value: NameString*): Self = this.set("TablesToDelete", js.Array(value :_*))
    @scala.inline
    def setTablesToDelete(value: BatchDeleteTableNameList): Self = this.set("TablesToDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

