package typings.behavior3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Category extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Category {
  @scala.inline
  def apply(
    category: String = null,
    description: String = null,
    name: String = null,
    properties: js.Any = null,
    title: String = null
  ): Anon_Category = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Category]
  }
}

