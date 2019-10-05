package typings.cytoscape.cytoscapeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeDataDefinition
  extends ElementDataDefinition
     with /* key */ StringDictionary[js.Any] {
  /**
    * the source node id (edge comes from this node)
    */
  var source: String
  /**
    * the target node id (edge goes to this node)
    */
  var target: String
}

object EdgeDataDefinition {
  @scala.inline
  def apply(
    source: String,
    target: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    id: String = null,
    position: Position = null
  ): EdgeDataDefinition = {
    val __obj = js.Dynamic.literal(source = source, target = target)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[EdgeDataDefinition]
  }
}

