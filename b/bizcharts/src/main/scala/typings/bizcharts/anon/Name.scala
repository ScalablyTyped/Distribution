package typings.bizcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var value: String
}

object Name {
  @scala.inline
  def apply(value: String, name: String = null): Name = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

