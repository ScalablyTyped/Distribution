package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLicenseSpecificationsForResourceRequest extends StObject {
  
  /**
    * ARNs of the license configurations to add.
    */
  var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
  
  /**
    * ARNs of the license configurations to remove.
    */
  var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the Amazon Web Services resource.
    */
  var ResourceArn: String
}
object UpdateLicenseSpecificationsForResourceRequest {
  
  inline def apply(ResourceArn: String): UpdateLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
  }
  
  extension [Self <: UpdateLicenseSpecificationsForResourceRequest](x: Self) {
    
    inline def setAddLicenseSpecifications(value: LicenseSpecifications): Self = StObject.set(x, "AddLicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setAddLicenseSpecificationsUndefined: Self = StObject.set(x, "AddLicenseSpecifications", js.undefined)
    
    inline def setAddLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = StObject.set(x, "AddLicenseSpecifications", js.Array(value*))
    
    inline def setRemoveLicenseSpecifications(value: LicenseSpecifications): Self = StObject.set(x, "RemoveLicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setRemoveLicenseSpecificationsUndefined: Self = StObject.set(x, "RemoveLicenseSpecifications", js.undefined)
    
    inline def setRemoveLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = StObject.set(x, "RemoveLicenseSpecifications", js.Array(value*))
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
