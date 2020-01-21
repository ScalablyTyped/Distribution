package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBoxOptions extends js.Object {
  /** A boolean indicating whether to include edges in the bounding box (default true). */
  var includeEdges: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to include labels in the bounding box (default true). */
  var includeLabels: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to include main (node or edge) labels in the bounding box (default true). */
  var includeMainLabels: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to include nodes in the bounding box (default true). */
  var includeNodes: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to include overlays (such as the one which appears when a node is clicked) in the bounding box (default true). */
  var includeOverlays: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to include (edge) source-labels in the bounding box (default true). */
  var includeSourceLabels: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to include (edge) target-labels in the bounding box (default true). */
  var includeTargetLabels: js.UndefOr[Boolean] = js.undefined
}

object BoundingBoxOptions {
  @scala.inline
  def apply(
    includeEdges: js.UndefOr[Boolean] = js.undefined,
    includeLabels: js.UndefOr[Boolean] = js.undefined,
    includeMainLabels: js.UndefOr[Boolean] = js.undefined,
    includeNodes: js.UndefOr[Boolean] = js.undefined,
    includeOverlays: js.UndefOr[Boolean] = js.undefined,
    includeSourceLabels: js.UndefOr[Boolean] = js.undefined,
    includeTargetLabels: js.UndefOr[Boolean] = js.undefined
  ): BoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeEdges)) __obj.updateDynamic("includeEdges")(includeEdges.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLabels)) __obj.updateDynamic("includeLabels")(includeLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMainLabels)) __obj.updateDynamic("includeMainLabels")(includeMainLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNodes)) __obj.updateDynamic("includeNodes")(includeNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(includeOverlays)) __obj.updateDynamic("includeOverlays")(includeOverlays.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSourceLabels)) __obj.updateDynamic("includeSourceLabels")(includeSourceLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTargetLabels)) __obj.updateDynamic("includeTargetLabels")(includeTargetLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxOptions]
  }
}

