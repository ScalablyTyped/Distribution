package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeDataDefinition
  extends ElementDataDefinition
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * the source node id (edge comes from this node)
    */
  var source: java.lang.String
  /**
    * the target node id (edge goes to this node)
    */
  var target: java.lang.String
}

object EdgeDataDefinition {
  @scala.inline
  def apply(
    source: java.lang.String,
    target: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    id: java.lang.String = null,
    position: Position = null
  ): EdgeDataDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[EdgeDataDefinition]
  }
}

