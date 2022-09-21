package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationConfigurationRequest extends StObject {
  
  /**
    * Specifies whether to enable Amazon Macie automatically for an account when the account is added to the organization in Organizations.
    */
  var autoEnable: boolean
}
object UpdateOrganizationConfigurationRequest {
  
  inline def apply(autoEnable: boolean): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(autoEnable = autoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  
  extension [Self <: UpdateOrganizationConfigurationRequest](x: Self) {
    
    inline def setAutoEnable(value: boolean): Self = StObject.set(x, "autoEnable", value.asInstanceOf[js.Any])
  }
}
