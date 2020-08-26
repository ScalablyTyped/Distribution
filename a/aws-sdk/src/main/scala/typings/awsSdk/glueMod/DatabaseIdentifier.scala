package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseIdentifier extends js.Object {
  /**
    * The ID of the Data Catalog in which the database resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
}

object DatabaseIdentifier {
  @scala.inline
  def apply(): DatabaseIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseIdentifier]
  }
  @scala.inline
  implicit class DatabaseIdentifierOps[Self <: DatabaseIdentifier] (val x: Self) extends AnyVal {
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
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    @scala.inline
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
  }
  
}

