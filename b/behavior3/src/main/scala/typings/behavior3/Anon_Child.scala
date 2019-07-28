package typings.behavior3

import typings.behavior3.b3Ns.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Child extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Child {
  @scala.inline
  def apply(child: BaseNode = null, name: String = null, properties: js.Any = null, title: String = null): Anon_Child = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Child]
  }
}

