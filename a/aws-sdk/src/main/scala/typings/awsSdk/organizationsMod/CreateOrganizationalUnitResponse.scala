package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOrganizationalUnitResponse extends js.Object {
  /**
    * A structure that contains details about the newly created OU.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.organizationsMod.OrganizationalUnit] = js.native
}

object CreateOrganizationalUnitResponse {
  @scala.inline
  def apply(): CreateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationalUnitResponse]
  }
  @scala.inline
  implicit class CreateOrganizationalUnitResponseOps[Self <: CreateOrganizationalUnitResponse] (val x: Self) extends AnyVal {
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
    def setOrganizationalUnit(value: OrganizationalUnit): Self = this.set("OrganizationalUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationalUnit: Self = this.set("OrganizationalUnit", js.undefined)
  }
  
}

