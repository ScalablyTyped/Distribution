package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties affect the styling of an edge’s line:
  *
  * http://js.cytoscape.org/#style/edge-line
  */
trait EdgeLine extends js.Object {
  /**
    * The curving method used to separate two or more edges between two nodes;
    * may be
    *  - haystack (default, very fast, bundled straight edges for which loops and compounds are unsupported),
    *  - bezier(bundled curved edges),
    *  - unbundled - bezier(curved edges for use with manual control points), or
    *  - segments (a series of straight lines).
    * Note that haystack edges work best with ellipse, rectangle, or similar nodes.
    * Smaller node shapes, like triangle, will not be as aesthetically pleasing.
    * Also note that edge arrows are unsupported for haystack edges.
    */
  var `curve-style`: js.UndefOr[
    cytoscapeLib.cytoscapeLibStrings.haystack | cytoscapeLib.cytoscapeLibStrings.bezier | cytoscapeLib.cytoscapeLibStrings.unbundled | cytoscapeLib.cytoscapeLibStrings.segments
  ] = js.undefined
  /**
    * The colour of the edge’s line.
    */
  var `line-color`: js.UndefOr[Colour] = js.undefined
  /**
    * The style of the edge’s line.
    */
  var `line-style`: js.UndefOr[LineStyle] = js.undefined
  /**
    * The width of an edge’s line.
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

