package typings
package cometdLib.cometdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionHandle extends js.Object {
  @JSName("callback")
  var callback_Original: Callback = js.native
  var channel: java.lang.String = js.native
  var id: scala.Double = js.native
  var listener: scala.Boolean = js.native
  var scope: js.UndefOr[js.Any] = js.native
  def callback(data: js.Any): scala.Unit = js.native
}

