package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatabaseRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the metadata database resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A DatabaseInput object specifying the new definition of the metadata database in the catalog.
    */
  var DatabaseInput: typings.awsSdk.glueMod.DatabaseInput = js.native
  /**
    * The name of the database to update in the catalog. For Hive compatibility, this is folded to lowercase.
    */
  var Name: NameString = js.native
}

object UpdateDatabaseRequest {
  @scala.inline
  def apply(DatabaseInput: DatabaseInput, Name: NameString, CatalogId: CatalogIdString = null): UpdateDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseInput = DatabaseInput.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatabaseRequest]
  }
}

