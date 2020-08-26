package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableResource extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, it is the account ID of the caller.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the table.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * A wildcard object representing every table under a database. At least one of TableResource$Name or TableResource$TableWildcard is required.
    */
  var TableWildcard: js.UndefOr[typings.awsSdk.lakeformationMod.TableWildcard] = js.native
}

object TableResource {
  @scala.inline
  def apply(DatabaseName: NameString): TableResource = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResource]
  }
  @scala.inline
  implicit class TableResourceOps[Self <: TableResource] (val x: Self) extends AnyVal {
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
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setTableWildcard(value: TableWildcard): Self = this.set("TableWildcard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableWildcard: Self = this.set("TableWildcard", js.undefined)
  }
  
}

