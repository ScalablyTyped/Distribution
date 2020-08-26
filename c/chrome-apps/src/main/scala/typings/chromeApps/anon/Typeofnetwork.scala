package typings.chromeApps.anon

import typings.chromeApps.chrome.system.network.NetworkInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofnetwork extends js.Object {
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit = js.native
}

object Typeofnetwork {
  @scala.inline
  def apply(
    getNetworkInterfaces: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit] => Unit
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getNetworkInterfaces = js.Any.fromFunction1(getNetworkInterfaces))
    __obj.asInstanceOf[Typeofnetwork]
  }
  @scala.inline
  implicit class TypeofnetworkOps[Self <: Typeofnetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetNetworkInterfaces(value: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit] => Unit): Self = this.set("getNetworkInterfaces", js.Any.fromFunction1(value))
  }
  
}

