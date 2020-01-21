package typings.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.UnmarshalledEndpointMessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSendUsersMessageResponse extends SendUsersMessageResponse {
  /**
    * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  @JSName("Result")
  var Result_UnmarshalledSendUsersMessageResponse: js.UndefOr[StringDictionary[StringDictionary[UnmarshalledEndpointMessageResult]]] = js.undefined
}

object UnmarshalledSendUsersMessageResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    RequestId: String = null,
    Result: StringDictionary[StringDictionary[UnmarshalledEndpointMessageResult]] = null
  ): UnmarshalledSendUsersMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSendUsersMessageResponse]
  }
}

