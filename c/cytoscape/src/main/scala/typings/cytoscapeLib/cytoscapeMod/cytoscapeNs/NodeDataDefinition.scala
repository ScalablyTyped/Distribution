package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDataDefinition
  extends ElementDataDefinition
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var parent: js.UndefOr[java.lang.String] = js.undefined
}

object NodeDataDefinition {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    id: java.lang.String = null,
    parent: java.lang.String = null,
    position: Position = null
  ): NodeDataDefinition = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[NodeDataDefinition]
  }
}

