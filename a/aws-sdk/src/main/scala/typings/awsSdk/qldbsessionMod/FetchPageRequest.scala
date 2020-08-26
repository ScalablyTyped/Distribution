package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchPageRequest extends js.Object {
  /**
    * Specifies the next page token of the page to be fetched.
    */
  var NextPageToken: PageToken = js.native
  /**
    * Specifies the transaction ID of the page to be fetched.
    */
  var TransactionId: typings.awsSdk.qldbsessionMod.TransactionId = js.native
}

object FetchPageRequest {
  @scala.inline
  def apply(NextPageToken: PageToken, TransactionId: TransactionId): FetchPageRequest = {
    val __obj = js.Dynamic.literal(NextPageToken = NextPageToken.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPageRequest]
  }
  @scala.inline
  implicit class FetchPageRequestOps[Self <: FetchPageRequest] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionId(value: TransactionId): Self = this.set("TransactionId", value.asInstanceOf[js.Any])
  }
  
}

