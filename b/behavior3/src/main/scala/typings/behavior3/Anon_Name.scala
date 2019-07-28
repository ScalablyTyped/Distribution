package typings.behavior3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, properties: js.Any = null, title: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Name]
  }
}

