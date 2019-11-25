package typings.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var method: String
}

object Anon_Data {
  @scala.inline
  def apply(method: String, data: String = null): Anon_Data = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

