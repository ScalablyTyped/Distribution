package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointMessageResultMod._UnmarshalledEndpointMessageResult
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageResultMod._UnmarshalledMessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMessageResponse extends _MessageResponse {
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  @JSName("EndpointResult")
  var EndpointResult__UnmarshalledMessageResponse: js.UndefOr[StringDictionary[_UnmarshalledEndpointMessageResult]] = js.undefined
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  @JSName("Result")
  var Result__UnmarshalledMessageResponse: js.UndefOr[StringDictionary[_UnmarshalledMessageResult]] = js.undefined
}

object _UnmarshalledMessageResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    EndpointResult: StringDictionary[_UnmarshalledEndpointMessageResult] = null,
    RequestId: String = null,
    Result: StringDictionary[_UnmarshalledMessageResult] = null
  ): _UnmarshalledMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (EndpointResult != null) __obj.updateDynamic("EndpointResult")(EndpointResult)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Result != null) __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[_UnmarshalledMessageResponse]
  }
}

