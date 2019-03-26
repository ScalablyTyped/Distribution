package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CssNs {
  type Colour = java.lang.String
  /** https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight */
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - cytoscapeLib.cytoscapeLibStrings.normal
    - cytoscapeLib.cytoscapeLibStrings.bold
    - cytoscapeLib.cytoscapeLibStrings.lighter
    - cytoscapeLib.cytoscapeLibStrings.bolder
  */
  type FontWeight = _FontWeight | scala.Double
  /**
    * A space-separated list of numbers ranging on [-1, 1],
    * representing alternating x and y values (i.e. x1 y1 x2 y2, x3 y3 ...).
    * This represents the points in the polygon for the node’s shape.
    * The bounding box of the node is given by (-1, -1), (1, -1), (1, 1), (-1, 1).
    */
  type ShapePolygonPoints = java.lang.String
}
