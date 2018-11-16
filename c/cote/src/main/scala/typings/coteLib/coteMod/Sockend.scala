package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cote", "Sockend")
@js.native
class Sockend protected () extends Component {
  /**
       * Exposes APIs directly to front-end. Make sure to use namespaces.
       */
  def this(io: socketDotIoLib.socketDotIoMod.SocketIONs.Server, /**
           * Configuration which controls the data being advertised for auto-discovery.
           */
  advertisement: SockendAdvertisement) = this()
  /**
       * Exposes APIs directly to front-end. Make sure to use namespaces.
       */
  def this(io: socketDotIoLib.socketDotIoMod.SocketIONs.Server, /**
           * Configuration which controls the data being advertised for auto-discovery.
           */
  advertisement: SockendAdvertisement, /**
           * Controls the network-layer configuration and environments for components.
           */
  discoveryOptions: DiscoveryOptions) = this()
}

