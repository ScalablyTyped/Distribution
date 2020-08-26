package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOrganizationsAccessReportRequest extends js.Object {
  /**
    * The path of the AWS Organizations entity (root, OU, or account). You can build an entity path using the known structure of your organization. For example, assume that your account ID is 123456789012 and its parent OU ID is ou-rge0-awsabcde. The organization root ID is r-f6g7h8i9j0example and your organization ID is o-a1b2c3d4e5. Your entity path is o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012.
    */
  var EntityPath: organizationsEntityPathType = js.native
  /**
    * The identifier of the AWS Organizations service control policy (SCP). This parameter is optional. This ID is used to generate information about when an account principal that is limited by the SCP attempted to access an AWS service.
    */
  var OrganizationsPolicyId: js.UndefOr[organizationsPolicyIdType] = js.native
}

object GenerateOrganizationsAccessReportRequest {
  @scala.inline
  def apply(EntityPath: organizationsEntityPathType): GenerateOrganizationsAccessReportRequest = {
    val __obj = js.Dynamic.literal(EntityPath = EntityPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOrganizationsAccessReportRequest]
  }
  @scala.inline
  implicit class GenerateOrganizationsAccessReportRequestOps[Self <: GenerateOrganizationsAccessReportRequest] (val x: Self) extends AnyVal {
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
    def setEntityPath(value: organizationsEntityPathType): Self = this.set("EntityPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationsPolicyId(value: organizationsPolicyIdType): Self = this.set("OrganizationsPolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationsPolicyId: Self = this.set("OrganizationsPolicyId", js.undefined)
  }
  
}

