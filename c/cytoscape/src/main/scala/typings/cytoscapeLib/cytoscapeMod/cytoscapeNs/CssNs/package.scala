package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CssNs {
  type ArrowFill = cytoscapeLib.cytoscapeLibStrings.filled | cytoscapeLib.cytoscapeLibStrings.hollow
  type ArrowShape = cytoscapeLib.cytoscapeLibStrings.tee | cytoscapeLib.cytoscapeLibStrings.triangle | cytoscapeLib.cytoscapeLibStrings.`triangle-tee` | cytoscapeLib.cytoscapeLibStrings.`triangle-backcurve` | cytoscapeLib.cytoscapeLibStrings.square | cytoscapeLib.cytoscapeLibStrings.circle | cytoscapeLib.cytoscapeLibStrings.diamond | cytoscapeLib.cytoscapeLibStrings.none
  type Colour = java.lang.String
  /** https://developer.mozilla.org/en-US/docs/Web/CSS/font-style */
  type FontStyle = cytoscapeLib.cytoscapeLibStrings.normal | cytoscapeLib.cytoscapeLibStrings.italic | cytoscapeLib.cytoscapeLibStrings.oblique
  /** https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight */
  type FontWeight = scala.Double | cytoscapeLib.cytoscapeLibStrings.normal | cytoscapeLib.cytoscapeLibStrings.bold | cytoscapeLib.cytoscapeLibStrings.lighter | cytoscapeLib.cytoscapeLibStrings.bolder
  /**
           * The line style; may be solid, dotted, dashed, or double
           */
  type LineStyle = cytoscapeLib.cytoscapeLibStrings.solid | cytoscapeLib.cytoscapeLibStrings.dotted | cytoscapeLib.cytoscapeLibStrings.dashed | cytoscapeLib.cytoscapeLibStrings.double
  /**
           * The shape of the node’s body.
           * Note that each shape fits within the specified width and height,
           * and so you may have to adjust width and height
           * if you desire an equilateral shape
           * (i.e. width !== height for several equilateral shapes).
           * 'polygon' is a custom polygon specified via shape-polygon-points.
           */
  type NodeShape = cytoscapeLib.cytoscapeLibStrings.rectangle | cytoscapeLib.cytoscapeLibStrings.roundrectangle | cytoscapeLib.cytoscapeLibStrings.ellipse | cytoscapeLib.cytoscapeLibStrings.triangle | cytoscapeLib.cytoscapeLibStrings.pentagon | cytoscapeLib.cytoscapeLibStrings.hexagon | cytoscapeLib.cytoscapeLibStrings.heptagon | cytoscapeLib.cytoscapeLibStrings.octagon | cytoscapeLib.cytoscapeLibStrings.star | cytoscapeLib.cytoscapeLibStrings.diamond | cytoscapeLib.cytoscapeLibStrings.vee | cytoscapeLib.cytoscapeLibStrings.rhomboid | cytoscapeLib.cytoscapeLibStrings.polygon
  /**
           * A space-separated list of numbers ranging on [-1, 1],
           * representing alternating x and y values (i.e. x1 y1 x2 y2, x3 y3 ...).
           * This represents the points in the polygon for the node’s shape.
           * The bounding box of the node is given by (-1, -1), (1, -1), (1, 1), (-1, 1).
           */
  type ShapePolygonPoints = java.lang.String
  /** http://js.cytoscape.org/#style/labels */
  type TextTranformation = cytoscapeLib.cytoscapeLibStrings.none | cytoscapeLib.cytoscapeLibStrings.uppercase | cytoscapeLib.cytoscapeLibStrings.lowercase
  /**
           * Transition animation
           */
  type TransitionTimingFunction = cytoscapeLib.cytoscapeLibStrings.linear | cytoscapeLib.cytoscapeLibStrings.spring | cytoscapeLib.cytoscapeLibStrings.`cubic-bezier` | cytoscapeLib.cytoscapeLibStrings.ease | cytoscapeLib.cytoscapeLibStrings.`ease-in` | cytoscapeLib.cytoscapeLibStrings.`ease-out` | cytoscapeLib.cytoscapeLibStrings.`ease-in-out` | cytoscapeLib.cytoscapeLibStrings.`ease-in-sine` | cytoscapeLib.cytoscapeLibStrings.`ease-out-sine` | cytoscapeLib.cytoscapeLibStrings.`ease-in-out-sine` | cytoscapeLib.cytoscapeLibStrings.`ease-in-quad` | cytoscapeLib.cytoscapeLibStrings.`ease-out-quad` | cytoscapeLib.cytoscapeLibStrings.`ease-in-out-quad` | cytoscapeLib.cytoscapeLibStrings.`ease-in-cubic` | cytoscapeLib.cytoscapeLibStrings.`ease-out-cubic` | cytoscapeLib.cytoscapeLibStrings.`ease-in-out-cubic` | cytoscapeLib.cytoscapeLibStrings.`ease-in-quart` | cytoscapeLib.cytoscapeLibStrings.`ease-out-quart` | cytoscapeLib.cytoscapeLibStrings.`ease-in-out-quart` | cytoscapeLib.cytoscapeLibStrings.`ease-in-quint` | cytoscapeLib.cytoscapeLibStrings.`ease-out-quint` | cytoscapeLib.cytoscapeLibStrings.`ease-in-out-quint` | cytoscapeLib.cytoscapeLibStrings.`ease-in-expo` | cytoscapeLib.cytoscapeLibStrings.`ease-out-expo` | cytoscapeLib.cytoscapeLibStrings.`ease-in-out-expo` | cytoscapeLib.cytoscapeLibStrings.`ease-in-circ` | cytoscapeLib.cytoscapeLibStrings.`ease-out-circ` | cytoscapeLib.cytoscapeLibStrings.`ease-in-out-circ`
}
