package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var Catalog: js.UndefOr[CatalogResource] = js.native
  /**
    * The location of an Amazon S3 path where permissions are granted or revoked. 
    */
  var DataLocation: js.UndefOr[DataLocationResource] = js.native
  /**
    * The database for the resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database permissions to a principal. 
    */
  var Database: js.UndefOr[DatabaseResource] = js.native
  /**
    * The table for the resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Table: js.UndefOr[TableResource] = js.native
  /**
    * The table with columns for the resource. A principal with permissions to this resource can select metadata from the columns of a table in the Data Catalog and the underlying data in Amazon S3.
    */
  var TableWithColumns: js.UndefOr[TableWithColumnsResource] = js.native
}

object Resource {
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
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
    def setCatalog(value: CatalogResource): Self = this.set("Catalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalog: Self = this.set("Catalog", js.undefined)
    @scala.inline
    def setDataLocation(value: DataLocationResource): Self = this.set("DataLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLocation: Self = this.set("DataLocation", js.undefined)
    @scala.inline
    def setDatabase(value: DatabaseResource): Self = this.set("Database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("Database", js.undefined)
    @scala.inline
    def setTable(value: TableResource): Self = this.set("Table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
    @scala.inline
    def setTableWithColumns(value: TableWithColumnsResource): Self = this.set("TableWithColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableWithColumns: Self = this.set("TableWithColumns", js.undefined)
  }
  
}

