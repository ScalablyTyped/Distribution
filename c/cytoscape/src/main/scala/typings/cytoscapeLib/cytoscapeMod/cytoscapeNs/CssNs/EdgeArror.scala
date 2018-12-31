package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Edge arrow
  *  * <pos>-arrow-color : The colour of the edge’s source arrow.
  *  * <pos>-arrow-shape : The shape of the edge’s source arrow.
  *  * <pos>-arrow-fill : The fill state of the edge’s source arrow.
  *
  * For each edge arrow property above, replace <pos> with one of
  *  * source : Pointing towards the source node, at the end of the edge.
  *  * mid-source : Pointing towards the source node, at the middle of the edge.
  *  * target : Pointing towards the target node, at the end of the edge.
  *  * mid-target: Pointing towards the target node, at the middle of the edge.
  *
  * Only mid arrows are supported on haystack edges.
  * http://js.cytoscape.org/#style/edge-arrow
  */
trait EdgeArror extends js.Object {
  /** The colour of the edge’s "mid-source" arrow. */
  var `mid-source-arrow-color`: js.UndefOr[Colour] = js.undefined
  /** The fill state of the edge’s mid-source arrow. */
  var `mid-source-arrow-fill`: js.UndefOr[ArrowFill] = js.undefined
  /** The shape of the edge’s mid-source arrow. */
  var `mid-source-arrow-shape`: js.UndefOr[ArrowShape] = js.undefined
  /** The colour of the edge’s "mid-target" arrow. */
  var `mid-target-arrow-color`: js.UndefOr[Colour] = js.undefined
  /** The fill state of the edge’s mid-target arrow. */
  var `mid-target-arrow-fill`: js.UndefOr[ArrowFill] = js.undefined
  /** The shape of the edge’s mid-target arrow. */
  var `mid-target-arrow-shape`: js.UndefOr[ArrowShape] = js.undefined
  /** The colour of the edge’s source arrow. */
  var `source-arrow-color`: js.UndefOr[Colour] = js.undefined
  /** The fill state of the edge’s source arrow. */
  var `source-arrow-fill`: js.UndefOr[ArrowFill] = js.undefined
  /** The shape of the edge’s source arrow. */
  var `source-arrow-shape`: js.UndefOr[ArrowShape] = js.undefined
  /** The colour of the edge’s target arrow. */
  var `target-arrow-color`: js.UndefOr[Colour] = js.undefined
  /** The fill state of the edge’s target arrow. */
  var `target-arrow-fill`: js.UndefOr[ArrowFill] = js.undefined
  /** The shape of the edge’s target arrow. */
  var `target-arrow-shape`: js.UndefOr[ArrowShape] = js.undefined
}

