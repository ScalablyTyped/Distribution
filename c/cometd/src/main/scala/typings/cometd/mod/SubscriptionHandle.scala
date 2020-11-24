package typings.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionHandle extends js.Object {
  
  def callback(data: js.Any): Unit = js.native
  @JSName("callback")
  var callback_Original: Callback = js.native
  
  var channel: String = js.native
  
  var id: Double = js.native
  
  var listener: Boolean = js.native
  
  var scope: js.UndefOr[js.Any] = js.native
}
