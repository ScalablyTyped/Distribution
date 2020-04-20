package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsPrimary extends js.Object {
  var isPrimary: Boolean
  var uuid: String
}

object AnonIsPrimary {
  @scala.inline
  def apply(isPrimary: Boolean, uuid: String): AnonIsPrimary = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsPrimary]
  }
}

