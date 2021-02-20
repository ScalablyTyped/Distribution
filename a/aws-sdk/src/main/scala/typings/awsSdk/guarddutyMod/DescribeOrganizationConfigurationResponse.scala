package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationConfigurationResponse extends StObject {
  
  /**
    * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
    */
  var AutoEnable: Boolean = js.native
  
  /**
    * An object that describes which data sources are enabled automatically for member accounts.
    */
  var DataSources: js.UndefOr[OrganizationDataSourceConfigurationsResult] = js.native
  
  /**
    * Indicates whether the maximum number of allowed member accounts are already associated with the delegated administrator master account.
    */
  var MemberAccountLimitReached: Boolean = js.native
}
object DescribeOrganizationConfigurationResponse {
  
  @scala.inline
  def apply(AutoEnable: Boolean, MemberAccountLimitReached: Boolean): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any], MemberAccountLimitReached = MemberAccountLimitReached.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConfigurationResponseMutableBuilder[Self <: DescribeOrganizationConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSources(value: OrganizationDataSourceConfigurationsResult): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    @scala.inline
    def setMemberAccountLimitReached(value: Boolean): Self = StObject.set(x, "MemberAccountLimitReached", value.asInstanceOf[js.Any])
  }
}
