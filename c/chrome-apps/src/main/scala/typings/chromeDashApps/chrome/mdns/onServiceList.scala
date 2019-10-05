package typings.chromeDashApps.chrome.mdns

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.FilteredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event fired to inform clients of the current complete
  * set of known available services. Clients should only
  * need to store the list from the most recent event.
  * The service type that the extension is interested in
  * discovering should be specified as the event filter
  * with the 'serviceType' key. Not specifying an event
  * filter will not start any discovery listeners.
  * @example
  * Filter example:
  * chrome.mdns.onServiceList.addListener(() => { },
  *  { 'serviceType': 'definitelyTyped._tcp.local' });
  */
@JSGlobal("chrome.mdns.onServiceList")
@js.native
object onServiceList
  extends TopLevel[
      FilteredEvent[js.Function1[/* services */ js.Array[Service], Unit], ServiceTypes]
    ]

