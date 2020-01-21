package typings.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var method: String
}

object AnonData {
  @scala.inline
  def apply(method: String, data: String = null): AnonData = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

