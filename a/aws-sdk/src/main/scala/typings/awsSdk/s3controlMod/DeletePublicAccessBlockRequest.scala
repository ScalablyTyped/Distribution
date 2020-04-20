package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePublicAccessBlockRequest extends js.Object {
  /**
    * The account ID for the Amazon Web Services account whose PublicAccessBlock configuration you want to remove.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
}

object DeletePublicAccessBlockRequest {
  @scala.inline
  def apply(AccountId: AccountId): DeletePublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublicAccessBlockRequest]
  }
}

