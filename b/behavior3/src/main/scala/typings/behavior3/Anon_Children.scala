package typings.behavior3

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[js.Array[BaseNode]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[BaseNode] = null,
    name: String = null,
    properties: js.Any = null,
    title: String = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Children]
  }
}

