package typings
package behavior3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Child extends js.Object {
  var child: js.UndefOr[behavior3Lib.b3Ns.BaseNode] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Child {
  @scala.inline
  def apply(
    child: behavior3Lib.b3Ns.BaseNode = null,
    name: java.lang.String = null,
    properties: js.Any = null,
    title: java.lang.String = null
  ): Anon_Child = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Child]
  }
}

