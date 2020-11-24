package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrganizationRequest extends js.Object {
  
  /**
    * Specifies the feature set supported by the new organization. Each feature set supports different levels of functionality.    CONSOLIDATED_BILLING: All member accounts have their bills consolidated to and paid by the management account. For more information, see Consolidated billing in the AWS Organizations User Guide.   The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.    ALL: In addition to all the features supported by the consolidated billing feature set, the management account can also apply any policy type to any member account in the organization. For more information, see All features in the AWS Organizations User Guide.   
    */
  var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.native
}
object CreateOrganizationRequest {
  
  @scala.inline
  def apply(): CreateOrganizationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationRequest]
  }
  
  @scala.inline
  implicit class CreateOrganizationRequestOps[Self <: CreateOrganizationRequest] (val x: Self) extends AnyVal {
    
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
    def setFeatureSet(value: OrganizationFeatureSet): Self = this.set("FeatureSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureSet: Self = this.set("FeatureSet", js.undefined)
  }
}
