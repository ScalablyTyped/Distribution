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
  @scala.inline
  implicit class PutPublicAccessBlockRequestOps[Self <: PutPublicAccessBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = this.set("PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
  }
  
}

