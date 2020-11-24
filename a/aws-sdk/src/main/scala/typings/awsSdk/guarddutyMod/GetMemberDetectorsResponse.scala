package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMemberDetectorsResponse extends js.Object {
  
  /**
    * An object that describes which data sources are enabled for a member account.
    */
  var MemberDataSourceConfigurations: typings.awsSdk.guarddutyMod.MemberDataSourceConfigurations = js.native
  
  /**
    * A list of member account IDs that were unable to be processed along with an explanation for why they were not processed.
    */
  var UnprocessedAccounts: typings.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}
object GetMemberDetectorsResponse {
  
  @scala.inline
  def apply(
    MemberDataSourceConfigurations: MemberDataSourceConfigurations,
    UnprocessedAccounts: UnprocessedAccounts
  ): GetMemberDetectorsResponse = {
    val __obj = js.Dynamic.literal(MemberDataSourceConfigurations = MemberDataSourceConfigurations.asInstanceOf[js.Any], UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberDetectorsResponse]
  }
  
  @scala.inline
  implicit class GetMemberDetectorsResponseOps[Self <: GetMemberDetectorsResponse] (val x: Self) extends AnyVal {
    
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
    def setMemberDataSourceConfigurationsVarargs(value: MemberDataSourceConfiguration*): Self = this.set("MemberDataSourceConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setMemberDataSourceConfigurations(value: MemberDataSourceConfigurations): Self = this.set("MemberDataSourceConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccounts): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
  }
}
