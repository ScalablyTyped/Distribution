package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMembersRequest extends StObject {
  
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to disassociate from the master account.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds
  
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the master account.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
}
object DisassociateMembersRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
  
  @scala.inline
  implicit class DisassociateMembersRequestMutableBuilder[Self <: DisassociateMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
