package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cote", "Subscriber")
@js.native
class Subscriber protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: SubscriberAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: SubscriberAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
}

