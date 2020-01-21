package typings.awsSdkClientPinpointBrowser.typesMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.UnmarshalledEndpointMessageResult
import typings.awsSdkClientPinpointBrowser.typesMessageResultMod.UnmarshalledMessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledMessageResponse extends MessageResponse {
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  @JSName("EndpointResult")
  var EndpointResult_UnmarshalledMessageResponse: js.UndefOr[StringDictionary[UnmarshalledEndpointMessageResult]] = js.undefined
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  @JSName("Result")
  var Result_UnmarshalledMessageResponse: js.UndefOr[StringDictionary[UnmarshalledMessageResult]] = js.undefined
}

object UnmarshalledMessageResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    EndpointResult: StringDictionary[UnmarshalledEndpointMessageResult] = null,
    RequestId: String = null,
    Result: StringDictionary[UnmarshalledMessageResult] = null
  ): UnmarshalledMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (EndpointResult != null) __obj.updateDynamic("EndpointResult")(EndpointResult.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMessageResponse]
  }
}

