package typings.awsSdkClientPinpointBrowser.typesEventsBatchMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventMod.UnmarshalledEvent
import typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod.UnmarshalledPublicEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEventsBatch extends EventsBatch {
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  @JSName("Endpoint")
  var Endpoint_UnmarshalledEventsBatch: js.UndefOr[UnmarshalledPublicEndpoint] = js.undefined
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  @JSName("Events")
  var Events_UnmarshalledEventsBatch: js.UndefOr[StringDictionary[UnmarshalledEvent]] = js.undefined
}

object UnmarshalledEventsBatch {
  @scala.inline
  def apply(Endpoint: UnmarshalledPublicEndpoint = null, Events: StringDictionary[UnmarshalledEvent] = null): UnmarshalledEventsBatch = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEventsBatch]
  }
}

