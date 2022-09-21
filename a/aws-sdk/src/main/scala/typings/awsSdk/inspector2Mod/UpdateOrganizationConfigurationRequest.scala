package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationConfigurationRequest extends StObject {
  
  /**
    * Defines which scan types are enabled automatically for new members of your Amazon Inspector organization.
    */
  var autoEnable: AutoEnable
}
object UpdateOrganizationConfigurationRequest {
  
  inline def apply(autoEnable: AutoEnable): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(autoEnable = autoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  
  extension [Self <: UpdateOrganizationConfigurationRequest](x: Self) {
    
    inline def setAutoEnable(value: AutoEnable): Self = StObject.set(x, "autoEnable", value.asInstanceOf[js.Any])
  }
}
