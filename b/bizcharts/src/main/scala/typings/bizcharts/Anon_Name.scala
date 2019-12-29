package typings.bizcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var value: String
}

object Anon_Name {
  @scala.inline
  def apply(value: String, name: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

