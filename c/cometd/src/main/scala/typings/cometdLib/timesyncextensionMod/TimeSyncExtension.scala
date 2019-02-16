package typings
package cometdLib.timesyncextensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSyncExtension
  extends cometdLib.cometdMod.Extension {
  @JSName("incoming")
  var incoming_Original: cometdLib.cometdMod.Listener = js.native
  @JSName("outgoing")
  var outgoing_Original: cometdLib.cometdMod.Listener = js.native
  /**
    * Get the estimated network lag in ms from the client to the server.
    */
  def getNetworkLag(): scala.Double = js.native
  /**
    *
    * Get the estimated server time as a Date object
    */
  def getServerDate(): stdLib.Date = js.native
  /**
    * Get the estimated server time in ms since the epoch.
    */
  def getServerTime(): scala.Double = js.native
  /**
    * Get the estimated offset in ms from the clients clock to the
    * servers clock.  The server time is the client time plus the offset.
    */
  def getTimeOffset(): scala.Double = js.native
  /**
    * Get an array of multiple offset samples used to calculate
    * the offset.
    */
  def getTimeOffsetSamples(): js.Array[scala.Double] = js.native
  @JSName("incoming")
  def incoming_MTimeSyncExtension(message: cometdLib.cometdMod.Message): scala.Unit = js.native
  @JSName("outgoing")
  def outgoing_MTimeSyncExtension(message: cometdLib.cometdMod.Message): scala.Unit = js.native
  @JSName("registered")
  def registered_MTimeSyncExtension(name: java.lang.String, cometd: cometdLib.cometdMod.CometD): scala.Unit = js.native
  @JSName("unregistered")
  def unregistered_MTimeSyncExtension(): scala.Unit = js.native
}

