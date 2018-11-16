package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cote", "Publisher")
@js.native
class Publisher protected () extends Component {
  def this(/**
           * Configuration which controls the data being advertised for auto-discovery.
           */
  advertisement: PublisherAdvertisement) = this()
  def this(/**
           * Configuration which controls the data being advertised for auto-discovery.
           */
  advertisement: PublisherAdvertisement, /**
           * Controls the network-layer configuration and environments for components.
           */
  discoveryOptions: DiscoveryOptions) = this()
  /**
       * Publishes an event to all Subscribers. Does not wait for results. If
       * there are no Subscribers listening, the event is lost.
       *
       * @param type EventEmitter-compatible type.
       * @param event Request.
       */
  def publish[T /* <: Event */](`type`: java.lang.String, event: T): scala.Unit = js.native
}

