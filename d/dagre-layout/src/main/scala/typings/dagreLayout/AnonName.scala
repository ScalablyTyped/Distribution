package typings.dagreLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var v: String
  var w: String
}

object AnonName {
  @scala.inline
  def apply(v: String, w: String, name: String = null): AnonName = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

