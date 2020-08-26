package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evidence extends js.Object {
  var comment: js.UndefOr[String] = js.native
  var createdAt: Date = js.native
  var id: String = js.native
  var sendToProcessorAt: Date = js.native
  var url: js.UndefOr[String] = js.native
}

object Evidence {
  @scala.inline
  def apply(createdAt: Date, id: String, sendToProcessorAt: Date): Evidence = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sendToProcessorAt = sendToProcessorAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evidence]
  }
  @scala.inline
  implicit class EvidenceOps[Self <: Evidence] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendToProcessorAt(value: Date): Self = this.set("sendToProcessorAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

