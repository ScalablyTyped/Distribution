package typings.chromecastDashCafDashSender.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayerChangedEvent")
@js.native
class RemotePlayerChangedEvent[T] protected () extends EventData {
  def this(`type`: RemotePlayerEventType, field: String, value: T) = this()
  var field: String = js.native
  var value: T = js.native
}

