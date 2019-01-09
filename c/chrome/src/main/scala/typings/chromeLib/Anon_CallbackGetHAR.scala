package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackGetHAR extends js.Object {
  var onNavigated: chromeLib.chromeNs.devtoolsNs.networkNs.NavigatedEvent
  var onRequestFinished: chromeLib.chromeNs.devtoolsNs.networkNs.RequestFinishedEvent
  def getHAR(callback: js.Function1[/* harLog */ js.Object, scala.Unit]): scala.Unit
}

