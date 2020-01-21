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
  def apply(
    DatabaseName: NameString,
    TableName: NameString,
    VersionIds: BatchDeleteTableVersionList,
    CatalogId: CatalogIdString = null
  ): BatchDeleteTableVersionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], VersionIds = VersionIds.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableVersionRequest]
  }
}

