package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOrganizationResponse extends js.Object {
  /**
    * A structure that contains details about the newly created organization.
    */
  var Organization: js.UndefOr[typings.awsSdk.organizationsMod.Organization] = js.native
}

object CreateOrganizationResponse {
  @scala.inline
  def apply(): CreateOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationResponse]
  }
  @scala.inline
  implicit class CreateOrganizationResponseOps[Self <: CreateOrganizationResponse] (val x: Self) extends AnyVal {
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
    def setOrganization(value: Organization): Self = this.set("Organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("Organization", js.undefined)
  }
  
}

