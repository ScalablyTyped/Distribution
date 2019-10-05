package typings.chromeDashApps

import typings.chromeDashApps.chrome.system.network.NetworkInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetwork extends js.Object {
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit
}

object Typeofnetwork {
  @scala.inline
  def apply(
    getNetworkInterfaces: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit] => Unit
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getNetworkInterfaces = js.Any.fromFunction1(getNetworkInterfaces))
  
    __obj.asInstanceOf[Typeofnetwork]
  }
}

