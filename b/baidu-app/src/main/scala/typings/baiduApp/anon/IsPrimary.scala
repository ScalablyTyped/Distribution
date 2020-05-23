package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsPrimary extends js.Object {
  var isPrimary: Boolean
  var uuid: String
}

object IsPrimary {
  @scala.inline
  def apply(isPrimary: Boolean, uuid: String): IsPrimary = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrimary]
  }
}

