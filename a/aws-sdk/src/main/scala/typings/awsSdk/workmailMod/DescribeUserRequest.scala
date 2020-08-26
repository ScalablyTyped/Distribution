package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserRequest extends js.Object {
  /**
    * The identifier for the organization under which the user exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The identifier for the user to be described.
    */
  var UserId: WorkMailIdentifier = js.native
}

object DescribeUserRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserRequest]
  }
  @scala.inline
  implicit class DescribeUserRequestOps[Self <: DescribeUserRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

