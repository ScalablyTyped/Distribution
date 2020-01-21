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
  def apply(Item: ListOfTemplateResponse, NextToken: string = null): TemplatesResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesResponse]
  }
}

