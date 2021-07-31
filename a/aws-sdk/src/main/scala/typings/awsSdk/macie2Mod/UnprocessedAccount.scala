package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedAccount extends StObject {
  
  /**
    * The AWS account ID for the account that the request applies to.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The source of the issue or delay in processing the request.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * The reason why the request hasn't been processed.
    */
  var errorMessage: js.UndefOr[string] = js.undefined
}
object UnprocessedAccount {
  
  @scala.inline
  def apply(): UnprocessedAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedAccount]
  }
  
  @scala.inline
  implicit class UnprocessedAccountMutableBuilder[Self <: UnprocessedAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: string): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
