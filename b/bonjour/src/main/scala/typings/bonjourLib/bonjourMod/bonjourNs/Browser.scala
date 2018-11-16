package typings
package bonjourLib.bonjourMod.bonjourNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Start a browser
     *
     * The browser listens for services by querying for PTR records of a given
     * type, protocol and domain, e.g. _http._tcp.local.
     *
     * If no type is given, a wild card search is performed.
     *
     * An internal list of online services is kept which starts out empty. When
     * ever a new service is discovered, it's added to the list and an "up" event
     * is emitted with that service. When it's discovered that the service is no
     * longer available, it is removed from the list and a "down" event is emitted
     * with that service.
     */
@js.native
trait Browser
  extends nodeLib.NodeJSNs.EventEmitter {
  var services: js.Array[Service] = js.native
  @JSName("on")
  def on_down(
    event: bonjourLib.bonjourLibStrings.down,
    listener: js.Function1[/* service */ Service, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_up(event: bonjourLib.bonjourLibStrings.up, listener: js.Function1[/* service */ Service, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_down(
    event: bonjourLib.bonjourLibStrings.down,
    listener: js.Function1[/* service */ Service, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_up(event: bonjourLib.bonjourLibStrings.up, listener: js.Function1[/* service */ Service, scala.Unit]): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_down(event: bonjourLib.bonjourLibStrings.down): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_up(event: bonjourLib.bonjourLibStrings.up): this.type = js.native
  @JSName("removeListener")
  def removeListener_down(
    event: bonjourLib.bonjourLibStrings.down,
    listener: js.Function1[/* service */ Service, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_up(event: bonjourLib.bonjourLibStrings.up, listener: js.Function1[/* service */ Service, scala.Unit]): this.type = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

