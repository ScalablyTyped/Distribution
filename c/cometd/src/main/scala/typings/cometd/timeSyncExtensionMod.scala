package typings.cometd

import typings.cometd.mod.CometD
import typings.cometd.mod.Extension
import typings.cometd.mod.Listener
import typings.cometd.mod.Message
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeSyncExtensionMod {
  
  @JSImport("cometd/TimeSyncExtension", JSImport.Default)
  @js.native
  class default () extends TimeSyncExtension
  
  @js.native
  trait TimeSyncExtension extends Extension {
    
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
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    @JSName("outgoing")
    def outgoing_MTimeSyncExtension(message: Message): Unit = js.native
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    
    @JSName("registered")
    def registered_MTimeSyncExtension(name: String, cometd: CometD): Unit = js.native
    
    @JSName("unregistered")
    def unregistered_MTimeSyncExtension(): Unit = js.native
  }
}
