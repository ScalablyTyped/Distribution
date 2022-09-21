package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Publisher")
@js.native
open class Publisher protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: PublisherAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: PublisherAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  
  /**
    * Publishes an event to all Subscribers. Does not wait for results. If
    * there are no Subscribers listening, the event is lost.
    *
    * @param type EventEmitter-compatible type.
    * @param event Request.
    */
  def publish[T /* <: Event */](`type`: String, event: T): Unit = js.native
}
