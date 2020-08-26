package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseResource extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, it is the account ID of the caller.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the database resource. Unique to the Data Catalog.
    */
  var Name: NameString = js.native
}

object DatabaseResource {
  @scala.inline
  def apply(Name: NameString): DatabaseResource = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseResource]
  }
  @scala.inline
  implicit class DatabaseResourceOps[Self <: DatabaseResource] (val x: Self) extends AnyVal {
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

