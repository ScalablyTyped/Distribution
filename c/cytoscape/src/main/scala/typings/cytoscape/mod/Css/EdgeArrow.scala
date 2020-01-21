package typings.cytoscape.mod.Css

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
trait EdgeArrow extends js.Object {
  /** The colour of the edge’s "mid-source" arrow. */
  var `mid-source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /** The fill state of the edge’s mid-source arrow. */
  var `mid-source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  /** The shape of the edge’s mid-source arrow. */
  var `mid-source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  /** The colour of the edge’s "mid-target" arrow. */
  var `mid-target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /** The fill state of the edge’s mid-target arrow. */
  var `mid-target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  /** The shape of the edge’s mid-target arrow. */
  var `mid-target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  /** The colour of the edge’s source arrow. */
  var `source-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /** The fill state of the edge’s source arrow. */
  var `source-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  /** The shape of the edge’s source arrow. */
  var `source-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
  /** The colour of the edge’s target arrow. */
  var `target-arrow-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  /** The fill state of the edge’s target arrow. */
  var `target-arrow-fill`: js.UndefOr[PropertyValueEdge[ArrowFill]] = js.undefined
  /** The shape of the edge’s target arrow. */
  var `target-arrow-shape`: js.UndefOr[PropertyValueEdge[ArrowShape]] = js.undefined
}

object EdgeArrow {
  @scala.inline
  def apply(
    `mid-source-arrow-color`: PropertyValueEdge[Colour] = null,
    `mid-source-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `mid-source-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `mid-target-arrow-color`: PropertyValueEdge[Colour] = null,
    `mid-target-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `mid-target-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `source-arrow-color`: PropertyValueEdge[Colour] = null,
    `source-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `source-arrow-shape`: PropertyValueEdge[ArrowShape] = null,
    `target-arrow-color`: PropertyValueEdge[Colour] = null,
    `target-arrow-fill`: PropertyValueEdge[ArrowFill] = null,
    `target-arrow-shape`: PropertyValueEdge[ArrowShape] = null
  ): EdgeArrow = {
    val __obj = js.Dynamic.literal()
    if (`mid-source-arrow-color` != null) __obj.updateDynamic("mid-source-arrow-color")(`mid-source-arrow-color`.asInstanceOf[js.Any])
    if (`mid-source-arrow-fill` != null) __obj.updateDynamic("mid-source-arrow-fill")(`mid-source-arrow-fill`.asInstanceOf[js.Any])
    if (`mid-source-arrow-shape` != null) __obj.updateDynamic("mid-source-arrow-shape")(`mid-source-arrow-shape`.asInstanceOf[js.Any])
    if (`mid-target-arrow-color` != null) __obj.updateDynamic("mid-target-arrow-color")(`mid-target-arrow-color`.asInstanceOf[js.Any])
    if (`mid-target-arrow-fill` != null) __obj.updateDynamic("mid-target-arrow-fill")(`mid-target-arrow-fill`.asInstanceOf[js.Any])
    if (`mid-target-arrow-shape` != null) __obj.updateDynamic("mid-target-arrow-shape")(`mid-target-arrow-shape`.asInstanceOf[js.Any])
    if (`source-arrow-color` != null) __obj.updateDynamic("source-arrow-color")(`source-arrow-color`.asInstanceOf[js.Any])
    if (`source-arrow-fill` != null) __obj.updateDynamic("source-arrow-fill")(`source-arrow-fill`.asInstanceOf[js.Any])
    if (`source-arrow-shape` != null) __obj.updateDynamic("source-arrow-shape")(`source-arrow-shape`.asInstanceOf[js.Any])
    if (`target-arrow-color` != null) __obj.updateDynamic("target-arrow-color")(`target-arrow-color`.asInstanceOf[js.Any])
    if (`target-arrow-fill` != null) __obj.updateDynamic("target-arrow-fill")(`target-arrow-fill`.asInstanceOf[js.Any])
    if (`target-arrow-shape` != null) __obj.updateDynamic("target-arrow-shape")(`target-arrow-shape`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeArrow]
  }
}

