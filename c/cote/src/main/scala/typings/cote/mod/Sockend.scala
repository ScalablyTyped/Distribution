package typings.cote.mod

import typings.socketIo.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Sockend")
@js.native
class Sockend protected () extends Component {
  /**
    * Exposes APIs directly to front-end. Make sure to use namespaces.
    */
  def this(
    io: Server,
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: SockendAdvertisement
  ) = this()
  def this(
    io: Server,
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
