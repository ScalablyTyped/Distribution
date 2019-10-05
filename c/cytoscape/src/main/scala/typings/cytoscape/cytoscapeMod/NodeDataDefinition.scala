package typings.cytoscape.cytoscapeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDataDefinition
  extends ElementDataDefinition
     with /* key */ StringDictionary[js.Any] {
  var parent: js.UndefOr[String] = js.undefined
}

object NodeDataDefinition {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    id: String = null,
    parent: String = null,
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

