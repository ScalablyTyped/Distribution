package typings
package azureDashSbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
  var alert: java.lang.String
  var aps: js.Object
  var badge: scala.Double
  var expiry: stdLib.Date
  var payload: js.Object
  var sound: java.lang.String
}

object Anon_Alert {
  @scala.inline
  def apply(
    alert: java.lang.String,
    aps: js.Object,
    badge: scala.Double,
    expiry: stdLib.Date,
    payload: js.Object,
    sound: java.lang.String
  ): Anon_Alert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alert")(alert)
    __obj.updateDynamic("aps")(aps)
    __obj.updateDynamic("badge")(badge)
    __obj.updateDynamic("expiry")(expiry)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("sound")(sound)
    __obj.asInstanceOf[Anon_Alert]
  }
}

