package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPublicAccessBlockRequest extends js.Object {
  /**
    * The account ID for the Amazon Web Services account whose PublicAccessBlock configuration you want to set.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The PublicAccessBlock configuration that you want to apply to the specified Amazon Web Services account.
    */
  var PublicAccessBlockConfiguration: typings.awsSdk.s3controlMod.PublicAccessBlockConfiguration = js.native
}

object PutPublicAccessBlockRequest {
  @scala.inline
  def apply(AccountId: AccountId, PublicAccessBlockConfiguration: PublicAccessBlockConfiguration): PutPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], PublicAccessBlockConfiguration = PublicAccessBlockConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPublicAccessBlockRequest]
  }
}

