package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Css {
  import org.scalablytyped.runtime.StringDictionary

  type Colour = String
  type Dictionary = StringDictionary[js.Any]
  /** https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight */
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.cytoscape.cytoscapeStrings.normal
    - typings.cytoscape.cytoscapeStrings.bold
    - typings.cytoscape.cytoscapeStrings.lighter
    - typings.cytoscape.cytoscapeStrings.bolder
  */
  type FontWeight = _FontWeight | Double
  /**
    * A space-separated list of numbers ranging on [-1, 1],
    * representing alternating x and y values (i.e. x1 y1 x2 y2, x3 y3 ...).
    * This represents the points in the polygon for the node’s shape.
    * The bounding box of the node is given by (-1, -1), (1, -1), (1, 1), (-1, 1).
    */
  type ShapePolygonPoints = String
}
