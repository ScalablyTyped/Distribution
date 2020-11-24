package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Requester")
@js.native
class Requester protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: RequesterAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: RequesterAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  
  /**
    * Queues a request until a Responder is available, and once so, delivers
    * the request. Requests are dispatched to Responders in a round-robin way.
    *
    * @param event Request.
    */
  def send[T /* <: Event */](event: T): js.Promise[_] = js.native
  /**
    * Queues a request until a Responder is available, and once so, delivers
    * the request. Requests are dispatched to Responders in a round-robin way.
    *
    * @param event Request.
    * @param callback Function to execute after getting a result.
    */
  def send[T /* <: Event */](event: T, callback: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]): Unit = js.native
}
