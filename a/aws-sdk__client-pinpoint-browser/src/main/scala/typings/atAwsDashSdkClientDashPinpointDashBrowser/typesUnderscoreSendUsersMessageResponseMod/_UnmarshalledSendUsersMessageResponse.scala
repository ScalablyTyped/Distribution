package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSendUsersMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointMessageResultMod._UnmarshalledEndpointMessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSendUsersMessageResponse extends _SendUsersMessageResponse {
  /**
    * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  @JSName("Result")
  var Result__UnmarshalledSendUsersMessageResponse: js.UndefOr[StringDictionary[StringDictionary[_UnmarshalledEndpointMessageResult]]] = js.undefined
}

object _UnmarshalledSendUsersMessageResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    RequestId: String = null,
    Result: StringDictionary[StringDictionary[_UnmarshalledEndpointMessageResult]] = null
  ): _UnmarshalledSendUsersMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSendUsersMessageResponse]
  }
}

