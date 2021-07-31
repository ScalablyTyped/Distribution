package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAccount extends StObject {
  
  /**
    * The AWS account ID of the Amazon Macie Classic member account.
    */
  var accountId: js.UndefOr[AWSAccountId] = js.undefined
}
object MemberAccount {
  
  @scala.inline
  def apply(): MemberAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberAccount]
  }
  
  @scala.inline
  implicit class MemberAccountMutableBuilder[Self <: MemberAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AWSAccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
