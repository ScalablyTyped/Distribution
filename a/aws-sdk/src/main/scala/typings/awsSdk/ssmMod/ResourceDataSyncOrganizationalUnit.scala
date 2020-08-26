package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncOrganizationalUnit extends js.Object {
  /**
    * The AWS Organization unit ID data source for the sync.
    */
  var OrganizationalUnitId: js.UndefOr[ResourceDataSyncOrganizationalUnitId] = js.native
}

object ResourceDataSyncOrganizationalUnit {
  @scala.inline
  def apply(): ResourceDataSyncOrganizationalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncOrganizationalUnit]
  }
  @scala.inline
  implicit class ResourceDataSyncOrganizationalUnitOps[Self <: ResourceDataSyncOrganizationalUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrganizationalUnitId(value: ResourceDataSyncOrganizationalUnitId): Self = this.set("OrganizationalUnitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationalUnitId: Self = this.set("OrganizationalUnitId", js.undefined)
  }
  
}

