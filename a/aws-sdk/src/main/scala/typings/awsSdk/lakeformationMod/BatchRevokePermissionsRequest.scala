package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRevokePermissionsRequest extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A list of up to 20 entries for resource permissions to be revoked by batch operation to the principal.
    */
  var Entries: BatchPermissionsRequestEntryList = js.native
}

object BatchRevokePermissionsRequest {
  @scala.inline
  def apply(Entries: BatchPermissionsRequestEntryList): BatchRevokePermissionsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRevokePermissionsRequest]
  }
  @scala.inline
  implicit class BatchRevokePermissionsRequestOps[Self <: BatchRevokePermissionsRequest] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: BatchPermissionsRequestEntry*): Self = this.set("Entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: BatchPermissionsRequestEntryList): Self = this.set("Entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

