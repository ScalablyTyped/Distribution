package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganizationRequest extends StObject {
  
  /**
    * Specifies the feature set supported by the new organization. Each feature set supports different levels of functionality.    CONSOLIDATED_BILLING: All member accounts have their bills consolidated to and paid by the management account. For more information, see Consolidated billing in the AWS Organizations User Guide.   The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.    ALL: In addition to all the features supported by the consolidated billing feature set, the management account can also apply any policy type to any member account in the organization. For more information, see All features in the AWS Organizations User Guide.   
    */
  var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined
}
object CreateOrganizationRequest {
  
  @scala.inline
  def apply(): CreateOrganizationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationRequest]
  }
  
  @scala.inline
  implicit class CreateOrganizationRequestMutableBuilder[Self <: CreateOrganizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureSet(value: OrganizationFeatureSet): Self = StObject.set(x, "FeatureSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureSetUndefined: Self = StObject.set(x, "FeatureSet", js.undefined)
  }
}
