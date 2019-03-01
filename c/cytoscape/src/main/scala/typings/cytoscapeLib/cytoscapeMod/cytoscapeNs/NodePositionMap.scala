package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/preset
  */
trait NodePositionMap
  extends /* nodeid */ org.scalablytyped.runtime.StringDictionary[Position]

object NodePositionMap {
  @scala.inline
  def apply(StringDictionary: /* nodeid */ org.scalablytyped.runtime.StringDictionary[Position] = null): NodePositionMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodePositionMap]
  }
}

