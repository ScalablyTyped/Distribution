package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBulkEmailResponse extends js.Object {
  var BulkEmailEntryResults: BulkEmailEntryResultList = js.native
}

object SendBulkEmailResponse {
  @scala.inline
  def apply(BulkEmailEntryResults: BulkEmailEntryResultList): SendBulkEmailResponse = {
    val __obj = js.Dynamic.literal(BulkEmailEntryResults = BulkEmailEntryResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBulkEmailResponse]
  }
  @scala.inline
  implicit class SendBulkEmailResponseOps[Self <: SendBulkEmailResponse] (val x: Self) extends AnyVal {
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
    def setBulkEmailEntryResultsVarargs(value: BulkEmailEntryResult*): Self = this.set("BulkEmailEntryResults", js.Array(value :_*))
    @scala.inline
    def setBulkEmailEntryResults(value: BulkEmailEntryResultList): Self = this.set("BulkEmailEntryResults", value.asInstanceOf[js.Any])
  }
  
}

