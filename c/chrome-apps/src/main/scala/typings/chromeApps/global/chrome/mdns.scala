package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.events.FilteredEvent
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.mdns.Service
import typings.chromeApps.chrome.mdns.ServiceTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.mdns
//////////
// mDNS //
//////////
/**
  * Use the chrome.mdns API to discover services over mDNS.
  * This comprises a subset of the features of the NSD spec:
  * @see http://www.w3.org/TR/discovery-api
  * @requires Permissions: 'mdns'
  * @since Chrome 31
  */
object mdns {
  
  @JSGlobal("chrome.mdns")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The maximum number of service instances that will be
    * included in onServiceList events. If more instances
    * are available, they may be truncated from the
    * onServiceList event.
    * @default 2048
    * @since Chrome 44.
    */
  @JSGlobal("chrome.mdns.MAX_SERVICE_INSTANCES_PER_EVENT")
  @js.native
  val MAX_SERVICE_INSTANCES_PER_EVENT: integer = js.native
  
  /**
    * Immediately issues a multicast DNS query for all service types.
    * |callback| is invoked immediately.
    * At a later time, queries will be sent,
    * and any service events will be fired.
    * @since Chrome 45.
    * @param callback Callback invoked after ForceDiscovery() has started.
    */
  inline def forceDiscovery(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceDiscovery")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  val onServiceList: FilteredEvent[js.Function1[/* services */ js.Array[Service], Unit], ServiceTypes] = js.native
}
