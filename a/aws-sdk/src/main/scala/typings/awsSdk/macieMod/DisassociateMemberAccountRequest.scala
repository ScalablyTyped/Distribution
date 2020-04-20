package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateMemberAccountRequest extends js.Object {
  /**
    * The ID of the member account that you want to remove from Amazon Macie.
    */
  var memberAccountId: AWSAccountId = js.native
}

object DisassociateMemberAccountRequest {
  @scala.inline
  def apply(memberAccountId: AWSAccountId): DisassociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberAccountRequest]
  }
}

