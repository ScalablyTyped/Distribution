package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMemberDetectorsResponse extends StObject {
  
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
  implicit class GetMemberDetectorsResponseMutableBuilder[Self <: GetMemberDetectorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberDataSourceConfigurations(value: MemberDataSourceConfigurations): Self = StObject.set(x, "MemberDataSourceConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberDataSourceConfigurationsVarargs(value: MemberDataSourceConfiguration*): Self = StObject.set(x, "MemberDataSourceConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccounts): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
