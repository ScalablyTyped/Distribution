package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatabaseRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the database resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the database to delete. For Hive compatibility, this must be all lowercase.
    */
  var Name: NameString = js.native
}

object DeleteDatabaseRequest {
  @scala.inline
  def apply(Name: NameString, CatalogId: CatalogIdString = null): DeleteDatabaseRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatabaseRequest]
  }
}

