package typings
package chromeLib.chromeNs.devtoolsNs.networkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.devtools.network")
@js.native
object ^ extends js.Object {
  var onNavigated: NavigatedEvent = js.native
  var onRequestFinished: RequestFinishedEvent = js.native
  def getHAR(callback: js.Function1[/* harLog */ js.Object, scala.Unit]): scala.Unit = js.native
}

