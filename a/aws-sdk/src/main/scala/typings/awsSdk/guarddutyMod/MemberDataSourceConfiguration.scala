package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberDataSourceConfiguration extends StObject {
  
  /**
    * The account ID for the member account.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId
  
  /**
    * Contains information on the status of data sources for the account.
    */
  var DataSources: DataSourceConfigurationsResult
}
object MemberDataSourceConfiguration {
  
  @scala.inline
  def apply(AccountId: AccountId, DataSources: DataSourceConfigurationsResult): MemberDataSourceConfiguration = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DataSources = DataSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDataSourceConfiguration]
  }
  
  @scala.inline
  implicit class MemberDataSourceConfigurationMutableBuilder[Self <: MemberDataSourceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSources(value: DataSourceConfigurationsResult): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
  }
}
