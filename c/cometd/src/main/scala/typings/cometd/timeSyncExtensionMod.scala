package typings.cometd

import typings.cometd.cometdMod.CometD
import typings.cometd.cometdMod.Extension
import typings.cometd.cometdMod.Listener
import typings.cometd.cometdMod.Message
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cometd/TimeSyncExtension", JSImport.Namespace)
@js.native
object timeSyncExtensionMod extends js.Object {
  @js.native
  trait TimeSyncExtension extends Extension {
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    /**
      * Get the estimated network lag in ms from the client to the server.
      */
    def getNetworkLag(): Double = js.native
    /**
      *
      * Get the estimated server time as a Date object
      */
    def getServerDate(): Date = js.native
    /**
      * Get the estimated server time in ms since the epoch.
      */
    def getServerTime(): Double = js.native
    /**
      * Get the estimated offset in ms from the clients clock to the
      * servers clock.  The server time is the client time plus the offset.
      */
    def getTimeOffset(): Double = js.native
    /**
      * Get an array of multiple offset samples used to calculate
      * the offset.
      */
    def getTimeOffsetSamples(): js.Array[Double] = js.native
    @JSName("incoming")
    def incoming_MTimeSyncExtension(message: Message): Unit = js.native
    @JSName("outgoing")
    def outgoing_MTimeSyncExtension(message: Message): Unit = js.native
    @JSName("registered")
    def registered_MTimeSyncExtension(name: String, cometd: CometD): Unit = js.native
    @JSName("unregistered")
    def unregistered_MTimeSyncExtension(): Unit = js.native
  }
  
  @js.native
  class default () extends TimeSyncExtension
  
}

