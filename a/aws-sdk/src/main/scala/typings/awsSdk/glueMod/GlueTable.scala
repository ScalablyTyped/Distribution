package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlueTable extends js.Object {
  /**
    * A unique identifier for the AWS Glue Data Catalog.
    */
  var CatalogId: js.UndefOr[NameString] = js.native
  /**
    * The name of the connection to the AWS Glue Data Catalog.
    */
  var ConnectionName: js.UndefOr[NameString] = js.native
  /**
    * A database name in the AWS Glue Data Catalog.
    */
  var DatabaseName: NameString = js.native
  /**
    * A table name in the AWS Glue Data Catalog.
    */
  var TableName: NameString = js.native
}

object GlueTable {
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString): GlueTable = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueTable]
  }
  @scala.inline
  implicit class GlueTableOps[Self <: GlueTable] (val x: Self) extends AnyVal {
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
    def setCatalogId(value: NameString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    @scala.inline
    def setConnectionName(value: NameString): Self = this.set("ConnectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionName: Self = this.set("ConnectionName", js.undefined)
  }
  
}

