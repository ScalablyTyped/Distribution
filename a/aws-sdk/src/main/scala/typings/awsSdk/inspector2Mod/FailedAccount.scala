package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedAccount extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var accountId: AccountId
  
  /**
    * The error code explaining why the account failed to enable Amazon Inspector.
    */
  var errorCode: ErrorCode
  
  /**
    * The error message received when the account failed to enable Amazon Inspector.
    */
  var errorMessage: NonEmptyString
  
  /**
    * An object detailing which resources Amazon Inspector is enabled to scan for the account.
    */
  var resourceStatus: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The status of Amazon Inspector for the account.
    */
  var status: js.UndefOr[Status] = js.undefined
}
object FailedAccount {
  
  inline def apply(accountId: AccountId, errorCode: ErrorCode, errorMessage: NonEmptyString): FailedAccount = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedAccount]
  }
  
  extension [Self <: FailedAccount](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setResourceStatus(value: ResourceStatus): Self = StObject.set(x, "resourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusUndefined: Self = StObject.set(x, "resourceStatus", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
