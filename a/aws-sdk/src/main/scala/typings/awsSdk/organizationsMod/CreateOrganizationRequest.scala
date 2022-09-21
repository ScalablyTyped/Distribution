package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganizationRequest extends StObject {
  
  /**
    * Specifies the feature set supported by the new organization. Each feature set supports different levels of functionality.    CONSOLIDATED_BILLING: All member accounts have their bills consolidated to and paid by the management account. For more information, see Consolidated billing in the Organizations User Guide.   The consolidated billing feature subset isn't available for organizations in the Amazon Web Services GovCloud (US) Region.    ALL: In addition to all the features supported by the consolidated billing feature set, the management account can also apply any policy type to any member account in the organization. For more information, see All features in the Organizations User Guide.   
    */
  var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined
}
object CreateOrganizationRequest {
  
  inline def apply(): CreateOrganizationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationRequest]
  }
  
  extension [Self <: CreateOrganizationRequest](x: Self) {
    
    inline def setFeatureSet(value: OrganizationFeatureSet): Self = StObject.set(x, "FeatureSet", value.asInstanceOf[js.Any])
    
    inline def setFeatureSetUndefined: Self = StObject.set(x, "FeatureSet", js.undefined)
  }
}
