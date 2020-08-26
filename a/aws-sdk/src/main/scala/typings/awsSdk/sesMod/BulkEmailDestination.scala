package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkEmailDestination extends js.Object {
  var Destination: typings.awsSdk.sesMod.Destination = js.native
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendBulkTemplatedEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var ReplacementTags: js.UndefOr[MessageTagList] = js.native
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var ReplacementTemplateData: js.UndefOr[TemplateData] = js.native
}

object BulkEmailDestination {
  @scala.inline
  def apply(Destination: Destination): BulkEmailDestination = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkEmailDestination]
  }
  @scala.inline
  implicit class BulkEmailDestinationOps[Self <: BulkEmailDestination] (val x: Self) extends AnyVal {
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
    def setDestination(value: Destination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacementTagsVarargs(value: MessageTag*): Self = this.set("ReplacementTags", js.Array(value :_*))
    @scala.inline
    def setReplacementTags(value: MessageTagList): Self = this.set("ReplacementTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacementTags: Self = this.set("ReplacementTags", js.undefined)
    @scala.inline
    def setReplacementTemplateData(value: TemplateData): Self = this.set("ReplacementTemplateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacementTemplateData: Self = this.set("ReplacementTemplateData", js.undefined)
  }
  
}

