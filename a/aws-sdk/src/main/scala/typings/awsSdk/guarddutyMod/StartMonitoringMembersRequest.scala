package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMonitoringMembersRequest extends StObject {
  
  /**
    * A list of account IDs of the GuardDuty member accounts to start monitoring.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds
  
  /**
    * The unique ID of the detector of the GuardDuty master account associated with the member accounts to monitor.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
}
object StartMonitoringMembersRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): StartMonitoringMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMonitoringMembersRequest]
  }
  
  @scala.inline
  implicit class StartMonitoringMembersRequestMutableBuilder[Self <: StartMonitoringMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
