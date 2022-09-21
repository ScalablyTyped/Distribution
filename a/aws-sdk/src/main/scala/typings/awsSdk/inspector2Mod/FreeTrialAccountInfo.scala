package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeTrialAccountInfo extends StObject {
  
  /**
    * The account associated with the Amazon Inspector free trial information.
    */
  var accountId: MeteringAccountId
  
  /**
    * Contains information about the Amazon Inspector free trial for an account.
    */
  var freeTrialInfo: FreeTrialInfoList
}
object FreeTrialAccountInfo {
  
  inline def apply(accountId: MeteringAccountId, freeTrialInfo: FreeTrialInfoList): FreeTrialAccountInfo = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], freeTrialInfo = freeTrialInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeTrialAccountInfo]
  }
  
  extension [Self <: FreeTrialAccountInfo](x: Self) {
    
    inline def setAccountId(value: MeteringAccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialInfo(value: FreeTrialInfoList): Self = StObject.set(x, "freeTrialInfo", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialInfoVarargs(value: FreeTrialInfo*): Self = StObject.set(x, "freeTrialInfo", js.Array(value*))
  }
}
