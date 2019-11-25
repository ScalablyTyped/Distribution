package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventsBatchMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventMod._UnmarshalledEvent
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscorePublicEndpointMod._UnmarshalledPublicEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEventsBatch extends _EventsBatch {
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  @JSName("Endpoint")
  var Endpoint__UnmarshalledEventsBatch: js.UndefOr[_UnmarshalledPublicEndpoint] = js.undefined
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  @JSName("Events")
  var Events__UnmarshalledEventsBatch: js.UndefOr[StringDictionary[_UnmarshalledEvent]] = js.undefined
}

object _UnmarshalledEventsBatch {
  @scala.inline
  def apply(Endpoint: _UnmarshalledPublicEndpoint = null, Events: StringDictionary[_UnmarshalledEvent] = null): _UnmarshalledEventsBatch = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEventsBatch]
  }
}

