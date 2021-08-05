package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigurationResponse extends StObject {
  
  /**
    * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
    */
  var AutoEnable: Boolean
  
  /**
    * An object that describes which data sources are enabled automatically for member accounts.
    */
  var DataSources: js.UndefOr[OrganizationDataSourceConfigurationsResult] = js.undefined
  
  /**
    * Indicates whether the maximum number of allowed member accounts are already associated with the delegated administrator master account.
    */
  var MemberAccountLimitReached: Boolean
}
object DescribeOrganizationConfigurationResponse {
  
  inline def apply(AutoEnable: Boolean, MemberAccountLimitReached: Boolean): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any], MemberAccountLimitReached = MemberAccountLimitReached.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
  
  extension [Self <: DescribeOrganizationConfigurationResponse](x: Self) {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setDataSources(value: OrganizationDataSourceConfigurationsResult): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setMemberAccountLimitReached(value: Boolean): Self = StObject.set(x, "MemberAccountLimitReached", value.asInstanceOf[js.Any])
  }
}
