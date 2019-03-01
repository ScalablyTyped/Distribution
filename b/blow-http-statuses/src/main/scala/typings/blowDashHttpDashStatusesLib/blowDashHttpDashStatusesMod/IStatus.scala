package typings
package blowDashHttpDashStatusesLib.blowDashHttpDashStatusesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatus extends js.Object {
  var code: scala.Double
  var message: java.lang.String
}

object IStatus {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String): IStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[IStatus]
  }
}

