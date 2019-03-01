package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBoxOptions extends js.Object {
  /** A boolean indicating whether to include edges in the bounding box (default true). */
  var includeEdges: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating whether to include labels in the bounding box (default true). */
  var includeLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating whether to include nodes in the bounding box (default true). */
  var includeNodes: js.UndefOr[scala.Boolean] = js.undefined
}

object BoundingBoxOptions {
  @scala.inline
  def apply(
    includeEdges: js.UndefOr[scala.Boolean] = js.undefined,
    includeLabels: js.UndefOr[scala.Boolean] = js.undefined,
    includeNodes: js.UndefOr[scala.Boolean] = js.undefined
  ): BoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeEdges)) __obj.updateDynamic("includeEdges")(includeEdges)
    if (!js.isUndefined(includeLabels)) __obj.updateDynamic("includeLabels")(includeLabels)
    if (!js.isUndefined(includeNodes)) __obj.updateDynamic("includeNodes")(includeNodes)
    __obj.asInstanceOf[BoundingBoxOptions]
  }
}

