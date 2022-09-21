package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigurationResponse extends StObject {
  
  /**
    * Specifies whether Amazon Macie is enabled automatically for accounts that are added to the organization.
    */
  var autoEnable: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether the maximum number of Amazon Macie member accounts are part of the organization.
    */
  var maxAccountLimitReached: js.UndefOr[boolean] = js.undefined
}
object DescribeOrganizationConfigurationResponse {
  
  inline def apply(): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
  
  extension [Self <: DescribeOrganizationConfigurationResponse](x: Self) {
    
    inline def setAutoEnable(value: boolean): Self = StObject.set(x, "autoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "autoEnable", js.undefined)
    
    inline def setMaxAccountLimitReached(value: boolean): Self = StObject.set(x, "maxAccountLimitReached", value.asInstanceOf[js.Any])
    
    inline def setMaxAccountLimitReachedUndefined: Self = StObject.set(x, "maxAccountLimitReached", js.undefined)
  }
}
