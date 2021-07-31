package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMonitoringMembersRequest extends StObject {
  
  /**
    * A list of account IDs for the member accounts to stop monitoring.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds
  
  /**
    * The unique ID of the detector associated with the GuardDuty master account that is monitoring member accounts.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
}
object StopMonitoringMembersRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): StopMonitoringMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMonitoringMembersRequest]
  }
  
  @scala.inline
  implicit class StopMonitoringMembersRequestMutableBuilder[Self <: StopMonitoringMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
