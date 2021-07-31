package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePublicAccessBlockRequest extends StObject {
  
  /**
    * The account ID for the AWS account whose PublicAccessBlock configuration you want to remove.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
}
object DeletePublicAccessBlockRequest {
  
  @scala.inline
  def apply(AccountId: AccountId): DeletePublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublicAccessBlockRequest]
  }
  
  @scala.inline
  implicit class DeletePublicAccessBlockRequestMutableBuilder[Self <: DeletePublicAccessBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
