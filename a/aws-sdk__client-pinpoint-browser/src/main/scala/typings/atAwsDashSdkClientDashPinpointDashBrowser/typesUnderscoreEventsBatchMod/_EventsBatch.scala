package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventsBatchMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventMod._Event
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscorePublicEndpointMod._PublicEndpoint
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EventsBatch extends js.Object {
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  var Endpoint: js.UndefOr[_PublicEndpoint] = js.undefined
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  var Events: js.UndefOr[StringDictionary[_Event] | (Iterable[js.Tuple2[String, _Event]])] = js.undefined
}

object _EventsBatch {
  @scala.inline
  def apply(
    Endpoint: _PublicEndpoint = null,
    Events: StringDictionary[_Event] | (Iterable[js.Tuple2[String, _Event]]) = null
  ): _EventsBatch = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EventsBatch]
  }
}

