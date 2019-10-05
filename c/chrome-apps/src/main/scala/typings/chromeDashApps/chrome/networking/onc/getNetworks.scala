package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.onc.getNetworks")
@js.native
object getNetworks extends js.Object {
  /**
    * Returns a list of network objects with the same properties provided by *getState*.
    * A filter is provided to specify the type of networks returned and to limit the number of networks.
    * Networks are ordered by the system based on their priority, with connected or connecting networks listed first.
    * @param callback Called with a interface of networks and their state properties when received.
    */
  def apply(filter: Filter, callback: js.Function1[/* result */ js.Array[NetworkStateProperties], Unit]): Unit = js.native
}

