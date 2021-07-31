package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateMemberAccountRequest extends StObject {
  
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie Classic as a member account.
    */
  var memberAccountId: AWSAccountId
}
object AssociateMemberAccountRequest {
  
  @scala.inline
  def apply(memberAccountId: AWSAccountId): AssociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMemberAccountRequest]
  }
  
  @scala.inline
  implicit class AssociateMemberAccountRequestMutableBuilder[Self <: AssociateMemberAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
  }
}
