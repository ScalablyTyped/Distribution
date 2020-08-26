package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationsDecisionDetail extends js.Object {
  /**
    * Specifies whether the simulated operation is allowed by the Organizations service control policies that impact the simulated user's account.
    */
  var AllowedByOrganizations: js.UndefOr[booleanType] = js.native
}

object OrganizationsDecisionDetail {
  @scala.inline
  def apply(): OrganizationsDecisionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationsDecisionDetail]
  }
  @scala.inline
  implicit class OrganizationsDecisionDetailOps[Self <: OrganizationsDecisionDetail] (val x: Self) extends AnyVal {
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
    def setAllowedByOrganizations(value: booleanType): Self = this.set("AllowedByOrganizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedByOrganizations: Self = this.set("AllowedByOrganizations", js.undefined)
  }
  
}

