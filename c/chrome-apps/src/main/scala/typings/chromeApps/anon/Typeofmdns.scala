package typings.chromeApps.anon

import typings.chromeApps.chrome.events.FilteredEvent
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.mdns.Service
import typings.chromeApps.chrome.mdns.ServiceTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmdns extends js.Object {
  /**
    * The maximum number of service instances that will be
    * included in onServiceList events. If more instances
    * are available, they may be truncated from the
    * onServiceList event.
    * @default 2048
    * @since Chrome 44.
    */
  val MAX_SERVICE_INSTANCES_PER_EVENT: integer = js.native
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
  val onServiceList: FilteredEvent[js.Function1[/* services */ js.Array[Service], Unit], ServiceTypes] = js.native
  /**
    * Immediately issues a multicast DNS query for all service types.
    * |callback| is invoked immediately.
    * At a later time, queries will be sent,
    * and any service events will be fired.
    * @since Chrome 45.
    * @param callback Callback invoked after ForceDiscovery() has started.
    */
  def forceDiscovery(callback: js.Function0[Unit]): Unit = js.native
}

object Typeofmdns {
  @scala.inline
  def apply(
    MAX_SERVICE_INSTANCES_PER_EVENT: integer,
    forceDiscovery: js.Function0[Unit] => Unit,
    onServiceList: FilteredEvent[js.Function1[/* services */ js.Array[Service], Unit], ServiceTypes]
  ): Typeofmdns = {
    val __obj = js.Dynamic.literal(MAX_SERVICE_INSTANCES_PER_EVENT = MAX_SERVICE_INSTANCES_PER_EVENT.asInstanceOf[js.Any], forceDiscovery = js.Any.fromFunction1(forceDiscovery), onServiceList = onServiceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmdns]
  }
  @scala.inline
  implicit class TypeofmdnsOps[Self <: Typeofmdns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMAX_SERVICE_INSTANCES_PER_EVENT(value: integer): Self = this.set("MAX_SERVICE_INSTANCES_PER_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceDiscovery(value: js.Function0[Unit] => Unit): Self = this.set("forceDiscovery", js.Any.fromFunction1(value))
    @scala.inline
    def setOnServiceList(value: FilteredEvent[js.Function1[/* services */ js.Array[Service], Unit], ServiceTypes]): Self = this.set("onServiceList", value.asInstanceOf[js.Any])
  }
  
}

