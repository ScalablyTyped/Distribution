package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberDataSourceConfiguration extends js.Object {
  /**
    * The account ID for the member account.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * Contains information on the status of data sources for the account.
    */
  var DataSources: DataSourceConfigurationsResult = js.native
}

object MemberDataSourceConfiguration {
  @scala.inline
  def apply(AccountId: AccountId, DataSources: DataSourceConfigurationsResult): MemberDataSourceConfiguration = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DataSources = DataSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDataSourceConfiguration]
  }
  @scala.inline
  implicit class MemberDataSourceConfigurationOps[Self <: MemberDataSourceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSources(value: DataSourceConfigurationsResult): Self = this.set("DataSources", value.asInstanceOf[js.Any])
  }
  
}

