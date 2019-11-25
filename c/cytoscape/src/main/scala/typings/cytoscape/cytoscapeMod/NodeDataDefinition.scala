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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDataDefinition]
  }
}

