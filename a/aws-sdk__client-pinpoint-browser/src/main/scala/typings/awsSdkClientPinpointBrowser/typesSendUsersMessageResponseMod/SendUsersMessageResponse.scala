package typings.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.EndpointMessageResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendUsersMessageResponse extends js.Object {
  /**
    * The unique ID of the Amazon Pinpoint project used to send the message.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The unique ID assigned to the users-messages request.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  var Result: js.UndefOr[
    (StringDictionary[
      StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
    ]) | (Iterable[
      js.Tuple2[
        String, 
        StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
      ]
    ])
  ] = js.undefined
}

object SendUsersMessageResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    RequestId: String = null,
    Result: (StringDictionary[
      StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
    ]) | (Iterable[
      js.Tuple2[
        String, 
        StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
      ]
    ]) = null
  ): SendUsersMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessageResponse]
  }
}

