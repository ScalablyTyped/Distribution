package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessControlRulesRequest extends js.Object {
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object ListAccessControlRulesRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId): ListAccessControlRulesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessControlRulesRequest]
  }
  @scala.inline
  implicit class ListAccessControlRulesRequestOps[Self <: ListAccessControlRulesRequest] (val x: Self) extends AnyVal {
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
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

