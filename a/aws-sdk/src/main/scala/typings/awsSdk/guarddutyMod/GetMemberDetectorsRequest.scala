package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMemberDetectorsRequest extends StObject {
  
  /**
    * The account ID of the member account.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  
  /**
    * The detector ID for the master account.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}
object GetMemberDetectorsRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): GetMemberDetectorsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberDetectorsRequest]
  }
  
  @scala.inline
  implicit class GetMemberDetectorsRequestMutableBuilder[Self <: GetMemberDetectorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
