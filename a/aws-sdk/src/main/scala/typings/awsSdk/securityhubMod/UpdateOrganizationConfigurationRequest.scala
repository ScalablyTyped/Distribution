package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationConfigurationRequest extends StObject {
  
  /**
    * Whether to automatically enable Security Hub for new accounts in the organization. By default, this is false, and new accounts are not added automatically. To automatically enable Security Hub for new accounts, set this to true.
    */
  var AutoEnable: Boolean
  
  /**
    * Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to DEFAULT, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to NONE.
    */
  var AutoEnableStandards: js.UndefOr[typings.awsSdk.securityhubMod.AutoEnableStandards] = js.undefined
}
object UpdateOrganizationConfigurationRequest {
  
  inline def apply(AutoEnable: Boolean): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  
  extension [Self <: UpdateOrganizationConfigurationRequest](x: Self) {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableStandards(value: AutoEnableStandards): Self = StObject.set(x, "AutoEnableStandards", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableStandardsUndefined: Self = StObject.set(x, "AutoEnableStandards", js.undefined)
  }
}
