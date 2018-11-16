package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EdgeDataDefinition
  extends ElementDataDefinition
     with /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
           * the source node id (edge comes from this node)
           */
  var source: java.lang.String
  /**
           * the target node id (edge goes to this node)
           */
  var target: java.lang.String
}

