package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationResponse extends js.Object {
  /**
    * A structure that contains information about the organization.  The AvailablePolicyTypes part of the response is deprecated, and you shouldn't use it in your apps. It doesn't include any policy type supported by Organizations other than SCPs. To determine which policy types are enabled in your organization, use the  ListRoots  operation. 
    */
  var Organization: js.UndefOr[typings.awsSdk.organizationsMod.Organization] = js.native
}

object DescribeOrganizationResponse {
  @scala.inline
  def apply(): DescribeOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationResponseOps[Self <: DescribeOrganizationResponse] (val x: Self) extends AnyVal {
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

