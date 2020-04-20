package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicAccessBlockRequest extends js.Object {
  /**
    * The account ID for the Amazon Web Services account whose PublicAccessBlock configuration you want to retrieve.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
}

object GetPublicAccessBlockRequest {
  @scala.inline
  def apply(AccountId: AccountId): GetPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicAccessBlockRequest]
  }
}

