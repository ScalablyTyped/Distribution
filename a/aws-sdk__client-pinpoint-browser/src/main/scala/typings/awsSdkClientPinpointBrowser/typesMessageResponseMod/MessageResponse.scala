package typings.awsSdkClientPinpointBrowser.typesMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.EndpointMessageResult
import typings.awsSdkClientPinpointBrowser.typesMessageResultMod.MessageResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResponse extends js.Object {
  /**
    * Application id of the message.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  var EndpointResult: js.UndefOr[
    StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
  ] = js.undefined
  /**
    * Original request Id for which this message was delivered.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  var Result: js.UndefOr[StringDictionary[MessageResult] | (Iterable[js.Tuple2[String, MessageResult]])] = js.undefined
}

object MessageResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    EndpointResult: StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]]) = null,
    RequestId: String = null,
    Result: StringDictionary[MessageResult] | (Iterable[js.Tuple2[String, MessageResult]]) = null
  ): MessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (EndpointResult != null) __obj.updateDynamic("EndpointResult")(EndpointResult.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
}

