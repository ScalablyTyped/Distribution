package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an organization. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[OrganizationArn] = js.native
  /**
    *  Do not use. This field is deprecated and doesn't provide complete information about the policies in your organization.  To determine the policies that are enabled and available for use in your organization, use the ListRoots operation instead.
    */
  var AvailablePolicyTypes: js.UndefOr[PolicyTypes] = js.native
  /**
    * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.
    */
  var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.native
  /**
    * The unique identifier (ID) of an organization. The regex pattern for an organization ID string requires "o-" followed by from 10 to 32 lower-case letters or digits.
    */
  var Id: js.UndefOr[OrganizationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var MasterAccountArn: js.UndefOr[AccountArn] = js.native
  /**
    * The email address that is associated with the AWS account that is designated as the master account for the organization.
    */
  var MasterAccountEmail: js.UndefOr[Email] = js.native
  /**
    * The unique identifier (ID) of the master account of an organization. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var MasterAccountId: js.UndefOr[AccountId] = js.native
}

object Organization {
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  @scala.inline
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
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
    def setArn(value: OrganizationArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAvailablePolicyTypesVarargs(value: PolicyTypeSummary*): Self = this.set("AvailablePolicyTypes", js.Array(value :_*))
    @scala.inline
    def setAvailablePolicyTypes(value: PolicyTypes): Self = this.set("AvailablePolicyTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailablePolicyTypes: Self = this.set("AvailablePolicyTypes", js.undefined)
    @scala.inline
    def setFeatureSet(value: OrganizationFeatureSet): Self = this.set("FeatureSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureSet: Self = this.set("FeatureSet", js.undefined)
    @scala.inline
    def setId(value: OrganizationId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setMasterAccountArn(value: AccountArn): Self = this.set("MasterAccountArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterAccountArn: Self = this.set("MasterAccountArn", js.undefined)
    @scala.inline
    def setMasterAccountEmail(value: Email): Self = this.set("MasterAccountEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterAccountEmail: Self = this.set("MasterAccountEmail", js.undefined)
    @scala.inline
    def setMasterAccountId(value: AccountId): Self = this.set("MasterAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterAccountId: Self = this.set("MasterAccountId", js.undefined)
  }
  
}

