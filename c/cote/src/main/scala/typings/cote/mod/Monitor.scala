package typings.cote.mod

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Monitor")
@js.native
class Monitor protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: MonitorAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: MonitorAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: MonitorAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: Unit,
    stream: Stream
  ) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: MonitorAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions,
    stream: Stream
  ) = this()
}
