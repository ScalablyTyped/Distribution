package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the table for which to retrieve the definition. For Hive compatibility, this name is entirely lowercase.
    */
  var Name: NameString = js.native
}

object GetTableRequest {
  @scala.inline
  def apply(DatabaseName: NameString, Name: NameString): GetTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableRequest]
  }
  @scala.inline
  implicit class GetTableRequestOps[Self <: GetTableRequest] (val x: Self) extends AnyVal {
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

