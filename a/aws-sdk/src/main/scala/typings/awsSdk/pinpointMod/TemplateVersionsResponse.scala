package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateVersionsResponse extends js.Object {
  /**
    * An array of responses, one for each version of the message template.
    */
  var Item: ListOfTemplateVersionResponse = js.native
  /**
    * The message that's returned from the API for the request to retrieve information about all the versions of the message template.
    */
  var Message: js.UndefOr[string] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the request to retrieve information about all the versions of the message template.
    */
  var RequestID: js.UndefOr[string] = js.native
}

object TemplateVersionsResponse {
  @scala.inline
  def apply(
    Item: ListOfTemplateVersionResponse,
    Message: string = null,
    NextToken: string = null,
    RequestID: string = null
  ): TemplateVersionsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestID != null) __obj.updateDynamic("RequestID")(RequestID.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVersionsResponse]
  }
}

