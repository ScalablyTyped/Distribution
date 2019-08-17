package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointMessageResultMod._EndpointMessageResult
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageResultMod._MessageResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MessageResponse extends js.Object {
  /**
    * Application id of the message.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  var EndpointResult: js.UndefOr[
    StringDictionary[_EndpointMessageResult] | (Iterable[js.Tuple2[String, _EndpointMessageResult]])
  ] = js.undefined
  /**
    * Original request Id for which this message was delivered.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  var Result: js.UndefOr[StringDictionary[_MessageResult] | (Iterable[js.Tuple2[String, _MessageResult]])] = js.undefined
}

object _MessageResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    EndpointResult: StringDictionary[_EndpointMessageResult] | (Iterable[js.Tuple2[String, _EndpointMessageResult]]) = null,
    RequestId: String = null,
    Result: StringDictionary[_MessageResult] | (Iterable[js.Tuple2[String, _MessageResult]]) = null
  ): _MessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (EndpointResult != null) __obj.updateDynamic("EndpointResult")(EndpointResult.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageResponse]
  }
}

