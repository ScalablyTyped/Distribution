package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cote", "Monitor")
@js.native
class Monitor protected () extends Component {
  def this(/**
           * Configuration which controls the data being advertised for auto-discovery.
           */
  advertisement: MonitorAdvertisement) = this()
  def this(/**
           * Configuration which controls the data being advertised for auto-discovery.
           */
  advertisement: MonitorAdvertisement, /**
           * Controls the network-layer configuration and environments for components.
           */
  discoveryOptions: DiscoveryOptions) = this()
  def this(/**
           * Configuration which controls the data being advertised for auto-discovery.
           */
  advertisement: MonitorAdvertisement, /**
           * Controls the network-layer configuration and environments for components.
           */
  discoveryOptions: DiscoveryOptions, stream: nodeLib.streamMod.Stream) = this()
}

