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
  
  inline def apply(AccountIds: AccountIds, DetectorId: DetectorId): StartMonitoringMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMonitoringMembersRequest]
  }
  
  extension [Self <: StartMonitoringMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
