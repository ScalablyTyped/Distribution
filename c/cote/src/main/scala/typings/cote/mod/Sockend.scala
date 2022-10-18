package typings.cote.mod

import typings.socketIo.distTypedEventsMod.DefaultEventsMap
import typings.socketIo.mod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Sockend")
@js.native
open class Sockend protected () extends Component {
  /**
    * Exposes APIs directly to front-end. Make sure to use namespaces.
    */
  def this(
    io: Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any],
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: SockendAdvertisement
  ) = this()
  def this(
    io: Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any],
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: SockendAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
}
