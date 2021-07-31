package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedAccount extends StObject {
  
  /**
    * The AWS account identifier of the member account that was not processed.
    */
  var AccountId: js.UndefOr[typings.awsSdk.detectiveMod.AccountId] = js.undefined
  
  /**
    * The reason that the member account request could not be processed.
    */
  var Reason: js.UndefOr[UnprocessedReason] = js.undefined
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
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setReason(value: UnprocessedReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
