package typings.botvs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var method: String
}

object Data {
  @scala.inline
  def apply(method: String, data: String = null): Data = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

