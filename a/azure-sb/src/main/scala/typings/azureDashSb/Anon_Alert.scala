package typings.azureDashSb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
  var alert: String
  var aps: js.Object
  var badge: Double
  var expiry: Date
  var payload: js.Object
  var sound: String
}

object Anon_Alert {
  @scala.inline
  def apply(alert: String, aps: js.Object, badge: Double, expiry: Date, payload: js.Object, sound: String): Anon_Alert = {
    val __obj = js.Dynamic.literal(alert = alert, aps = aps, badge = badge, expiry = expiry, payload = payload, sound = sound)
  
    __obj.asInstanceOf[Anon_Alert]
  }
}

