package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResponse extends js.Object {
  /**
    * An array of responses, one for each message template that's associated with your Amazon Pinpoint account and meets any filter criteria that you specified in the request.
    */
  var Item: ListOfTemplateResponse = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object TemplatesResponse {
  @scala.inline
  def apply(Item: ListOfTemplateResponse): TemplatesResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesResponse]
  }
  @scala.inline
  implicit class TemplatesResponseOps[Self <: TemplatesResponse] (val x: Self) extends AnyVal {
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
    def setItemVarargs(value: TemplateResponse*): Self = this.set("Item", js.Array(value :_*))
    @scala.inline
    def setItem(value: ListOfTemplateResponse): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

