package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOrganizationRequest extends js.Object {
  /**
    * Specifies the feature set supported by the new organization. Each feature set supports different levels of functionality.    CONSOLIDATED_BILLING: All member accounts have their bills consolidated to and paid by the master account. For more information, see Consolidated billing in the AWS Organizations User Guide.   The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.    ALL: In addition to all the features that consolidated billing feature set supports, the master account can also apply any policy type to any member account in the organization. For more information, see All features in the AWS Organizations User Guide.   
    */
  var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.native
}

object CreateOrganizationRequest {
  @scala.inline
  def apply(FeatureSet: OrganizationFeatureSet = null): CreateOrganizationRequest = {
    val __obj = js.Dynamic.literal()
    if (FeatureSet != null) __obj.updateDynamic("FeatureSet")(FeatureSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganizationRequest]
  }
}

