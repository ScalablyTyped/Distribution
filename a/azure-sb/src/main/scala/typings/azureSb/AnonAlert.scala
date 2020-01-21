package typings.azureSb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlert extends js.Object {
  var alert: String
  var aps: js.Object
  var badge: Double
  var expiry: Date
  var payload: js.Object
  var sound: String
}

object AnonAlert {
  @scala.inline
  def apply(alert: String, aps: js.Object, badge: Double, expiry: Date, payload: js.Object, sound: String): AnonAlert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], aps = aps.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlert]
  }
}

