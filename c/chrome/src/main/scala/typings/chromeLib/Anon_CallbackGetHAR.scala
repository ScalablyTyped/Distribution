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

object Anon_CallbackGetHAR {
  @scala.inline
  def apply(
    getHAR: js.Function1[/* harLog */ js.Object, scala.Unit] => scala.Unit,
    onNavigated: chromeLib.chromeNs.devtoolsNs.networkNs.NavigatedEvent,
    onRequestFinished: chromeLib.chromeNs.devtoolsNs.networkNs.RequestFinishedEvent
  ): Anon_CallbackGetHAR = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction1(getHAR), onNavigated = onNavigated, onRequestFinished = onRequestFinished)
  
    __obj.asInstanceOf[Anon_CallbackGetHAR]
  }
}

