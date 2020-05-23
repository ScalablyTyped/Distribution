package typings.chrome.anon

import typings.chrome.chrome.devtools.network.HARLog
import typings.chrome.chrome.devtools.network.NavigatedEvent
import typings.chrome.chrome.devtools.network.RequestFinishedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetwork extends js.Object {
  var onNavigated: NavigatedEvent
  var onRequestFinished: RequestFinishedEvent
  def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit
}

object Typeofnetwork {
  @scala.inline
  def apply(
    getHAR: js.Function1[/* harLog */ HARLog, Unit] => Unit,
    onNavigated: NavigatedEvent,
    onRequestFinished: RequestFinishedEvent
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction1(getHAR), onNavigated = onNavigated.asInstanceOf[js.Any], onRequestFinished = onRequestFinished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetwork]
  }
}

