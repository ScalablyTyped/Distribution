package typings.azureArmResource.managementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementGroup extends js.Object {
  var details: js.UndefOr[ManagementGroupDetailsProperties] = js.native
  var displayName: js.UndefOr[String] = js.native
  val id: js.UndefOr[String] = js.native
  val name: js.UndefOr[String] = js.native
  var tenantId: js.UndefOr[String] = js.native
  val `type`: js.UndefOr[String] = js.native
}

object ManagementGroup {
  @scala.inline
  def apply(): ManagementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementGroup]
  }
  @scala.inline
  implicit class ManagementGroupOps[Self <: ManagementGroup] (val x: Self) extends AnyVal {
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
    def setDetails(value: ManagementGroupDetailsProperties): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

