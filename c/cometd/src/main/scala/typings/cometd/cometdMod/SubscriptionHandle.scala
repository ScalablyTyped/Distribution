package typings.cometd.cometdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionHandle extends js.Object {
  @JSName("callback")
  var callback_Original: Callback = js.native
  var channel: String = js.native
  var id: Double = js.native
  var listener: Boolean = js.native
  var scope: js.UndefOr[js.Any] = js.native
  def callback(data: js.Any): Unit = js.native
}

