package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateMemberAccountRequest extends StObject {
  
  /**
    * The ID of the member account that you want to remove from Amazon Macie Classic.
    */
  var memberAccountId: AWSAccountId = js.native
}
object DisassociateMemberAccountRequest {
  
  @scala.inline
  def apply(memberAccountId: AWSAccountId): DisassociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberAccountRequest]
  }
  
  @scala.inline
  implicit class DisassociateMemberAccountRequestMutableBuilder[Self <: DisassociateMemberAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
  }
}
