package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayerChangedEvent")
@js.native
class RemotePlayerChangedEvent[T] protected () extends EventData {
  def this(`type`: RemotePlayerEventType, field: java.lang.String, value: T) = this()
  var field: java.lang.String = js.native
  var value: T = js.native
}

