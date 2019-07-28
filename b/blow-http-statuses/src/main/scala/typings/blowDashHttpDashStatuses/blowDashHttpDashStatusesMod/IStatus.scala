package typings.blowDashHttpDashStatuses.blowDashHttpDashStatusesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatus extends js.Object {
  var code: Double
  var message: String
}

object IStatus {
  @scala.inline
  def apply(code: Double, message: String): IStatus = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[IStatus]
  }
}

