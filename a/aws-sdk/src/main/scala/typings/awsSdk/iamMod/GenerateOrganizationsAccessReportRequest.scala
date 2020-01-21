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
  def apply(EntityPath: organizationsEntityPathType, OrganizationsPolicyId: organizationsPolicyIdType = null): GenerateOrganizationsAccessReportRequest = {
    val __obj = js.Dynamic.literal(EntityPath = EntityPath.asInstanceOf[js.Any])
    if (OrganizationsPolicyId != null) __obj.updateDynamic("OrganizationsPolicyId")(OrganizationsPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOrganizationsAccessReportRequest]
  }
}

