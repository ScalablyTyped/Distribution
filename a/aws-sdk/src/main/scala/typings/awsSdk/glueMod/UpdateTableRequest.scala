package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  /**
    * By default, UpdateTable always creates an archived version of the table before updating it. However, if skipArchive is set to true, UpdateTable does not create the archived version.
    */
  var SkipArchive: js.UndefOr[BooleanNullable] = js.native
  /**
    * An updated TableInput object to define the metadata table in the catalog.
    */
  var TableInput: typings.awsSdk.glueMod.TableInput = js.native
}

object UpdateTableRequest {
  @scala.inline
  def apply(DatabaseName: NameString, TableInput: TableInput): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableInput = TableInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
  @scala.inline
  implicit class UpdateTableRequestOps[Self <: UpdateTableRequest] (val x: Self) extends AnyVal {
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
    def setTableInput(value: TableInput): Self = this.set("TableInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    @scala.inline
    def setSkipArchive(value: BooleanNullable): Self = this.set("SkipArchive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipArchive: Self = this.set("SkipArchive", js.undefined)
  }
  
}

